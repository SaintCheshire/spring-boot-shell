package saint.cheshire.cli;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;
import saint.cheshire.service.ExampleService;

@ShellComponent
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class ExampleCLI {

    @NonNull
    private final ExampleService exampleService;

    @ShellMethod(
            key = "example",
            value = "Simple example"
    )
    public String example() {
        return exampleService.example();
    }

    @ShellMethod(
            key = "example with args",
            value = "Simple example with arguments"
    )
    public String exampleWithArguments(
            @NonNull @ShellOption(
                    help = "Some description of first argument"
            ) String firstArg,
            @NonNull @ShellOption(
                    value = "--second",
                    help = "Another description of second argument"
            ) String secondArg
    ) {
        return exampleService.exampleWithArguments(firstArg, secondArg);
    }

}

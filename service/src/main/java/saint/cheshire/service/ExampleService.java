package saint.cheshire.service;

import lombok.NonNull;
import org.springframework.stereotype.Service;

import static java.lang.String.format;

@Service
public class ExampleService {

    @NonNull
    public String example() {
        return "Calling service with simple example command";
    }

    @NonNull
    public String exampleWithArguments(@NonNull String firstArgument, @NonNull String secondArgument) {
        return format("Calling service with simple example command with args %s and %s", firstArgument, secondArgument);
    }

}

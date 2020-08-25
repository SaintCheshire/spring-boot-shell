package saint.cheshire.service;

import lombok.NonNull;
import org.springframework.stereotype.Service;

@Service
public class ExampleService {

    @NonNull
    public String example() {
        return "Calling service with simple example command";
    }

    @NonNull
    public String exampleWithArguments(@NonNull String firstArgument, @NonNull String secondArgument) {
        return "Calling service with simple example command with args {} and {}";
    }

}

package org.springframework.samples.springbootbase.util;

import io.swagger.v3.oas.annotations.Operation;
import lombok.experimental.UtilityClass;

import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import static java.util.stream.Collectors.toMap;
import static java.util.stream.IntStream.range;
@UtilityClass
public class JsonResponseBuilderUtil {

/*    public static Map<String, Object> buildJsonResponse(
            List<String> keys,
            List<Object> arguments) {

        validateListSizes(keys, arguments);

        return range(0, keys.size())
                .boxed()
                .collect(toMap(keys::get, arguments::get));
    }

    @Operation(summary = "Validates if the number of keys equals the number of arguments")
    private static void validateListSizes(
            @NotNull List<String> keys,
            @NotNull List<Object> arguments) {
        if (keys.size() != arguments.size())
            throw new JsonResponseBuilderUtil("The number of keys must be equal to the number of arguments.");
    }*/

}

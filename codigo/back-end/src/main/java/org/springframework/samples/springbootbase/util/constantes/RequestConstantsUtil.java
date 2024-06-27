package org.springframework.samples.springbootbase.util.constantes;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.experimental.UtilityClass;
import java.util.ArrayList;
import java.util.List;
import static java.util.Arrays.asList;

@UtilityClass
@Schema(description = "Contains constants for request handling")
public class RequestConstantsUtil {

    public static final String USER_ENDPOINT = "/user";

    public static final String[] PUBLIC_PATHS = {"/", "/actuator/health"};

    public static final String[] PUBLIC_POST_PATHS = {"/user", "/login"};

    public static final List<String> ALLOWED_CORS_METHODS = new ArrayList<>(asList("GET", "POST", "PUT", "PATCH", "HEAD", "OPTIONS"));

    public static final String CORS_CONFIGURATION = "/**";

    public static final String AUTHORIZATION_HEADER = "Authorization";

    public static final String AUTHORIZATION_HEADER_VALUE = "Bearer %s";

    public static final String TOKEN_TYPE = "Bearer";

    public static final String CONTENT_TYPE = "application/json";

    public static final String CHARACTER_ENCODING = "UTF-8";

    public static final String REQUEST_RESPONSE_BODY = "{" +
            "\n\"token\": \"" + TOKEN_TYPE + " %s\"," +
            "\n\"user\": \"%s\"" + "," +
            "\n\"time\": \"%s\"" + "," +
            "\n}";

    public static final String[] IGNORED_PROPERTIES = new String[]{"id", "password", "roles", "creationDate", "lastModificationDate"};

    public static final List<String> ADDRESS_CONTROLLER_KEYS = new ArrayList<>(asList("status", "message", "address_id"));

    public static final List<String> USER_CONTROLLER_KEYS = new ArrayList<>(asList("status", "message", "user_id"));

    public static final String MSG_USER_CREATED = "User successfully created";

    public static final String MSG_USER_UPDATED = "User successfully updated";

    public static final String MSG_USER_DELETED = "User successfully deleted";

    public static final String MSG_USER_PASSWORD = "Password successfully updated";
}


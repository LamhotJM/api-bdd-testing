package util;

import config.Config;

public class AuthenticationUtil {

    public static String getAuthToken() {
        // Return auth token from config or fetch dynamically
        return Config.AUTH_TOKEN;
    }
}
package config;

public class configProperties {

    public static applicationConfigReader appConfig = new applicationConfigReader();
    public static String BaseURl=appConfig.getBaseUrl();
}

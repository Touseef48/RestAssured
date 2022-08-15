package config;
import ru.qatools.properties.Property;
import ru.qatools.properties.PropertyLoader;
import ru.qatools.properties.Resource.Classpath;


@Classpath({"config.properties"})
public class applicationConfigReader {
    private static applicationConfigReader config;
    public static applicationConfigReader getConfig() {
        if (config == null) {
            config = new applicationConfigReader();
        }
        return config;
    }
    @Property("baseUrl")
    private String baseUrl;

    public applicationConfigReader() {
        PropertyLoader.newInstance().populate(this);
    }


    public String getBaseUrl() {
        return this.baseUrl;
    }

}

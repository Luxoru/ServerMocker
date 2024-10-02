package server;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ServerProperties {

    private final Properties properties;

    public ServerProperties(){
        properties = new Properties();


        try (InputStream inputStream = ServerMock.class.getClassLoader().getResourceAsStream("server.properties")) {
            if (inputStream == null) {
                System.out.println("Sorry, unable to find config.properties");
                return;
            }

            // Load the properties from the input stream
            properties.load(inputStream);
        } catch (IOException e) {

        }
    }

    public int getPort() {
        return Integer.parseInt(properties.getProperty("port", "25565"));
    }

    public int getViewDistance() {
        return Integer.parseInt(properties.getProperty("view-distance", "12"));
    }

    public int getSimulationDistance() {
        return Integer.parseInt(properties.getProperty("sim-distance", "12"));
    }

    public String getIpAddress() {
        return properties.getProperty("ip-address", "127.0.0.1");
    }

    public String getWorldType() {
        return properties.getProperty("level-type", "NORMAL");
    }

    public boolean shouldGenerateStructures() {
        return Boolean.parseBoolean(properties.getProperty("generate-structures", "true"));
    }

    public int getMaxWorldSize() {
        return Integer.parseInt(properties.getProperty("max-world-size", "127"));
    }

    public boolean shouldAllowEnd() {
        return Boolean.parseBoolean(properties.getProperty("allow-end", "true"));
    }

    public boolean shouldAllowNether() {
        return Boolean.parseBoolean(properties.getProperty("allow-nether", "true"));
    }

    public boolean isLoggingIPs() {
        return Boolean.parseBoolean(properties.getProperty("logging-ips", "true"));
    }
}

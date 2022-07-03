package Config;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:config/config.properties")
public interface ConfigTests extends Config {
    String login();
    String password();
}

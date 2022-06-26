package com.demoqa.tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class Configproperties {
    @Test
    @Tag("prop")
    void setProp(){
        String browser = System.getProperty("browser");
        String version = System.getProperty("version");
        System.out.println(browser);
        System.out.println(version);
    }
}

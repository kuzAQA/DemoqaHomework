package com.demoqa.tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class Configproperties {
    @Test
    @Tag("prop")
    void setProp(){
        System.setProperty("browser", "safari");
        String browser = System.getProperty("browser");
        String version = System.getProperty("version", "100");
        System.out.println(browser);
        System.out.println(version);
    }
}

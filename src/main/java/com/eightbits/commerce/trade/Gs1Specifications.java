package com.eightbits.commerce.trade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Gs1Specifications {
    private static final Properties PROPS = new Properties();
    private static final Logger LOGGER = LoggerFactory.getLogger(Gs1Specifications.class);

    static {
        try (InputStream resource = Gs1Specifications.class.getClassLoader().getResourceAsStream("xml/xslt/SharedCommon.properties")) {
            if (resource != null) PROPS.load(resource);
        } catch (IOException e) {
            LOGGER.error("Error loading properties file", e);
        }
    }

    public String getVersion() {
        return PROPS.getProperty("gs1.version");
    }

}

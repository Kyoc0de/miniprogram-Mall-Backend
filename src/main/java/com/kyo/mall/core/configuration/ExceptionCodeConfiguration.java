package com.kyo.mall.core.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
@Data
@ConfigurationProperties(prefix = "kyo")
@PropertySource(value = "classpath:config/exception-code.properties")
public class ExceptionCodeConfiguration {

    private Map<Integer,String> codes = new HashMap<>();

    public String getMessage(int code){
        String message = codes.get(code);
        return message;
    }
}

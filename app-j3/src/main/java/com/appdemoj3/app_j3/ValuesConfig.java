package com.appdemoj3.app_j3;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

// esto es el soporte de caracteres especiales

@Configuration
@PropertySources({
    @PropertySource(value = "classpath:values.properties" , encoding = "UTF-8")
})
public class ValuesConfig {

}

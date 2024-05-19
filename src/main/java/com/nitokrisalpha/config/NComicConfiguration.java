package com.nitokrisalpha.config;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootConfiguration
@EnableConfigurationProperties(NComicConfigProperties.class)
public class NComicConfiguration {
}

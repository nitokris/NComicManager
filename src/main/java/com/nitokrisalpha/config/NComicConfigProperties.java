package com.nitokrisalpha.config;

import com.nitokrisalpha.validator.PathExists;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

@Data
@Validated
@ConfigurationProperties(prefix = "comic")
public class NComicConfigProperties {

    @PathExists
    private String coverSavePath = "/tmp";

}

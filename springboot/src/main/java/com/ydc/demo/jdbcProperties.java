package com.ydc.demo;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;


//@ConfigurationProperties(prefix = "jdbc")//prefis 前缀
@Data
public class jdbcProperties {

    String driverClassName;
    String url;
    String username;
    String password;
}

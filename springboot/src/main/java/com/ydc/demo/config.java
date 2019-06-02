package com.ydc.demo;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;


import javax.sql.DataSource;

@SpringBootConfiguration
//@PropertySource("classpath:jdbc.properties")
//@EnableConfigurationProperties(jdbcProperties.class)
public class config {
//    @Value("jdbc.driverClassName")
//    private  String driverClassName;
//    @Value("jdbc.url")
//    private String url;
//    @Value("jdbc.username")
//    private String username;
//    @Value("jdbc.password")
//    private String password;

    @Bean
    @ConfigurationProperties(prefix = "jdbc")
   public DataSource dataSource(){
        return new DruidDataSource();
    }
}

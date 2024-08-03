package com.ivoronline.springboot_db_datasource_create_datasourceproperties.config;

import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class MyDatasourceConfig {

  //=========================================================================================================
  // DATA SOURCE PROPERTIES 1
  //=========================================================================================================
  // Load from application.properties
  @Bean
  @Primary
  @ConfigurationProperties("my.spring.datasource")
  public DataSourceProperties dataSourceProperties1() {
    return new DataSourceProperties();
  }
  
  //=========================================================================================================
  // DATA SOURCE PROPERTIES 2
  //=========================================================================================================
  // Load manually
  @Bean
  public DataSourceProperties dataSourceProperties2() {
    DataSourceProperties dataSourceProperties = new DataSourceProperties();
                         dataSourceProperties.setUrl            ("jdbc:oracle:thin:@localhost:1522/orcl");
                         dataSourceProperties.setUsername       ("TEST");
                         dataSourceProperties.setPassword       ("LETMEIN");
                       //dataSourceProperties.setDriverClassName("oracle.jdbc.OracleDriver");
    return dataSourceProperties;
  }
  
}

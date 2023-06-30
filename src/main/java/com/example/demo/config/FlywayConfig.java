package com.example.demo.config;

import org.flywaydb.core.Flyway;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @author galang
 */
@Configuration
public class FlywayConfig {

    @Bean(initMethod = "migrate")
    @ConfigurationProperties(prefix = "spring.flyway.datasourceprimary")
    public Flyway flywayDataSource1(@Qualifier("dataSourcePrimary") DataSource dataSourcePrimary) {
        return Flyway.configure()
                .dataSource(dataSourcePrimary)
                .load();
    }

    @Bean(initMethod = "migrate")
    @ConfigurationProperties(prefix = "spring.flyway.datasourcesecondary")
    public Flyway flywayDataSource2(@Qualifier("dataSourceSecondary") DataSource dataSourceSecondary) {
        return Flyway.configure()
                .dataSource(dataSourceSecondary)
                .load();
    }
}

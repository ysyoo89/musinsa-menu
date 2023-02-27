package com.musinsa.musinsamenu;

import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Import;

@TestConfiguration
@Import({DataSourceAutoConfiguration.class, QuerydslConfiguration.class})
public class JPATestConfig {
    public JPATestConfig() {
    }
}

package com.wj.dictionary.config;

import io.github.wj0410.core.tools.config.DefaultMybatisPlusConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@EnableTransactionManagement
@Configuration
public class MybatisPlusConfig extends DefaultMybatisPlusConfig {

}

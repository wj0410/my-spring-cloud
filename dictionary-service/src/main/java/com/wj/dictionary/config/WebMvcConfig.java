package com.wj.dictionary.config;

import io.github.wj0410.core.tools.config.AuthSecretKeyWebMvcConfig;
import org.springframework.context.annotation.Configuration;

/**
 * 全剧过滤器，必须从网关访问
 */
@Configuration
public class WebMvcConfig extends AuthSecretKeyWebMvcConfig {

}

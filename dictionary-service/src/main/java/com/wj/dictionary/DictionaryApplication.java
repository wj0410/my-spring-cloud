package com.wj.dictionary;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import com.wj.common.CommonApplication;
import com.wj.common.constants.CommonConstants;
import io.github.wj0410.core.tools.interceptor.prop.AuthIgnoreProperties;
import io.github.wj0410.core.tools.interceptor.AuthSecretKeyInterceptor;
import io.github.wj0410.core.tools.mybatisplus.DefaultMetaObjectHandler;
import io.github.wj0410.core.tools.redis.RedisLockHelper;
import io.github.wj0410.core.tools.redis.RedisUUID;
import io.github.wj0410.core.tools.restful.exception.ExceptionController;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DictionaryApplication {

    public static void main(String[] args) {
        CommonApplication.run(CommonConstants.DICTIONARY_APPLICATION_NAME, DictionaryApplication.class, args);
    }

    // mybatis-plus 字段填充控制器，实现公共字段自动写入
    @Bean
    public MetaObjectHandler defaultMetaObjectHandler() {
        return new DefaultMetaObjectHandler();
    }

}

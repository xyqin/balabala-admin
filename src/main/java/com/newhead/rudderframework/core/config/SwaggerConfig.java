package com.newhead.rudderframework.core.config;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by xyqin on 2017/4/8.
 */
@EnableSwagger2
@Configuration
public class SwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .paths(paths())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("壁纸API")
                .description("用于移动App调用")
                .version("1.0")
                .build();
    }

    private Predicate<String> paths() {
        return Predicates.or(
                PathSelectors.regex("/aw/api.*"),
                PathSelectors.regex("/files.*"),
                PathSelectors.regex("/images.*"),
                PathSelectors.regex("/security.*"),
                PathSelectors.regex("/ruddermenu.*"),
                PathSelectors.regex("/rudderpermission.*"),
                PathSelectors.regex("/rudderrole.*"),
                PathSelectors.regex("/rudderrole2permission.*"),
                PathSelectors.regex("/rudderuser.*"),
                PathSelectors.regex("/rudderuser2role.*")
        );
    }

}

package com.jayant.lean.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.envers.repository.support.EnversRevisionRepositoryFactoryBean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "com.jayant.lean",
    repositoryFactoryBeanClass = EnversRevisionRepositoryFactoryBean.class)
public class JpaEnversConfiguration {

}

package com.cofig;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by debasish paul on 14-11-2017.
 */
@Configuration
@EnableJpaRepositories(basePackages = {"com.repo"})
@EntityScan(basePackages = {"com.model"})
public class JpaConfiguration {
}

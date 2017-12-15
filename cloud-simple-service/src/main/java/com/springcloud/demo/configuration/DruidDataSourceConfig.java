package com.springcloud.demo.configuration;

import com.alibaba.druid.pool.DruidDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * 描述：
 * druid设置
 *
 * @author chentianlong
 * @create 2017/12/15 14:31
 */
@Configuration
@ConfigurationProperties(prefix = "spring.datasource")
public class DruidDataSourceConfig {
    private final Logger logger = LoggerFactory.getLogger(DruidDataSourceConfig.class);
    @Autowired
    private DataSourceProperties dataSourceProperties;

    @Bean
    public DataSource druidDataSource() {
        DataSourceProperties config = dataSourceProperties;
        DruidDataSource  druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName(config.getDriverClassName());
        druidDataSource.setUrl(config.getUrl());
        druidDataSource.setUsername(config.getUsername());
        druidDataSource.setPassword(config.getPassword());
        logger.info("=========data source=============");
        logger.info(config.getDriverClassName());
        return druidDataSource;
    }
}

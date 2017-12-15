package com.springcloud.demo.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 描述：
 * 数据源参数类
 *
 * @author chentianlong
 * @create 2017/12/15 14:22
 */
@ConfigurationProperties(prefix = "mysqldb.datasource")
public class DataSourceProperties {

    private String url;
    private String username;
    private String password;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

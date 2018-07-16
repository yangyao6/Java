package com.pactera.springboot;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author Yangyao
 * @time 2018年07月16日 14:52
 * @company 文思海辉技术有限公司
 */
@Component
@ConfigurationProperties(prefix = "student")
public class StudentProperties {

    private String name;

    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}

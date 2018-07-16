package com.pactera.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.util.Date;

/**
 * @author Yangyao
 * @time 2018年07月16日 11:09
 * @company 文思海辉技术有限公司
 */
//@RestController 注解： 该注解是 @Controller 和 @ResponseBody 注解的合体版
//@RestController
@Controller
public class HelloController {

    /*@Value("${name}")
    private String name;

    @Value("${age}")
    private Integer age;*/

    /*@Value("${content}")
    private String content;*/

    /*@Autowired
    private StudentProperties studentProperties;

    @RequestMapping("/hello")
    public String hello(){
//        return "Hello Spring Boot!" + name + age;
//        return content;
        return studentProperties.getName() + studentProperties.getAge();
    }*/

    @RequestMapping("/hello")
    public String hello(Model model){
        model.addAttribute("now",DateFormat.getDateTimeInstance().format(new Date()));
        return "hello";
    }
}

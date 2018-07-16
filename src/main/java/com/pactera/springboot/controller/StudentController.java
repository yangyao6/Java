package com.pactera.springboot.controller;

import com.pactera.springboot.mapper.StudentMapper;
import com.pactera.springboot.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author Yangyao
 * @time 2018年07月16日 16:55
 * @company 文思海辉技术有限公司
 */
@SuppressWarnings("ALL")
@Controller
public class StudentController {

    @Autowired
    StudentMapper studentMapper;

    @RequestMapping("/listStudent")
    public String listStudent(Model model){
        List<Student> students = studentMapper.findAll();
        model.addAttribute("students", students);
        return "listStudent";
    }
}

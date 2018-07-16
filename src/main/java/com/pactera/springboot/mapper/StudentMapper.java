package com.pactera.springboot.mapper;

import com.pactera.springboot.pojo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author Yangyao
 * @time 2018年07月16日 16:51
 * @company 文思海辉技术有限公司
 */
@Mapper
public interface StudentMapper {

    @Select("SELECT * FROM student")
    List<Student> findAll();
}

package com.tom.mybatisdruid.mapper;

import com.tom.mybatisdruid.dto.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface StudentMapper {

    @Select("select * from student")
    public List<Student> listAll();

    @Select("insert student(name,age) values(#{name}, #{age})")
    public void insert(Student student);
}

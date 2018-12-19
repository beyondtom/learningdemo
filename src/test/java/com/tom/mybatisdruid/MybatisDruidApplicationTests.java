package com.tom.mybatisdruid;

import com.tom.mybatisdruid.mapper.StudentMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisDruidApplicationTests {

    @Autowired
    StudentMapper mapper;
    @Test
    public void contextLoads() {
        System.out.println(this.mapper.listAll());
    }

}


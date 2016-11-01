package com.group.eams.test;

import com.group.eams.service.IEmployeeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by zcy-fover on 2016/11/1.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring-config.xml",
                                   "classpath:spring/spring-mvc.xml",
                                   "classpath:mybatis/mybatis-config.xml"})
public class EmployeeTest {
    @Autowired
    private IEmployeeService service = null;

    @Test
    public void findEmployee(){
        System.out.println(service.getEmployeeList());
    }

}

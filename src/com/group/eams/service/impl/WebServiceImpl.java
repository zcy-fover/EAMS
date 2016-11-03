package com.group.eams.service.impl;

import com.group.eams.entity.Employee;
import com.group.eams.mapper.EmployeeMapper;
import com.group.eams.service.IWebService;
import com.group.eams.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zcy-fover on 2016/11/2.
 */
@Service
public class WebServiceImpl implements IWebService{

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public Result getEmployee(Employee employee){
        Result result = new Result();
        result.setSuccess(false);
        Employee queryResult = employeeMapper.findEmployeeByAccount(employee.getAccount());
        if (queryResult == null){
            result.setMessage("该员工不存在");
            return result;
        } else if (employee.getAccount() != queryResult.getAccount()){
            result.setMessage("用户名错误");
            return result;
        } else if (employee.getPassword() != queryResult.getPassword()){
            result.setMessage("密码错误");
            return result;
        } else {
            result.setSuccess(true);
            return result;
        }
    }
}

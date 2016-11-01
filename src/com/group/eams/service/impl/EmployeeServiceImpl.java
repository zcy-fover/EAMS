package com.group.eams.service.impl;

import com.group.eams.entity.Employee;
import com.group.eams.mapper.EmployeeMapper;
import com.group.eams.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zcy-fover on 2016/10/31.
 */
@Service
public class EmployeeServiceImpl implements IEmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    /**
     * @param account
     * @param password
     * @return
     */
    @Override
    public String findEmployeeByAccount(String account, String password) {
        Employee employee = employeeMapper.findEmployeeByAccount(account);
        if (employee != null){
            if (account.equals(employee.getAccount()) && password.equals(employee.getPassword())){
                return "登录成功";
            } else {
                return "帐号或密码错误";
            }
        } else {
            return "用户不存在";
        }
    }

    /**
     * 获取员工列表
     *
     * @return
     */
    @Override
    public List<Employee> getEmployeeList() {
        return employeeMapper.getAllEmployee();
    }
}

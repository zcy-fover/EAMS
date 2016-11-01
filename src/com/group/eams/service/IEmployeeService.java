package com.group.eams.service;

import com.group.eams.entity.Employee;

import java.util.List;

/**
 * Created by zcy-fover on 2016/10/31.
 */
public interface IEmployeeService {

    /**
     *
     * @param account
     * @param password
     * @return
     */
    public String findEmployeeByAccount(String account, String password);

    /**
     * 获取员工列表
     * @return
     */
    public List<Employee> getEmployeeList();

}

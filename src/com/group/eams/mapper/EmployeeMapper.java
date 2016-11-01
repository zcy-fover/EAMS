package com.group.eams.mapper;

import com.group.eams.entity.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by zcy-fover on 2016/10/31.
 */
@Repository
public interface EmployeeMapper {
    /**
     * 根据登陆时的帐号查询用户
     *
     * @param account
     * @return
     */
    public Employee findEmployeeByAccount(String account);

    /**
     * 获取员工列表
     * @return
     */
    List<Employee> getAllEmployee();
}

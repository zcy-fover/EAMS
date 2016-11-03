package com.group.eams.service;

import com.group.eams.entity.Employee;
import com.group.eams.util.Result;

/**
 * Created by zcy-fover on 2016/11/2.
 */
public interface IWebService {
    /**
     * 根据前台seesion中封装的employee对象查询数据库是否存在该员工
     * @param employee
     * @return
     */
    public Result getEmployee(Employee employee);
}

package com.group.eams.interceptor;

import com.group.eams.entity.Employee;
import org.springframework.web.portlet.handler.HandlerInterceptorAdapter;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by zcy-fover on 2016/11/2.
 * 登陆拦截器，放置未登录时访问系统
 */
public class LoginInterceptor implements HandlerInterceptor{

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {

        Employee employee = (Employee) httpServletRequest.getSession().getAttribute("employee");
        HttpSession session = httpServletRequest.getSession();
        if (employee == null){
            session.setAttribute("message", "您还没有登录 | 请先登录");
            httpServletResponse.sendRedirect(httpServletRequest.getContextPath() + "/login");
            return false;
        } else {
            return true;
        }
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}

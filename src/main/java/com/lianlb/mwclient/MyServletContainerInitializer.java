package com.lianlb.mwclient;

import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.context.annotation.Configuration;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import java.util.Set;

/**
 * 测试
 */
//@Configuration
public class MyServletContainerInitializer implements ServletContextInitializer {

//    @Override
//    public void onStartup(Set<Class<?>> set, ServletContext servletContext) throws ServletException {
//        System.out.println("------------- 知否执行过程 -------------");
//    }

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        System.out.println("------------- 实现ServletContextInitializer -------------");
    }
}

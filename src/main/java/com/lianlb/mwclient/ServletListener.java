package com.lianlb.mwclient;

import org.springframework.context.annotation.Configuration;
import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
//@Configuration
public class ServletListener implements ServletContextListener {


    public ServletListener() {
        System.out.println("查看看类加载器 ... ");
        System.out.println("MyServletContainerInitializer = " + MyServletContainerInitializer.class.getClassLoader());
        System.out.println("ServletContainerInitializer = " + ServletContainerInitializer.class.getClassLoader());

        System.out.println("查看加载类所在jar包路径 ... ");
        System.out.println("MyServletContainerInitializer = " + MyServletContainerInitializer.class.getProtectionDomain().getCodeSource().getLocation());
        System.out.println("ServletContainerInitializer = " + ServletContainerInitializer.class.getProtectionDomain().getCodeSource().getLocation());

    }

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("init ... ");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("destroy ... ");
    }
}

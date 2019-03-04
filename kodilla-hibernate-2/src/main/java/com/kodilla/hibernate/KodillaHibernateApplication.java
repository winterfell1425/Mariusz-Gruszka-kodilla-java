package com.kodilla.hibernate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
//public class KodillaHibernateApplication extends SpringBootServletInitializer {
public class KodillaHibernateApplication {

    public static void main(String[] args) {
        SpringApplication.run(KodillaHibernateApplication.class, args);
    }
    //@Override
   // protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        //return application.sources(KodillaHibernateApplication.class);
   // }
}


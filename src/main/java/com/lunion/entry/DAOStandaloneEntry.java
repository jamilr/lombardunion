package com.lunion.entry;

import com.lunion.dao.PersonDAO;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by jr on 8/18/2014.
 */

public class DAOStandaloneEntry {

    private static ClassPathXmlApplicationContext context;

    public static void main(String... args) {

        context = new ClassPathXmlApplicationContext("classpath:app-context.xml");

        PersonDAO dao = (PersonDAO)context.getBean("PersonDAO");


    }



}

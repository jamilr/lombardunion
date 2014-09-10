package com.lunion.util;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

public abstract class CustomHibernateDAOSupport extends HibernateDaoSupport {

    @Autowired
    public void setSF(SessionFactory sessionFactory) {

        setSessionFactory(sessionFactory);
    }

}
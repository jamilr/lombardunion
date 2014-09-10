package com.lunion.dao.dao.test;

import com.lunion.dao.BaseDAO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by jr on 8/20/2014.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:app-context.xml", "classpath:hibernate.cfg.xml"})
public class PersonDAOTest {

    @Autowired
    private BaseDAO baseDAO;

    @Test
    public final void testSaveData() {


        //baseDAO.save(currency);
    }
}

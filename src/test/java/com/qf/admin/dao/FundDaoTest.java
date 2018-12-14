package com.qf.admin.dao;

import com.qf.admin.pojo.po.Fund;
import com.qf.admin.pojo.vo.PageInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class FundDaoTest {
    @Autowired
        private FundDao fundDao;
    @Test
    public void showfund() {
        PageInfo pageInfo = new PageInfo();
        pageInfo.setPagesize(10);
        pageInfo.setPageindex(4);
        List<Fund> showfund = fundDao.showfund(pageInfo);
        System.out.println(pageInfo.getOffset());
        System.out.println(showfund);
    }
}
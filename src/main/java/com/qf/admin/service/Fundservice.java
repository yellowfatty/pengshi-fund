package com.qf.admin.service;

import com.qf.admin.pojo.po.Fund;
import com.qf.admin.pojo.vo.PageInfo;

import javax.swing.*;
import java.util.List;

public interface Fundservice {


    List<Fund> getlistfunds();

    List<Fund> pagefunds(String cid);

    Fund getfund(String jid);

    int updatefund(Fund fund);

    void deletefund(String jid);

    List<Fund> searchfund(String search);

    void addjijin(Fund fund);


    PageInfo numberfunds(int pageindex, int pagesize);
}

package com.qf.admin.dao;


import com.qf.admin.pojo.po.Fund;
import com.qf.admin.pojo.vo.PageInfo;
import org.apache.ibatis.annotations.Param;

import javax.swing.*;
import java.util.List;

public interface FundDao {

    List<Fund> getlistfunds();

    List<Fund> pagefunds(String cid);

    Fund getfund(String jid);

    int updatefund(Fund fund);

    void deletefund(String jid);

    List<Fund> searchfund(String search);

    void addjijin(Fund fund);

    int countfund();

    List<Fund> showfund(PageInfo pageInfo);   
}

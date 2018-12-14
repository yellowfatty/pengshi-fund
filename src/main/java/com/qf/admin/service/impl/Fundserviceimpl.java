package com.qf.admin.service.impl;

import com.qf.admin.dao.FundDao;
import com.qf.admin.pojo.po.Fund;
import com.qf.admin.pojo.vo.PageInfo;
import com.qf.admin.service.Fundservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.*;
import java.util.List;

@Service
public class Fundserviceimpl implements Fundservice {
    @Autowired
    private FundDao fundDao;
    @Override
    //全部基金
    public List<Fund> getlistfunds() {
        try {
            return fundDao.getlistfunds();
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    //分页的基金
    public List<Fund> pagefunds(String cid) {
        try {
            return fundDao.pagefunds(cid);
        }catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    //查询单个基金

    @Override
    public int updatefund(Fund fund) {
        try {
            return fundDao.updatefund(fund);
        }catch (Exception e){
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public void deletefund(String jid) {
        try {
           fundDao.deletefund(jid);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public Fund getfund(String jid) {
        try {
            return fundDao.getfund(jid);
        }catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public List<Fund> searchfund(String search) {
        try {
            return fundDao.searchfund(search);
        }catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public void addjijin(Fund fund) {
        try {
            fundDao.addjijin(fund);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public PageInfo numberfunds(int pageindex, int pagesize) {
        PageInfo pageInfo = new PageInfo();
        //    一共有多少商品
        int countfund = fundDao.countfund();
        System.out.println("一共有商品"+countfund);
        pageInfo.setFundcount(countfund);
        // 每页显示的几个商品
        pageInfo.setPagesize(pagesize);
        System.out.println("每页显示"+pagesize);
        //一共有几页
        int pagefunds = (countfund+pagesize-1)/pagesize;
        pageInfo.setTotalfund(pagefunds);
        System.out.println("一共有几页"+pagefunds);
        //当前页的页码
        pageInfo.setPageindex(pageindex);
        System.out.println("当前页的页码"+pageindex);
        //当前页所展示的商品
        List<Fund> funds = fundDao.showfund(pageInfo);
//       if(pageInfo.getListfunds()==null){
//           pageInfo.setListfunds(funds);
//       }else{
//           pageInfo.getListfunds().clear();
//           pageInfo.setListfunds(funds);
//       }
        pageInfo.setListfunds(funds);
        System.out.println("当前页展示的商品"+funds);
        System.out.println("offset"+pageInfo.getOffset());

        return pageInfo;
    }
}

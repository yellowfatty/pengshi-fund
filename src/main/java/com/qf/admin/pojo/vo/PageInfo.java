package com.qf.admin.pojo.vo;


import com.qf.admin.pojo.po.Fund;

import java.util.List;

public class PageInfo {
//    一共有多少商品
    private int fundcount;
    // 每页显示的几个商品
    private int pagesize;
    //一共有几页
    private int totalfund;
    //当前页的页码
    private int pageindex;
    //当前页所展示的商品
    private List<Fund> listfunds;
    //sql语句的前缀
  private int offset;

    public int getFundcount() {
        return fundcount;
    }

    public void setFundcount(int fundcount) {
        this.fundcount = fundcount;
    }

    public int getTotalfund() {
        return totalfund;
    }

    public void setTotalfund(int totalfund) {
        this.totalfund = totalfund;
    }

    public List<Fund> getListfunds() {
        return listfunds;
    }

    public void setListfunds(List<Fund> listfunds) {
        this.listfunds = listfunds;
    }
//    private int offset;

    public int getPageindex() {
        return pageindex;
    }

    public void setPageindex(int pageindex) {
        this.pageindex = pageindex;
    }

    public int getPagesize() {
        return pagesize;
    }

    public void setPagesize(int pagesize) {
        this.pagesize = pagesize;
    }

    public int getOffset() {
        System.out.println(pagesize);
        return (pageindex-1)*pagesize;
    }
}

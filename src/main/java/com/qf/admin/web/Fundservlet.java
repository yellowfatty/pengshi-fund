package com.qf.admin.web;

import com.qf.admin.pojo.po.Fund;
import com.qf.admin.pojo.vo.PageInfo;
import com.qf.admin.service.impl.Fundserviceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.swing.*;
import java.util.List;

@Controller
public class Fundservlet {
    @Autowired
    Fundserviceimpl fundserviceimpl;
//  全部基金分页
//    @RequestMapping(value = "indexFund",method = RequestMethod.GET)
//    public String listFund(@RequestParam(defaultValue = "1") Integer pageindex,@RequestParam(defaultValue = "8") Integer pagesize){
//        System.out.println(pageindex);
//        System.out.println(pagesize);
//        List<Fund> funds = fundserviceimpl.listFundBypage(PageInfo pageinfo);
//        return "index";
//    }
        @RequestMapping(value = "/indexFund",method = RequestMethod.GET)
        public String getFunds(Model model){
            List<Fund> funds = fundserviceimpl.getlistfunds();
           // System.out.println(funds);
            model.addAttribute("fund",funds);
            return"index";
        }
        @RequestMapping(value = "/pagefund",method = RequestMethod.GET)
        public String pagefunds(String cid,Model model){
            List<Fund> pagefund = fundserviceimpl.pagefunds(cid);
            model.addAttribute("fund",pagefund);
           // System.out.println(pagefund);
            return "index";
        }
        @RequestMapping(value = "/updatefund",method = RequestMethod.GET)
        public String update(String jid,Model model){
            Fund fund = fundserviceimpl.getfund(jid);
//            System.out.println(fund);
            model.addAttribute("fund",fund);
            return "upbatewebpage";
        }
        @RequestMapping(value = "/updatejijin",method = RequestMethod.POST)
        public String updatefund(Fund fund){
          //  System.out.println(fund);
            int upfund = fundserviceimpl.updatefund(fund);
            return "redirect:indexFund";
        }
        @RequestMapping(value = "/deletefund",method = RequestMethod.GET)
        public String deletefund(String jid){
            fundserviceimpl.deletefund(jid);
            return "redirect:indexFund";
        }
        @RequestMapping(value = "/searchfund",method = RequestMethod.POST)
        public String searchfund(String search,Model model){
            List<Fund> funds = fundserviceimpl.searchfund(search);
            model.addAttribute("fund",funds);
            System.out.println(funds);
            return "index";
        }
        @RequestMapping(value = "/addjijin",method = RequestMethod.POST)
        public String addjijin(Fund fund){
            fundserviceimpl.addjijin(fund);
            System.out.println(fund);
            return "redirect:indexFund";
        }
    @RequestMapping(value = "/addjijin1",method = RequestMethod.GET)
    public String addjijin1(){
        return "addwebpage";
    }

    @RequestMapping(value = "numberfunds",method = RequestMethod.GET)
    public String numberfunds(@RequestParam(defaultValue = "1") int pageindex,@RequestParam(defaultValue = "10") int pagesize,Model model){
        System.out.println("前端出入的页数"+pageindex);
           PageInfo pageInfo = fundserviceimpl.numberfunds(pageindex,pagesize);
           model.addAttribute("pageInfo",pageInfo);
           model.addAttribute("fund",pageInfo.getListfunds());
            return"index";
    }
}

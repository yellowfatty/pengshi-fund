<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/12/8
  Time: 14:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>Bootstrap 101 Template</title>


    <link href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" rel="stylesheet">

</head>
<style>
    div{
        width: 500px;
        margin: auto;
        position: relative;
        top: 20px;

    }
    label{
        position: relative;
        top: 20px;
    }
</style>
<div class="header-wrap"style="position: relative;left: 100px;">
    <h3>鹏氏基金后台管理系统</h3>
</div>
<body>
<form action="updatejijin" method="post">
        <input type="hidden" name="jid" value="${fund.jid}">
        <div class="form-group" style="margin: auto;"/>
        <label  class="col-sm-2 control-label" >基金名</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" placeholder="基金名称" name="uname" value="${fund.uname}">
        </div>
        <div class="form-group" style="margin: auto;"/>
        <label  class="col-sm-2 control-label" >详情</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" placeholder="基金详情" name="details" value="${fund.details}">
        </div>
        <div class="form-group" style="margin: auto;"/>
        <label  class="col-sm-2 control-label" >年涨幅</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" placeholder="Email" name="percentnian" value="${fund.percentnian}">
        </div>

        <div class="form-group" style="margin: auto;"/>
        <label class="col-sm-2 control-label" >日涨幅</label>
        <div class="col-sm-10">
            <input type="text" class="form-control"  placeholder="日涨幅百分比" name="percentri" value="${fund.percentri}">
        </div>

        <div class="form-group" style="margin: auto;"/>
        <label  class="col-sm-2 control-label" >时长</label>
        <div class="col-sm-10">
            <input type="text" class="form-control"  placeholder="赎回时长" name="redeem"  value="${fund.redeem}">
        </div>

        <div class="form-group" style="margin: auto;"/>
        <label  class="col-sm-2 control-label" >净值</label>
        <div class="col-sm-10">
            <input type="text" class="form-control"  placeholder="净值" name="networth"  value="${fund.networth}">
        </div>

        <div class="form-group" style="margin: auto;"/>
        <label  class="col-sm-2 control-label" >期限</label>
        <div class="col-sm-10">
            <input type="text" class="form-control"  placeholder="基金期限" name="time" value="${fund.time}">
        </div>

        <div class="form-group" style="margin: auto;"/>
        <label  class="col-sm-2 control-label" >起投额</label>
        <div class="col-sm-10">
            <input type="text" class="form-control"  placeholder="基金起投金额" name="money" value="${fund.money}">
        </div>

        <div class="form-group" style="margin: auto;"/>
        <label class="col-sm-2 control-label" >类型</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" placeholder="基金类型1，2，3，4，5，6" name="cid" value="${fund.cid}">
        </div>

        <div class="form-group" style="margin: auto;"/>
        <label class="col-sm-2 control-label" >规模</label>
        <div class="col-sm-10">
            <input type="text" class="form-control"  placeholder="基金规模" name="scale"  value="${fund.scale}">
        </div>

        <div class="form-group" style="margin: auto;"/>
        <label  class="col-sm-2 control-label" >风险</label>
        <div class="col-sm-10">
            <input type="text" class="form-control"  placeholder="基金风险" name="risk" value="${fund.risk}">
        </div>

        <div class="form-group" style="margin: auto;"/>
        <label  class="col-sm-2 control-label" >金额</label>
        <div class="col-sm-10">
            <input type="text" class="form-control"  placeholder="基金剩余可投金额" name="residue" value="${fund.residue}">
        </div>

        <div class="form-group" style="margin: auto;"/>
        <label class="col-sm-2 control-label" >期限</label>
        <div class="col-sm-10">
            <input type="text" class="form-control"  placeholder="基金购买期限" name="timeLimits" value="${fund.timeLimits}">
        </div>

        <div class="col-sm-12">
            <button type="submit" class="btn btn-success" style="margin-top: 50px;margin-left: 60px;">（修改）amend</button>
            <button type="reset" class="btn btn-warning" style="margin-top: 50px;margin-left: 120px;">（重置）reset</button>
        </div>




</form>
</body>
<script src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"></script>

</html>

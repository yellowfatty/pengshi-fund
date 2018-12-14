<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>飞勇基金股份有限公司</title>
    </q><link href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="header-wrap"style="position: relative;left: 100px;">
    <h3>飞勇基金股份有限公司</h3>
</div>
<!--导航条-->
<nav class="navbar navbar-default">
    <div class="container-fluid">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">首页</a>
        </div>
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav">
                <li ><a href="indexFund">全部基金</a></li>
                <li ><a href="addjijin1">添加基金</a></li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">基金类型<span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="pagefund?cid=1">股票型</a></li>
                        <li><a href="pagefund?cid=2">混合型</a></li>
                        <li><a href="pagefund?cid=3">货币型</a></li>
                        <li role="separator" class="divider"></li>
                        <li><a href="pagefund?cid=4">理财型</a></li>
                        <li><a href="pagefund?cid=5">指数型</a></li>
                        <li><a href="pagefund?cid=6">债劵型</a></li>
                    </ul>
                </li>
            </ul>
            <form class="navbar-form navbar-right" action="searchfund" method="post">
                <div class="form-group" align="right">
                    <input type="text" class="form-control" placeholder="请输入基金编号或基金名称" name="search">
                </div>
                <button type="submit" class="btn btn-info">搜索</button>
            </form>
        </div><!-- /.navbar-collapse -->
    </div><!-- /.container-fluid -->
</nav>

<table class="table table-hover">
    <tr>
        <td>基金ID</td>
        <td>基金名称</td>
        <td>基金年百分比</td>
        <td>基金日百分比</td>
        <td>基金净值</td>
        <td>基金起投金额</td>
        <td>基金规模</td>
        <td>基金时间</td>
        <td>基金操作</td>

    </tr>
    <c:forEach items="${fund}" var="fund">
    <tr>
        <td>${fund.jid}</td>
        <td>${fund.uname}</td>
        <td>${fund.percentnian}</td>
        <td>${fund.percentri}</td>
        <td>${fund.networth}</td>
        <td>${fund.money}</td>
        <td>${fund.scale}</td>
        <td>${fund.timeLimits}</td>
        <td>
            <a href="updatefund?jid=${fund.jid}"><button type="button" class="btn btn-primary">修改</button></a>
            <a href="deletefund?jid=${fund.jid}"><button type="button" class="btn btn-danger">删除</button></a>
        </td>

    </tr>
    </c:forEach>
<%--分页--%>
    <nav aria-label="Page navigation" style="position: absolute;bottom: -150px;right: 600px;">
        <ul class="pagination">
            <li>
                <c:if test="${pageInfo.pageindex==1 }">
                    <span aria-hidden="true">&laquo;</span>
                </c:if>
                <c:if test="${pageInfo.pageindex!=1 }">
                <a href="numberfunds?pageindex=${pageInfo.pageindex-1}" aria-label="Previous">
                    <span aria-hidden="true">&laquo;</span>
                </a>
                </c:if>
            </li>
                <%--items 一共有多少页--%>
                <c:forEach begin="1" end="${pageInfo.totalfund}" var="i">
                    <%--传入当前第几页--%>
                    <li><a href="numberfunds?pageindex=${i}">${i}</a></li>
                </c:forEach>

            <li>
                <c:if test="${pageInfo.totalfund==1 }">
                    <span aria-hidden="true">&raquo;</span>
                </c:if>
                <c:if test="${pageInfo.totalfund!=1 }">
                    <a href="numberfunds?pageindex=${pageInfo.pageindex+1}" aria-label="Previous">
                        <span aria-hidden="true">&raquo;</span>
                    </a>
                </c:if>
            </li>
        </ul>
    </nav>
</table>

<script src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"></script>
</body>
</html>
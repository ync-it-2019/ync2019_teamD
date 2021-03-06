<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>        
<html lang="en">

<head>

  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>SB Admin 2 - Bootstrap Admin Theme</title>

  <!-- Bootstrap Core CSS -->
  <link href="/resources/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

  <!-- MetisMenu CSS -->
  <link href="/resources/vendor/metisMenu/metisMenu.min.css" rel="stylesheet">

  <!-- Custom CSS -->
  <link href="/resources/dist/css/sb-admin-2.css" rel="stylesheet">

  <!-- Morris Charts CSS -->
  <link href="/resources/vendor/morrisjs/morris.css" rel="stylesheet">

  <!-- Custom Fonts -->
  <link href="/resources/vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

  <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
  <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
  <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>
	<%@include file="header.jsp"%>

    <div id="page-wrapper">
      <div class="row">
        <div class="col-lg-12">
          <h1 class="page-header">프로젝트 통계</h1>
        </div>
      </div>
      <div class="row">
        <div class="col-lg-4 col-md-6">
          <div class="panel panel-primary">
            <div class="panel-heading">
              <div class="row">
                <div class="col-xs-3">
                  <i class="glyphicon glyphicon-education fa-5x"></i>
                </div>
                <div class="col-xs-9 text-right">
                  <div class="huge">${count.cnt} 개</div>
                  <div>투자에 참여한 프로젝트 수</div>
                </div>
              </div>
            </div>
            <a href="#">
              <div class="panel-footer">
                <span class="pull-left">View Details</span>
                <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
                <div class="clearfix"></div>
              </div>
            </a>
          </div>
        </div>
        <div class="col-lg-4 col-md-6">
          <div class="panel panel-green">
            <div class="panel-heading">
              <div class="row">
                <div class="col-xs-3">
                  <i class="glyphicon glyphicon-usd fa-5x"></i>
                </div>
                <div class="col-xs-9 text-right">
                  <div class="huge">
                  <fmt:formatNumber type="number" maxFractionDigits="3" 
	        	value="${count.inv}" />
                  </div>
                  <div>전체 프로젝트 투자금액</div>
                </div>
              </div>
            </div>
            <a href="#">
              <div class="panel-footer">
                <span class="pull-left">View Details</span>
                <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
                <div class="clearfix"></div>
              </div>
            </a>
          </div>
        </div>
        <div class="col-lg-4 col-md-6">
          <div class="panel panel-yellow">
            <div class="panel-heading">
              <div class="row">
                <div class="col-xs-3">
                  <i class="glyphicon glyphicon-user fa-5x"></i>
                </div>
                <div class="col-xs-9 text-right">
                  <div class="huge">${idCnt.id} 명</div>
                  <div>투자자 수</div>
                </div>
              </div>
            </div>
            <a href="#">
              <div class="panel-footer">
                <span class="pull-left">View Details</span>
                <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
                <div class="clearfix"></div>
              </div>
            </a>
          </div>
        </div>
        <div class="col-lg-12"></div>
        <div class="col-lg-12">
          <h4>투자자 랭킹</h4>
          <!-- Tab panes -->
          <table class="table table-hover" id="categoryTableIng">
            <thead>
              <tr>
                <th onclick="w3.sortHTML('#categoryTableIng', '.item', 'td:nth-child(1)')" style="cursor:pointer">
                  No</th>
                <th onclick="w3.sortHTML('#categoryTableIng', '.item', 'td:nth-child(2)')" style="cursor:pointer">
                  아이디</th>
                <th onclick="w3.sortHTML('#categoryTableIng', '.item', 'td:nth-child(3)')" style="cursor:pointer">
                  실명</th>
                <th onclick="w3.sortHTML('#categoryTableIng', '.item', 'td:nth-child(4)')" style="cursor:pointer">
                  누적 투자금액</th>
              </tr>
            </thead>
            <tbody>
            <c:forEach items="${member}" var="Member">
              <tr class="item">
                <td>${Member.rownum}</td>
                <td>${Member.userid}</td>
                <td>${Member.name}</td>
                <td>${Member.su}</td>
              </tr>
             </c:forEach>
              <!-- <tr class="item">
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                  </tr> -->
            </tbody>
          </table>
        </div>
        <!-- /#page-wrapper -->

      </div>
      <!-- /#wrapper -->

      <!-- jQuery -->
      <script src="/resources/vendor/jquery/jquery.min.js"></script>

      <!-- Bootstrap Core JavaScript -->
      <script src="/resources/vendor/bootstrap/js/bootstrap.min.js"></script>

      <!-- Metis Menu Plugin JavaScript -->
      <script src="/resources/vendor/metisMenu/metisMenu.min.js"></script>

      <!-- Morris Charts JavaScript -->
      <script src="/resources/vendor/raphael/raphael.min.js"></script>
      <script src="/resources/vendor/morrisjs/morris.min.js"></script>
      <script src="/resources/data/morris-data.js"></script>

      <!-- Custom Theme JavaScript -->
      <script src="/resources/dist/js/sb-admin-2.js"></script>
      <script src="/resources/js/w3.js"></script>

</body>

</html>

<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
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

  <div id="wrapper">

    <!-- Navigation -->
    <nav class="navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">
      <div class="navbar-header">
        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
          <span class="sr-only">Toggle navigation</span>
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
        </button>
        <a class="navbar-brand" href="index.html">Gorenani</a>
      </div>
      <!-- /.navbar-header -->

      <ul class="nav navbar-top-links navbar-right">
        <!-- /.dropdown -->
        <li class="dropdown">
          <a class="dropdown-toggle" data-toggle="dropdown" href="#">
            <i class="fa fa-tasks fa-fw"></i> <i class="fa fa-caret-down"></i>
          </a>
          <ul class="dropdown-menu dropdown-tasks">
            <li>
              <a href="#">
                <div>
                  <p>
                    <strong>Task 1</strong>
                    <span class="pull-right text-muted">40% Complete</span>
                  </p>
                  <div class="progress progress-striped active">
                    <div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="40" aria-valuemin="0" aria-valuemax="100" style="width: 40%">
                      <span class="sr-only">40% Complete (success)</span>
                    </div>
                  </div>
                </div>
              </a>
            </li>
            <li class="divider"></li>
            <li>
              <a href="#">
                <div>
                  <p>
                    <strong>Task 2</strong>
                    <span class="pull-right text-muted">20% Complete</span>
                  </p>
                  <div class="progress progress-striped active">
                    <div class="progress-bar progress-bar-info" role="progressbar" aria-valuenow="20" aria-valuemin="0" aria-valuemax="100" style="width: 20%">
                      <span class="sr-only">20% Complete</span>
                    </div>
                  </div>
                </div>
              </a>
            </li>
            <li class="divider"></li>
            <li>
              <a href="#">
                <div>
                  <p>
                    <strong>Task 3</strong>
                    <span class="pull-right text-muted">60% Complete</span>
                  </p>
                  <div class="progress progress-striped active">
                    <div class="progress-bar progress-bar-warning" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 60%">
                      <span class="sr-only">60% Complete (warning)</span>
                    </div>
                  </div>
                </div>
              </a>
            </li>
            <li class="divider"></li>
            <li>
              <a href="#">
                <div>
                  <p>
                    <strong>Task 4</strong>
                    <span class="pull-right text-muted">80% Complete</span>
                  </p>
                  <div class="progress progress-striped active">
                    <div class="progress-bar progress-bar-danger" role="progressbar" aria-valuenow="80" aria-valuemin="0" aria-valuemax="100" style="width: 80%">
                      <span class="sr-only">80% Complete (danger)</span>
                    </div>
                  </div>
                </div>
              </a>
            </li>
            <li class="divider"></li>
            <li>
              <a class="text-center" href="#">
                <strong>See All Tasks</strong>
                <i class="fa fa-angle-right"></i>
              </a>
            </li>
          </ul>
          <!-- /.dropdown-tasks -->
        </li>
        <!-- /.dropdown -->
        <li class="dropdown">
          <a class="dropdown-toggle" data-toggle="dropdown" href="#">
            <i class="fa fa-bell fa-fw"></i> <i class="fa fa-caret-down"></i>
          </a>
          <ul class="dropdown-menu dropdown-alerts">
            <li>
              <a href="#">
                <div>
                  <i class="fa fa-comment fa-fw"></i> New Comment
                  <span class="pull-right text-muted small">4 minutes ago</span>
                </div>
              </a>
            </li>
            <li class="divider"></li>
            <li>
              <a href="#">
                <div>
                  <i class="fa fa-twitter fa-fw"></i> 3 New Followers
                  <span class="pull-right text-muted small">12 minutes ago</span>
                </div>
              </a>
            </li>
            <li class="divider"></li>
            <li>
              <a href="#">
                <div>
                  <i class="fa fa-envelope fa-fw"></i> Message Sent
                  <span class="pull-right text-muted small">4 minutes ago</span>
                </div>
              </a>
            </li>
            <li class="divider"></li>
            <li>
              <a href="#">
                <div>
                  <i class="fa fa-tasks fa-fw"></i> New Task
                  <span class="pull-right text-muted small">4 minutes ago</span>
                </div>
              </a>
            </li>
            <li class="divider"></li>
            <li>
              <a href="#">
                <div>
                  <i class="fa fa-upload fa-fw"></i> Server Rebooted
                  <span class="pull-right text-muted small">4 minutes ago</span>
                </div>
              </a>
            </li>
            <li class="divider"></li>
            <li>
              <a class="text-center" href="#">
                <strong>See All Alerts</strong>
                <i class="fa fa-angle-right"></i>
              </a>
            </li>
          </ul>
          <!-- /.dropdown-alerts -->
        </li>
        <!-- /.dropdown -->
        <li class="dropdown">
          <a class="dropdown-toggle" data-toggle="dropdown" href="#">
            <i class="fa fa-user fa-fw"></i> <i class="fa fa-caret-down"></i>
          </a>
          <ul class="dropdown-menu dropdown-user">
            <li><a href="#"><i class="fa fa-user fa-fw"></i> User Profile</a>
            </li>
            <li><a href="#"><i class="fa fa-gear fa-fw"></i> Settings</a>
            </li>
            <li class="divider"></li>
            <li><a href="login.html"><i class="fa fa-sign-out fa-fw"></i> Logout</a>
            </li>
          </ul>
          <!-- /.dropdown-user -->
        </li>
        <!-- /.dropdown -->
      </ul>
      <!-- /.navbar-top-links -->

      <div class="navbar-default sidebar" role="navigation">
        <div class="sidebar-nav navbar-collapse">
          <ul class="nav" id="side-menu">
            <li class="sidebar-search">
              <div class="input-group custom-search-form">
                <input type="text" class="form-control" placeholder="Search...">
                <span class="input-group-btn">
                  <button class="btn btn-default" type="button">
                    <i class="fa fa-search"></i>
                  </button>
                </span>
              </div>
              <!-- /input-group -->
            </li>
            <li>
              <a href="index.html"><i class="fa fa-dashboard fa-fw"></i> 회원 관리 <span class="fa arrow"></span></a>
              <ul class="nav nav-second-level">
                <li>
                  <a href="admin_member">회원 목록</a>
                </li>
                <li>
                  <a href="admin_withdraw">탈퇴 신청</a>
                </li>
              </ul>
            </li>
            <li>
              <a href="#"><i class="fa fa-bar-chart-o fa-fw"></i> 프로젝트 관리 <span class="fa arrow"></a>
              <ul class="nav nav-second-level">
                <li>
                  <a href="admin_project">프로젝트 목록</a>
                </li>
                <li>
                  <a href="admin_openProject">오픈 예정 프로젝트</a>
                </li>
                <li>
                  <a href="admin_endProject">마감 된 프로젝트</a>
                </li>
                <li>
                  <a href="admin_writeProject">프로젝트 신청 목록</a>
                </li>
                <li>
                  <a href="admin_comment">댓글 목록</a>
                </li>
              </ul>
              <!-- /.nav-second-level -->
            </li>
            <li>
              <a href="tables.html"><i class="fa fa-table fa-fw"></i> 통계 <span class="fa arrow"></a>
              <ul class="nav nav-second-level">
                <li>
                  <a href="admin_dashboardProject">프로젝트 통계</a>
                </li>
                <li>
                  <a href="admin_invest">투자 통계</a>
                </li>
              </ul>
            </li>
            <li>
              <a href="forms.html"><i class="fa fa-edit fa-fw"></i> 고객센터 <span class="fa arrow"></a>
              <ul class="nav nav-second-level">
                <li>
                  <a href="admin_inqury">공지사항</a>
                </li>
                <li>
                  <a href="admin_1-1inqury">1:1 문의</a>
                </li>
                <li>
                  <a href="admin_faq">FAQ</a>
                </li>
              </ul>
            </li>

          </ul>
        </div>
        <!-- /.sidebar-collapse -->
      </div>
      <!-- /.navbar-static-side -->
    </nav>

			<div id="page-wrapper">
			      <div class="row">
			        <div class="col-lg-12">
			          <h1 class="page-header">공지 사항</h1>
			        </div>
			      <table class="table-bordered">				
						<tbody>
							<tr>
								<th>NO</th>
								<td align="left">${notice.notice_num }</td>
							</tr>
							<tr>
								<th>제목</th>
								<td>${notice.title }</td>
							</tr>
							<tr>
								<th>내용</th>
								<td>${notice.content }</td>
							</tr>
							<tr>
								<th>첨부파일</th>
								<td>${notice.attach }</td>
							</tr>
						</tbody>
					</table>

					
					<button data-oper='list' class="btn btn-info" onclick="location.href='admin_inqury'">List</button>

					<form id='operForm' action="/admin/modify" method="get">
					  <input type='hidden' id='bno' name='notice_num' value='<c:out value="${notice.notice_num}"/>'>
					  <input type='hidden' name='pageNum' value='<c:out value="${cri.pageNum}"/>'>
					  <input type='hidden' name='amount' value='<c:out value="${cri.amount}"/>'>
					  <input type='hidden' name='keyword' value='<c:out value="${cri.keyword}"/>'>
					  <input type='hidden' name='type' value='<c:out value="${cri.type}"/>'>  
					</form>
				</div>
				<div class="clearfix"> </div>
			</div>
       </div>


      
<script type="text/javascript" src="/resources/js/reply.js?v=1.0"></script>

<script type="text/javascript">
$(document).ready(function () {
	  
	var bnoValue = '<c:out value="${notice.notice_num}"/>';
	var replyUL = $(".chat");
	  
	showList(1);
	
});
</script>

<script type="text/javascript">

function replaceEscapeStr(str) {
	return str.replace("\\","\\\\");
}

$(document).ready(function() {
  
	var operForm = $("#operForm");
    
	$("button[data-oper='list']").on("click", function(e){
    
		operForm.find("#notice_num").remove();
		operForm.attr("action","/admin/admin_inqury")
		operForm.submit();
    
	});
}); 

</script>

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
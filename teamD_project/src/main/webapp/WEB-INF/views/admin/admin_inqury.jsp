<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

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
        <a class="navbar-brand" href="admin_member">Gorenani</a>
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
        <form action="">
          <div class="col-lg-4">
            <input type="text" name="search" placeholder="검색" class="form-control">
          </div>
          <div class="col-lg-4">
            <button type="submit" class="btn btn-info">검색</button>
          </div>
        </form>
        <a href='admin_inquryWrite' class='mypageLinkEditBtn'>New Board</a>
        <table class="table table-hover" id="myTable">
          <thead>
            <!-- 태그 누르면 정렬됨 -->
            <tr class="item">
              <th onclick="w3.sortHTML('#myTable', '.itemss', 'td:nth-child(1)')" style="cursor:pointer">No</th>
              <th onclick="w3.sortHTML('#myTable', '.itemss', 'td:nth-child(2)')" style="cursor:pointer">제목</th>
              <th onclick="w3.sortHTML('#myTable', '.itemss', 'td:nth-child(3)')" style="cursor:pointer">등록일</th>
            </tr>				
          </thead>         
          <tbody>
          <c:forEach items="${list}" var="notice">
			<tr>
				<td><c:out value="${notice.notice_num}" /></td>
	
				<td><a href="/admin/admin_inquryView?notice_num=${notice.notice_num}">
									   <c:out value="${notice.title}" /></a></td>
								
				<td><fmt:formatDate pattern="yyyy-MM-dd"
						value="${notice.reg_date}" /></td>
			</tr>
		</c:forEach>         
          </tbody>
        </table>
        		<div class='pull-right'>
					<ul class="pagination">
						<c:if test="${pageMaker.prev}">
							<li class="paginate_button previous"><a
								href="${pageMaker.startPage -1}">Previous</a></li>
						</c:if>

						<c:forEach var="num" begin="${pageMaker.startPage}"
							end="${pageMaker.endPage}">
							<li class="paginate_button  ${pageMaker.cri.pageNum == num ? "active":""} ">
								<a href="${num}">${num}</a>
							</li>
						</c:forEach>

						<c:if test="${pageMaker.next}">
							<li class="paginate_button next"><a
								href="${pageMaker.endPage +1 }">Next</a></li>
						</c:if>
					</ul>
				</div>
				<form id='actionForm' action="/admin/admin_inqury" method='get'>
					<input type='hidden' name='pageNum'
						   value='${pageMaker.cri.pageNum}'>
					<input type='hidden' name='amount' 
					       value='${pageMaker.cri.amount}'>
				</form>
				</div>
				<div class="clearfix"> </div>
			</div>
       </div>
 <!--//contact-->
 <!--/grids-->
  
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
	<script type="text/javascript">
		$(document).ready(function() {
			/*
				var defaults = {
				containerID: 'toTop', // fading element id
				containerHoverID: 'toTopHover', // fading element hover id
				scrollSpeed: 1200,
				easingType: 'linear'
				};
			 */

			$().UItoTop({
				easingType : 'easeOutQuart'
			});

		});
		
		    var actionForm = $("#actionForm");

            $(".paginate_button a").on("click", function(e) {
			e.preventDefault();
			console.log('click');
			actionForm.find("input[name='pageNum']").val($(this).attr("href")); //a태그를 의미함 = 페이지 번호"#num"
			actionForm.submit();
		});
	</script>
	<!--$(".move").on("click", function(e){
		
		e.preventDefault();
		actionForm.append("<input type='hidden' name='notice_num' value='"+
				$(this).attr("href")+"'>");
		actionForm.attr("action", "/admin/admin_inqury");
		actionForm.submit();
	});-->


</body>

</html>

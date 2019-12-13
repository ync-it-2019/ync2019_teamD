<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
				<h1 class="page-header">1:1 문의 상세보기</h1>
			</div>
			<table class="table-bordered">
				<tbody>
					<div class="col-sm-2" style="background-color: lavenderblush;">
						<h5>게시글 번호</h5>
					</div>
					<div class="col-sm-10">
						<h5>${inqury.inqury_num }</h5>
					</div>
					<div class="col-sm-2" style="background-color: lavenderblush;">
						<h5>작성날짜</h5>
					</div>
					<div class="col-sm-10">
						<h5>${inqury.reg_date }</h5>
					</div>
					<div class="col-sm-2" style="background-color: lavenderblush;">
						<h5>작성자</h5>
					</div>
					<div class="col-sm-10">
						<h5>${inqury.userid }</h5>
					</div>
					<div class="col-sm-2" style="background-color: lavenderblush;">
						<h5>제목</h5>
					</div>
					<div class="col-sm-10">
						<h5>${inqury.title }</h5>
					</div>
					<div class="col-sm-2" style="background-color: lavenderblush;">
						<h5>내용</h5>
					</div>
					<div class="col-sm-10">
						<h5>${inqury.content }</h5>
					</div>
<%-- 					<div class="col-sm-2" style="background-color: lavenderblush;">
						<h5>첨부파일 </h5>
					</div>
					<div class="col-sm-10">
						<h5>${inqury.attach }</h5>
					</div> --%>
				</tbody>
			</table>
		</div>
				
		<div class="col-sm-4"></div>

		<div class="col-sm-2">
			<a href="admin_1-1inqury.html">
				<button type="button">목록</button>
			</a>
		</div>
		<form action="/admin/InquryDelete" method="post">
				<input type="hidden" name="${_csrf.parameterName}"
					   value="${_csrf.token}" /> 
				<input type="hidden" name="inqury_num"
					   value="${inqury.inqury_num}"> 
				<input type="submit"
					   value="삭제하기" onclick="alert('정말로 삭제처리하시겠습니까?')">
		</form>
		<div class="col-sm-4"></div>

		<div class="row">
			<div class="col-lg-12">
				<h1 class="page-header">답변</h1>
			</div>
			<form role="form" action="/admin/admin_1-1inquryView" method="post"
				  enctype="multiplart/form-data">
				<input type="hidden" name="inqury_num" value="${inqury.inqury_num}" />
				<input type="hidden" name="ripple_check" value="${inqury.ripple_check}">
				
				<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">
				<table class="table-bordered">
					<tbody>
						<c:if test="${inqury.ripple_check == 'N'}">
							<div class="col-sm-2" style="background-color: lavenderblush;">
								<h5>답변날짜</h5>
							</div>
							<div class="col-sm-10">
								<h5>${inqury.ripple_date }</h5>
							</div>
							<div class="col-sm-2" style="background-color: lavenderblush;">
								<h5>답변상태</h5>
							</div>
							<div class="col-sm-10">
								<h5>
								    <c:out value="${inqury.ripple_check}" />
								</h5>
							</div>
							<div class="col-sm-2" style="background-color: lavenderblush;">
								<h5>답변내용</h5>
							</div>
							<div class="col-sm-10">
								<input type="text" placeholder="성실하게 답변해주세요. "
									name="ripple_content" class="form-control">
							</div>

							<div class="col-sm-2"></div>

							<div class="col-sm-2">
								<input type="submit" id="submit2" value="답변하기">
							</div>
							
							<div class="col-sm-4"></div>
						</c:if>
						<c:if test="${inqury.ripple_check == 'Y'}">
							<div class="col-sm-2" style="background-color: lavenderblush;">
								<h5>답변날짜</h5>
							</div>
							<div class="col-sm-10">
								<h5>${inqury.ripple_date }</h5>
							</div>
							<div class="col-sm-2" style="background-color: lavenderblush;">
								<h5>답변상태</h5>
							</div>
							<div class="col-sm-10">
								<h5>
									<c:out value="${inqury.ripple_check}" />
								</h5>
							</div>
							<div class="col-sm-2" style="background-color: lavenderblush;">
								<h5>답변내용</h5>
							</div>
							<div class="col-sm-10">
								<h5>
									<c:out value="${inqury.ripple_content}" />
								</h5>
							</div>
						</c:if>
					</tbody>
				</table>
			</form>
		</div>
	</div>

	<!-- /#page-wrapper -->

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

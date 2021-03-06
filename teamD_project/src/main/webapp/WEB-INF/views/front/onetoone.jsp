<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!--
Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE html>
<html>

<head>
<title>Elite Shoppy an Ecommerce Online Shopping Category Flat
	Bootstrap Responsive Website Template | Contact :: w3layouts</title>
<!--/tags -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords"
	content="Elite Shoppy Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template,
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript">
	
	
		addEventListener("load", function() {
			setTimeout(hideURLbar, 0);
		}, false);

		function hideURLbar() {
			window.scrollTo(0, 1);
		}
	

</script>
<!--//tags -->
<link href="resources/css/bootstrap.css" rel="stylesheet"
	type="text/css" media="all" />
<link href="resources/css/style.css" rel="stylesheet" type="text/css"
	media="all" />
<link href="resources/css/jin_style.css" rel="stylesheet"
	type="text/css" media="all" />
<link href="resources/css/font-awesome.css" rel="stylesheet">
<!-- //for bootstrap working -->
<link
	href="//fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i,800"
	rel="stylesheet">
<link
	href='//fonts.googleapis.com/css?family=Lato:400,100,100italic,300,300italic,400italic,700,900,900italic,700italic'
	rel='stylesheet' type='text/css'>
</head>

<body>
	 <%@include file="header.jsp"%>

	<!-- /banner_bottom_agile_info -->
	<div class="page-head_agile_info_w3l">
		<div class="container">
			<h3>1:1 문의</h3>
			<!--/w3_short-->
			<div class="services-breadcrumb">
				<div class="agile_inner_breadcrumb">

					<ul class="w3_short">
						<li><a href="../">Home</a><i>|</i></li>
						<li>Contact</li>
					</ul>
				</div>
			</div>
			<!--//w3_short-->
		</div>
	</div>
	<!--/contact-->
	<div class="banner_bottom_agile_info">
		<div class="container">
			<div class="contact-grid-agile-w3s">
				<div class="col-md-4 contact-grid-agile-w3">
					<div class="contact-grid-agile-w31">
						<a href="notice">
							<h4>공지사항</h4>
						</a>
					</div>
				</div>
				<div class="col-md-4 contact-grid-agile-w3">
					<div class="contact-grid-agile-w32">
						<a href="onetoone">
							<h4>1:1 문의</h4>
						</a>
					</div>
				</div>
				<div class="col-md-4 contact-grid-agile-w3">
					<div class="contact-grid-agile-w33">
						<a href="fqa">
							<h4>FAQ</h4>
						</a>
					</div>
				</div>
				<div class="clearfix"></div>
			</div>
		</div>
	</div>
	<div class="container">
		<div class="searchbox">
			<!-- 			<input type="text" placeholder="작성자" size="20px">
			<input type="submit" name="ok" value="Search" class="ClassName"> -->
			<span style="float: right"> 
			
			<input type="submit" name="ok" value="문의하기" onclick="location.href='/otoform'" class="ClassName">
			</span>
		</div>
	</div>
	<div class="banner_bottom_agile_info">
		<div class="container">
			<div class="agile-contact-grids">
				<div class="agile-contact-left">
					<table>
						<thead class="top-content">
							<tr>
								<th>No</th>
								<th>제목</th>
								<th>작성자</th>
								<th>작성날짜</th>
								<th>답변여부</th>
							</tr>
						</thead>
						
						<c:forEach items="${list}" var="inqury">
							<tr>
								<td><c:out value="${inqury.inqury_num}" /></td>
								<td><a href="onedetail?inqury_num=${inqury.inqury_num}">
									   <c:out value="${inqury.title}" /></a></td>
								<td><c:out value="${inqury.userid}" /></td>
								<td><fmt:formatDate pattern="yyyy-MM-dd"
										            value="${inqury.reg_date}" /></td>
							    <td><c:out value="${inqury.ripple_check}" /></td>
							</tr>
						</c:forEach>
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
					<form id='actionForm' action="/onetoone" method='get'>
						<input type='hidden' name='pageNum' value='${pageMaker.cri.pageNum}'>
						<input type='hidden' name='amount' value='${pageMaker.cri.amount}'>
					</form>
				</div>
				<div class="clearfix"></div>
			</div>
		</div>
	</div>
	<!--//contact-->

	<!-- footer -->
	<div class="footer">
		<div class="footer_agile_inner_info_w3l">
			<div class="col-md-3 footer-left">
				<h2>
					<a href="../"><span>G</span>oreNani </a>
				</h2>
				<p>Lorem ipsum quia dolor sit amet, consectetur, adipisci velit,
					sed quia non numquam eius modi tempora.</p>
				<ul class="social-nav model-3d-0 footer-social w3_agile_social two">
					<li><a href="#" class="facebook">
							<div class="front">
								<i class="fa fa-facebook" aria-hidden="true"></i>
							</div>
							<div class="back">
								<i class="fa fa-facebook" aria-hidden="true"></i>
							</div>
					</a></li>
					<li><a href="#" class="twitter">
							<div class="front">
								<i class="fa fa-twitter" aria-hidden="true"></i>
							</div>
							<div class="back">
								<i class="fa fa-twitter" aria-hidden="true"></i>
							</div>
					</a></li>
					<li><a href="#" class="instagram">
							<div class="front">
								<i class="fa fa-instagram" aria-hidden="true"></i>
							</div>
							<div class="back">
								<i class="fa fa-instagram" aria-hidden="true"></i>
							</div>
					</a></li>
					<li><a href="#" class="pinterest">
							<div class="front">
								<i class="fa fa-linkedin" aria-hidden="true"></i>
							</div>
							<div class="back">
								<i class="fa fa-linkedin" aria-hidden="true"></i>
							</div>
					</a></li>
				</ul>
			</div>
			<div class="col-md-9 footer-right">
				<div class="sign-grds">
					<div class="col-md-4 sign-gd">
						<h4>
							Our <span>Information</span>
						</h4>
						<ul>
							<li><a href="../">Home</a></li>
							
							<li><a href="project">프로젝트</a></li>
							<li><a href="open">오픈예정</a></li>
							<li><a href="culture">문화콘텐츠</a></li>
							<li><a href="end">종료된 프로젝트</a></li>
						</ul>
					</div>

					<div class="col-md-5 sign-gd-two">
						<h4>
							Gorenani <span>Information</span>
						</h4>
						<div class="w3-address">
							<div class="w3-address-grid">
								<div class="w3-address-left">
									<i class="fa fa-phone" aria-hidden="true"></i>
								</div>
								<div class="w3-address-right">
									<h6>Phone Number</h6>
									<p>+82 234 567 8901</p>
								</div>
								<div class="clearfix"></div>
							</div>
							<div class="w3-address-grid">
								<div class="w3-address-left">
									<i class="fa fa-envelope" aria-hidden="true"></i>
								</div>
								<div class="w3-address-right">
									<h6>Email Address</h6>
									<p>
										Email :<a href="mailto:example@email.com"> Easy@naver.com</a>
									</p>
								</div>
								<div class="clearfix"></div>
							</div>
							<div class="w3-address-grid">
								<div class="w3-address-left">
									<i class="fa fa-map-marker" aria-hidden="true"></i>
								</div>
								<div class="w3-address-right">
									<h6>Location</h6>
									<p>South of Korea</p>
								</div>
								<div class="clearfix"></div>
							</div>
						</div>
					</div>
					<div class="col-md-3 sign-gd flickr-post">
						<h4>
							D<span>eveloper</span>
						</h4>

						<ul>
							<li>김현진</li>
							<br>
							<li>이미영</li>
							<br>
							<li>이지원</li>
							<br>
							<li>이준혁</li>
							<br>
							<li>이승철</li>
						</ul>

					</div>
					<div class="clearfix"></div>
				</div>
			</div>
			<div class="clearfix"></div>

			<p class="copy-right">
				&copy 2019 GoreNani. All rights reserved | Design by <a
					href="http://w3layouts.com/">GoreNani</a>
			</p>
		</div>
	</div>
	<!-- //footer -->
	<!-- login -->
	<div class="modal fade" id="myModal4" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content modal-info">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body modal-spa">
					<div class="login-grids">
						<div class="login">
							<div class="login-bottom">
								<h3>Sign up for free</h3>
								<form>
									<div class="sign-up">
										<h4>Email :</h4>
										<input type="text" value="Type here"
											onfocus="this.value = '';"
											onblur="if (this.value == '') {this.value = 'Type here';}"
											required="">
									</div>
									<div class="sign-up">
										<h4>Password :</h4>
										<input type="password" value="Password"
											onfocus="this.value = '';"
											onblur="if (this.value == '') {this.value = 'Password';}"
											required="">

									</div>
									<div class="sign-up">
										<h4>Re-type Password :</h4>
										<input type="password" value="Password"
											onfocus="this.value = '';"
											onblur="if (this.value == '') {this.value = 'Password';}"
											required="">

									</div>
									<div class="sign-up">
										<input type="submit" value="REGISTER NOW">
									</div>

								</form>
							</div>
							<div class="login-right">
								<h3>Sign in with your account</h3>
								<form>
									<div class="sign-in">
										<h4>Email :</h4>
										<input type="text" value="Type here"
											onfocus="this.value = '';"
											onblur="if (this.value == '') {this.value = 'Type here';}"
											required="">
									</div>
									<div class="sign-in">
										<h4>Password :</h4>
										<input type="password" value="Password"
											onfocus="this.value = '';"
											onblur="if (this.value == '') {this.value = 'Password';}"
											required=""> <a href="#">Forgot password?</a>
									</div>
									<div class="single-bottom">
										<input type="checkbox" id="brand" value=""> <label
											for="brand"><span></span>Remember Me.</label>
									</div>
									<div class="sign-in">
										<input type="submit" value="SIGNIN">
									</div>
								</form>
							</div>
							<div class="clearfix"></div>
						</div>
						<p>
							By logging in you agree to our <a href="#">Terms and
								Conditions</a> and <a href="#">Privacy Policy</a>
						</p>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- //login -->
	<a href="#home" class="scroll" id="toTop" style="display: block;">
		<span id="toTopHover" style="opacity: 1;"> </span>
	</a>
	<!-- js -->
	<script type="text/javascript" src="resources/js/jquery-2.1.4.min.js"></script>
	<!-- //js -->
	<!-- cart-js -->
	<script src="resources/js/minicart.min.js"></script>
	<script>
		// Mini Cart
		paypal.minicart.render({
			action : '#'
		});

		if (~window.location.search.indexOf('reset=true')) {
			paypal.minicart.reset();
		}
	</script>

	<!-- //cart-js -->

	<!-- stats -->
	<script src="resources/js/jquery.waypoints.min.js"></script>
	<script src="resources/js/jquery.countup.js"></script>
	<script>
		$('.counter').countUp();
	</script>
	<!-- //stats -->
	<!-- start-smoth-scrolling -->
	<script type="text/javascript" src="resources/js/move-top.js"></script>
	<script type="text/javascript" src="resources/js/jquery.easing.min.js"></script>
	<script type="text/javascript">
		jQuery(document).ready(function($) {
			$(".scroll").click(function(event) {
				event.preventDefault();
				$('html,body').animate({
					scrollTop : $(this.hash).offset().top
				}, 1000);
			});
		});
	</script>
	<!-- here stars scrolling icon -->
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
	<!-- //here ends scrolling icon -->

	<!-- for bootstrap working -->
	<script type="text/javascript" src="resources/js/bootstrap.js"></script>
	<script type="text/javascript" src="resources/js/bootstrap2.js"></script>
</body>

</html>

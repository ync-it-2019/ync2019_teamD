<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<!-- 10-31 임시로 Date부분 뺌 -->
<head>
	<title>Elite Shoppy an Ecommerce Online Shopping Category Flat Bootstrap Responsive Website Template |Men's :: w3layouts</title>
	<!--/tags -->
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta name="keywords" content="Elite Shoppy Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template,
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
	<link rel="stylesheet" type="text/css" media="all" href="/resources/css/chul.css">
	<link href="/resources/css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
	<link rel="stylesheet" type="text/css" href="/resources/css/jquery-ui.css">
	<link href="/resources/css/style.css" rel="stylesheet" type="text/css" media="all" />
	<link href="/resources/css/font-awesome.css" rel="stylesheet">
	<!-- //for bootstrap working -->
	<link href="//fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i,800" rel="stylesheet">
	<link href='//fonts.googleapis.com/css?family=Lato:400,100,100italic,300,300italic,400italic,700,900,900italic,700italic' rel='stylesheet' type='text/css'>
	<style type="text/css">
		}
	</style>
	
	<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
</head>

<body>
	 <%@include file="header.jsp"%>
	<!-- /banner_bottom_agile_info -->
	<div class="page-head_agile_info_w3l">
		<div class="container">
			<h3>프로젝트 <span>작성 </span></h3>
			<!--/w3_short-->
			<div class="services-breadcrumb">
				<div class="agile_inner_breadcrumb">

					<ul class="w3_short">
						<li><a href="../">Home</a><i>|</i></li>
						<li>프로젝트 작성</li>
					</ul>
				</div>
			</div>
			<!--//w3_short-->
		</div>
	</div>

	<!-- header-bot (로고 있는 부분) -->

	<!-- //header-bot -->
	
	<div class="row">
    <!-- 분야 설정 분야 -->
    <div class="col-sm-2"><br></div>
    <div class="col-sm-8">
      <br><br>
      <h1>분야 설정</h1>
      <br><br><br>
      <h3>어떤 분야의 프로젝트를 진행할 예정인가요?</h3><br>
      <p>진행하려는 프로젝트에 가장 유사한 카테고리를 선택하세요.나중에 수정할 수 있습니다.</p>
      <form role="form" class="submitProject" id="writeForm" action="/front/project_write1" method="post" enctype="multipart/form-data">
      		<input type="hidden" name = "title_image" value="">
            <input type="hidden" name = "attach_1" value="">
            <input type="hidden" name = "contents_image1" value="">
            <input type="hidden" name = "contents_image2" value="">
        	<input type="hidden" name = "attach_2" value="">
        	<input type="hidden" name = "attach_3" value="">
     		<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
     		<input type="hidden" name="userid" value="<sec:authentication property="principal.username"/>">
        <select name="category" id="category_id" class="custom-select" autofocus="autofocus">
          <option value="카테고리" selected>카테고리</option>
          <option value="테크/가전">테크/가전</option>
          <option value="패션/잡화">패션/잡화</option>
          <option value="뷰티">뷰티</option>
          <option value="푸드">푸드</option>
          <option value="홈리빙">홈리빙</option>
          <option value="디자인소품">디자인소품</option>
          <option value="여행/레저">여행/레저</option>
          <option value="스포츠/모빌리티">스포츠/모빌리티</option>
          <option value="게임/취미">게임/취미</option>
          <option value="반려동물">반려동물</option>
          <option value="모임">모임</option>
          <option value="공연/컬쳐">공연/컬쳐</option>
          <option value="소셜/캠페인">소셜/캠페인</option>
          <option value="교육/키즈">교육/키즈</option>
          <option value="출판">출판</option>
          <option value="기부/후원">기부/후원</option>
        </select>
        <br><br>
        <br><br><br>
        <div class="sort-grid"></div>
        <h1 class="sectionLabel">간략 소개</h1>
        <br><br><br><br>
        <h3>진행할 프로젝트를 간략하게 소개하세요.</h3><br>
        <p>무엇을 만들고 싶은지, 이루고 싶은 목표는 무엇인지 알려주세요.걱정하지 마세요! 나중에 수정할 수 있습니다.</p>
        <textarea name="simple_content" id="simple_content" class="form-control" rows="8" cols="70%" maxlength="100" placeholder="예) 중급! 일본어 문법 요점정리 POINT 20"></textarea>
        <br><br><br>
        <div class="sort-grid"></div>
        <h1>프로젝트 내용</h1>
        <br><br><br><br>
        <div class="col-sm-5">
          <h3>연락처</h3>
        </div>
        <div class="col-sm-6">
          <p>
          	<sec:authentication property="principal.username"/>	
          </p><br>
          <input type="text" class="form-control" name="phone" id="phone" placeholder="휴대폰 번호(- 없이)" size="30%">
          <br><br><br>
        </div>
        <div class="col-sm-5">
          <h3>회사명</h3>
        </div>
        <div class="col-sm-6">
          <input type="text" class="form-control" name="company" id="company" placeholder="회사명" size="30%">
          <br><br><br>
        </div>
        <div class="row">
          <div class="col-sm-5">
            <h3>목표 금액</h3>
          </div>
          <div class="col-sm-6">
            <input type="number" class="form-control" min="0" name="achive_invest" id="achive_invest" step="10000" placeholder="(원)">
            <br><br>
          </div>
        </div><br>
        <div class="row">
          <div class="col-sm-5">
            <h3>대표 이미지</h3>
          </div>
          <div class="col-sm-6">
            <p>- 사이즈 : 300 x 400 이상</p>
          </div>
        </div><br>
        <div class="row">
          <div class="col-sm-5">
            <img src="/resources/images/uploadPicture.png" style="width:65%">
            <!-- 이미지는 할줄 모르겠다 -->
          </div>
          <div class="col-sm-6">
            <p>- 용량 : 3MB 미만</p>
            <br>
            <p>- 텍스트 및 로고 삽입 금지</p><br>
            <%--<input type="file" class="form-control-file border" id="imageUpload" name="title_image"> --%>
            <input type="file" class="form-control-file border"  id="imageUpload" name="uploadFile">
            <br><br>
          </div>
        </div><br>
        <div class="row">
          <div class="col-sm-5">
            <h3>첨부 파일</h3>
          </div>
          <div class="col-sm-6">
            <input type="file" class="form-control-file border" name="uploadFile">
            <br><br>
          </div>
        </div><br>
        <div class="row">
          <div class="col-sm-5">
            <h3>프로젝트 기간</h3>
          </div>
          <div class="col-sm-6">
            <input type="date" id="project_start" name="project_start"/>~
            <input type="date" id="project_end" name="project_end"/>
            <br><br>
          </div>
        </div><br>
        <div class="row">
          <div class="col-sm-5">
            <h3>수수료</h3>
          </div>
          <div class="col-sm-6"><br>
            <div class="jumbotron">
              <div style="margin-left:5%;">
                <h3>&nbsp&nbsp
                  오픈 수수료는 10%(VAT별도)입니다.</h3><br>
                - 부가 서비스 이용 시, 추가 수수료가 발생될 수 있습니다.<br><br>
                - 기부후원 프로젝트의 경우, 수수료가 다르게 적용됩니다.<br><br>
                - 자세한 내용은 상세 약관 내용을 확인해주세요.<br><br>
                <input type="checkbox" class="custom-control-input" id="SusuRyocheck" name="SusuRyocheck">
                &nbsp&nbsp
                <label for="SusuRyocheck">수수료 정책을 확인했으며 동의합니다.</label>
              </div>
            </div>
          </div>
        </div>
        <br><br><br>
        <div class="sort-grid"></div>
        <h1>상세 설명</h1><br><br>
        <div class="row">
          <div class="col-sm-6">
            <div class="jumbotron">
              <img src="/resources/images/uploadPicture.png" class="setSize60"><br><br><br>
              <%-- <input type="file" class="setSize60" name="contents_image1"><br> --%>
              <input type="file" class="form-control-file border"  name="uploadFile" style="margin-left:100px;">
            </div>
          </div>
          <div class="col-sm-6">
            <div class="jumbotron">
              <img src="/resources/images/uploadPicture.png" class="setSize60"><br><br><br>
              <%--<input type="file" class="setSize60" name="contents_image2">--%> 
           	  <input type="file" class="form-control-file border"  name="uploadFile" style="margin-left:100px;">
            </div>
          </div>
          <div class="row">
            <div class="col-sm-6">
              <div style="margin-top:5%;margin-left:5%;">
                <h3> 추가 첨부파일</h3>
              </div>
            </div>
            <div class="col-sm-6">
              <div style="margin-top:5%;margin-left:5%;">
                <input type="file" class="form-control-file border"  name="uploadFile">
                <br><br>
                <input type="file" class="form-control-file border"  name="uploadFile">
              </div>
            </div>
          </div>
          <div style="margin-top:5%;margin-left:5%;">
            <h3>프로젝트 상세 내용</h3><br>
            <textarea name="detail_content" id="detail_content" rows="12" cols="90"></textarea>
          </div>
        </div>
        <div style="margin-top:5%;margin-left:5%;">
          <input type="button" class="nButton" id="submit_btn" name="submit_btn" value="검토 요청">
        </div><br><br>
      </form>
    </div>
    <div class="col-sm-2"><br></div>
  </div>



	<!-- //mens -->
<!--/grids-->

	<!-- login -->
	<div class="modal fade" id="myModal4" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content modal-info">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
				</div>
				<div class="modal-body modal-spa">
					<div class="login-grids">
						<div class="login">
							<div class="login-bottom">
								<h3>Sign up for free</h3>
								<form>
									<div class="sign-up">
										<h4>Email :</h4>
										<input type="text" value="Type here" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Type here';}" required="">
									</div>
									<div class="sign-up">
										<h4>Password :</h4>
										<input type="password" value="Password" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Password';}" required="">

									</div>
									<div class="sign-up">
										<h4>Re-type Password :</h4>
										<input type="password" value="Password" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Password';}" required="">

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
										<input type="text" value="Type here" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Type here';}" required="">
									</div>
									<div class="sign-in">
										<h4>Password :</h4>
										<input type="password" value="Password" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Password';}" required="">
										<a href="#">Forgot password?</a>
									</div>
									<div class="single-bottom">
										<input type="checkbox" id="brand" value="">
										<label for="brand"><span></span>Remember Me.</label>
									</div>
									<div class="sign-in">
										<input type="submit" value="SIGNIN">
									</div>
								</form>
							</div>
							<div class="clearfix"></div>
						</div>
						<p>By logging in you agree to our <a href="#">Terms and Conditions</a> and <a href="#">Privacy Policy</a></p>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- //login -->
	<a href="#home" class="scroll" id="toTop" style="display: block;"> <span id="toTopHover" style="opacity: 1;"> </span></a>
	<!-- js -->
	<script type="text/javascript" src="/resources/js/jquery-2.1.4.min.js"></script>
	<!-- //js -->
	<script src="/resources/js/responsiveslides.min.js"></script>
	<script>
		// You can also use "$(window).load(function() {"
		$(function() {
			// Slideshow 4
			$("#slider3").responsiveSlides({
				auto: true,
				pager: true,
				nav: false,
				speed: 500,
				namespace: "callbacks",
				before: function() {
					$('.events').append("<li>before event fired.</li>");
				},
				after: function() {
					$('.events').append("<li>after event fired.</li>");
				}
			});
		});
	</script>
	<script src="/resources/js/modernizr.custom.js"></script>
	<!-- Custom-JavaScript-File-Links -->
	<!-- cart-js -->
	<script src="/resources/js/minicart.min.js"></script>
	<script>
		// Mini Cart
		paypal.minicart.render({
			action: '#'
		});

		if (~window.location.search.indexOf('reset=true')) {
			paypal.minicart.reset();
		}
	</script>

	<!-- //cart-js -->
	<!---->
	<script type='text/javascript'>
		//<![CDATA[
		$(window).load(function() {
			$("#slider-range").slider({
				range: true,
				min: 0,
				max: 9000,
				values: [1000, 7000],
				slide: function(event, ui) {
					$("#amount").val("$" + ui.values[0] + " - $" + ui.values[1]);
				}
			});
			$("#amount").val("$" + $("#slider-range").slider("values", 0) + " - $" + $("#slider-range").slider("values", 1));

		}); //]]>
	</script>
	<script type="text/javascript" src="/resources/js/jquery-ui.js"></script>
	<!---->
	<!-- start-smoth-scrolling -->
	<script type="text/javascript" src="/resources/js/move-top.js"></script>
	<script type="text/javascript" src="/resources/js/jquery.easing.min.js"></script>
	<script type="text/javascript">
		jQuery(document).ready(function($) {
			$(".scroll").click(function(event) {
				event.preventDefault();
				$('html,body').animate({
					scrollTop: $(this.hash).offset().top
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
				easingType: 'easeOutQuart'
			});

		});
	</script>
	<!-- //here ends scrolling icon -->
	
	<script type="text/javascript">
		// 검색 버튼 클릭 이벤트 작업포인트
	var writeForm = $("#writeForm");
	$("#submit_btn").on("click",	function(e) {
		var target = document.getElementById("category_id");
		
   		if (target.options[target.selectedIndex].text == '카테고리') {
			alert("카테고리를 선택하세요");
			document.getElementById('category_id').focus();
			return false;
		} 
   		else if (!writeForm.find("textarea[name='simple_content']").val()) {
			alert("게시물 제목을 입력하세요.");
			document.getElementById('simple_content').focus();
			return false;
		}
   		else if (!writeForm.find("input[name='phone']").val()) {
			alert("전화번호를 입력하세요.");
			document.getElementById('phone').focus();
			return false;
		}
   		else if (!writeForm.find("input[name='company']").val()) {
			alert("회사명을 입력하세요.");
			document.getElementById('company').focus();
			return false;
		}
   		else if (!writeForm.find("input[name='achive_invest']").val()) {
			alert("목표금액을 입력하세요.");
			document.getElementById('achive_invest').focus();
			return false;
		}
   		else if (!writeForm.find("input[id='imageUpload']").val()) {
			alert("메인 이미지를 선택하세요.");
			document.getElementById('imageUpload').focus();
			return false;
		}
   		else if (!writeForm.find("input[name='project_start']").val()) {
			alert("시작날짜를 선택하세요.");
			document.getElementById('project_start').focus();
			return false;
		}
   		else if (!writeForm.find("input[name='project_end']").val()) {
			alert("종료날짜를 선택하세요.");
			document.getElementById('project_end').focus();
			return false;
		}
   		else if (!writeForm.find("input[name='SusuRyocheck']").is(":checked")) {
			alert("약관을 동의해주세요.");
			document.getElementById('SusuRyocheck').focus();
			return false;
		}
   		else if (!writeForm.find("textarea[name='detail_content']").val()) {
			alert("상세정보를 입력하세요.");
			document.getElementById('detail_content').focus();
			return false;
		}
   		else
			writeForm.submit();
	});
	</script>
	
	<!-- for bootstrap working -->
	<script type="text/javascript" src="/resources/js/bootstrap.js"></script>
	<script type="text/javascript" src="/resources/js/bootstrap2.js"></script>
</body>

</html>


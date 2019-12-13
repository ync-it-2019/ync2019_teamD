<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!--
Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE html>
<html>

<head>
  <title>Elite Shoppy an Ecommerce Online Shopping Category Flat Bootstrap Responsive Website Template | About :: w3layouts</title>
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
  <link rel="stylesheet" type="text/css" media="all" href="resources/css/chul.css">
  <link href="resources/css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
  <link href="resources/css/team.css" rel="stylesheet" type="text/css" media="all" />
  <link href="resources/css/style.css" rel="stylesheet" type="text/css" media="all" />
  <link href="resources/css/font-awesome.css" rel="stylesheet">
  <!-- //for bootstrap working -->
  <link href="//fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i,800" rel="stylesheet">
  <link href='//fonts.googleapis.com/css?family=Lato:400,100,100italic,300,300italic,400italic,700,900,900italic,700italic' rel='stylesheet' type='text/css'>
</head>

<body>
   <%@include file="header.jsp"%>
  <!-- /banner_bottom_agile_info -->
  <div class="page-head_agile_info_w3l">
    <div class="container">
      <a href="myPage">
        <h3>My <span>Page </span></h3>
      </a>
      <!--/w3_short-->
      <div class="services-breadcrumb">
        <div class="agile_inner_breadcrumb">

          <ul class="w3_short">
            <li><a href="../">Home</a><i>|</i></li>
            <li>MyPage</li>
          </ul>
        </div>
      </div>
      <!--//w3_short-->
    </div>
  </div>
  <!-- /banner_bottom_agile_info -->
  <div class="banner_bottom_agile_info">
    <div class="container">
      <div class="agile_ab_w3ls_info">
        <form action="/profileEdit" method="post" enctype="multipart/form-data">
        <input type="hidden" name="uploadFile" value="">
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
          <div class="col-md-7 ab_pic_w3ls">
            <h1 class="aboutLabel">프로필 정보 설정</h1>
            <p>(개인회원/투자자 회원 여부)</p>
            <h3>프로필 사진</h3>
            <img src="images\myImage.jpg" style="width:30%">
            <input type="file" class="form-control-file border" id="fileUpload" name="uploadFile">
            <div class="recentInventProject">
              <h3>최근 투자한 프로젝트</h3>
              <a href="#"><p class="recentInventProjectTitle">&nbsp;&nbsp;머리가 잘 빗어지는 마법의 빗 ! 지금부터 투자...</p></a>
            </div>
            <div class="div_InterestCategory">
              <h3 style="margin-bottom:4%;">관심 분야</h3>
              <div class="col-md-6 ab_pic_w3ls">
                <select name="interesting_category" class="custom-select" autofocus="autofocus">
                  <option selected>관심 분야 1</option>
                  <option value="테크,가전">테크,가전</option>
                  <option value="패션,잡화">패션,잡화</option>
                  <option value="뷰티">뷰티</option>
                  <option value="푸드">푸드</option>
                  <option value="홈리빙">홈리빙</option>
                  <option value="디자인소품">디자인소품</option>
                  <option value="여행,레저">여행,레저</option>
                  <option value="스포츠,모빌리티">스포츠,모빌리티</option>
                  <option value="반려동물">반려동물</option>
                  <option value="모임">모임</option>
                  <option value="공연,컬쳐">공연,컬쳐</option>
                  <option value="소셜,캠페인">소셜,캠페인</option>
                  <option value="교육,키즈">교육,키즈</option>
                  <option value="출판">출판</option>
                  <option value="기부,후원">기부,후원</option>
                </select>
              </div>
            </div>
          </div>
          <div class="col-md-5 ab_pic_w3ls_text_info">
            <h3 class="simpleIntroLabel">간단히 나를 소개해주세요.</h3><br />
            <textarea name="self_introduce" class="form-control" rows="20" cols="70%" maxlength="100"></textarea>
            <!-- <button type="button" class="cButton" name="button">취소</button> -->
            <div class="myPageEditBtnClass">
              <a href="#" class="cButton">취소</a>
              <input type="submit" class="nButton" name="submit" value="확인">
            </div>

          </div>
        </form>



        <div class="clearfix"></div>
      </div>
      <!-- 진행 중, 종료 네비게이션 바  -->
    </div>
  </div>
  <!-- //we-offer -->
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
  <script type="text/javascript" src="resources/js/jquery-2.1.4.min.js"></script>
  <!-- //js -->
  <!-- cart-js -->
  <script src="resources/js/minicart.min.js"></script>
  <script src="resources/js/chul.js"></script>
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

  <!-- for bootstrap working -->
  <script type="text/javascript" src="resources/js/bootstrap.js"></script>
  <script type="text/javascript" src="resources/js/bootstrap2.js"></script>
</body>

</html>

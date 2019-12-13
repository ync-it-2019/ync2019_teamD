<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!--
Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<?php include "../db.php"; ?>
<!DOCTYPE html>
<html>

<head>
  <title>Elite Shoppy an Ecommerce Online Shopping Category Flat Bootstrap Responsive Website Template | Contact :: w3layouts</title>
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

    $(document).ready(function() {
      $(".menu>a").click(function() {
        var submenu = $(this).next("ul");

        // submenu 가 화면상에 보일때는 위로 보드랍게 접고 아니면 아래로 보드랍게 펼치기
        if (submenu.is(":visible")) {
          submenu.slideUp();
        } else {
          submenu.slideDown();
        }
      }).mouseover(function() {
        $(this).next("ul").slideDown();
      });
    });
  </script>

  <script>
    function checkid() {
      var userid = document.getElementById("uid").value;
      if (userid) {
        url = "check.php?userid=" + userid;
        window.open(url, "chkid", "width=300,height=100");
      } else {
        alert("아이디를 입력하세요");
      }
    }
  </script>

  <style>
    .menu a {
      cursor: pointer;
    }

    .menu .hide {
      display: none;
    }
  </style>

  <!--//tags -->
  <link href="resources/css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
  <link href="resources/css/style.css" rel="stylesheet" type="text/css" media="all" />
  <link href="resources/css/mimi.css" rel="stylesheet" type="text/css" media="all" />
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
    <h3>I<span>nvestor Join </span></h3>
    <!--/w3_short-->
    <div class="services-breadcrumb">
      <div class="agile_inner_breadcrumb">

        <ul class="w3_short">
          <li><a href="../">Home</a><i>|</i></li>
          <li>investorjoin</li>
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
            <i class="fa fa-ban" aria-hidden="true"></i>
            <h4>비회원</h4>
            <p>프로젝트 관람만 가능합니다. <span>지금바로 회원가입을 해보세요!</span></p>
          </div>
        </div>
        <div class="col-md-4 contact-grid-agile-w3">
          <div class="contact-grid-agile-w32">
            <i class="fa fa-user" aria-hidden="true"></i>
            <h4>일반회원</h4>
            <p>회원 서비스를 이용하실 수 있습니다. <span>당신의 아이디어를 보여주세요!</span></p>
          </div>
        </div>
        <div class="col-md-4 contact-grid-agile-w3">
          <div class="contact-grid-agile-w33">
            <i class="fa fa-credit-card" aria-hidden="true"></i>
            <h4>투자자</h4>
            <p>투자 서비스를 이용하실 수 있습니다. <span>당신의 자본을 보여주세요!</span></p>
          </div>
        </div>
        <div class="clearfix"> </div>
      </div>
    </div>
  </div>
  <div class="banner_bottom_agile_info">
    <div class="container">
      <div class="agile-contact-grids">
        <div class="agile-contact-left">
          <div class="col-md-6 contact-form">
            <h2 class="white-w3ls">투자회원 <span>등록</span></h2>

            <form action="investorjoin" method="post">
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
              <div class="styled-input">
                <td>
                  <font size="3em" color="white">은행 선택 </font>
                  <select name="bank">
                    <option value="DaeguBank">대구은행</option>
                    <option value="WooriBank">우리은행</option>
                    <option value="BusanBank">부산은행</option>
                    <option value="ShinhanBank">신한은행</option>
                    <option value="KBBank">국민은행</option>
                    <option value="NHBank">농협은행</option>
                    <option value="IBKBank">기업은행</option>
                  </select>
                </td>
              </div>
              <div class="styled-input">
                <input type="text" name="account" required="">
                <label>계좌번호 입력</label>
                <span></span>
              </div>
              <br>
              <!-- <a href="#" data-toggle="modal" data-target="#myModal3-1">
                <input type="submit" value="투자회원 등록">
              </a> -->
              <input type="submit" id="submit" value="계좌등록">
              <a href="../">
                <input type="button" id="bnt" value=" 취소 ">
              </a>
            </form>
          </div>
        </div>
        <div class="clearfix"> </div>
      </div>
    </div>
  </div>
  <!--//contact-->
  <!--/grids-->

  <!--grids-->
  <!-- footer -->
  <!-- footer -->
  <div class="footer">
    <div class="footer_agile_inner_info_w3l">
      <div class="col-md-3 footer-left">
        <h2><a href="../"><span>G</span>oreNani </a></h2>
        <p>Lorem ipsum quia dolor
          sit amet, consectetur, adipisci velit, sed quia non
          numquam eius modi tempora.</p>
        <ul class="social-nav model-3d-0 footer-social w3_agile_social two">
          <li><a href="#" class="facebook">
              <div class="front"><i class="fa fa-facebook" aria-hidden="true"></i></div>
              <div class="back"><i class="fa fa-facebook" aria-hidden="true"></i></div>
            </a></li>
          <li><a href="#" class="twitter">
              <div class="front"><i class="fa fa-twitter" aria-hidden="true"></i></div>
              <div class="back"><i class="fa fa-twitter" aria-hidden="true"></i></div>
            </a></li>
          <li><a href="#" class="instagram">
              <div class="front"><i class="fa fa-instagram" aria-hidden="true"></i></div>
              <div class="back"><i class="fa fa-instagram" aria-hidden="true"></i></div>
            </a></li>
          <li><a href="#" class="pinterest">
              <div class="front"><i class="fa fa-linkedin" aria-hidden="true"></i></div>
              <div class="back"><i class="fa fa-linkedin" aria-hidden="true"></i></div>
            </a></li>
        </ul>
      </div>
      <div class="col-md-9 footer-right">
        <div class="sign-grds">
          <div class="col-md-4 sign-gd">
            <h4>Our <span>Information</span> </h4>
            <ul>
              <li><a href="../">Home</a></li>
              
              <li><a href="project">프로젝트</a></li>
              <li><a href="open">오픈예정</a></li>
              <li><a href="culture">문화콘텐츠</a></li>
              <li><a href="end">종료된 프로젝트</a></li>
            </ul>
          </div>

          <div class="col-md-5 sign-gd-two">
            <h4>Gorenani <span>Information</span></h4>
            <div class="w3-address">
              <div class="w3-address-grid">
                <div class="w3-address-left">
                  <i class="fa fa-phone" aria-hidden="true"></i>
                </div>
                <div class="w3-address-right">
                  <h6>Phone Number</h6>
                  <p>+82 234 567 8901</p>
                </div>
                <div class="clearfix"> </div>
              </div>
              <div class="w3-address-grid">
                <div class="w3-address-left">
                  <i class="fa fa-envelope" aria-hidden="true"></i>
                </div>
                <div class="w3-address-right">
                  <h6>Email Address</h6>
                  <p>Email :<a href="mailto:example@email.com"> Easy@naver.com</a></p>
                </div>
                <div class="clearfix"> </div>
              </div>
              <div class="w3-address-grid">
                <div class="w3-address-left">
                  <i class="fa fa-map-marker" aria-hidden="true"></i>
                </div>
                <div class="w3-address-right">
                  <h6>Location</h6>
                  <p>South of Korea

                  </p>
                </div>
                <div class="clearfix"> </div>
              </div>
            </div>
          </div>
          <div class="col-md-3 sign-gd flickr-post">
            <h4>D<span>eveloper</span></h4>

            <ul>
              <li>김현진</li> <br>
              <li>이미영</li> <br>
              <li>이지원</li> <br>
              <li>이준혁</li> <br>
              <li>이승철</li>
            </ul>

          </div>
          <div class="clearfix"></div>
        </div>
      </div>
      <div class="clearfix"></div>

      <p class="copy-right">&copy 2019 GoreNani. All rights reserved | Design by <a href="http://w3layouts.com/">GoreNani</a></p>
    </div>
  </div>
  <!-- //footer -->

  <!-- login -->
  <div class="modal fade" id="myModal4" tabhome="-1" role="dialog" aria-labelledby="myModalLabel">
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
  <script src="resources/js/modernizr.custom.js"></script>
  <!-- Custom-JavaScript-File-Links -->
  <!-- cart-js -->
  <script src="resources/js/minicart.min.js"></script>
  <script>
    // Mini Cart
    paypal.minicart.render({
      action: '#'
    });

    if (~window.location.search.homeOf('reset=true')) {
      paypal.minicart.reset();
    }
  </script>

  <!-- //cart-js -->
  <!-- script for responsive tabs -->
  <script src="resources/js/easy-responsive-tabs.js"></script>
  <script>
    $(document).ready(function() {
      $('#horizontalTab').easyResponsiveTabs({
        type: 'default', //Types: default, vertical, accordion
        width: 'auto', //auto or any width like 600px
        fit: true, // 100% fit in a container
        closed: 'accordion', // Start closed if in accordion view
        activate: function(event) { // Callback function if tab is switched
          var $tab = $(this);
          var $info = $('#tabInfo');
          var $name = $('span', $info);
          $name.text($tab.text());
          $info.show();
        }
      });
      $('#verticalTab').easyResponsiveTabs({
        type: 'vertical',
        width: 'auto',
        fit: true
      });
    });
  </script>
  <!-- //script for responsive tabs -->
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

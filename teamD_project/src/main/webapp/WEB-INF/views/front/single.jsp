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
  <title>Elite Shoppy an Ecommerce Online Shopping Category Flat Bootstrap Responsive Website Template | Single :: w3layouts</title>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

  <script src="https://www.gstatic.com/charts/loader.js"></script>



  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>

<!--새로 추가한 것 여기부터-->

  <!--새로 추가한 바 그래프-->
  <script src="//www.google.com/jsapi"></script>
  <script type="text/javascript">
    // google.charts.load("current", {
    //   packages: ["corechart"]
    // });
    // google.charts.setOnLoadCallback(drawChart);
    //
    // function drawChart() {
    //   var data = google.visualization.arrayToDataTable([
    //     ['Year', 'Visitations', {
    //       role: 'style'
    //     }],
    //     ['수익', 80, 'color: gray'],
    //     ['안정', 100, 'color: #76A7FA'],
    //     ['성장', 16, 'opacity: 0.2'],
    //     ['시장', 22, 'stroke-color: #703593; stroke-width: 4; fill-color: #C5A5CF'],
    //     ['호감', 28, 'stroke-color: #871B47; stroke-opacity: 0.6; stroke-width: 8; fill-color: #BC5679; fill-opacity: 0.2']
    //   ]);
    //
    //   var view = new google.visualization.DataView(data);
    //   view.setColumns([0, 1,
    //     {
    //       calc: "stringify",
    //       sourceColumn: 1,
    //       type: "string",
    //       role: "annotation"
    //     },
    //     2
    //   ]);
    //
    //   var options = {
    //     title: "매력도 평가",
    //     width: 400,
    //     height: 300,
    //
    //     bar: {
    //       groupWidth: "95%"
    //     },
    //     legend: {
    //       position: "center"
    //     },
    //   };
    //   var chart = new google.visualization.BarChart(document.getElementById("barchart_values"));
    //   chart.draw(view, options);
    // }

    var myChart = {
    "type": "bar",
    "title": {
      "text": "매력도 평가"
    },

    "plot": {
      "value-box": {
        "text": "%v"
      },
      "tooltip": {
        "text": "%v"
      }
    },
    "scale-x": {
      "values": [
        "수익",
        "안정",
        "성장",
        "시장",
        "호감"
      ]
    },
    "series": [
      {
        "values": [3,6,9,5,2],
      }
    ]
   };


  function clearTextarea(){
      /* 텍스트박스 지우는 부분 */
    $('#comment').val('');
  }

  function clearInput(){
    $('#invest_content').val('');
  }

  </script>


  <script>
		function onlyNumber(event){
			event = event || window.event;
			var keyID = (event.which) ? event.which : event.keyCode;
			if ( (keyID >= 48 && keyID <= 57) || (keyID >= 96 && keyID <= 105) || keyID == 8 || keyID == 46 || keyID == 37 || keyID == 39 )
				return;
			else
				return false;
		}
		function removeChar(event) {
			event = event || window.event;
			var keyID = (event.which) ? event.which : event.keyCode;
			if ( keyID == 8 || keyID == 46 || keyID == 37 || keyID == 39 )
				return;
			else
				event.target.value = event.target.value.replace(/[^0-9]/g, "");
		}
	</script>
  <!--여기까지 바 그래프-->










  <!-- 도넛 그래프 시작 -->
  <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
  <script type="text/javascript">
    var dd = 12;
    google.charts.load("current", {
      packages: ["corechart"]
    });
    google.charts.setOnLoadCallback(drawChart);

    function drawChart() {
      var data = google.visualization.arrayToDataTable([
        ['Task', 'Hours per Day'],
        ['일반' + ' ' + dd + '명', 11],
        ['공무원' + ' ' + 11 + '명', 2],
        ['CEO' + ' ' + 11 + '명', 5],
        ['자영업' + ' ' + 11 + '명', 3],
        ['직업5' + ' ' + 11 + '명', 7]
      ]);

      var options = {
        title: '직업별 투자자 현황',
        pieHole: 0.7,
        width: 380,
        height: 200,
        pieSliceText: 'none',
        fontSize: 11,
        enableInteractivity:false ,
      };

      var chart = new google.visualization.PieChart(document.getElementById('donutchart'));
      chart.draw(data, options);
    }

  </script>

<script type="text/javascript">



</script>
  <!--바 그래프-->
<script src="resources/js/zingchart.min.js"></script>

  <!--여기까지-->


  <style>
			img { display: block; margin: 0px auto; }
	</style>


<!--새로 추가한 것 여기까지-->


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
  <!-- //tags -->
  <link href="resources/css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
  <link href="resources/css/jiwon.css" rel="stylesheet" type="text/css" media="all" />
  <link rel="stylesheet" href="resources/css/flexslider.css" type="text/css" media="screen" />
  <link href="resources/css/font-awesome.css" rel="stylesheet">
  <link href="resources/css/easy-responsive-tabs.css" rel='stylesheet' type='text/css' />
  <link href="resources/css/style.css" rel="stylesheet" type="text/css" media="all" />

  <!-- //for bootstrap working -->
  <link href="//fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i,800" rel="stylesheet">
  <link href='//fonts.googleapis.com/css?family=Lato:400,100,100italic,300,300italic,400italic,700,900,900italic,700italic' rel='stylesheet' type='text/css'>
</head>

<body>
  <!-- header -->
  <div class="header" id="home">
		<div class="container">
			<ul>
				<li> <a href="#" data-toggle="modal" data-target="#myModal"><i class="fa fa-unlock-alt" aria-hidden="true"></i>로그인</a></li>
				<li> <a href="join"><i class="fa fa-pencil-square-o" aria-hidden="true"></i> 회원가입 </a></li>
				<li> <a href="myPage"><i class="fa fa-user" aria-hidden="true"></i> 마이페이지 </a></li>
				<li> <a href="notice"><i class="fa fa-envelope-o" aria-hidden="true"></i> 고객센터 </a></li>
			</ul>
		</div>
	</div>
  <!-- //header -->
  <!-- header-bot -->
  <div class="header-bot">
    <div class="header-bot_inner_wthreeinfo_header_mid">
      <div class="col-md-4 header-middle">
        <form action="#" method="post">
          <input type="search" name="search" placeholder="Search here..." required="">
          <input type="submit" value=" ">
          <div class="clearfix"></div>
        </form>
      </div>
      <!-- header-bot -->
      <div class="col-md-4 logo_agile">
        <h1><a href="../"><span>G</span>oreNani <i class="fa fa-shopping-bag top_logo_agile_bag" aria-hidden="true"></i></a></h1>
      </div>
      <!-- header-bot -->
      <div class="col-md-4 agileits-social top_content">
        <ul class="social-nav model-3d-0 footer-social w3_agile_social">
          <li class="share">Share On : </li>
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
      <div class="clearfix"></div>
    </div>
  </div>
  <!-- //header-bot -->
  <!-- banner -->
  <div class="ban-top">
    <div class="container">
      <div class="to15p_nav_left">
        <nav class="navbar navbar-default">
          <div class="container-fluid">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
              <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
              </button>
            </div>
            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse menu--shylock" id="bs-example-navbar-collapse-1">
              <ul class="nav navbar-nav menu__list">
                <li class="active menu__item"><a class="menu__link" href="../">HOME <span class="sr-only">(current)</span></a></li>
                <li class=" menu__item"><a class="menu__link" href="total">한눈에보기</a></li>
                <li class=" menu__item"><a class="menu__link" href="project">프로젝트</a></li>
                <li class=" menu__item"><a class="menu__link" href="open">오픈예정</a></li>
                <li class=" menu__item"><a class="menu__link" href="culture">문화콘텐츠</a></li>
                <li class=" menu__item"><a class="menu__link" href="end">종료된프로젝트</a></li>
              </ul>
            </div>
          </div>
        </nav>
      </div>
      <div class="top_nav_right">
        <div class="wthreecartaits wthreecartaits2 cart cart box_1">
          <form action="#" method="post" class="last">
            <input type="hidden" name="cmd" value="_cart">
            <input type="hidden" name="display" value="1">
            <!-- style.css w3view-cart 색상 변경 및 projectSubmitButton 클래스 생성 -->
            <button class="w3view-cart" type="submit" name="submit" onclick = "location.href = 'project_write'">
              <h5 class="projectSubmitButton">Project 신청</h5>
            </button>
          </form>

        </div>
      </div>
      <div class="clearfix"></div>
    </div>
  </div>
  <!-- //banner-top -->
  <!-- Modal1 -->
  <div class="modal fade" id="myModal" tabindex="-1" role="dialog">
    <div class="modal-dialog">
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
        </div>
        <div class="modal-body modal-body-sub_agile">
          <div class="col-md-8 modal_body_left modal_body_left1">
            <h3 class="agileinfo_sign">Sign In <span>Now</span></h3>
            <form action="#" method="post">
              <div class="styled-input agile-styled-input-top">
                <input type="text" name="Name" required="">
                <label>Name</label>
                <span></span>
              </div>
              <div class="styled-input">
                <input type="email" name="Email" required="">
                <label>Email</label>
                <span></span>
              </div>
              <input type="submit" value="Sign In">
            </form>
            <ul class="social-nav model-3d-0 footer-social w3_agile_social top_agile_third">
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
            <div class="clearfix"></div>
            <p><a href="#" data-toggle="modal" data-target="#myModal2"> Don't have an account?</a></p>

          </div>
          <div class="col-md-4 modal_body_right modal_body_right1">
            <img src="resources/images/log_pic.jpg" alt=" " />
          </div>
          <div class="clearfix"></div>
        </div>
      </div>
      <!-- //Modal content-->
    </div>
  </div>
  <!-- //Modal1 -->
  <!-- Modal2 -->
  <div class="modal fade" id="myModal2" tabindex="-1" role="dialog">
    <div class="modal-dialog">
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
        </div>
        <div class="modal-body modal-body-sub_agile">
          <div class="col-md-8 modal_body_left modal_body_left1">
            <h3 class="agileinfo_sign">Sign Up <span>Now</span></h3>
            <form action="#" method="post">
              <div class="styled-input agile-styled-input-top">
                <input type="text" name="Name" required="">
                <label>Name</label>
                <span></span>
              </div>
              <div class="styled-input">
                <input type="email" name="Email" required="">
                <label>Email</label>
                <span></span>
              </div>
              <div class="styled-input">
                <input type="password" name="password" required="">
                <label>Password</label>
                <span></span>
              </div>
              <div class="styled-input">
                <input type="password" name="Confirm Password" required="">
                <label>Confirm Password</label>
                <span></span>
              </div>
              <input type="submit" value="Sign Up">
            </form>
            <ul class="social-nav model-3d-0 footer-social w3_agile_social top_agile_third">
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
            <div class="clearfix"></div>
            <p><a href="#">By clicking register, I agree to your terms</a></p>

          </div>
          <div class="col-md-4 modal_body_right modal_body_right1">
            <img src="resources/images/log_pic.jpg" alt=" " />
          </div>
          <div class="clearfix"></div>
        </div>
      </div>
      <!-- //Modal content-->
    </div>
  </div>
  <!-- //Modal2 -->
  <!--/single_page-->
  <!-- /banner_bottom_agile_info -->
  <div class="page-head_agile_info_w3l">
    <div class="container">
      <h3>프로젝트 <span> 제목 </span></h3>
      <!--/w3_short-->
      <div class="services-breadcrumb">
        <div class="agile_inner_breadcrumb">

          <ul class="w3_short">
            <li><a href="../">Home</a><i>|</i></li>
            <li>Single Page</li>
          </ul>
        </div>
      </div>
      <!--//w3_short-->
    </div>
  </div>

  <!-- banner-bootom-w3-agileits -->
  <div class="banner-bootom-w3-agileits">
    <div class="container">




      <!--테스트용 두개 붙이기-->
      <div class="container-fluid" style=" height:100%;">

        <!-- <div class="row" > -->
          <div class="col-md-4-1" style="">


            <div class="grid images_3_of_2"  >

              <div class="flexslider">
                <div class="thumb-image"> <img src="http://placehold.it/650x350" data-imagezoom="true" class="img-responsive"> </div>
                <div class="clearfix"></div>
              </div>
            </div>


            <!-- <ul class="slides">
              <li data-thumb="http://placehold.it/700x600">

              </li>
              <li data-thumb="http://placehold.it/700x600">
                <div class="thumb-image"> <img src="http://placehold.it/700x550" data-imagezoom="true" class="img-responsive"> </div>
              </li>
              <li data-thumb="http://placehold.it/700x600">
                <div class="thumb-image"> <img src="http://placehold.it/700x550" data-imagezoom="true" class="img-responsive"> </div>
              </li>
            </ul> -->

            <div class="container-fluid">
                <div class="row2">
                  <div class="col-sm-4-1" >
                    <div id="myChart" style="width:300px;"></div>
                    <!-- <div id="barchart_values"></div> -->
                  </div>
                  <div class="col-sm-8-1">
                    <div id="donutchart"  style= "padding: 0px 0px 0px 80px;"></div>
                  </div>
                </div>
            </div>








          </div>
          <div class="col-md-8-1" style="padding-left:60px;">
            <h3><span class="item_price">7일 남음</span></h3>
            <br>
            <div class="progress">
              <div class="progress-bar progress-bar-success" style="width: 70%">70%</div>
              <!--모금현황-->
            </div>
            <h3>120%</h3>% 달성
            <br>
            <br>
            <h3><span class="item_price">150,000</span></h3><p>원 펀딩</p>
            <br>
            <h3>100</h3>명의 투자자
            <br>
            <!-- <h3>현재 <code>150,000.</code>원 모금됨.</h3> -->
            <br>



            <!--투자버튼 여기부터 시작-->
            <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#invest_button" style="width:330px;" id="test2">
              투자하기
            </button>
          <!-- The Modal -->
          <div class="modal fade" id="invest_button">
            <div class="modal-dialog">
              <div class="modal-content">
  <form class="" action="home" method="post">
                <!-- Modal Header -->
                <div class="modal-header">
                  <h4 class="modal-title">투자</h4>
                  <button type="button" class="close" data-dismiss="modal">&times;</button>
                </div>

                <!-- Modal body -->
                <div class="modal-body">
                  금액 입력
                  <br>
                  <input type="text" class="form-control" placeholder="원하는 금액을 입력하세요." id="invest_content" name="ic" onkeydown='return onlyNumber(event)' onkeyup='removeChar(event)' onfocusout='removeChar(event)'>

                  <br>
                  <h4>왜 투자를 결심하셨나요?(필수항목)</h4>

                    <input type="radio" name="gender" value="male" checked> 수익
                    <input type="radio" name="gender" value="female"> 안정
                    <input type="radio" name="gender" value="other"> 성장
                    <input type="radio" name="gender" value="other"> 시장
                    <input type="radio" name="gender" value="other"> 호감<br>

                </div>

                <!-- Modal footer -->
                <div class="modal-footer">

                <p>150,000 <span>원</<span></p> &nbsp;&nbsp;
                 <input type="submit" class="btn btn-danger2" name="submit" value="투자하기" class="button"><button type="button" class="btn btn-danger" data-dismiss="modal" onclick="clearInput()">Close</button>
                </div>

                </form>
              </div>
            </div>
          </div>
            <!--투자버튼 여기까지-->


            <!-- <div class="snipcart-details top_brand_home_details item_add single-item hvr-outline-out button2">
              <form action="#" method="post">

                <fieldset>
                  <input type="hidden" name="cmd" value="_cart">
                  <input type="hidden" name="add" value="1">
                  <input type="hidden" name="business" value=" ">
                  <input type="hidden" name="item_name" value="Wing Sneakers">
                  <input type="hidden" name="amount" value="650.00">
                  <input type="hidden" name="discount_amount" value="1.00">
                  <input type="hidden" name="currency_code" value="USD">
                  <input type="hidden" name="return" value=" ">
                  <input type="hidden" name="cancel_return" value=" ">
                  <input type="submit" name="submit" value="투자하기" class="button">
                </fieldset>
              </form>
            </div> -->

          </div>


          <div class="col-md-8-1" style=" padding:10px; margin:20px 0px 0px 0px;">
            <!--새로 추가할 컨텐츠-->
                        <div style="border:1px; border-style: solid;
                                    border-width: 1px;  margin:10px; height:200px;">
                                    <div style=" height:33%">
                                        datalis
                                    </div>
                                    <div style=" height:33%">
                                        datalis
                                    </div>
                                    <div style="height:33%;">
                                      <div id="flip" style="padding:10px 0px 0px 0px;">Click to slide the panel down or up</div>
                                    </div>
                                    <div id="panel">이메일, 전화번호</div>
                        </div>

          </div>




        <!-- </div> -->


    <!-- <div class="container-fluid" style="padding-left:90px;">
        <div class="row">
          <div class="col-sm-4-1" >


          </div>
          <div class="col-sm-8-1">

          </div>
        </div>
    </div> -->




<br>
        <!--테스트용 두개 붙이기 여기까지-->
        <div class="col-md-8-1 single-right-left simpleCart_shelfItem">



        </div>

      </div>

      <div class="clearfix"> </div>

      <!-- /new_arrivals -->
      <div class="responsive_tabs_agileits" style="width:960px; margin:0 auto; overflow:hidden;">
        <div id="horizontalTab">
          <ul class="resp-tabs-list" style="width: 500px;
                                      margin-left: auto;
                                      margin-right: auto;">
            <li>상세정보</li>
            <li>투자자</li>
            <li>코멘트</li>
          </ul>
          <div class="resp-tabs-container">
            <!--/tab_one-->
            <div class="tab1" >

              <div class="single_page_agile_its_w3ls">



                <h2>스토리</h2>
                <img src="resources/images/content.jpg" style="width:900px;">
                <p>설명</p>
                <p class="w3ls_para">Lorem ipsum dolor sit amet, consectetur adipisicing elPellentesque vehicula augue eget nisl ullamcorper, molestie blandit ipsum auctor. Mauris volutpat augue dolor.Consectetur adipisicing elit, sed do eiusmod
                  tempor incididunt ut lab ore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco. labore et dolore magna aliqua.</p>
                  <img src="resources/images/content2.gif" style="width:900px;">

              </div>

            </div>
            <!--//tab_one-->
            <div class="tab2">

              <div class="single_page_agile_its_w3ls">
                  <h3>총 몇명</h3>
                <div class="bootstrap-tab-text-grids">
                  <div class="bootstrap-tab-text-grid">

                    <div class="media p-3">
                      <img src="http://placehold.it/700x600" alt="John Doe" class="mr-3 mt-3 rounded-circle" style="width:60px;">
                      <div class="media-body">
                        <br>
                        <h4>이름 <small><i>DATE 쓰면 될듯</i></small></h4>
                        <p>이름님이 100,000원 투자로 참여 하셨습니다. 반복문으로 여러개</p>
                      </div>
                    </div>

                    <div class="media  p-3">
                      <img src="http://placehold.it/700x600" alt="John Doe" class="mr-3 mt-3 rounded-circle" style="width:60px;">
                      <div class="media-body">
                        <h4>John Doe <small><i>Posted on February 19, 2016</i></small></h4>
                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
                      </div>
                    </div>
                    <div class="media border p-3">
                      <img src="http://placehold.it/700x600" alt="John Doe" class="mr-3 mt-3 rounded-circle" style="width:60px;">
                      <div class="media-body">
                        <h4>John Doe <small><i>Posted on February 19, 2016</i></small></h4>
                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
                      </div>
                    </div>


                    <div class="clearfix"> </div>
                  </div>



                </div>

              </div>
            </div>



            <div class="tab3">

              <div class="single_page_agile_its_w3ls">

                <!-- <div class="container"> -->
  <h2>여기 코멘트 작성부분</h2>
  <!-- 코멘트 작성 버튼 부분 -->
  <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#comment_write" style="width:500px">
    코멘트 작성
  </button>



<div class="bootstrap-tab-text-grids">
  <div class="bootstrap-tab-text-grid">
  <div class="media border p-3">
    <img src="resources/images/t2.jpg" alt="John Doe" class="mr-3 mt-3 rounded-circle" style="width:45px;">
    <div class="media-body">
      <h4>John Doe <small><i>Posted on February 19, 2016</i></small></h4>
      <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
      <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
      <div class="media p-3">
        <img src="resources/images/t1.jpg" alt="Jane Doe" class="mr-3 mt-3 rounded-circle" style="width:45px;">
        <div class="media-body">
          <h4>Jane Doe <small><i>Posted on February 20 2016</i></small></h4>
          <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
          <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
        </div>
      </div>
    </div>
  </div>
</div>
</div>



  <!-- The Modal -->
  <div class="modal fade" id="comment_write">
    <div class="modal-dialog modal-lg">
      <div class="modal-content">

        <!-- Modal Header -->
        <div class="modal-header">
          <h4 class="modal-title">코멘트 작성</h4>
          <button type="button" class="close" data-dismiss="modal">&times;</button>
        </div>

        <!-- Modal body -->
        <div class="modal-body">

          <!--모달 창 안에 코멘트 작성란 부분-->
          <div class="container_comment">
              <h2>궁금한 것을 물어보세요.</h2>
              <p>The form below contains a textarea for comments:</p>
              <!--댓글 작성부분-->
              <form  method="post" action="/action_page.php">
                <div class="form-group">
                  <label for="comment">Comment</label>
                  <textarea class="form-control" rows="5" id="comment" name="text"></textarea>
                </div>
                <button type="submit" class="btn btn-primary">작성</button>
              </form>

            </div>





        </div>

        <!-- Modal footer -->
        <div class="modal-footer">
          <button type="button" id = "cle" class="btn btn-secondary" data-dismiss="modal" onclick="clearTextarea()">Close</button>
        </div>

      </div>
    </div>
  </div>
<!-- </div> -->

              </div>
            </div>
          </div>
        </div>
      </div>
  <!-- //new_arrivals -->
  <!--/slider_owl-->



  <!--//single_page-->
  <!--/grids-->

  <!--grids-->
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
							<li><a href="total">한눈에보기</a></li>
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
  <script src="resources/js/modernizr.custom.js"></script>
  <!-- Custom-JavaScript-File-Links -->
  <!-- cart-js -->
  <script src="resources/js/minicart.min.js"></script>
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
  <!-- single -->
  <script src="resources/js/imagezoom.js"></script>
  <!-- single -->
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
  <!-- FlexSlider -->
  <script src="resources/js/jquery.flexslider.js"></script>
  <script>
    // Can also be used with $(document).ready()
    $(window).load(function() {
      $('.flexslider').flexslider({
        animation: "slide",
        controlNav: "thumbnails"
      });
    });
  </script>
  <!-- //FlexSlider-->
  <!-- //script for responsive tabs -->
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

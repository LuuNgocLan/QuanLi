<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
	<title>Admin | Đại học bách khoa</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	
	<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
	<!-- bootstrap-css -->
	<link rel="stylesheet" href="${pageContext.request.contextPath}/templates/assets/css/bootstrap.min.css" >
	<!-- //bootstrap-css -->
	<!-- Custom CSS -->
	<link href="${pageContext.request.contextPath}/templates/assets/css/style.css" rel='stylesheet' type='text/css' />
	<link href="${pageContext.request.contextPath}/templates/assets/css/style-responsive.css" rel="stylesheet"/>
	<!-- font CSS -->
	<!-- <link href='//fonts.googleapis.com/css?family=Roboto:400,100,100italic,300,300italic,400italic,500,500italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>-->
	<!-- font-awesome icons -->
	<link rel="stylesheet" href="${pageContext.request.contextPath}/templates/assets/css/font.css" type="text/css"/>
	<link href="${pageContext.request.contextPath}/templates/assets/css/font-awesome.css" rel="stylesheet"> 
	<!-- //font-awesome icons -->
	<script src="${pageContext.request.contextPath}/templates/assets/js/jquery2.0.3.min.js" type="text/javascript"></script>
	
	
	<!-- Date -->
	<link href="${pageContext.request.contextPath}/templates/assets/css/jquery.datepick.css" rel="stylesheet">
	<script src="${pageContext.request.contextPath}/templates/assets/js/jquery.plugin.min.js" type="text/javascript"></script>
	<script src="${pageContext.request.contextPath}/templates/assets/js/jquery.datepick.js" type="text/javascript"></script>
</head>
<body>
	<section id="container">
	<!--header start-->
		<header class="header fixed-top clearfix">
			<!--logo start-->
			<div class="brand">
				<a href="${pageContext.request.contextPath}/" class="logo">QUẢN LÝ</a>
    			<div class="sidebar-toggle-box">
        			<div class="fa fa-bars"></div>
    			</div>
			</div>
			<!--logo end-->
			<div class="nav notify-row" id="top_menu">
    			<!--  notification start -->
    			<ul class="nav top-menu">
        			<!-- settings start -->
        			<li class="dropdown">
            			<a data-toggle="dropdown" class="dropdown-toggle" href="#">
                			<i class="fa fa-tasks"></i>
                			<span class="badge bg-success">0</span>
            			</a>
            			<ul class="dropdown-menu extended tasks-bar">
                			<li>
                    			<p class="">Tính năng đang cập nhật!!</p>
                			</li>
                		<!-- 
                			<li>
                    			<a href="#">
	                        		<div class="task-info clearfix">
	                            		<div class="desc pull-left">
	                                		<h5>Target Sell</h5>
	                                		<p>25% , Deadline  12 June’13</p>
	                            		</div>
	                                	<span class="notification-pie-chart pull-right" data-percent="45">
	                            		<span class="percent"></span>
	                            		</span>
	                        		</div>
                    			</a>
                			</li>
			                <li class="external">
			                    <a href="#">See All Tasks</a>
			                </li>
			            -->
            			</ul>
        			</li>
        			<!-- settings end -->
       				<!-- inbox dropdown start-->
        			<li id="header_inbox_bar" class="dropdown">
            			<a data-toggle="dropdown" class="dropdown-toggle" href="#">
                			<i class="fa fa-envelope-o"></i>
                			<span class="badge bg-important">0</span>
            			</a>
            			<ul class="dropdown-menu extended inbox">
                			<li>
                    			<p class="red">Tính năng đang cập nhật</p>
                			</li>
                		<!--	
                			<li>
                    			<a href="#">
                        			<span class="photo"><img alt="avatar" src="images/3.png"></span>
                                	<span class="subject">
	                                	<span class="from">Jonathan Smith</span>
	                                	<span class="time">Just now</span>
                                	</span>
                                	<span class="message">
                                    	Hello, this is an example msg.
                                	</span>
                    			</a>
                			</li>
               				<li>
			                    <a href="#">See all messages</a>
                			</li>
                		-->
            			</ul>
        			</li>
        			<!-- inbox dropdown end -->
        			<!-- notification dropdown start-->
        	
        			<li id="header_notification_bar" class="dropdown">
            			<a data-toggle="dropdown" class="dropdown-toggle" href="#">
                			<i class="fa fa-bell-o"></i>
                			<span class="badge bg-warning">1</span>
            			</a>
            			<ul class="dropdown-menu extended notification">
                			<li>
                    			<p>Không có thông báo nào!!</p>
                			</li>
                			<%-- <li>
                    			<div class="alert alert-info clearfix">
	                        		<span class="alert-icon"><i class="fa fa-bolt"></i></span>
	                        		<div class="noti-info">
	                            		<a href="${pageContext.request.contextPath}/templates/admin/comment/notactive"><%=num%> bình luận chờ phê duyệt!</a>
	                        		</div>
                    			</div>
                			</li> --%>
            			</ul>
        			</li>
        			<!-- notification dropdown end -->
    			</ul>
   				<!--  notification end -->
			</div>
			<div class="top-nav clearfix">
    			<!--search & user info start-->
    			<ul class="nav pull-right top-menu">
        			<li>
            			<input type="text" class="form-control search" placeholder=" Search">
        			</li>
        			<!-- user login dropdown start-->
        			<li class="dropdown">
            			<a data-toggle="dropdown" class="dropdown-toggle" href="#">
                			<img alt="" src="${pageContext.request.contextPath}/templates/assets/images/3.png"/>
                			<span class="username">${username}</span>
                			<b class="caret"></b>
            			</a>
            			<ul class="dropdown-menu extended logout">
                			<li><a href="${pageContext.request.contextPath}/user/detail"><i class=" fa fa-suitcase"></i>Profile</a></li>
                			<li><a href="#"><i class="fa fa-cog"></i> Settings</a></li>
                			<li><a href="${pageContext.request.contextPath}/dangxuat"><i class="fa fa-key"></i> Log Out</a></li>
            			</ul>
        			</li>
        			<!-- user login dropdown end -->
    			</ul>
    			<!--search & user info end-->
			</div>
		</header>
		<!--header end-->
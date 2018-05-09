<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
		<!--sidebar start-->
		<aside>
    		<div id="sidebar" class="nav-collapse">
        	<!-- sidebar menu start-->
        		<div class="leftside-navigation">
            		<ul class="sidebar-menu" id="nav-accordion">
                		
                		<li class="sub-menu">
                    		<a href="javascript:;">
                        		<i class="fa fa-th-list"></i>
                        		<span>User</span>
                    		</a>
                    		<ul class="sub">
								<li><a href="${pageContext.request.contextPath}/user">Danh sách user</a></li>
								<li><a href="${pageContext.request.contextPath}/user/add">Thêm user</a></li>
								<li><a href="${pageContext.request.contextPath}/user/search">Tìm kiếm User</a></li>
                    		</ul>
                		</li>
                		<li class="sub-menu">
                    		<a href="javascript:;">
                        		<i class="fa fa-th-list"></i>
                        		<span>Thông tin cá nhân</span>
                    		</a>
                    		<ul class="sub">
								<li><a href="${pageContext.request.contextPath}/user/detail">Xem thông tin cá nhân</a></li>
								<li><a href="${pageContext.request.contextPath}/user/changepass">Đổi mật khẩu</a></li>
                    		</ul>
                		</li>
                		
                		
                		
           			 </ul>            
           		</div>
        		<!-- sidebar menu end-->
    		</div>
		</aside>
		<!--sidebar end-->
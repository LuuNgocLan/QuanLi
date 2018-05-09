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
                        		<span>Phòng ban</span>
                    		</a>
                    		<ul class="sub">
								<li><a href="${pageContext.request.contextPath}/phongban">Danh sách phòng ban</a></li>
								<li><a href="${pageContext.request.contextPath}/phongban/them">Thêm phòng ban</a></li>
                    		</ul>
                		</li>
                		<li class="sub-menu">
                    		<a href="javascript:;">
                        		<i class="fa fa-th-list"></i>
                        		<span>Nhân viên</span>
                    		</a>
                    		<ul class="sub">
								<li><a href="${pageContext.request.contextPath}/nhanvien">Danh sách nhân viên</a></li>
								<li><a href="${pageContext.request.contextPath}/nhanvien/them">Thêm nhân viên</a></li>
                    		</ul>
                		</li>
                		
                		
                		
           			 </ul>            
           		</div>
        		<!-- sidebar menu end-->
    		</div>
		</aside>
		<!--sidebar end-->
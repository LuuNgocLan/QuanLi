<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="../inc/header.jsp"%>
	<%@include file="../inc/sidebar.jsp"%>
		<section id="main-content">
			<section class="wrapper">
				<div class="form-w3layouts">
        			<div class="row">
                		<div class="col-lg-12">
                    		<section class="panel">
                        		<header class="panel-heading">
                            		Thêm User
                            		<span class="tools pull-right">
                                		<a class="fa fa-chevron-down" href="javascript:;"></a>
                             		</span>
                        		</header>
                        		<div class="panel-body">
                            		<div class=" form">
                                		<form action="${pageContext.request.contextPath}/user/add" method="post" class="cmxform form-horizontal " id="commentForm" novalidate="novalidate">
                                			<div class="form-group ">
                                        		<label for="cname" class="control-label col-lg-4" >Firstname</label>
                                        		<div class="col-lg-4">
                                            		<input class=" form-control" id="firstname" name="firstname" value="<c:if test="${not empty firstname}">${firstname}</c:if>" minlength="2" type="text" required="">
                                        		</div>
                                    		</div>
                                    			<div class="form-group ">
                                        		<label for="cname" class="control-label col-lg-4" >Lastname</label>
                                        		<div class="col-lg-4">
                                            		<input class=" form-control" id="lastname" name="lastname" value="<c:if test="${not empty lastname}">${lastname}</c:if>" minlength="2" type="text" required="">
                                        		</div>
                                    		</div>
                                    		
                                    		<div class="form-group ">
                                        		<label for="cname" class="control-label col-lg-4" >Username</label>
                                        		<div class="col-lg-4">
                                            		<input class=" form-control" id="username" name="username" value="<c:if test="${not empty username}">${username}</c:if>" minlength="2" type="text" required="">
                                        		</div>
                                    		</div>
                                    		<div class="form-group ">
                                        		<label for="cname" class="control-label col-lg-4" >Password</label>
                                        		<div class="col-lg-4">
                                            		<input type="password" class="form-control" id="password" name="password" value="<c:if test="${not empty password}">${password}</c:if>" minlength="2" type="text" required="">
                                        		</div>
                                    		</div>
                                    		<div class="form-group">
                                        		<div class="col-lg-4" style="text-align: right" >
                                            		<button class="btn btn-primary" type="submit">Thêm</button>
                                        		</div>
                                        		<div class="col-lg-6" style="padding-top:10px;" class="msg">
                                        			<span style="color:red">${msgErr}</span>
                                        		</div>
                                    		</div>
                                		</form>
                            		</div>
                        		</div>
                    		</section>
                		</div>
            		</div>
        		</div>
        	</section>
			<!-- <script type="text/javascript">
				$(function() {
					$('#popupDatepicker').datepick();
					$('#inlineDatepicker').datepick({onSelect: showDate});
				});
				
				function getDate(){
					alert('The date chosen is ');
					var x = document.getElementById("inlineDatepicker");
					 if (x.style.display === "none") {
					        x.style.display = "block";
					 } else {
					        x.style.display = "none";
					 }
				}
				function showDate(date) {
					alert('The date chosen is ' + date);
				}
			</script> -->
        	
        	
<%@include file="../inc/footer.jsp"%>
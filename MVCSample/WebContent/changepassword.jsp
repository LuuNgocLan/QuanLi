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
                            		Thay đổi mật khẩu
                            		<span class="tools pull-right">
                                		<a class="fa fa-chevron-down" href="javascript:;"></a>
                             		</span>
                        		</header>
                        		<div class="panel-body">
                            		<div class=" form">
                                		<form action="${pageContext.request.contextPath}/user/changepass" method="post" class="cmxform form-horizontal " id="commentForm" novalidate="novalidate">
                                			<div class="form-group ">
                                        		<label for="cname" class="control-label col-lg-4" >Mật khẩu cũ</label>
                                        		<div class="col-lg-4">
                                            		<input class=" form-control" id="oldpass" name="oldpass" type="password" minlength="2"  required="">
                                        		</div>
                                    		</div>
                                    			<div class="form-group ">
                                        		<label for="cname" class="control-label col-lg-4" >Mật khẩu mới</label>
                                        		<div class="col-lg-4">
                                            		<input class=" form-control" id="newpass" name="newpass" type="password" value="" minlength="2"  required="">
                                        		</div>
                                    		</div>
                                    		
                                    		<div class="form-group ">
                                        		<label for="cname" class="control-label col-lg-4" >Nhập lại mật khẩu mới</label>
                                        		<div class="col-lg-4">
                                            		<input class=" form-control" id="re_newpass" name="re_newpass" type="password"  value="" minlength="2"  required="">
                                        		</div>
                                    		</div>
                                    		<div class="form-group">
                                        		<div class="col-lg-4" style="text-align: right" >
                                            		<button class="btn btn-primary" type="submit">Cập nhật</button>
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
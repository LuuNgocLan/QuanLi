<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page language="java" import="model.bean.User"%>
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
							Thông tin cá nhân <span class="tools pull-right"> <a
								class="fa fa-chevron-down" href="javascript:;"></a>
							</span>
						</header>
						<%
							User user = (User) request.getAttribute("user");
						%>
						
						<div class="panel-body">
							<div class=" form">
								<form method="get" class="cmxform form-horizontal "
									id="commentForm" novalidate="novalidate">
									<div class="form-group ">
										<label for="cname" class="control-label col-lg-4">ID</label>
										<div class="col-lg-4">
											<input class=" form-control" id="id" name="id"
												value="<%=user.getId()%>" minlength="2" type="text"
												required="">
										</div>
									</div>
									<div class="form-group ">
										<label for="cname" class="control-label col-lg-4">Firstname</label>
										<div class="col-lg-4">
											<input class=" form-control" id="firstname" name="firstname"
												value="<%=user.getFirstname()%>" minlength="2" type="text"
												required="">
										</div>
									</div>
									<div class="form-group ">
										<label for="cname" class="control-label col-lg-4">Lastname</label>
										<div class="col-lg-4">
											<input class=" form-control" id="lastname" name="lastname"
												value="<%=user.getLastname()%>" minlength="2" type="text"
												required="">
										</div>
									</div>

									<div class="form-group ">
										<label for="cname" class="control-label col-lg-4">Username</label>
										<div class="col-lg-4">
											<input class=" form-control" id="username" name="username"
												value="<%=user.getUsername()%>" minlength="2" type="text"
												required="">
										</div>
									</div>
									<div class="form-group ">
										<label for="cname" class="control-label col-lg-4">Password</label>
										<div class="col-lg-4">
											<input class=" form-control" type="password" id="password"
												name="password" value="<%=user.getPassword()%>"
												minlength="2" type="text" required="">
										</div>
									</div>
									<div class="form-group ">
										<label for="cname" class="control-label col-lg-4">Quyền</label>
										<div class="col-lg-4">
											<input class=" form-control" id="role" name="role"
												value="<%=user.getIdRole()%>" minlength="2" type="text"
												required="">
										</div>
									</div>
								</form>
							</div>
						</div>
						<div class="col-sm-6">
							<div class="msg">
								<span style="color: blue">${msg}</span>
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
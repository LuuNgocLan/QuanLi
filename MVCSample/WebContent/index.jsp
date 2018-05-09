<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" import="java.util.ArrayList"%>
<%@ page language="java" import="model.bean.User"%>
<%@include file="../inc/header.jsp"%>
<%@include file="../inc/sidebar.jsp"%>
<section id="main-content">
	<section class="wrapper">
		<div class="table-agile-info">
			<div class="panel panel-default">
				<div class="panel-heading">Danh sách user</div>
				<div class="row w3-res-tb">
					<div class="col-sm-5 m-b-xs"></div>
					<div class="col-sm-4"></div>
					<div class="col-sm-3"></div>
				</div>
				
				<div class="col-sm-6">
					<div class="msg">
						<span style="color: blue">${msg}</span> <span style="color: red">${msgErr}</span>
					</div>
				</div>
				<div class="clearfix"></div>
				<div class="table-responsive">
					<table class="table table-striped b-t b-light">
						<thead>
							<tr>
								<th style="width: 5%; text-align: center;">ID</th>
								<th>Username</th>
								<th>Firstname</th>
								<th>Lastname</th>
								<th>ID_Role</th>
								<th style="text-align: center;">Chức năng</th>
							</tr>
						<thead>
						<tbody>
							<%
								ArrayList<User> userArray = (ArrayList<User>) request.getAttribute("userArray");
								for (int i = 0; i < userArray.size(); i++) {
							%>
							<tr>
								<td><%=userArray.get(i).getId()%></td>
								<td><%=userArray.get(i).getUsername()%></td>
								<td><%=userArray.get(i).getFirstname()%></td>
								<td><%=userArray.get(i).getLastname()%></td>
								<td><%=userArray.get(i).getIdRole()%></td>
								<td align="center">
									<a
									href="${pageContext.request.contextPath}/user/sua?id=<%=userArray.get(i).getId()%>">Sửa</a>
									<a
									href="${pageContext.request.contextPath}/user/xoa?id=<%=userArray.get(i).getId()%>">Xóa</a>
								</td>
							</tr>

							<%
								}
							%>
						</tbody>
					</table>
				</div>
				<footer class="panel-footer">
					<div class="row">
						<div class="col-sm-6 text-right text-center-xs"></div>
					</div>
				</footer>
			</div>
		</div>
	</section>
	<%@include file="../inc/footer.jsp"%>
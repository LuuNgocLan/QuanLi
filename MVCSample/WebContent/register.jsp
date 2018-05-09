<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Đăng Nhập | THPT</title>
	<link href="<%=request.getContextPath()%>/templates/assets/css/login.css" rel="stylesheet" type="text/css" media="all" />
	<link rel="stylesheet" href="<%=request.getContextPath()%>/templates/assets/css/bootstrap.min.css" >
</head>
<body>

	<div class="form-main">
		<h2>Đăng kí</h2>
		<form action="${pageContext.request.contextPath}/dangki" method="post">
			<div class="form-group">
				<label  class="col-md-4" >Firstname </label> 
				<div class="col-md-8">
					<input name="firstname" value="" type="text" />
				</div>
				<div class="clearfix"></div>
			</div>
			<div class="form-group">
				<label  class="col-md-4" >Lastname </label> 
				<div class="col-md-8">
					<input name="lastname" value="" type="text" />
				</div>
				<div class="clearfix"></div>
			</div>
			<div class="form-group">
				<label  class="col-md-4" >Username </label> 
				<div class="col-md-8">
					<input name="username" value="" type="text" />
				</div>
				<div class="clearfix"></div>
			</div>
			<div class="form-group">
				<label  class="col-md-4" >Password</label> 
				<div class="col-md-8">
					<input name="password" value="" type="password" />
				</div>
				<div class="clearfix"></div>
			</div>
			<div class="form-group">
				<div  >
					<input name="submit" value="Đăng kí" type="submit" />
				</div>
			</div>
			
			<p style="color:red;text-align: center">${msg}</p>
		</form>
	</div>
</body>

</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>
	</head>

	<body>
		<form method="post" action="${pageContext.request.contextPath }/user">
			<table border="1px" width="500px" align="center">
				<tr>
					<td>付款方</td>
					<td><input type="text" name="from"></td>
				</tr>
				<tr>
					<td>收款方</td>
					<td><input type="text" name="to"></td>
				</tr>
				<tr>
					<td>金额</td>
					<td><input type="text" name="money"></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit"></td>
				</tr>
			</table>
		</form>

	</body>
</html>
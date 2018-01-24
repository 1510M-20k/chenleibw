<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="<%=request.getContextPath()%>/bootstrap-3.3.7-dist/css/bootstrap.min.css">
</head>
<body>
<center>
		<label class="checkbox-inline"> <input type="checkbox" <c:forEach items="${list}" var="t"><c:if test="${t.pid==2 }">checked</c:if></c:forEach>
			id="inlineCheckbox1" value="2" onclick="a1()"> 阿迪达斯
		</label> <label class="checkbox-inline"> <input
			type="checkbox" id="inlineCheckbox2" value="1" onclick="n1()" <c:forEach items="${list}" var="t"><c:if test="${t.pid==1 }">checked</c:if></c:forEach>> 耐克
		</label> <label class="checkbox-inline"> <input
			type="checkbox" id="inlineCheckbox3" value="3" onclick="l1()" <c:forEach items="${list}" var="t"><c:if test="${t.pid==3 }">checked</c:if></c:forEach>> 李宁
		</label>
		<form class="form-inline">
			<div class="form-group">
				<label for="exampleInputName2">Name</label> <input type="text"class="form-control" name="link" id="exampleInputName2" placeholder="LI_NING">
			</div>
			<button type="submit" class="btn btn-default">搜索</button>
		</form>
	</center>
<table class="table table-condensed">
					<thead>
						<tr>
							<th>商品编号</th>
							<th>商品名称</th>
							<th>品牌（中文）</th>
							<th>品牌</th>
							<th>价格</th>
							<th>库存</th>
							<th>销量</th>
						</tr>
					</thead>
					<tbody>
					<c:forEach items="${list}" var="t">
						<tr class="ck">
							<td>${t.gnumber }</td>
							<td>${t.gname }</td>
							<td>
								<c:forEach items="${pai1 }" var="p">
									<c:if test="${t.pid==p.pid }">${p.brandc}</c:if>
								</c:forEach>
							</td>
							<td>
								<c:forEach items="${pai1 }" var="p">
									<c:if test="${t.pid==p.pid }">${p.brand}</c:if>
								</c:forEach>
							</td>
							<td>${t.price }</td>
							<td>${t.num }</td>
							<td>${t.sales_volume }</td>
						</tr>
						</c:forEach>
					</tbody>
				</table> 
<script type="text/javascript" src="<%=request.getContextPath()%>/bootstrap-3.3.7-dist/jquery.min.js"></script>
	<script type="text/javascript" src="<%=request.getContextPath()%>/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
	<script type="text/javascript">
		function a1() {
			if($("#inlineCheckbox1:checked")){
				var pid = $("#inlineCheckbox1").val();
				location.href="<%=request.getContextPath()%>/user/list.action?pid="+pid;
			}
		}
		function n1() {
			if($("#inlineCheckbox1:checked")){
				var pid = $("#inlineCheckbox2").val();
				location.href="<%=request.getContextPath()%>/user/list.action?pid="+pid;
			}
		}
		function l1() {
			if($("#inlineCheckbox1:checked")){
				var pid = $("#inlineCheckbox3").val();
				location.href="<%=request.getContextPath()%>/user/list.action?pid="+pid;
			}
		}
	</script>
</body>
</html>
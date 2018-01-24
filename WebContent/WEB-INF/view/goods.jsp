<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="<%=request.getContextPath()%>/bootstrap-3.3.7-dist/css/bootstrap.min.css">
</head>
<body>
	<center>
	<form class="form-inline" action="<%=request.getContextPath()%>/goods/list.action" method="post">
		<c:forEach items="${pa }" var="p">
		<input type="checkbox" name="pid" value="${p.pid }" ${pai.pid==p.pid?'checked':'' }>${p.brandc }
		</c:forEach><br>
		<input type="checkbox" name="stock" value="0" ${goods.stock!=null?'checked':'' }>仅看有货
		   <div class="form-group">
   			 <label for="exampleInputName2">Name</label>
    			<input type="text" class="form-control" name="gname" placeholder="Jane Doe">
  			</div>

		<input type="submit" class="btn" value="搜索">
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
		function st() {
			if($("#kk:checked")){
				location.href="<%=request.getContextPath()%>/user/list.action";
			}
		}
	</script>
</body>
</html>
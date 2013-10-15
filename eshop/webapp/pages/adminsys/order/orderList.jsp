<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ include file="/pages/common/taglibs.jsp"%>
<html>
<head>
<base href="<%=basePath%>">
<title>订单列表</title>
</head>
<body>
<table>
<s:iterator value="#request.pageList.list" status="i">
<tr>
	<td><a><s:property value="orderid"/></a>&nbsp;&nbsp;&nbsp;</td>
	<td><s:property value="orderdate" />&nbsp;&nbsp;&nbsp;</td>
	<td>￥ <s:property value="totalpris" />&nbsp;&nbsp;&nbsp;</td>
	<td><s:property value="status" />&nbsp;&nbsp;&nbsp;</td>
	<%-- <td><s:if test="status == 1">已验证</s:if><s:else>未验证</s:else></td> --%>
</tr>
</s:iterator>
<tr>
	<td>
		总：
	</td>
	<td>
		<s:property value="#request.pageList.list.size()" />
	</td>
	<td>
		
	</td>
</tr>
</table>
<s:debug></s:debug>
</body>
</html>
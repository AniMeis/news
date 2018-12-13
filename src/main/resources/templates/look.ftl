<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1  style="color:red">回复信息列表</h1>
 <table  border="1px">
	<tr ><td colspan="7"> <a href="save?invid=${invid}">添加</a> 
				<a href="/">返回</a> </td></tr>
 <tr><th>回复内容</th><th>回复昵称</th><th>发布时间</th></tr>
		<#assign x=0/>

		<#list emplys as em>
		<#assign x=x+1/>

		<tr  <#if x%2!=0>
		 style="background:#66ccff"
		</#if>>
			<td>${em.content}</td>
			<td>${em.author}</td>
			<td>${em.createdate?date}</td>
		</tr>
		</#list>
		
		
 </table>
</body>
</html>
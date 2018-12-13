<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1  style="color:red">帖子列表</h1>
 <table  border="1px">
	<tr align="center"><form action="/getByTitle"><td colspan="7">帖子标题：<input name="title" value="<#if title??>${title} </#if>"><input  type="submit" value="搜索"></td></form></tr>
 <tr><th>标题</th><th>内容摘要</th><th>作者</th><th>发布时间</th><th colspan="2">操作</th></tr>
		 
<#assign x=0/>
		<#list inviation as inv>
		<#assign x=x+1/>

		<tr  <#if x%2!=0>
		 style="background:#66ccff"
		</#if>>
			<td>${inv.title}</td>
			<td>${inv.summary}</td>
			<td>${inv.author}</td>
			<td>${inv.careatedate?date}</td>
			<td colspan="2">
				<a href="/getByKey?invid=${inv.id}">查看</a>  ||
				<a href="/removeByKey?id=${inv.id}">删除</a> 
			</td>
	
		</tr>
		</#list>
		<#if flag??><tr align="center"><td colspan="7"> ${flag}</td></tr></#if>
 </table>
 		<#if (page.pageNum !=1)>
 			<a href="/?pageNum=1" >首页</a>
		</#if>
 		<#if (page.pageNum-1>0)>
			<a href="/?pageNum=${page.pageNum-1}" >上一页</a>
		</#if>
		<#if page.pageNum+1<=page.pages>
				<a href="/?pageNum=${page.pageNum+1}">下一页</a>
		</#if>
		<#if page.pages!=page.pageNum>
		<a href="/?pageNum= ${page.pages}" >末页</a>
		</#if>
</body>
</html>
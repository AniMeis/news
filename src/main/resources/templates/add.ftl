<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="dosave" method="post">
	<table  border="1px">
		<input type="hidden" name="invid" id="invid" value="${invid}">
		<tr><td>回复内容</td><td>
		<input name="content" id="content">
		<text>
		</td></tr>
		<tr><td>回复昵称</td><td><input name="author" id="author"></td></tr>
		<tr><td colspan="2"><input type="submit" value="保存"><input type="button"  value="返回" onclick="history.back(-1)"></td></tr>
	</table>
	</form>
</body>
<script src="http://code.jquery.com/jquery-latest.js"></script>
<script>
	$(function(){
		$("#content").blur(function(){
			var name =	$(this).val();
			if(name==null||name==""){
				alert("回复内容不能为空");
			}
		});
	});
	
	
	
	</script>
</html>
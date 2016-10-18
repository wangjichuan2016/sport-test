<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/test-tag" prefix="wang"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<wang:hello name="王冀川" age="29"></wang:hello>
hello 我的asdfasd好啊的的的多多阿萨德发生的发生的

<%--<!--高速版-->
<div id="SOHUCS"></div>
<script charset="utf-8" type="text/javascript" src="http://changyan.sohu.com/upload/changyan.js" ></script>
<script type="text/javascript">
    window.changyan.api.config({
        appid: 'cysoCXWnU',
        conf: 'prod_364e521684d5c71836f4ce69b37c2a9c'
    });
</script>--%>

<!--打分版，用户可以对当前新闻、游戏或者应用等进行1-5级的评分-->
<div id="SOHUCS"></div>
<script charset="utf-8" type="text/javascript" src="http://changyan.sohu.com/upload/changyan.js" ></script>
<script type="text/javascript">
    window._config = { showScore: true };
    window.changyan.api.config({
        appid: 'cysoCXWnU',
        conf: 'prod_364e521684d5c71836f4ce69b37c2a9c'
    });
</script>



<a href="#SOHUCS" id="changyan_count_unit"></a>
<script type="text/javascript" src="http://assets.changyan.sohu.com/upload/plugins/plugins.count.js"></script>

</body>
</html>
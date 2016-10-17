<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ace test</title>
<style type="text/css" media="screen">
    #editor { 
        position: absolute;
        top: 30px;
        right: 0;
        bottom: 0;
        left: 0;
        width: 800px;
        height: 500px;
    }
</style>
<script src="js/ace/src-min-noconflict/ace.js" type="text/javascript" charset="utf-8"></script>
</head>
<body>
<div style="width: 20px;height: 20px;display: block">
<input type="button" value="测试" onclick="test01()"/>
</div>
<div id="editor">function foo(items) {
    var x = "All this is syntax highlighted";
    return x;
}</div>



<script>
    var editor = ace.edit("editor");
    editor.setTheme("ace/theme/monokai");
    editor.getSession().setMode("ace/mode/javascript");
    function test01(){
    	alert(editor.getSession.readonly);
    	//editor.insert("Something cool");
    	//alert(editor.session.getLength());
    /* 	editor.getSession().setUseWrapMode(true);
    	editor.setHighlightActiveLine(false); */
    	//editor.resize();
    	/* editor.find('all',{
    	    backwards: false,
    	    wrap: false,
    	    caseSensitive: false,
    	    wholeWord: false,
    	    regExp: false
    	}); */
    }
</script>
</body>
</html>
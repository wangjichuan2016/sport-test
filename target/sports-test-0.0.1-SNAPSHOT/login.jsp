<%--
  Created by IntelliJ IDEA.
  User: wangjichuan
  Date: 16-6-30
  Time: 下午3:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
    <script type="application/javascript" src="/js/jquery.min.js"></script>
    <script type="application/javascript" src="/js/ckeditor/ckeditor.js"></script>
</head>
<body>
hello world!!!!
lallalal
<textarea name="editor1" id="editor1" rows="10" cols="80">
    This is my textarea to be replaced with CKEditor.
</textarea>
<input type="button" onclick="submitContent()" value="提交">
</body>
<script>
    var myeditor = CKEDITOR.replace("editor1",
            {
                toolbar:
                        [
                                ['Bold'],
                                ['Image'],
                                ['Link']
                        ]
            });
    function submitContent(){
//        alert(1);
        console.info(CKEDITOR.instances.editor1.getData());
    }
  /*  CKEDITOR.editorConfig = function(config){
        config.toolbal = [
            { name: 'styles', items: [ 'Styles'] },
            { name: 'colors', items: [ 'TextColor', 'BGColor' ] }
        ];
    }*/
</script>
</html>

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


/*    CKEDITOR.plugins.add('simpleLink', {
        lang:['zh-cn'],
        requires: ['dialog'],
        init: function(editor){
            // Add the link and unlink buttons.
            editor.addCommand('simpleLink', new CKEDITOR.dialogCommand('simpleLink'));

            editor.ui.addButton('simpleLink', {
                label: editor.lang.tbTip,
                icon: this.path + 'images/link.png',
                command: 'SimpleLink'
            });
            CKEDITOR.dialog.add('linkcontent', this.path + 'dialogs/linkcontent.js');
        }
    });*/
    var myeditor = CKEDITOR.replace("editor1",
            {
//                extraPlugins:"simpleLink",
                toolbar:
                        [
                            ['Bold'],
                            ['Image'],
                            ['SimpleLink']
                        ],
                width:"50%",
                resize_dir: 'both',
                language:"en",
                removeDialogTabs:"image:advanced;image:Link;image:info;link:target",
                filebrowserImageUploadUrl:"/picture/multiupload?maxWidth=400&maxHeight=400"
            });
    function submitContent(){
//        alert(1);
        console.info(CKEDITOR.instances.editor1.getData());
        CKEDITOR.instances.editor1.setData("<p>哈哈</p><img src='http://fengyun-bar.b0.upaiyun.com/origin_4fc2a178-c70f-41d8-b723-279641818b5a.jpg'/>")
    }
  /*  CKEDITOR.editorConfig = function(config){
        config.toolbal = [
            { name: 'styles', items: [ 'Styles'] },
            { name: 'colors', items: [ 'TextColor', 'BGColor' ] }
        ];
    }*/
</script>

<script>
    $.ajax({
        url:"http://localhost:9090/index/hello/wang",
        dataType:'jsonp',
        data:'',
        jsonp:'callback',
        success:function(result) {
            for(var i in result) {
                alert(i+":"+result[i]);//循环输出a:1,b:2,etc.
            }
        },
        timeout:3000
    });
</script>
</html>

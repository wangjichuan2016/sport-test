<%--
  Created by IntelliJ IDEA.
  User: wangjichuan
  Date: 16-5-18
  Time: 上午10:41
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>bootstrap hello world</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="/js/bootstrap/css/bootstrap.css" rel="stylesheet">
    <style type="text/css">

    </style>

</head>
<body>

<%--<i class="icon_class_name icon-white"></i>
<div class="container">
    <div class="row">
        <div class="span12">
            <form class="well form-search">
                <input type="text" class="input-medium search-query">
                <button type="submit" class="btn"><i class="icon-white"></i> Search</button>
            </form>
        </div>
    </div>
    <footer>
        <p>&copy; Company 2013</p>
    </footer>
</div>



<div class="container">
    <div class="row">
        <div class="span6">
            <ul class="nav nav-tabs nav-stacked">
                <li ><a href="#">Home</a></li>
                <li class="active"><a href="#">Tutorials</a></li>
                <li><a href="#">Practice Editor </a></li>
                <li><a href="#">Gallery</a></li>
                <li><a href="#">Contact</a></li>
            </ul>
        </div>
    </div>
</div>
<div class="container">
    <div class="row">
        <div class="span6">
            <ul class="nav nav-list">
                <li class="nav-header">List header</li>
                <li class="active"><a href="#">Home</a></li>
                <li><a href="#">Library</a></li>
                <li><a href="#">Applications</a></li>
                <li class="nav-header">Another list header</li>
                <li><a href="#">Profile</a></li>
                <li><a href="#">Settings</a></li>
                <li class="divider"></li>
                <li><a href="#">Help</a></li>
            </ul>
        </div>
    </div>
</div>
<div class="container">
    <div class="span6">
        <ul class="nav nav-list">
            <li class="nav-header">List header</li>
            <li class="active"><a href="#"><i class="icon-white icon-home"></i> Home</a></li>
            <li><a href="#"><i class="icon-book"></i> Library</a></li>
            <li><a href="#"><i class="icon-pencil"></i> Applications</a></li>
            <li class="nav-header">Another list header</li>
            <li><a href="#"><i class="icon-user"></i> Profile</a></li>
            <li><a href="#"><i class="icon-cog"></i> Settings</a></li>
            <li class="divider"></li>
            <li><a href="#"><i class="icon-flag"></i> Help</a></li>
        </ul>
    </div>
</div>
<div class="container">
    <div class="row">
        <div class="span6">
            <ul class="nav nav-tabs">
                <li class="active"><a href="#">Home</a></li>
                <li><a href="#">About</a></li>
                <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">FrontEnd<b class="caret"></b></a>
                    <ul class="dropdown-menu">
                        <li><a href="#">Twitter Bootstrap</a></li>
                        <li><a href="#">Google Plus API</a></li>
                        <li><a href="#">HTML5</a></li>
                        <li class="divider"></li>
                        <li><a href="#">Examples</a></li>
                    </ul>
                </li>
                <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">BackEnd<b class="caret bottom-up"></b></a>
                    <ul class="dropdown-menu bottom-up pull-right">
                        <li><a href="#">PHP</a></li>
                        <li><a href="#">MySQL</a></li>
                        <li><a href="#">PostgreSQL</a></li>
                        <li class="divider"></li>
                        <li><a href="#">Live Demos</a></li>
                    </ul>
                </li>
            </ul>
        </div>
    </div>
</div>


<div class="container">
    <div class="row">
        <div class="span4">
            <div class="tabbable">
                <ul class="nav nav-tabs">
                    <li class="active"><a href="#1" data-toggle="tab">Section 1</a></li>
                    <li class=""><a href="#2" data-toggle="tab">Section 2</a></li>
                    <li class=""><a href="#3" data-toggle="tab">Section 3</a></li>
                </ul>
                <div class="tab-content">
                    <div class="tab-pane active" id="1">
                        <p>You are watching section 1.</p>
                    </div>
                    <div class="tab-pane" id="2">
                        <p>You are watching Section 2.</p>
                    </div>
                    <div class="tab-pane" id="3">
                        <p>You are watching Section 3.</p>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>--%>
<%--<div id="fb-root"></div>
<script>(function(d, s, id) {
    var js, fjs = d.getElementsByTagName(s)[0];
    if (d.getElementById(id)) return;
    js = d.createElement(s); js.id = id;
    js.src = "//connect.facebook.net/en_GB/all.js#xfbml=1";
    fjs.parentNode.insertBefore(js, fjs);
}(document, 'script', 'facebook-jssdk'));</script>
<script type="text/javascript">
    (function() {
        var po = document.createElement('script'); po.type = 'text/javascript'; po.async = true;
        po.src = 'https://apis.google.com/js/plusone.js';
        var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(po, s);
    })();
</script>
<div class="navbar navbar-fixed-top">
    <div class="navbar-inner">
        <div class="container">
            <!--navigation does here-->
            <ul class="nav">
                <li class="active">

                    <ul class="nav">
                        <li class="dropdown">
                            <a href="#"
                               class="dropdown-toggle"
                               data-toggle="dropdown">
                                Services
                                <b class="caret"></b>
                            </a>
                            <ul class="dropdown-menu">
                                <li><a href="#">Web Design</a></li>
                                <li><a href="#">Web development</a></li>
                                <li><a href="#">Wordpress Theme development</a></li>
                            </ul>
                        </li>
                    </ul>
                </li>
                <li><a href="#">About</a></li>
                <li><a href="#">Portfolio</a></li>
                <li><a href="#">Contact</a></li>
            </ul>
            <form class="navbar-search pull-left">
                <input type="text" class="search-query" placeholder="Search">
            </form>
            <ul class="nav pull-right">
                <li class="dropdown">
                    <a href="#"
                       class="dropdown-toggle"
                       data-toggle="dropdown">
                        Social
                        <b class="caret"></b>
                    </a>
                    <ul class="dropdown-menu">
                        <li class="socials"><!-- Place this tag where you want the +1 button to render -->
                            <g:plusone annotation="inline" width="150"></g:plusone>
                        </li>
                        <li class="socials"><div class="fb-like" data-send="false" data-width="150" data-show-faces="true"></div></li>
                        <li class="socials"><a href="https://twitter.com/share" class="twitter-share-button">Tweet</a>
                            <script>!function(d,s,id){var js,fjs=d.getElementsByTagName(s)[0];if(!d.getElementById(id)){js=d.createElement(s);js.id=id;js.src="//platform.twitter.com/widgets.js";fjs.parentNode.insertBefore(js,fjs);}}(document,"script","twitter-wjs");</script></li>
                    </ul>
                </li>
            </ul>
        </div>
    </div>
</div>--%>

<%--<div class="container">
    <div class="row">
        <div class="span6">
            <ul class="breadcrumb">
                <li>
                    <a href="#">Home</a> <span class="divider">></span>
                </li>
                <li>
                    <a href="#">Tutorials</a> <span class="divider">></span>
                </li>
                <li class="active">HTML5</li>
            </ul>
        </div>
    </div>
</div>--%>
<div class="dropdown">
    <!-- Link or button to toggle dropdown -->
    <ul class="dropdown-menu" role="menu"  aria-labelledby="dLabel">
        <li><a tabindex="-1" href="#">Action</a></li>
        <li><a tabindex="-1" href="#">Another action</a></li>
        <li><a tabindex="-1" href="#">Something else here</a></li>
        <li class="divider"></li>
        <li><a tabindex="-1" href="#">Separated link</a></li>
    </ul>
</div>

<script src="/js/jquery.min.js"></script>
<script src="/js/bootstrap/js/bootstrap.js"></script>
<script src="/js/bootstrap/js/alert.js"></script>
</body>
</html>

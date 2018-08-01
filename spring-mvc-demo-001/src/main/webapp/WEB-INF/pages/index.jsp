<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>SpringMVC Demo 首页</title>
    <script src="/hhqm/js/jquery-3.3.1.min.js"></script>
    <script>
        function getRandomJson(){
            $.ajax({
                type: "GET",
                url: "/hhqm/getRandomStr", //ajax请求的地址
                async: true, //设置异步请求
                dataType: "json",
                success: function(a, b, c) {
                    alert(a);
                }
            });
        }

    </script>
</head>
<body>
<h1>这里是SpringMVC Demo首页</h1>

<input type="button" value="点击获取json" onclick="getRandomJson();">

<h3>出现此页面，说明配置成功。</h3>

</body>
</html>
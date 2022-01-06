<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>

<html>
<head>
    <title>厂商列表</title>

    <%
        pageContext.setAttribute("APP_PATH",request.getContextPath());
    %>

    <script type="text/javascript" src="${APP_PATH}/static/js/jquery-1.7.2.js"></script>
    <link href="${APP_PATH}/static/bootstrap-3.4.1-dist/css/bootstrap.min.css" rel="stylesheet">
    <script scr="${APP_PATH}/static/bootstrap-3.4.1-dist/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
<%--    标题--%>
    <div class="row">
        <div class="col-md-12">
            <h1>厂商信息</h1>
        </div>
    </div>

<%--    按钮--%>
    <div class="row">
        <div class="col-md-4 col-md-offset-8"></div>
        <button class="btn btn-primary">搜索</button>
    </div>

<%--    表格数据--%>
    <div class="row">
        <div class="col-md-12">
            <table>
                <tr>
                    <th>品类编码</th>
                    <th>品牌编码</th>
                    <th>品牌名称</th>
                    <th>条码段</th>
                    <th>厂商名称</th>
                    <th>厂商编码</th>
                    <th>是否正确</th>
                    <th>信息类型</th>
                    <th>更新类型</th>
                </tr>
            </table>
        </div>
    </div>

<%--    分页信息--%>
    <div class="row"></div>


</div>



</body>
</html>

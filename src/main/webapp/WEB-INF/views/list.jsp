<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="s" uri="http://java.sun.com/jsp/jstl/core" %>
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
        <div class="col-md-4 col-md-offset-8">
            品类编码:<input type="text"/>
            品牌编码:<input type="text"/>
            <button class="btn btn-primary glyphicon glyphicon-search">搜索</button>
        </div>
    </div>

    <form class="navbar-form navbar-left" role="search">
        <div class="form-group">
            <input type="text" class="form-control" placeholder="请输入品类编码">
            <input type="text" class="form-control" placeholder="请输入品牌编码">
        </div>
        <button type="submit" class="btn btn-default">Search</button>
    </form>

    <div class="row">
        <button class="btn-danger">新增</button>
    </div>

<%--    表格数据--%>
    <div class="row">
        <div class="col-md-12">
            <table class="table-hover">
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
                    <th>编辑</th>
                </tr>

                <c:forEach items="${pageInfo.list}" var="m">
                    <tr>
                        <th>${m.e01}</th>
                        <th>${m.e1}</th>
                        <th>${m.brand}</th>
                        <th>${m.厂商码}</th>
                        <th>${m.manufacture}</th>
                        <th>${m.manufacture_code}</th>
                        <th>${m.use}</th>
                        <th>${m.infotype}</th>
                        <th>${m.updatetype}</th>
                        <th>
                            <button class="btn btn-danger">
                                <span class="glyphicon glyphicon-pencil btn-sm">编辑</span>
                            </button>
                        </th>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </div>

<%--    分页文字信息--%>
    <div class="row">
        <div class="col-md-6">
            当前${pageInfo.pageNum}页,总${pageInfo.pages}页,总${pageInfo.getTotal}条记录
        </div>

<%--    分页条信息--%>
        <div class="col-md-6">
            <nav aria-label="Page navigation">
                <ul class="pagination">
                    <li><a href="${APP_PATH}/manufacture?pn=1">首页</a></li>

                    <c:if test="${pageInfo.hasPreviousPage}">
                        <li>
                            <a href="${APP_PATH}/manufacture?pn=${pageInfo.pageNum - 1}" aria-label="Previous">
                                <span aria-hidden="true">&laquo;</span>
                            </a>
                        </li>
                    </c:if>

                    <s:forEach items="${pageInfo.navigatepageNums}" var="p">
                        <c:if test="${p == pageInfo.pageNum}">
                            <li class="active"><a href="#">${p}</a></li>
                        </c:if>
                        <c:if test="${p != pageInfo.pageNum}">
                            <li><a href="${APP_PATH}/manufacture?pn=${p}">${p}</a></li>
                        </c:if>
                    </s:forEach>

                    <c:if test="${pageInfo.hasNextPage}">
                    <li>
                        <a href="${APP_PATH}/manufacture?pn=${pageInfo.pageNum + 1}" aria-label="Next">
                            <span aria-hidden="true">&raquo;</span>
                        </a>
                    </li>
                    </c:if>
                    <li><a href="${APP_PATH}/manufacture?pn=${pageInfo.pages}">末页</a></li>
                </ul>
            </nav>
        </div>
    </div>


</div>



</body>
</html>

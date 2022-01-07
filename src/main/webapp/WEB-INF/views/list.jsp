<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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


    <button class="btn btn-info  btn-sm " style="position:absolute;right:400px; top:20px;">
        <span class="glyphicon glyphicon-envelope btn-sm"> 登录</span>
    </button>


<div class="container">
<%--    标题--%>
    <div class="row">
        <div class="col-md-12">
            <h1>厂商信息</h1>
        </div>
    </div>




    <form class="form-inline">
        <div class="form-group">
            <input type="text" class="form-control" id="exampleInputName2" placeholder="请输入品类编码">
        </div>
        <div class="form-group">
            <input type="email" class="form-control" id="exampleInputEmail2" placeholder="请输入品牌编码">
        </div>
        <button class="btn btn-success  btn-sm">
            <span class="glyphicon glyphicon-search btn-sm"> 查询</span>
        </button>
        <button class="btn btn-success  btn-sm">
            <span class="glyphicon glyphicon-plus btn-sm"> 新增</span>
        </button>

    </form>



<%--    表格数据--%>
    <div class="row">
        <div class="col-md-12">
            <table class="table table-hover ">
                <tr>
                    <th>ID</th>
                    <th>品类编码</th>
                    <th>品牌编码</th>
                    <th>品牌名称</th>
                    <th>条码段</th>
                    <th>是否正确</th>
                    <th>信息类型</th>
                    <th>厂商中文</th>
                    <th>厂商英文</th>
                    <th>厂商编码</th>
                    <th>更新类型</th>
                    <th>编辑</th>
                </tr>

                <c:forEach items="${pageInfo.list}" var="m">
                    <tr>
                        <th>${m.id}</th>
                        <th>${m.e01}</th>
                        <th>${m.e1}</th>
                        <th>${m.brand}</th>
                        <th>${m.bar}</th>
                        <th>${m.whether}</th>
                        <th>${m.infotype}</th>
                        <th>${m.manufactureChinese}</th>
                        <th>${m.rep30050}</th>
                        <th>${m.manufactureCode}</th>
                        <th>${m.updatetype}</th>
                        <th>
                            <button class="btn btn-warning">
                                <span class="glyphicon glyphicon-pencil btn-sm"> 编辑</span>
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
            当前${pageInfo.pageNum}页,共${pageInfo.pages}页
<%--            ,总${pageInfo.getTotal}条记录--%>
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

                    <c:forEach items="${pageInfo.navigatepageNums}" var="p">
                        <c:if test="${p == pageInfo.pageNum}">
                            <li class="active"><a href="#">${p}</a></li>
                        </c:if>
                        <c:if test="${p != pageInfo.pageNum}">
                            <li><a href="${APP_PATH}/manufacture?pn=${p}">${p}</a></li>
                        </c:if>
                    </c:forEach>

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

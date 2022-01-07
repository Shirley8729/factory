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


<button class="btn btn-info  btn-xs " style="position:absolute;right:400px; top:50px;">
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
            <span class="glyphicon glyphicon-search btn-xs"> 查询</span>
        </button>
        <button class="btn btn-success  btn-sm">
            <span class="glyphicon glyphicon-plus btn-xs"> 新增</span>
        </button>

    </form>



    <%--    表格数据--%>
    <div class="row">
        <div class="col-md-12">
            <table class="table table-hover " id="mans_table">
                <thead>
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
                </thead>
                <tbody>

                </tbody>


            </table>
        </div>
    </div>

    <%--    分页文字信息--%>
    <div class="row">
        <div class="col-md-6" id="page_info_area"></div>
        <%--    分页条信息--%>
        <div class="col-md-6" id="page_nav_area"></div>
    </div>


</div>

<%--页面加载完后，发送ajax请求，获取page数据--%>
<script type="text/javascript">
    $(function () {
        $.ajax({
            url:"${APP_PATH}/manufacture",
            data:"pn=1",
            type:"GET",
            contentType: "application/json;charset=utf-8",
            success:function (result) {
            // 1.解析显示厂商数据
                build_mans_table(result);
            // 2.解析显示分页信息
                build_page_info(result);
            // 3.解析显示分页条数据
                build_page_nav(result);
            }
        });
    });
    
    function build_mans_table(result) {
        //清空table表格
        $("#emps_table tbody").empty();
        var mans=result.extend.pageInfo.list;
        $.each(mans,function (index,item) {
            var manuIDTD=$("<td></td>").append(item.id);
            var e0IDTD=$("<td></td>").append(item.e01);
            var e1IDTD=$("<td></td>").append(item.e1);
            var brandIDTD=$("<td></td>").append(item.brand);
            var barIDTD=$("<td></td>").append(item.bar);
            var whetherIDTD=$("<td></td>").append(item.whether);
            var infotypeIDTD=$("<td></td>").append(item.infotype);
            var manuChIDTD=$("<td></td>").append(item.manufactureChinese);
            var rep30050IDTD=$("<td></td>").append(item.rep30050);
            var manuCoIDTD=$("<td></td>").append(item.manufactureCode);
            var mupdateIDTD=$("<td></td>").append(item.updatetype);
            var editBtn=$("<button></button>").addClass("btn btn-warning")
                .append($("<span></span>").addClass("glyphicon glyphicon-pencil btn-xs")).append("编辑");

            $("<tr></tr>").append(manuIDTD).append(e0IDTD).append(e1IDTD).append(brandIDTD).append(barIDTD)
                .append(whetherIDTD).append(infotypeIDTD).append(manuChIDTD).append(rep30050IDTD).append(manuCoIDTD)
                .append(mupdateIDTD).append(editBtn).appendTo("#mans_table tbody");

        });
    }

    function build_page_info(result) {

        $("#page_info_area").append("当前"+result.extend.pageInfo.pageNum+"页,共"+result.extend.pageInfo.pages+"页");
    }

    function build_page_nav(result) {

        var firstPageLi=$("<li></li>").append($("<a></a>").append("首页").attr("href","#"));
        var lastPageLi=$("<li></li>").append($("<a></a>").append("&laquo;"));
        var lastPageLi=$("<li></li>").append($("<a></a>").append("&raquo;"));
        var lastPageLi=$("<li></li>").append($("<a></a>").append("末页").attr("href","#"));

        // $("#page_nav_area").append
    }
</script>
</body>
</html>

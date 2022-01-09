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

<!-- 厂商添加的模态框 -->
<div class="modal fade" id="manAddModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="myModalLabel">添加</h4>
            </div>
            <div class="modal-body">
                <form class="form-horizontal">
                    <div class="form-group">
                        <label class="col-sm-2 control-label">品类编码</label>
                        <div class="col-sm-10">
                            <input type="text" name="e01" class="form-control" id="manE01_add_input" placeholder="品类编码">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">品牌编码</label>
                        <div class="col-sm-10">
                            <input type="text" name="e1" class="form-control" id="manE1_add_input" placeholder="品牌编码">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">条码段</label>
                        <div class="col-sm-10">
                            <input type="text" name="bar" class="form-control" id="manBar_add_input" placeholder="691~696(取8位),697~699(取9位),其它(取7位)">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">是否正确</label>
                        <div class="col-sm-10">
                            <label class="radio-inline">
                                <input type="radio" name="whether" id="whether1_add_input" value="Y" checked="checked"> Y
                            </label>
                            <label class="radio-inline">
                                <input type="radio" name="whether" id="whether2_add_input" value="N"> N
                            </label>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-sm-2 control-label">厂商名称</label>
                        <div class="col-sm-10">
                            <select class="form-control" name="mId" id="man_add_select"></select>
                        </div>
                    </div>

                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button type="button" class="btn btn-primary" id="man_save_btn">保存</button>
            </div>
        </div>
    </div>
</div>

<!-- 厂商修改的模态框 -->
<div class="modal fade" id="manUpdateModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title">修改</h4>
            </div>
            <div class="modal-body">
                <form class="form-horizontal">
                    <div class="form-group">
                        <label class="col-sm-2 control-label">品类编码</label>
                        <div class="col-sm-10">
                            <input type="text" name="e01" class="form-control" id="manE01_update_input" placeholder="品类编码">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">品牌编码</label>
                        <div class="col-sm-10">
                            <input type="text" name="e1" class="form-control" id="manE1_update_input" placeholder="品牌编码">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">条码段</label>
                        <div class="col-sm-10">
                            <input type="text" name="bar" class="form-control" id="manBar_update_input" placeholder="691~696(取8位),697~699(取9位),其它(取7位)">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">是否正确</label>
                        <div class="col-sm-10">
                            <label class="radio-inline">
                                <input type="radio" name="whether" id="whether1_update_input" value="Y" checked="checked"> Y
                            </label>
                            <label class="radio-inline">
                                <input type="radio" name="whether" id="whether2_update_input" value="N"> N
                            </label>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-sm-2 control-label">厂商名称</label>
                        <div class="col-sm-10">
                            <select class="form-control" name="mId" id="man_update_select"></select>
                        </div>
                    </div>

                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button type="button" class="btn btn-primary" id="man_update_btn">更新</button>
            </div>
        </div>
    </div>
</div>


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
            <span class="glyphicon glyphicon-plus btn-xs" id="man_add_modal"> 新增</span>
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

    var nextPage,currentPage;

    $(function () {
        to_page(1);
    });


    function to_page(pn){
        $.ajax({
            url:"${APP_PATH}/manufacture",
            data:"pn="+pn,
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
    }
    function build_mans_table(result) {
        //清空table表格
        $("#mans_table tbody").empty();
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
            var editBtn=$("<button></button>").addClass("btn btn-warning edit_btn")
                .append($("<span></span>").addClass("glyphicon glyphicon-pencil btn-xs")).append("编辑");

            //为编辑按钮添加属性，存放当前员工id
            editBtn.attr("edit_id",item.id)

            $("<tr></tr>").append(manuIDTD).append(e0IDTD).append(e1IDTD).append(brandIDTD).append(barIDTD)
                .append(whetherIDTD).append(infotypeIDTD).append(manuChIDTD).append(rep30050IDTD).append(manuCoIDTD)
                .append(mupdateIDTD).append(editBtn).appendTo("#mans_table tbody");

        });
    }

    function build_page_info(result) {
        //清空table表格
        $("#page_info_area").empty();

        $("#page_info_area").append("当前"+result.extend.pageInfo.pageNum+"页,共"+result.extend.pageInfo.pages+"页");

        nextPage=result.extend.pageInfo.pages + 1;
        currentPage=result.extend.pageInfo.pageNum
    }

    function build_page_nav(result) {

        //清空table表格
        $("#page_nav_area").empty();

        var ul=$("<ul></ul>").addClass("pagination");
        var firstPageLi=$("<li></li>").append($("<a></a>").append("首页").attr("href","#"));
        var prePageLi=$("<li></li>").append($("<a></a>").append("&laquo;"));

        if(result.extend.pageInfo.hasPreviousPage == false){
            firstPageLi.addClass("disabled");
            prePageLi.addClass("disabled");
        }else{
            firstPageLi.click(function (){
                to_page(1);
            });

            prePageLi.click(function (){
                to_page(result.extend.pageInfo.pageNum - 1)
            });
        }



        var nextPageLi=$("<li></li>").append($("<a></a>").append("&raquo;"));
        var lastPageLi=$("<li></li>").append($("<a></a>").append("末页").attr("href","#"));

        if(result.extend.pageInfo.hasNextPage == false){
            nextPageLi.addClass("disabled");
            lastPageLi.addClass("disabled");
        }else{
            nextPageLi.click(function (){
                to_page(result.extend.pageInfo.pageNum + 1);
            });

            prePageLi.click(function (){
                to_page(result.extend.pageInfo.pages)
            });
        }



        ul.append(firstPageLi).append(prePageLi);

        $.each(result.extend.pageInfo.navigatepageNums,function (index,item){

            var numLi=$("<li></li>").append($("<a></a>").append(item));

            if(result.extend.pageInfo.pageNum ==  item){
                numLi.addClass("active");
            }
            numLi.click(function (){
                to_page(item);
            });
            ul.append(numLi);
        });

        ul.append(nextPageLi).append(lastPageLi);

        var navEle=$("<nav></nav>").append(ul);
        navEle.appendTo("#page_nav_area");
    }

    function reset_form(ele){
        //重置表单内容
        $(ele)[0].reset();
        //清空表单样式
        $(ele).find("*").removeClass("has-error has-success")
        $(ele).find(".help-block").text("")
    }
    //点击按钮弹出模态框
    $("man_add_modal").click(function (){
        //清除表单样式 和 数据
        reset_form("manAddModal form")
        //发送ajax请求，返回所有厂商名称
        getMans("man_add_modal");
        //弹出模态框
        $("manAddModal").modal({
            backdrop:"static"
        });
    });

//    查出所有厂商信息,显示在下拉列表
    function getMans(ele){

        //清空下拉列表
        $(ele).empty();
        $.ajax({
            url:"${APP_PATH}/mans",
            type: "GET",
            success:function (result){

                //在下拉列表显示厂商信息
                $.each(result.extend.mans,function (){

                    var optionEle=$("<option></option>").append(this.manufactureCode + "_" + this.manufacture).attr("value",this.manufactureCode)
                    optionEle.appendTo(ele)
                });
            }
        });
    }

    //校验表单数据
    function validate_add_form(){

        $.ajax({
            url:"${APP_PATH}/checkE01E1Bar",
            data:{
                "e01":$('#manE01_add_input'),
                "e1":$('#manE1_add_input'),
                "bar":$('#manBar_add_input'),
            },
            success:function (result){
                if(result.code == 100){
                    show_validate_msg("manE01_add_input","success","");
                    show_validate_msg("manE1_add_input","success","");
                    show_validate_msg("manBar_add_input","success","");
                }else if(result.code == 200){
                    show_validate_msg("manE01_add_input","error","该记录已存在");
                    show_validate_msg("manE1_add_input","error","该记录已存在");
                    show_validate_msg("manBar_add_input","error","该记录已存在");
                }
            }

        });
    }

    function show_validate_msg(ele,status,msg){
        //清除当前元素的校验状态
        $(ele).parent().removeClass("has-error has-success")
        $(ele).next("span").text("")

        if(status == "success"){
            $(ele).parent().addClass("has-success")
            $(ele).next("span").text(msg)
        }else if(status == "fail"){
            $(ele).parent().addClass("has-error")
            $(ele).next("span").text(msg)
        }
    }

    $("#man_save_btn").click(function (){
        //保存模态框数据,校验数据
        if(! validate_add_form()){
            return false;
        }

        $.ajax({
            url:"${APP_PATH}/man",
            type:"POST",
            data: $("man_add_select").serialize(),
            success:function (result){
                //关闭模态框
                $("manAddModal").modal('hide')
                //来到末页显示添加数据
                to_page(nextPage)
                alert(result.msg)

            }
        });
    });

    function getMan(id){
        $.ajax({
            url:"${APP_PATH}/man/"+id,
            type:"GET",
            success:function (result){

                var manData=result.extend.man;
                $("manE01_update_input").text(manData.e01);
                $("manE1_update_input").text(manData.e01);
                $("manUpdateModal input[name=whether]").val([manData.whether]);
                $("manUpdateModal select").val([manData.id]);
            }
        });
    }
    $(document).on("click",".edit_btn",function (){
        //查询厂商信息
        getMan($(this).attr("edit_id"));
        //查询厂商下拉菜单
        getMans("manUpdateModal select");

        //把员工id传递给模态框的更新按钮
        $("man_update_btn").attr("edit_id",$(this).attr("edit_id"))
        //弹出模态框
        $("manUpdateModal").modal({
            backdrop:"static"
        });
    });

    //更新按钮
    $("man_update_btn").click(function (){

        //发送ajax请求
        $.ajax({
            url:"${APP_PATH}/man"+$(this).attr("edit_id"),
            type:"POSt",
            data:$("manUpdateModal form").serialize(),
            success:function (){
                //关闭对话框
                $("#manUpdateModal").modal("hide");
                //返回修改数据页码
                to_page(currentPage);
            }
        });
    });
</script>
</body>
</html>

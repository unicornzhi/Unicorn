$(function () {
    setTimeout("changeImg()",1500) ;
    $(".point-list-s ul li").eq(0).css("background", "#adadad");
    $(".homepage-cat4").hover(function () {
        $(".homepage-cat4 .homepage-cat-submenu").show();
    },function () {
        $(".homepage-cat4 .homepage-cat-submenu").hide();
    })
    $(".homepage-cat6").hover(function () {
        $(".homepage-cat6 .homepage-cat-submenu").show();
    },function () {
        $(".homepage-cat6 .homepage-cat-submenu").hide();
    });






    // /......................................................................../



    // JQ和ajax实现搜索框显示菜名，并使用cookie保存用户搜索历史记录，当搜索框获得焦点时，显示搜索历史
    $("input[name='keyword']").keyup(function () {
        // alert( typeof($("input[name='keyword']").val())); String
        $.ajax({
            url:"/SearchC_name",
            data:{"keyword":$("input[name='keyword']").val()},
            dataType:"json",
            type:"post",
            success:function (result) {
                // console.log(result); //控制台输出json对象，用于调试
                $("#search_show").html("");

                for( var i=0;i<result.length;i++){
                    var $node=$('<p>'+result[i].c_name+'</p>');
                    $("#search_show").append($node);
                     // $("#search_show  p").html($("#search_show  p").html()+result[i].c_name);
                     // $("#search_show ul").html($("#search_show ul").html()+result[i].c_name+"<br>");
                }
                $("#search_show").show();
                if($("#search_show p").text()!="" ){
                    $("#search_show p").mouseover(function () {
                        // alert($(this).text());
                        $("input[name='keyword']").val( $(this).text());
                    });
                    $("#search_show p").click(function () {
                        $("#search_show").hide();
                    });
                }
             }

        })

    });

   // 搜索按钮事件  (  8、31 无法完成）
   // $("input[value='搜菜谱']").click(function () {
   //     $.ajax({
   //         url:"/Search",
   //         data:{"keyword":$("input[name='keyword']").val()},
   //         dataType:"json",
   //         type:"post",
   //
   //     })
   //
   // });

});
// function clearDiv() {
//     var $node=$("input[name='keyword']");
//     // $node.blur(function () {
//     //         $("#search_show").hide();
//     // });
//    	//回车快捷查询
//     $node.keypress(function (e) {
//         var keyCode = e.keyCode ? e.keyCode : e.which ? e.which : e.charCode;
//         if (keyCode == 13){
//             $("#search_show").hide();
//         }
//     });











// /......................................................................../









var i=0;
var imgs=new Array("images/index/lunbo_show1.jpg","images/index/lunbo_show2.jpg","images/index/lunbo_show3.jpg","images/index/lunbo_show4.jpg","images/index/lunbo_show5.jpg");
function changeImg() {

    i++;
    $(".point-list-s ul li").eq(i).css("background", "#adadad");
    $(".point-list-s ul li").eq(i).siblings().css("background", "#ffffff");
    $("#lb_show img").attr("src",imgs[i]);
    if(i==5){
        i=-1;
    }

    setTimeout("changeImg()",1500) ;
}


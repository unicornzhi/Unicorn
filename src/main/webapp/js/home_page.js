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
    })

    $.ajax({
        url:"/GetSessionServlet",
        data:{"userBean":"sessionkey"},
        dataType:"json",
        success:function (ret) {
            if(ret==null){
                alert("没有获取到session的值")
            }else{
                // 将注册和登录隐藏
                var user = ret ;
                loginAngRigister();
                showIndexMessage(user);
            }
        }
    });


    function loginAngRigister() {
        $(".a-login").css("display","none");
        // 显示用户头像和收藏
        $(".user-nav").attr("style","display:block");
        $(".user-collect").attr("style","display:block");
    }

     function showIndexMessage(user){
        // 先将之前的隐藏
         $(".login").css("display","none");
         $(".user").attr("style","display:block");

         // 获取用户的头像url
         var imageurl = user.u_image;
         // 获取用户的姓名
         var username = user.u_name;

         $(".name a").text(username+"的厨房");
         $(".image-link img").attr("src",imageurl);

     }



    // 点击登录，显示登录弹窗
    $(".user-action a:eq(0)").click(function () {
        layer.open({
            title:false,
            type: 2,
            closeBtn: 1, //不显示关闭按钮
            shade: [0],
            area: ['340px', '494px'],
            offset: 'auto',
            anim: 2,
            content: ['login.html', 'no'], //iframe的url，no代表不显示滚动条
        });
    });
    // 点击注册，显示注册弹窗
    $(".user-action a:eq(1)").click(function () {
        layer.open({
            title:false,
            type: 2,
            closeBtn: 1, //不显示关闭按钮
            shade: [0],
            area: ['340px', '574px'],
            offset: 'auto',
            anim: 2,
            content: ['rigister.html', 'no'], //iframe的url，no代表不显示滚动条
        });
    });
});
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


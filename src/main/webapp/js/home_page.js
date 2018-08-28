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


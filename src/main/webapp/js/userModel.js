$(function () {
    $(".btn1").click(function () {
        $(".dish-popup").show();
        // 隐藏窗体的滚动条
        $("body").css({ "overflow": "hidden" });
    })
    $(".dish-popup-close").click(function () {
        $(".dish-popup").hide();
        //显示窗体的滚动条
        $("body").css({ "overflow": "visible" });
    })
})

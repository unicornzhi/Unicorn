<!--用户点击登录跳转到登录界面-->
$(function () {
    $("button").click(function () {
            $.post("/insertUserInfo",{"username":$("input[name='username']").val(),
                "password":$("input[name='password']").val(),
                "phone":$("input[name='phone']").val()
            },function (ret) {
                if(ret){
                    layer.close(layer.index);
                    location.href="login.html";
                }else{
                    alert("注册失败");
                }
            },'text')
          });

    $(".message span:eq(0)").click(function () {
        // 发送验证码短信
        // $.post("/MessageServlet",
        //     {"phone":$("input[name='phone']").val()});
            alert("短信已发送");
    });

    // 点击登录 弹出登录窗口
    $(".l-footer a").click(function () {
        layer.close(layer.index);
       layer.open({
            title: false,
            type: 2,
            closeBtn: 1, //不显示关闭按钮
            shade: [0],
             area: ['340px', '494px'],
            offset: 'auto',
            anim: 2,
            content: ['login.html', 'no']
        });
    });

});
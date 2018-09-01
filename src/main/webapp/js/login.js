$(function () {

    // 登录
    $("button").click(function () {

        $.post("/checkLockServlet",{"username":$("input[name='username']").val(),
                "password":$("input[name='password']").val(),
                "phone":$("input[name='phone']").val()
            },
            function (ret) {
                if(ret){
                    layer.close(layer.index);
                    window.parent.location.reload();
                }else{
                    alert("用户名或密码错误") ;
                }
            },'json');
    });
    // 点击注册
    $(".l-footer a").click(function () {

        layer.open({
            title:false,
            type: 2,
            closeBtn: 0, //不显示关闭按钮
            shade: [0],
            area: ['340px', '574px'],
            offset: 'auto',
            anim: 2,
            content: ['rigister.html', 'no'],
            end:function () {
                var index = parent.layer.getFrameIndex(window.name);
                parent.layer.close(index);
            }
        });
    });
    // 验证用户名
    $("input[name='username']").keyup(function () {
        var regex =/\w{4,10}/;
        var username = $(this).val();
        if(!regex.test(username)){
            layer.tips('用户名不得少于4位', $(this), {
                tips: [1, 'red'],
                time:4000
            });
        }else{
            layer.closeAll('tips');
        }
    });
    //验证密码
    $("input[name='password']").keyup(function () {
        var regex =/^[a-zA-Z0-9]{6,18}/;
        var password = $(this).val();
        if(!regex.test(password)){
            layer.tips('密码不得少于6位', $(this), {
                tips: [1, 'red'],
                time:0,
                id:"password"
            });
        }else{
            layer.closeAll('tips');
        }

    });
    // 验证手机号码
    $("input[name='phone']").keyup(function () {
        var regex =/^\d{11}$/;
        var phone = $(this).val();
        if(!regex.test(phone)){
            layer.tips('手机号码必须为11位', $(this), {
                tips: [1, 'red'],
                time:4000
            });
        }else{
            layer.closeAll('tips');
        }
    })







});

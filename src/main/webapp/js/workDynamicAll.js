$(function () {

// ====================================================================
    //给动态的图片绑定弹出事件
    $(".content-middle").on("click",".plain .dish-280 .cover img",function(){

        $(".dish-popup").show();

        //模态框里的封面图片换
        $(".dish-cover img").prop("src",$(this).attr("src"));
        //换名字
        $(".gray-font a").text($(this).parent().next().next().next().next().children().eq(0).text());
        //换中间的用户头像
        $(".dish-info .pure-u .image-link img").prop("src",$(this).parent().next().next().next().next().children().eq(0).children().eq(0).attr('src'));
        //换上面的用户头像
        $(".mb0 .avatar-right-2 .left .image-link img").prop("src",$(this).parent().next().next().next().next().children().eq(0).children().eq(0).attr('src'));


        // 隐藏窗体的滚动条
        $("body").css({ "overflow": "hidden" });
    });
    $(".dish-popup-close").click(function () {
        $(".dish-popup").hide();
        //显示窗体的滚动条
        $("body").css({ "overflow": "visible" });
    })
    var nameArray =new Array();


//显示所有动态
//     $("#li2").click(function () {
        $(".show-list").remove();
        $.ajax({
            url: "/findDynamicAndUSerServlet",
            type: "post",
            dataType: "json",
            success: function (result) {
                var arm1 = Math.floor(Math.random() * 10);
                var arm2 = Math.ceil(Math.random() * 10);
                for (var i = 0; i < result.length; i++) {
                    var add = $("<ul class='plain pure-g' style='float: left;margin: 0 53px 30px 0;'><div  class=\"dish-280  white-bg has-border\" data-digged=\"false\" data-id=\"143513691\" role=\"dish\">\n" +
                        "  <div class=\"cover\">\n" +
                        "    <img class=\"showModel\" src='" + result[i].d_image + "' data-src='' alt=\"我的厨房不能没有烤箱\" width=\"280\" height=\"280\" class=\"unveiled\">\n" +
                        // "        <a  class=\"plain digg-link logined\" style=\"display: none;\"></a>\n" +
                        // "        <a  rel=\"nofollow\" class=\"plain undigg-link logined\" style=\"display: none;\"></a>\n" +
                        "  </div>\n" +
                        "  <p class=\"name ellipsis red-font\">\n" +
                        "    <a >我的厨房不能没有烤箱</a>&nbsp;\n" +
                        "  </p>\n" +
                        "  <p class=\"desc\">\n" +
                        result[i].d_xinde+
                        "  </p>\n" +
                        "  <div class=\"stats pure-g\">\n" +
                        "    <p class=\"pure-u-1-2\">20小时前</p>\n" +
                        "    <p class=\"pure-u-1-2 align-right\">\n" +
                        "      <span class=\"n-diggs\">1068</span>&nbsp;&nbsp;\n" +
                        "      <span class=\"n-comments\">189</span>\n" +
                        "    </p>\n" +
                        "  </div>\n" +
                        "  <div class=\"author clearfix ellipsis\">\n" +
                        "      <a  href='' title=\"Sunrise太阳\" class=\"avatar-link avatar\">\n" +
                        "        <img src='" + result[i].u_image +"' data-src=\"http://i2.chuimg.com/54ea92ab6f844c968a67660906ed374b_160w_160h.jpg?imageView2/1/w/30/h/30/interlace/1/q/90\" alt=\"Sunrise太阳\" width=\"30\" height=\"30\" class=\"unveiled\">" +
                        // "          Sunrise太阳" +
                        result[i].u_name +
                        "      </a>" +
                        "          <a  class=\"icon icon-cooker\" rel=\"nofollow\"></a>" +
                        "      <span class=\"location gray-font\">（上海,浦东新）</span>" +
                        "    " +
                        "    <a  rel=\"nofollow\" target=\"_blank\">" +
                        "      <img src='' class=\"float-right\" style=\"margin: 7px 10px 0 0;\">" +
                        "    </a>" +
                        "  </div>" +
                        "</div></ul>");
                    $(".cate").after(add);
                }
                $(".buttons").css("clear", "both");


            },
            error: function () {

            }
        })
    // })




// 刘志辉  end
// ====================================================================




})
$(function () {
    var hometown = new Array();
    hometown[1] = ["通州","房山","昌平","怀柔"];
    hometown[2] = ["市南","市北","城阳","四方"];
    hometown[3] = ["红桥","塘沽","河东","河西"];
    $("select[name='hometownProvience']").change(function () {
        $("select[name='hometownCity']").html("");
        if($(this).val() == 0){
            var node = $("<option value='0'>请选择</option>");
            $("select[name='hometownCity']").append(node);
        }else{
            var city = hometown[$(this).val()];
            for(var i = 1;i <= city.length;i++){
                var node = $("<option value='"+i+"'>"+city[i-1]+"</option>");
                $("select[name='hometownCity']").append(node);
            }
        }

    })
    $("select[name='nowliveProvience']").change(function () {
        $("select[name='nowliveCity']").html("");
        if($(this).val() == 0){
            var node = $("<option value='0'>请选择</option>");
            $("select[name='nowliveCity']").append(node);
        }else{
            var city = hometown[$(this).val()];
            for(var i = 1;i <= city.length;i++){
                var node = $("<option value='"+i+"'>"+city[i-1]+"</option>");
                $("select[name='nowliveCity']").append(node);
            }
        }

    })
    $("#basic-info").click(function () {
        $(".basic-info").show();
        $(".set-vatar").hide();
        $(".change-pwd").hide();
    })
    $("#set-avatar").click(function () {
        $(".basic-info").hide();
        $(".set-vatar").show();
        $(".change-pwd").hide();
    })
    $("#change-pwd").click(function () {
        $(".basic-info").hide();
        $(".set-vatar").hide();
        $(".change-pwd").show();
    })
})
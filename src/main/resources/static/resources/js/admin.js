function loading(content,timeout){
	var $loading = $("<div class='mkloading animated bounceInLeft'>"+
		"<span>"+content+"</span>"+
	"</div>");
	$("body").append($loading);
	var width = $loading.width();
	var height = $loading.height();
	$loading.css({marginLeft:(-width/2),marginTop:(-height/2)});
	$loading.on("click",function(){
		$(this).removeClass("animated bounceInLeft")
		.addClass("animated bounceOutRight")
		.fadeOut("slow",function(){
			$(this).remove();
			if($loading.timer)clearInterval($loading.timer);
		});
	});
	
	if(!timeout)timeout=3;
	if($loading.timer)clearInterval($loading.timer);
	// 定时器消息
	$loading.timer = setInterval(function(){
		$loading.trigger("click");
	},timeout*1000);
}
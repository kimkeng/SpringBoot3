$(function(){
	$('.rollover').rollover();
				// 메인 매뉴
	$('.menuH').hover(
		function(){
		$(this).find('.sub').stop(true).css('height','auto').slideDown();
		},
		function(){
		$(this).find('.sub').stop(false).css('height','auto').slideUp();
		}
	);
	var tg = $('.sub')
	$('.navBtn').on('click',function(){
		tg.css('height','550px');
		if (tg.is(':visible')){
			tg.slideUp();
		}else{
			tg.slideDown();
		}
	});
});
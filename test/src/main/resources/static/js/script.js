$(function(){
		// 메인 매뉴
	$('.menuH').hover(
		function(){
		$(this).find('.sub').stop(true,true).slideDown();	
		},
		function(){
		$('.menuH ul').stop(false,false).slideUp();	
		}
	);
	
	var balloon = $('<div class="balloon"></div>').appendTo('body');
	function updateBalloonPosition(x, y){
		balloon.css({left: x+15, top: y});
	}
	
	function showBalloon(){
		balloon.stop();    //충돌방지용
		balloon.css('opacity', 0).show();
		balloon.animate({opacity:1}, 1000);
	}
	function hideBalloon(){
		balloon.stop(); 
		balloon.animate({opacity:0}, 1000, 
			function(){
				/* balloon.css('opacity', 1).hide(); 이거대신 이거 */
				balloon.hide()
			});		//세번째 함수 = 콜백함수 (아주 중요함)
	}
	
	$('.showBalloon').each(function(){
		var element = $(this);
		var text = element.attr('title');
		element.attr('title','');
		element.hover(
			function(event){
				balloon.text(text);
				updateBalloonPosition(event.pageX, event.pageY);
				/* balloon.show(); */
				showBalloon();
			},
			function(){
				/* balloon.hide(); */
				hideBalloon();
			}
		);

		element.mousemove(function(event){
			updateBalloonPosition(event.pageX, event.pageY);
		});
	});
	var interval = 2000; //0.5초
	$('.topTop1').each(function(){
		var timer;
		var container = $(this);
		
		function switchImg(){
			var anchors = container.find('img'); //메서드를 만들기 위한 제이쿼리 객체
			var first = anchors.eq(0); //eq는 몇번째를? 이란뜻
			var second = anchors.eq(1); //두번째
			first.fadeOut().appendTo(container);
			//fadeOut은 이미지 사라지게 하기 
			//appendTo는 이미지가 나오게 하기
			second.fadeIn();
		}
		function startTimer(){ //사용자 정의 함수
			timer = setInterval(switchImg,interval);
		}
		function stopTimer (){
			clearInterval(timer);//timer을 멈춰라
		}
		
		

		startTimer();
	});
	var interval = 1000; //0.5초
	$('.mainBox').each(function(){
		var timer;
		var container = $(this);
		
		function switchImg(){
			var anchors = container.find('a'); //메서드를 만들기 위한 제이쿼리 객체
			var first = anchors.eq(0); //eq는 몇번째를? 이란뜻
			var second = anchors.eq(1); //두번째
			first.fadeOut().appendTo(container);
			//fadeOut은 이미지 사라지게 하기 
			//appendTo는 이미지가 나오게 하기
			second.fadeIn();
		}
		function startTimer(){ //사용자 정의 함수
			timer = setInterval(switchImg,interval);
		}
		function stopTimer (){
			clearInterval(timer);//timer을 멈춰라
		}
		
		
		container.find('a').hover(stopTimer,startTimer);
		// setInterval(switchImg,interval);
		startTimer();
	});
	$('.rollover').rollover();
		$(function(){
		$.getJSON('http://api.openweathermap.org/data/2.5/weather?id=1835848&appid=e9c7b11fc5906d121d843bb9bfb7341d&units=metric',function(data){
			var $minTemp = data.main.temp_min;
			var $maxTemp = data.main.temp_max;
			var $cTemp = data.main.temp;
			var $now = new Date(Date.now());
			var month = $now.getMonth()+1;
			var $cDate = $now.getFullYear() + '년' + month + '월 ' + $now.getDate() + '일' + $now.getHours() + '시' + $now.getMinutes() + '분';
			var $wIcon = data.weather[0].icon;
			
			
			$('.clowtemp').append($minTemp);
			$('.ctemp').append($cTemp);
			$('.chightemp').append($maxTemp);
			$('h2').prepend($cDate);
			$('.cicon').append('<img src="http://openweathermap.org/img/wn/'+$wIcon+'.png" />');
		});
	});
});
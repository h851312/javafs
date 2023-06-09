// 문서가 준비되면 함수 실행
$(function () {

    // 내비게이션바
    $('.main > li > a').mouseenter(function (e) {
        // a태그 기본 이벤트 제거
        e.preventDefault();
        $('.sub').stop().slideDown(400);
        $('.nav_bg').stop().animate({ height: 180 }, 400);
    });
    $('nav').mouseleave(function () {
        $('.sub').stop().slideUp(400);
        $('.nav_bg').stop().animate({ height: 0 }, 400);
    });

    // 섹션1 - 비디오 자동플레이
    // $('video').get(0).play();

    // 섹션1 - 캐로셀
    const slider = $('.slider').bxSlider({
        mode: 'horizontal',
        // mode: 'vertical',
        // mode: 'fade',
        //자동슬라이드
        auto: true,
        //컨트롤 버튼(좌우, 페이저)를 클릭하면 자동 슬라이드 정지
        stopAutoOnClick: true,
        // 슬라이드 위에 hover하면 auto 일시정지
        autoHover: true,
        // 실행 /일시정지 버튼
        // autoControls: true,
        // 네비게이션(인디케이터. 페이저)
        pager: false,
        // 이전/이후 버튼
        controls: false,
        // 전환시간
        speed: 500,
        // 지연시간(슬라이드가 정지되어 있는 시간)
        pause: 4000,

        // 슬라이드 전환 직전에 autoPager() 함수를 호출하여 동작 시킴
        onSlideBefore: function () {
            autoPager();
        },
        // 슬라이드 전환 직후 titMotion() 함수를 호출하여 동작 시킴
        onSlideAfter: function () {
            titMotion();
        }
    });

    function titMotion() {
        // 슬라이드 전환 직후의 텍스트 모션
        $('#slideWrap .slider li div').animate({ top: 0, opacity: 1 });
    }

    function autoPager() {
        // 페이저의 이미지 변경
        // 페이저 a태그의 active 클래스 모두 제거
        $('#slideWrap .pager a').removeClass('active');
        // 현재 슬라이드 번호를 가져와서 currentIdx에 저장
        let currentIdx = slider.getCurrentSlide();
        $('#slideWrap .pager a').eq(currentIdx).addClass('active');

        // 슬라이드 전환 직전의 텍스트 모션
        $('#slideWrap .slider li div ').css({ top: 100, opacity: 0 });
    }

    // 페이저 버튼
    $('#slideWrap .pager a').click(function (e) {
        //a태그의 기본이벤트 제거
        e.preventDefault();
        let idx = $(this).index();
        //idx 번호에 해당하는 위로 슬라이드가 이동
        slider.goToSlide(idx);
        return false;
    });

    // 이전 버튼
    $('#slideWrap #prev').click(function (e) {
        e.preventDefault();
        //이전슬라이드로 이동
        slider.goToPrevSlide();
        autoPager();
        return false;
    });
    // 이후 버튼
    $('#slideWrap #next').click(function (e) {
        e.preventDefault();
        //다음슬라이드 이동
        slider.goToNextSlide();
        autoPager();
        return false;
    });
    // 풀페이지 레이아웃
    $('.section').mousewheel(function (e, delta) {
        let prev;
        if (delta > 0) {
            prev = $(this).prev().offset().top;
            console.log(prev);
            $('html').stop().animate({ scrollTop: prev }, 400, 'easeOutExpo');
        } else if (delta < 0) {
            let next = $(this).next().offset().top;
            console.log(next);
            $('html').stop().animate({ scrollTop: next }, 400, 'easeOutExpo');
        }
    });
    //섹션2
    const sec2 = $('#section2'),
        btn = sec2.find('.btn'),
        txt1 = sec2.find('.txt1'),
        txt2 = sec2.find('.txt2'),
        header = $('header');

    $(window).scroll(function () {
        let sT = $(this).scrollTop();
        let stVal = 600;
        console.log(sT);

        if (sT >= stVal) {
            btn.css({ opacity: 1 });
            txt1.css({ left: 360 + 'px' });
            // txt.style.left = 400 + 'px';
            txt2.css({ left: 360 + 'px' });
            //네비게이션 바 색 변화
            header.css({background:'#fdd000'});

        } else {
            btn.css({ opacity: 0 });
            txt1.css({ left: -800 + 'px' });
            // txt.style.left = -400 + 'px';
            txt2.css({ left: -400 + 'px' });
            //네비게이션 바 색 변화
            header.css({background:'transparent'});
        }
    });

    // 섹션3

    const tabBtn = $('.thumb li'),
        bigImg = $('.big li'),
        txt = $('.txt li');

    tabBtn.click(function () {
        let idx = $(this).index();
        tabBtn.removeClass('active');
        bigImg.removeClass('active');
        txt.removeClass('active');
        $(this).addClass('active');
        bigImg.eq(idx).addClass('active');
        txt.eq(idx).addClass('active');

    });

    //섹션4

    //상단 텍스트 모션을 위한 텍스트 복제
    const txtTop = $('.top');
    const txtTopSpan = txtTop.find('span');
    const txtBtm = $('.btm');
    const txtBtmSpan = txtBtm.find('span');

    txtTopSpan.clone().appendTo(txtTop);
    txtBtmSpan.clone().appendTo(txtBtm);

    //호버 페이드 이펙트 

    // var cnt = 0, timer, idx;
    // $('.fade').mouseenter(function(){
    //     idx = $(this).parent().index();
    //     timer = setInterval(slide, 2000);
    // });
    // $('fade').mouseleave(function(){
    //     clearInterval(timer);
    // });
    const inner = $('.container > div');
    const fade = $('.fade');
    let cnt = 0, idx, timer;

    fade.mouseenter(function () {
        //마우스를 올린 fade의 부모의 색인 번호를 idx 저장
        idx = $(this).parent().index();
        //2초마다 fadeFn 함수를 호출한다.
        timer = setInterval(fadeFn, 2000)
    });

    //fade 위에서  마우스가 벗어나면 함수 실행
    fade.mouseleave(function () {
        //setinterval 정지
        clearInterval(timer);
    });
    function fadeFn() {
        cnt++;
        if (cnt > 2) {
            cnt = 0;
        }
        //idx가 0이명 .story
        //idxrk 1이면 .identity
        inner.eq(idx).find('li').eq(cnt).fadeIn(1000).siblings().fadeOut(1000);
        // inner.eq(idx).find('li').fadeOut(1000);
        // inner.eq(idx).find('li').eq(cnt).fadeIn(1000);

    };

    // 패밀리사이트

    const fs = $('.fs'),
        fsLst = fs.find('ul'),
        fsIcon = fs.find('i'),
        fsTxt = fs.find('span'),
        fsBtn = fs.find('.fsBtn');
    let state = 0;
    //.fsBtn을 클릭하면 함수 실행
    fsBtn.click(function (e) {
        e.preventDefault;
        
        fsLst.slideToggle();
        
        
        if (state == 0) {
            
            fsIcon.attr({ class: 'fa-solid fa-minus' });
            fsTxt.text('관련 사이트 닫기');
            state = 1;
            
        } else {
            fsIcon.attr({ class: 'fa-solid fa-plus' });
            fsTxt.text('관련 사이트 열기');
            state = 0;
            
        }
    });





});

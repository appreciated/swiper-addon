import Swiper from 'swiper';

window.com_github_appreciated_swiper_swiperConnector = {
    init: function (element, config) {
        console.log(config);
        let swiper = new Swiper(element, JSON.parse(config));
        setTimeout(function () {
            swiper.activeIndex = 0;
            swiper.update();
        }, 100)
    }
}
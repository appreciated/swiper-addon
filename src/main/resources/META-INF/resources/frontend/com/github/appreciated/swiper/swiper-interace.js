import Swiper from 'swiper';

window.com_github_appreciated_swiper_swiperConnector = {
    init: function (element, config) {
        console.log(config);
        new Swiper(element, JSON.parse(config));
    }
}
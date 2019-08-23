import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import Swiper from 'swiper';

class SwiperWrapper extends PolymerElement {
    static get template() {
        return html`
        <slot>
        <div id="swiper-container" class="swiper-container">
            <div id="swiper-wrapper" class="swiper-wrapper" style="width: 100%; height: 100%">
       
            </div>
            <div class="swiper-pagination"></div>

    <div class="swiper-button-prev"></div>
    <div class="swiper-button-next"></div>

    <div class="swiper-scrollbar"></div>
        </div>
</slot>`;
    }

    static get is() {
        return 'swiper-wrapper'
    }

    static get properties() {
        return {
            config: {
                type: Object
            }
        }
    }

    ready() {
        super.ready();
        this.updateConfig();
        this.swiperComponent = new Swiper(this.shadowRoot.querySelector('#swiper-container'), this.config);
    }

    updateConfig() {
        this.config = {};
    }

    updateData() {
        if (this.chartObj) {
            this.chartObj.updateSeries(JSON.parse(this.series))
        }
    }

    render() {
        if (this.chartComponent) {
            this.updateConfig();
            this.chartComponent.render();
        }
    }
}

customElements.define(SwiperWrapper.is, SwiperWrapper);

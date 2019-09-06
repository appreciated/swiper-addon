package com.github.appreciated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.vaadin.flow.component.AttachEvent;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.HasSize;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.dependency.JavaScript;
import com.vaadin.flow.component.dependency.NpmPackage;
import com.vaadin.flow.component.html.Div;

import java.util.Arrays;

@NpmPackage(value = "swiper", version = "^4.5.0")
@CssImport("swiper/dist/css/swiper.min.css")
@JavaScript(value = "./com/github/appreciated/swiper/swiper-interace.js")
public class Swiper extends Div implements HasComponents, HasSize {

    Div wrapper = new Div();
    Div pagination = new Div();
    Div buttonPrev = new Div();
    Div buttonNext = new Div();
    private SwiperConfig config;

    public Swiper(SwiperConfig config) {
        setConfig(config);
        addClassName("swiper-container");
        wrapper.addClassName("swiper-wrapper");
        wrapper.setSizeFull();
        initNextButton();
        initPreviousButton();
        initPagination();
        super.add(wrapper);
        setSizeFull();
    }

    private void setConfig(SwiperConfig config) {
        this.config = config;
    }

    private void initNextButton() {
        if (config.getNavigation() != null) {
            buttonPrev.addClassName("swiper-button-next");
            super.add(buttonNext);

        }
    }

    public void initPreviousButton() {
        if (config.getNavigation() != null) {
            buttonPrev.addClassName("swiper-button-prev");
            super.add(buttonNext);
        }
    }

    public void initPagination() {
        if (config.getPagination() != null && config.getPagination().getEl() != null) {
            pagination.addClassName(config.getPagination().getEl().replace(".", ""));
            super.add(pagination);
        }
    }

    @Override
    protected void onAttach(AttachEvent attachEvent) {
        super.onAttach(attachEvent);
        try {
            getElement().executeJs("window.com_github_appreciated_swiper_swiperConnector.init($0, $1)", getElement(), new ObjectMapper().setSerializationInclusion(JsonInclude.Include.NON_NULL).writeValueAsString(config));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void add(Component... components) {
        Arrays.stream(components).forEach(component -> {
            Div slideWrapper = new Div(component);
            slideWrapper.addClassName("swiper-slide");
            slideWrapper.setSizeFull();
            wrapper.add(slideWrapper);
        });
    }

    @Override
    public void remove(Component... components) {
        wrapper.remove(components);
    }
}

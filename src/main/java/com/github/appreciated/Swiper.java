package com.github.appreciated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.appreciated.config.Direction;
import com.github.appreciated.config.Navigation;
import com.vaadin.flow.component.*;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.dependency.JavaScript;
import com.vaadin.flow.component.dependency.NpmPackage;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

import java.util.Arrays;

@NpmPackage(value = "swiper", version = "^4.5.0")
@CssImport("./com/github/appreciated/swiper/swiper-styles.css")
@JavaScript(value = "./com/github/appreciated/swiper/swiper-interace.js")
public class Swiper extends Div implements HasComponents, HasSize, HasStyle {

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
        final Navigation navigation = config.getNavigation();

        if (navigation != null) {
            buttonNext.addClassName(
                navigation.getNextEl() != null
                    ? navigation.getNextEl()
                    : "swiper-button-next"
            );
            super.add(buttonNext);
        }
    }

    public void initPreviousButton() {
        final Navigation navigation = config.getNavigation();

        if (navigation != null) {
            buttonPrev.addClassName(
                navigation.getPrevEl() != null
                    ? navigation.getPrevEl()
                    : "swiper-button-prev"
            );
            super.add(buttonPrev);
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
            HorizontalLayout slideWrapper = new HorizontalLayout(component);
            if (config.getJustifyContentMode() != null) {
                slideWrapper.setJustifyContentMode(config.getJustifyContentMode());
            }
            if (config.getAlignment() != null) {
                slideWrapper.setAlignItems(config.getAlignment());
            }
            slideWrapper.addClassName("swiper-slide");
            if (config.getSlidesPerView() != null && config.getSlidesPerView().equals("auto")) {
                if (config.getDirection() == Direction.HORIZONTAL) {
                    slideWrapper.setHeightFull();
                } else {
                    slideWrapper.setWidthFull();
                }
            } else {
                slideWrapper.setSizeFull();
            }
            wrapper.add(slideWrapper);
        });
    }

    @Override
    public void remove(Component... components) {
        wrapper.remove(components);
    }
}

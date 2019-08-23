package com.github.appreciated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.HasSize;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

import java.util.Arrays;


@JsModule("./com/github/appreciated/swiper/swiper-wrapper.js")
@NpmPackage(value = "swiper", version = "^4.5.0")
@Tag("swiper-wrapper")
public class Swiper extends PolymerTemplate<SwiperModel> implements HasComponents, HasSize {
    SwiperConfig config;

    @Id("swiper-container")
    Div swiperContainer;

    @Id("swiper-wrapper")
    Div swiperWrapper;

    public Swiper(SwiperConfig config) {
        setConfig(config);
    }

    private void setConfig(SwiperConfig config) {
        try {
            getModel().setConfig(new ObjectMapper().setSerializationInclusion(JsonInclude.Include.NON_NULL).writeValueAsString(config));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void add(Component... components) {
        Arrays.stream(components).forEach(component -> {
            Div slideWrapper = new Div(component);
            slideWrapper.getElement().getClassList().add("swiper-slide");
            slideWrapper.setSizeFull();
            swiperWrapper.add(slideWrapper);
        });
    }

    @Override
    public void remove(Component... components) {
        swiperWrapper.remove(components);
    }

    @Override
    public void setWidth(String width) {
        swiperContainer.setWidth(width);
    }

    @Override
    public void setHeight(String height) {
        swiperContainer.setHeight(height);
    }
}

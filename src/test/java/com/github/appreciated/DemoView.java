package com.github.appreciated;

import com.github.appreciated.config.Direction;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.Theme;
import com.vaadin.flow.theme.lumo.Lumo;
import com.vaadin.flow.theme.material.Material;

@Route("")
@Theme(value = Material.class, variant = Lumo.LIGHT)
public class DemoView extends Div {

    public DemoView() {
        setSizeFull();
        addHorizontal();
        addVertical();
    }

    private void addHorizontal() {
        Swiper sw = new Swiper(SwiperConfigBuilder.get()
                .withDirection(Direction.HORIZONTAL)
                .withLoop(true)
                .build()
        );
        sw.setHeight("300px");
        sw.setWidth("100%");
        sw.add(getSlide(), getSlide(), getSlide(), getSlide());
        add(sw);
    }

    private void addVertical() {
        Swiper sw = new Swiper(SwiperConfigBuilder.get()
                .withDirection(Direction.VERTICAL)
                .withLoop(true).build()
        );
        sw.setHeight("300px");
        sw.setWidth("100%");
        sw.add(getSlide(), getSlide(), getSlide(), getSlide());
        add(sw);
    }

    HorizontalLayout getSlide() {
        HorizontalLayout slide = new HorizontalLayout();
        slide.setSizeFull();
        slide.add(new Label("Meow"));
        slide.setAlignItems(FlexComponent.Alignment.CENTER);
        slide.setJustifyContentMode(FlexComponent.JustifyContentMode.CENTER);
        return slide;
    }

}


package com.github.appreciated;

import com.vaadin.flow.templatemodel.Encode;
import com.vaadin.flow.templatemodel.TemplateModel;

public interface SwiperModel extends TemplateModel {

    void setConfig(String config);
    String getConfig();

}

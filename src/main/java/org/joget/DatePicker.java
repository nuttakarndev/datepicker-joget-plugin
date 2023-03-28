package org.joget;

import org.joget.apps.app.service.AppPluginUtil;
import org.joget.apps.app.service.AppUtil;
import org.joget.apps.form.model.Element;
import org.joget.apps.form.model.FormBuilderPalette;
import org.joget.apps.form.model.FormBuilderPaletteElement;
import org.joget.apps.form.model.FormData;
import org.joget.apps.form.service.FormUtil;

import java.util.Map;

public class DatePicker extends Element implements FormBuilderPaletteElement {
    private String PROPERTIES_PATH = "/properties/DatePicker";

    @Override
    public String renderTemplate(FormData formData, Map map) {
        String template = "datePicker.ftl";

        String value = FormUtil.getElementPropertyValue(this, formData);
        map.put("value", value);

        String html = FormUtil.generateElementHtml(this, formData, template, map);
        return html;
    }

    @Override
    public String getName() {
        return getLabel();
    }

    @Override
    public String getVersion() {
        return "1.0.0";
    }

    @Override
    public String getDescription() {
        return AppPluginUtil.getMessage("org.joget.DatePicker.pluginDesc", getClassName(), PROPERTIES_PATH);
    }

    @Override
    public String getLabel() {
        return AppPluginUtil.getMessage("org.joget.DatePicker.pluginLabel", getClassName(), PROPERTIES_PATH);
    }

    @Override
    public String getClassName() {
        return getClass().getName();
    }

    @Override
    public String getPropertyOptions() {
        return AppUtil.readPluginResource(getClassName(), "/properties/DatePicker.json", null, true, PROPERTIES_PATH);
    }

    @Override
    public String getFormBuilderCategory() {
        return FormBuilderPalette.CATEGORY_CUSTOM;
    }

    @Override
    public int getFormBuilderPosition() {
        return 0;
    }

    @Override
    public String getFormBuilderIcon() {
        return "/plugin/" + getClassName() + "/icon.gif";
    }

    @Override
    public String getFormBuilderTemplate() {
        return getLabel();
    }
}

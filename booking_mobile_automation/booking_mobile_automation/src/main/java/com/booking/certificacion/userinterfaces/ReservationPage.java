package com.booking.certificacion.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ReservationPage extends PageObject {

    public static Target CLICK_DESTINATION_INPUT = Target.the("Click on destination field")
            .locatedBy("//android.widget.Button[@content-desc='Introduce tu destino']");

    public static Target DESTINATION_INPUT = Target.the("Enter estination on destination field")
            .locatedBy("//*[@resource-id='com.booking:id/facet_with_bui_free_search_booking_header_toolbar_content']");

    public static Target SELECT_DESTINATION = Target.the("Select destination")
            .locatedBy("//*[@resource-id='com.booking:id/view_disambiguation_destination_title']");

    public static Target DATE = Target.the("Select date on calendar")
            .locatedBy("//android.view.View[@content-desc='{0}']");

    public static Target SELECT_DATES_BTN = Target.the("Confirm dates")
            .locatedBy("//*[@resource-id='com.booking:id/facet_date_picker_confirm']");

    public static Target APPLY_BTN = Target.the("Apply button")
            .locatedBy("//*[@resource-id='com.booking:id/group_config_apply_button']");

    public static Target SEARCH_BTN = Target.the("Click on Search button")
            .locatedBy("//android.view.View[@content-desc='Cuadro de búsqueda de alojamiento']/android.view.View/android.widget.Button");


}

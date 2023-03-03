package com.booking.certificacion.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class LoginPage extends PageObject {

    public static Target SELECT_ACOUNT_OPTION = Target.the("Select Acount option to login")
            .locatedBy("//*[@resource-id='com.booking:id/identity_landing_social_button_text']");

    public static Target EMAIL_INPUT = Target.the("Enter email address")
            .locatedBy("//*[@resource-id='com.booking:id/identity_text_input_edit_text']");

    public static Target CONTINUE_BTN = Target.the("Continue button")
            .locatedBy("//*[@resource-id='com.booking:id/identity_landing_social_button']");

    public static Target PASSWORD_INPUT = Target.the("Password field")
            .locatedBy("//*[@resource-id='com.booking:id/identity_text_input_edit_text']");

    public static Target LOGIN_BTN = Target.the("Login button")
            .locatedBy("//*[@resource-id='com.booking:id/identity_landing_social_button']");
}

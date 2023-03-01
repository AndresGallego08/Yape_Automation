package com.herokuapp.bookerrestful.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/ping.feature",
        glue = "com.herokuapp.bookerrestful.stepdefinitions",
        snippets = SnippetType.CAMELCASE
        //tags = "@HealthCheck"
)
public class PingRunner {
}

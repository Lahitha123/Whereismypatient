package org.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Feature", dryRun = false, glue = "org\\steps", plugin ={"html:target/CucumberReport.html"})
public class TestRunner {


}
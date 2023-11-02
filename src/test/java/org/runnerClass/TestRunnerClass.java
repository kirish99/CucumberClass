package org.runnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;




@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\FeatureFile\\Execution.feature",
                 glue = "org.executionClass",
                 snippets = SnippetType.CAMELCASE,
                 dryRun = false)


public class TestRunnerClass {

}

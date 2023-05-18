package org.runner;

import org.base.BaseClass;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= "C:\\Users\\HP\\eclipse-workspace\\CucumberFrameWork\\src\\test\\resources\\Feature\\BookaHotel.feature",
glue = "org.step",
dryRun = false,
//tags = "@Sanity"
plugin = {"html:C:\\Users\\HP\\eclipse-workspace\\CucumberFrameWork\\target\\htmlReport",
"junit:C:\\Users\\HP\\eclipse-workspace\\CucumberFrameWork\\target\\junitReport.junit",
"json:C:\\Users\\HP\\eclipse-workspace\\CucumberFrameWork\\target\\jsonReport.json"}
)
public class TestRunnerClass extends BaseClass
{
	@AfterClass
	public static void tc01()
	{
	generateJVMreport("C:\\Users\\HP\\eclipse-workspace\\CucumberFrameWork\\target\\jsonReport.json");
	}
	
}

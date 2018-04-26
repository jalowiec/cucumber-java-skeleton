package skeleton;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "io.cucumber.pro.JsonReporter:all"})
public class RunCukesTest {
	
	@Test
	public void test() {
	    assertEquals(15, 15);
	}
}

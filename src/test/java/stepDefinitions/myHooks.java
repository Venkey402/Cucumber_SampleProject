package stepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;

public class myHooks {

    @Before
    public void setup() {
        System.out.println("set up method");
    }

    @After
    public void tearDown() {
        System.out.println("Tear down method");
    }

    @BeforeStep
    public void beforeStep()
    {
        System.out.println("Before each step");
    }
    @AfterStep
    public void afterStep()
    {
        System.out.println("After each step");
    }
}

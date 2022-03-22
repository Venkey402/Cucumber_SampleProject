package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class loginSteps {

    @Given("user on the login page")
    public void user_on_the_login_page() {
        System.out.println("user is on the login page");
    }

    @When("user types {string}")
    public void user_types(String uname_pass) {
        System.out.println("user typed " + uname_pass);
    }

    @When("user types username")
    public void user_types_username() {
        System.out.println("user typed username");
    }

    @When("user types password")
    public void user_types_password() {
        System.out.println("user typed password");
    }

    @When("user clicks on the login button")
    public void user_clicks_on_the_login_button() {
        System.out.println("user clicked on the login page");
    }

    @Then("user lands on the homepage")
    public void user_lands_on_the_homepage() {
        System.out.println("user is on the home page");
    }

    @Then("user logs out")
    public void user_logs_out() {
        System.out.println("user logged out");
    }

    @When("user types the following usernames")
    public void user_types_the_following_usernames(DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.

        List<List<String>> usernames = dataTable.asLists();
        for (List<String> e : usernames)
            for (String usr : e)
                System.out.println("user typed " + usr);

    }


}

package demo.steps;

import demo.pages.ArticlePage;
import demo.pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class PokemonStepdefs {
    private ArticlePage articlePage = new ArticlePage();
    private HomePage homePage = new HomePage();

    @Given("User open Bulbapedia home page")
    public void userOpenBulbapediaHomePage(){
        homePage.openHomePage();
    }


    @When("User input search {string} on home page and Click Enter")
    public void userInputSearchOnHomePageAndClickEnter(String keyword) {
        homePage.inputSearch(keyword);
    }

    @Then("User see article with contains {string} details and show that its {string} pokemon")
    public void userSeeArticleWithContainsDetailsAndShowThatItsPokemon(String pokemonname, String number) {
        String actual = ArticlePage.getPokemonName();
        Assert.assertEquals(pokemonname, actual);

        String numberactual = ArticlePage.getPokemonNumber();
        Assert.assertEquals(number, numberactual);
    }
}

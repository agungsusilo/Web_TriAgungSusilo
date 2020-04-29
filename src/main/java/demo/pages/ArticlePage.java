package demo.pages;

import demo.webdriver.WebDriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ArticlePage {
    public String getPokemonName(){
        WebElement PokeName = WebDriverInstance.driver.findElement(By.xpath("//td[@class='roundy']//table//tbody//tr//td//big//big//b[contains(text(),'Bulbasaur')]"));
        String name = PokeName.getText();
        return name;
    }

    public String getPokemonNumber(){
        WebElement PokeNum = WebDriverInstance.driver.findElement(By.xpath("//span[contains(text(),'#001')]"));
        String numb = PokeNum.getText();
        return numb;
    }
}

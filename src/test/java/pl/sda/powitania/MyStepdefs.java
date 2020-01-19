package pl.sda.powitania;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pl.sda.powitania.Powitania;

public class MyStepdefs {
    Powitania powitania;
    private String zwroconePowitanie;

    @Given("instancja klasy powitanie zostala utworzona")
    public void instancjaKlasyPowitanieZostalaUtworzona() {
        powitania = new Powitania();
    }

    @When("uzyto jezyka polskiego")
    public void uzytoJezykaPolskiego() {
        zwroconePowitanie = powitania.getHelloMessage("pl");
    }

    @Then("zostalo wyswietlone pozdrowienie w jezyku polskim")
    public void zostaloWyswietlonePozdrowienieWJezykuPolskim() {
        assert zwroconePowitanie.equals("Witaj Świecie!");
    }

    @When("uzyto jezyka angielskiego")
    public void uzytoJezykaAngielskiego() {
        zwroconePowitanie = powitania.getHelloMessage("en");
    }

    @Then("zostalo wyswietlone pozdrowienie w jezyku angielskim")
    public void zostaloWyswietlonePozdrowienieWJezykuAngielskim() {
        assert zwroconePowitanie.equals("Hello world!");
    }
}

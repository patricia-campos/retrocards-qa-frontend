package pages;

import org.openqa.selenium.By;
import util.BaseTest;

public class KudoCardPage {

    //==================================================================================================================
    //                                          Página Kudo Card | KUDO CARD
    //==================================================================================================================

    // DECLARAÇÃO DOS CAMPOS:

    public static final By sprintSelector = By.cssSelector("#root > div.sc-bczRLJ.jnamFA > div > table > tbody > tr:nth-child(3) > td:nth-child(2)"); //3 DA LISTA

    public static final By abaKudoBox = By.cssSelector("#KUDOBOX");

    public static final By kudoBoxSelector = By.cssSelector("#root > div.sc-bczRLJ.jnamFA > div > table > tbody > tr > td:nth-child(2)");

    public static final By createKudoCardBtn = By.cssSelector("#createKudocard");

    public static final By titleField = By.cssSelector("#title");

    public static final By descriptionField = By.cssSelector("#description");

    public static final By memberSelect = By.cssSelector("#root > div.sc-bczRLJ.jnamFA > div > form > div.sc-bczRLJ.fuEIgj > div.sc-hAZoDl.gkYMgE > div.sc-fnykZs.efrddH");

    public static final By userSelected = By.cssSelector("#root > div.sc-bczRLJ.jnamFA > div > form > div.sc-bczRLJ.fuEIgj > div.sc-hAZoDl.gkYMgE > div.sc-fEOsli.dqyedd > div:nth-child(3)");

    public static final By submitKudoCardBtn = By.cssSelector("#createKudoCard");

    public static final By editKudoCardIcon = By.cssSelector("#root > div.sc-bczRLJ.jnamFA > div > ul > li:nth-child(2) > div > button:nth-child(2) > svg > path");

    public static final By deleteKudoCardIcon = By.cssSelector("#root > div.sc-bczRLJ.jnamFA > div > ul > li:nth-child(2) > div > button:nth-child(3) > svg");

    public static final By deleteBtn = By.cssSelector("#confirm-modal");


    // VALIDAÇÕES:

    public static final By comSucessoMsg = By.cssSelector("#text-pagination");

    public static final By titleErrorMsg = By.cssSelector("#root > div.sc-bczRLJ.jnamFA > div > form > div:nth-child(4) > span");

    public static final By descriptionErrorMsg = By.cssSelector("#root > div.sc-bczRLJ.jnamFA > div > form > div:nth-child(7) > span");

    //==================================================================================================================

    // MÉTODOS:


    // Preencher com dados válidos:

    public void preencherTitulo() {
        BaseTest.sendKeys(titleField, "Parabéns pela agilidade!");
    }

    public void preencherDescricao() {
        BaseTest.sendKeys(descriptionField, "Entrega realizada com muita agilidade! Parabéns pelo empenho!");
    }

    public void preencherDescricaoEditada() {
        BaseTest.sendKeys(descriptionField, "Obrigada pela dedicação!");
    }

    // Dados vazios:

    public void preencherTitleVazio() {
        BaseTest.sendKeys(titleField, "");
    }

    public void preencherDescriptionVazia() {
        BaseTest.sendKeys(descriptionField, "");
    }

    public void selecionarCampoUsuario() {
        BaseTest.click(memberSelect);
    }

    public void selecionarUsuarioEscolhido() {
        BaseTest.click(userSelected);
    }

    public void clicarRegistrarBtn() {
        BaseTest.click(submitKudoCardBtn);
    }

    public void clicarKudoCardIcon() {
        BaseTest.click(editKudoCardIcon);
    }

    public void clicarDeleteKudoCardIcon() {
        BaseTest.click(deleteKudoCardIcon);
    }

    public void clicarKudoCardDeleteBtn() {
        BaseTest.click(deleteBtn);
    }

    // Clique Buttons:

    public void escolherSprint() {
        BaseTest.click(sprintSelector);
    }

    public void selecionarAbaKudoBox() {
        BaseTest.click(abaKudoBox);
    }

    public void escolherKudoBox() {
        BaseTest.click(kudoBoxSelector);
    }

    public void clicarCriarKudoCard() {
        BaseTest.click(createKudoCardBtn);
    }


    // Validações:

    public String validarCriarKudoCardComSucesso() {
        return BaseTest.getText(comSucessoMsg);
    }

    public String validarTitleError() {
        return BaseTest.getText(titleErrorMsg);
    }

    public String validarDescriptionError() {
        return BaseTest.getText(descriptionErrorMsg);
    }
}

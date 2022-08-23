package pages;

import org.openqa.selenium.By;
import util.BaseTest;

public class LoginPage {

    //==================================================================================================================
    //                                                   LOGIN
    //==================================================================================================================

    // DECLARAÇÃO DOS CAMPOS:

    public static final By emailField = By.cssSelector("#email");

    public static final By passwordField = By.cssSelector("#password");

    public static final By loginBtn = By.cssSelector("#login");

    public static final By logoutBtn = By.cssSelector("#logout");

    public static final By createNewAccountBtn = By.cssSelector("#root > div.sc-gsnTZi.kAnUXQ > div.sc-gsnTZi.jmxJjA > form > p > a");

    // VALIDAÇÕES:

    public static final By welcomeMsg = By.cssSelector("#root > header > div > div > span");

    public static final By emailObrigatorioMsg = By.cssSelector("#root > div.sc-bczRLJ.hZGDwK > div.sc-bczRLJ.bmOLla > form > div:nth-child(4) > span");

    public static final By passwordObrigatorioMsg = By.cssSelector("#root > div.sc-bczRLJ.hZGDwK > div.sc-bczRLJ.bmOLla > form > div:nth-child(7) > span");

    public static final By emailValidoMsg = By.cssSelector("#root > div.sc-bczRLJ.hZGDwK > div.sc-bczRLJ.bmOLla > form > div:nth-child(4) > span");

    public static final By emailNaoRegistradoMsg = By.cssSelector("#login");

    public static final By passwordIncorretoMsg = By.cssSelector("#login");

    public static final By logoutValidoMsg = By.cssSelector("#login");


    //==================================================================================================================

    // MÉTODOS:

    // Preencher com dados válidos:

    public void preencherEmailCorretoAdmin() {
        BaseTest.sendKeys(emailField, "admin@gmail.com");
    }

    public void preencherEmailCorretoFacilitator() {
        BaseTest.sendKeys(emailField, "facilitator@gmail.com");
    }

    public void preencherEmailCorretoMember() {
        BaseTest.sendKeys(emailField, "member@gmail.com");
    }

    public void preencherPasswordCorreto() {
        BaseTest.sendKeys(passwordField, "12345");
    }

    // Dados vazios:

    public void preencherEmailVazio() {
        BaseTest.sendKeys(emailField, "");
    }

    public void preencherPasswordVazio() {
        BaseTest.sendKeys(passwordField, "");
    }

    // Dados incorretos:

    public void preencherEmailInvalido() {
        BaseTest.sendKeys(emailField, "danyllogmail.com");
    }

    public void preencherEmailNaoCadastrado() {     // FIXME - CAPTURAR TOAST
        BaseTest.sendKeys(emailField, "dannylo@gmail.com");
    }

    public void preencherPasswordIncorreto() {      // FIXME - CAPTURAR TOAST
        BaseTest.sendKeys(passwordField, "54321");
    }

    // Clique Buttons:

    public void clicarLoginBtn() {
        BaseTest.click(loginBtn);
    }

    public void clicarLogoutBtn() {
        BaseTest.click(logoutBtn);
    }

    public void clicarCreateAccountBtn() {
        BaseTest.click(createNewAccountBtn);
    }


    // Validações:

    public String validarLoginComSucesso() {
        return BaseTest.getText(welcomeMsg);
    }

    public String validarLoginSemSucessoEmailVazio() {
        return BaseTest.getText(emailObrigatorioMsg);
    }

    public String validarLoginSemSucessoPasswordVazio() {
        return BaseTest.getText(passwordObrigatorioMsg);
    }

    public String validarLoginSemSucessoEmailInvalido() {
        return BaseTest.getText(emailValidoMsg);
    }

    public String validarLoginSemSucessoEmailNaoCadastrado() {  // FIXME - CAPTURAR TOAST
        return BaseTest.getText(emailNaoRegistradoMsg);
    }

    public String validarLoginSemSucessoPasswordIncorreto() {   // FIXME - CAPTURAR TOAST
        return BaseTest.getText(passwordIncorretoMsg);
    }

    public String validarLogoutComSucesso() {
        return BaseTest.getText(logoutValidoMsg);
    }

}

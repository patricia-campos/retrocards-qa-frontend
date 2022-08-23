package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import util.BaseTest;

public class CadastrarPage {

    Faker faker = new Faker();

    String name = faker.name().nameWithMiddle();
    String email = faker.internet().emailAddress();

    //==================================================================================================================
    //                                                  CADASTRAR
    //==================================================================================================================

    // DECLARAÇÃO DOS CAMPOS:

    public static final By createAccountBtn = By.cssSelector("#sign-up");

    public static final By nameField = By.cssSelector("#name");

    public static final By emailField = By.cssSelector("#email");

    public static final By passwordField = By.cssSelector("#password");

    public static final By registerBtn = By.cssSelector("#createLogin");

    // VALIDAÇÕES:

    public static final By nameErrorMsg = By.cssSelector("#root > div.sc-bczRLJ.itlwFG > div.sc-bczRLJ.hPkmCz > form > div:nth-child(4) > span");

    public static final By emailErrorMsg = By.cssSelector("#root > div.sc-bczRLJ.itlwFG > div.sc-bczRLJ.hPkmCz > form > div:nth-child(7) > span");

    public static final By passwordErrorMsg = By.cssSelector("#root > div.sc-bczRLJ.itlwFG > div.sc-bczRLJ.hPkmCz > form > div:nth-child(10) > span");

    public static final By validaCadastroComSucesso = By.cssSelector("#login");

    //==================================================================================================================

    // MÉTODOS:

    // Preencher com dados válidos:

    public void preencherNameCadastroCorreto() {
        BaseTest.sendKeys(nameField, name);
    }

    public void preencherEmailCadastroCorreto() {
        BaseTest.sendKeys(emailField, email);
    }

    public void preencherPasswordCadastrarCorreto() {
        BaseTest.sendKeys(passwordField, "12345");
    }

    // Dados vazios:

    public void preencherNameCadastroVazio() {
        BaseTest.sendKeys(nameField, "");
    }

    public void preencherEmailCadastroVazio() {
        BaseTest.sendKeys(emailField, "");
    }

    public void preencherPasswordCadastroVazio() {
        BaseTest.sendKeys(passwordField, "");
    }

    // Dados mínimo e máximo de caractereres/ inválidos:

    public void preencherNameMinCaracteres() {
        BaseTest.sendKeys(nameField, "qa");
    }

    public void preencherEmailInválido() {
        BaseTest.sendKeys(emailField, "qagmail.com");
    }

    public void preencherPasswordMinCaracteres() {
        BaseTest.sendKeys(passwordField, "1");
    }

    public void preencherPasswordMaxCaracteres() {
        BaseTest.sendKeys(passwordField, "Lorem ipsum dolor sit amet, consectetur adipiscing elit nunc.");
    }

    public void preencherPasswordErrado() {
        BaseTest.sendKeys(passwordField, "45678");
    }


    // Validações:

    public String validarCadastroComSucesso() {
        return BaseTest.getText(validaCadastroComSucesso);
    }

    public String validarCadastroSemSucessoNameVazio() {
        return BaseTest.getText(nameErrorMsg);
    }

    public String validarCadastroSemSucessoEmailVazio() {
        return BaseTest.getText(emailErrorMsg);
    }

    public String validarCadastroSemSucessoPasswordVazio() {
        return BaseTest.getText(passwordErrorMsg);
    }

    public String validarCadastroSemSucessoNameMin() {
        return BaseTest.getText(nameErrorMsg);
    }

    public String validarCadastroSemSucessoPasswordMin() {
        return BaseTest.getText(passwordErrorMsg);
    }

    public String validarCadastroSemSucessoNameMax() {
        return BaseTest.getText(nameErrorMsg);
    }

    public String validarCadastroSemSucessoPasswordMax() {
        return BaseTest.getText(passwordErrorMsg);
    }

    public String validarCadastroSemSucessoEmailInvalido() {
        return BaseTest.getText(emailErrorMsg);
    }

    // Botão:

    public void clicarCreateBtn() {
        BaseTest.click(registerBtn);
    }

    public void clicarCreateAccountBtn() {
        BaseTest.click(createAccountBtn);
    }
}

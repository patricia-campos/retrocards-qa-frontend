package pages;

import org.openqa.selenium.By;
import util.BaseTest;

public class SprintPage {

    //==================================================================================================================
    //                                          Página Sprint | SPRINT
    //==================================================================================================================

    // DECLARAÇÃO DOS CAMPOS:

    public static final By criarBtn = By.cssSelector("#createSprint");

    public static final By titleField = By.cssSelector("#title");

    public static final By startDateField = By.cssSelector("#startDate");

    public static final By endDateField = By.cssSelector("#endDate");

    public static final By cadastrarBtn = By.cssSelector("#submitSprint");

    public static final By voltarBtn = By.cssSelector("#backSprint");

    public static final By editIcon = By.cssSelector("#root > div.sc-bczRLJ.jnamFA > div > table > tbody > tr:nth-child(1) > td:nth-child(4) > div > button.sc-dkzDqf.gJuwqT > svg");

    public static final By editBtn = By.cssSelector("#submitSprint");

    public static final By deleteIcon = By.cssSelector("#root > div.sc-bczRLJ.jnamFA > div > table > tbody > tr:nth-child(1) > td:nth-child(4) > div > button.sc-dkzDqf.fKzLrf > svg");

    public static final By deleteBtn = By.cssSelector("#confirm-modal");

    public static final By cancelBtn = By.cssSelector("#react-confirm-alert > div > div > div > div > button.sc-dkzDqf.fjKwiC");

    // VALIDAÇÕES:

    public static final By voltarHomeMsg = By.cssSelector("#text-pagination");

    public static final By titleErrorMsg = By.cssSelector("#root > div.sc-bczRLJ.jnamFA > div > form > div.sc-breuTD.etXVWC > span");

    public static final By startDateErrorMsg = By.cssSelector("#root > div.sc-bczRLJ.jnamFA > div > form > div.sc-bczRLJ.hzrdPQ > div:nth-child(1) > div > span");

    public static final By endDateErrorMsg = By.cssSelector("#root > div.sc-bczRLJ.jnamFA > div > form > div.sc-bczRLJ.hzrdPQ > div:nth-child(2) > div > span");


    //==================================================================================================================

    // MÉTODOS:

    // Preencher campos corretos:

    public void preencherTitleCorreto() {
        BaseTest.sendKeys(titleField, "Projeto 1/10 - Cliente Cantina do Press");
    }

    public void preencherTitleEditado() {
        BaseTest.sendKeys(titleField, "Projeto 1/5- Cliente Cantina do Press");
    }

    public void preencherStartDateCorreto() {
        BaseTest.sendKeys(startDateField, "30/12/2022");
    }

    public void preencherEndDateCorreto() {
        BaseTest.sendKeys(endDateField, "01/01/2023");
    }


    // Preencher campos em branco:

    public void preencherTitleBranco() {
        BaseTest.sendKeys(titleField, "");
    }

    public void preencherStartDateBranco() {
        BaseTest.sendKeys(startDateField, "");
    }

    public void preencherEndDateBranco() {
        BaseTest.sendKeys(endDateField, "");
    }


    // Preencher campos com limite de caracteres/ errados:

    public void preencherTitleMinimo() {
        BaseTest.sendKeys(titleField, "Mn");
    }

    public void preencherStartDateMinimo() {
        BaseTest.sendKeys(startDateField, "20");
    }

    public void preencherEndDateMinimo() {
        BaseTest.sendKeys(endDateField, "20");
    }

    public void preencherTitleMaximo() {
        BaseTest.sendKeys(titleField, "Lorem ipsum dolor sit amet, consectetur adipiscing elit eget.");
    }

    public void preencherStartDatePassado() {
        BaseTest.sendKeys(startDateField, "01/08/2022");
    }

    public void preencherEndDatePassado() {
        BaseTest.sendKeys(endDateField, "01/08/2022");
    }

    public void preencherStartDatePosteriorEndDate() {
        BaseTest.sendKeys(startDateField, "02/02/2023");
    }


    // Validações:

    public String validarCadastrarSprintComSucesso() {
        return BaseTest.getText(criarBtn);
    }

    public String validarEditarSprintComSucesso() {
        return BaseTest.getText(criarBtn);
    }

    public String validarCadastrarSemSucessoTitleError() {
        return BaseTest.getText(titleErrorMsg);
    }

    public String validarCadastrarSemSucessoStartDateError() {
        return BaseTest.getText(startDateErrorMsg);
    }

    public String validarCadastrarSemSucessoEndDateError() {
        return BaseTest.getText(endDateErrorMsg);
    }

    public String validarNavegacaoComSucesso() {
        return BaseTest.getText(voltarHomeMsg);
    }

    public String validarCadastrarSemSucessoEndDatePassado() {
        return BaseTest.getText(endDateErrorMsg);
    }

    public String validarCadastrarSemSucessoStartDatePosterior() {
        return BaseTest.getText(endDateErrorMsg);
    }

    public String validarEditarSemSucessoTitleError() {
        return BaseTest.getText(titleErrorMsg);
    }

    public void clear() {
        BaseTest.limparCampoForce(titleField);
    }


    // Clicar Buttons:

    public void clicarCriarBtn() {
        BaseTest.click(criarBtn);
    }

    public void clicarCadastrarBtn() {
        BaseTest.click(cadastrarBtn);
    }

    public void clicarVoltarBtn() {
        BaseTest.click(voltarBtn);
    }

    public void clicarEditarIcon() {
        BaseTest.click(editIcon);
    }

    public void clicarEditarBtn() {
        BaseTest.click(editBtn);
    }

    public void clicarDeletarIcon() {
        BaseTest.click(deleteIcon);
    }

    public void clicarDeletarBtn() {
        BaseTest.click(deleteBtn);
    }

    public void clicarCancelarBtn() {
        BaseTest.click(cancelBtn);
    }

}

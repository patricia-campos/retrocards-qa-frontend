package pages;

import org.openqa.selenium.By;
import util.BaseTest;

public class KudoBoxPage {

    //==================================================================================================================
    //                                                  KUDO BOX
    //==================================================================================================================

    // DECLARAÇÃO DOS CAMPOS:

    public static final By selecionaSprint = By.cssSelector("#root > div.sc-bczRLJ.jnamFA > div > table > tbody > tr:nth-child(1) > td:nth-child(2)");

    public static final By selecionaAbaKudoBox = By.cssSelector("#KUDOBOX");

    public static final By criaKudosBoxBtn = By.cssSelector("#createKudoBox");

    public static final By titleField = By.cssSelector("#title");

    public static final By endDateField = By.cssSelector("#endDate");

    public static final By cadastraKudoBoxBtn = By.cssSelector("#submitKudoBox");

    public static final By voltarBtn = By.cssSelector("#backToSprintFromKudoBox");

    public static final By editIcon = By.cssSelector("#root > div.sc-bczRLJ.jnamFA > div > table > tbody > tr > td:nth-child(6) > div > button.sc-dkzDqf.dwbvGA > svg");

    public static final By deleteIcon = By.cssSelector("#root > div.sc-bczRLJ.jnamFA > div > table > tbody > tr > td:nth-child(6) > div > button.sc-dkzDqf.jLxQrP > svg");

    public static final By deleteBtn = By.cssSelector("#confirm-modal");

    // VALIDAÇÕES:

    public static final By voltarKudoBoxPageMsg = By.cssSelector("#KUDOBOX");

    public static final By titleErrorMsg = By.cssSelector("#root > div.sc-bczRLJ.jnamFA > div > form > div.sc-breuTD.etXVWC > span");

    public static final By endDateErrorMsg = By.cssSelector("#root > div.sc-bczRLJ.jnamFA > div > form > div.sc-bczRLJ.fuEIgj > div > span");


    //==================================================================================================================

    // MÉTODOS:

    // Preencher com dados válidos:

    public void preencherTitleCorreto() {
        BaseTest.sendKeys(titleField, "Reunião 1");
    }

    public void preencherTitleEditado() {
        BaseTest.sendKeys(titleField, "- Retornos");
    }

    public void preencherEndDateCorreto() {
        BaseTest.sendKeys(endDateField, "31/12/2022");
    }


    // Dados vazios:

    public void preencherTitleBranco() {
        BaseTest.sendKeys(titleField, "");
    }

    public void preencherEndDateBranco() {
        BaseTest.sendKeys(endDateField, "");
    }


    // Dados mínimo e máximo de caractereres/ inválidos:

    public void preencherTitleMinimo() {
        BaseTest.sendKeys(titleField, "Mn");
    }

    public void preencherEndDateMinimo() {
        BaseTest.sendKeys(endDateField, "20");
    }

    public void preencherTitleMaximo() {
        BaseTest.sendKeys(titleField, "Lorem ipsum dolor sit amet, consectetur adipiscing elit eget.");
    }

    public void preencherEndDatePassado() {
        BaseTest.sendKeys(endDateField, "19/05/1988");
    }

    public void preencherEndDateFuturo() {
        BaseTest.sendKeys(endDateField, "02/03/2023");
    }


    // Validações:

    public String validarCadastrarKudoBoxComSucesso() {
        return BaseTest.getText(criaKudosBoxBtn);
    }

    public String validarEditarKudoBoxComSucesso() {
        return BaseTest.getText(criaKudosBoxBtn);
    }

    public String validarCadastrarSemSucessoTitleError() {
        return BaseTest.getText(titleErrorMsg);
    }

    public String validarCadastrarSemSucessoDateError() {
        return BaseTest.getText(endDateErrorMsg);
    }
    /*
    public String validarNavegacaoComSucesso() {
        return BaseTest.getText(criaKudosBoxBtn);
    }
    public String validarCadastrarSemSucessoEndDatePassado() {
        return BaseTest.getText(endDateErrorMsg);
    }
    public String validarCadastrarSemSucessoEndDateFuturo() {
        return BaseTest.getText(endDateErrorMsg);
    }
    public String validarEditarSemSucessoTitleError() {
        return BaseTest.getText(titleErrorMsg);
    }
*/

    // Clicar Buttons:

    public void clicarSelecionarSprint() {
        BaseTest.click(selecionaSprint);
    }

    public void selecionarAbaKudoBoxBtn() {
        BaseTest.click(selecionaAbaKudoBox);
    }

    public void clicarCriarKudoBoxBtn() {
        BaseTest.click(criaKudosBoxBtn);
    }

    public void clicarRegistarKudoBoxBtn() {
        BaseTest.click(cadastraKudoBoxBtn);
    }

    public void clicarVoltarKudoBoxBtn() {
        BaseTest.click(voltarBtn);
    }

    public void clicarEditarIcon() {
        BaseTest.click(editIcon);
    }

    public void clicarDeletarIcon() {
        BaseTest.click(deleteIcon);
    }

    public void clicarDeletarBtn() {
        BaseTest.click(deleteBtn);
    }

    // Clear:
    public void clearTitleField() {
        BaseTest.limparCampoForce(titleField);
    }

    public void clearDateField() {
        BaseTest.limparCampoForce(endDateField);
    }

}

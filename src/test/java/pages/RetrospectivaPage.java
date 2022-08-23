package pages;

import org.openqa.selenium.By;
import util.BaseTest;

public class RetrospectivaPage {

    //==================================================================================================================
    //                                             RETROSPECTIVA
    //==================================================================================================================

    // DECLARAÇÃO DOS CAMPOS:

    public static final By sprintSelector = By.cssSelector("#root > div.sc-bczRLJ.jnamFA > div > table > tbody > tr:nth-child(1) > td:nth-child(2)");

    public static final By createRetrospectiveBtn = By.cssSelector("#createRetrospective");

    public static final By titleField = By.cssSelector("#title");

    public static final By retrospectiveDateField = By.cssSelector("#occurredDate");

    public static final By submitRetrospectiveBtn = By.cssSelector("#submitRetrospective");

    public static final By backToRetrospectiveBtn = By.cssSelector("#backToSprintFromRetropective");

    public static final By confirmBtn = By.cssSelector("#confirm-modal");

    public static final By cancelBtn = By.cssSelector("#close-modal");

    public static final By chooseUserSelector = By.cssSelector("#root > div.sc-gsnTZi.bVAMue > div > form > div.sc-gsnTZi.dtELat > div > div.sc-hAZoDl.gkYMgE > div.sc-fnykZs.efrddH");

    public static final By userChoosedSelector = By.cssSelector("#root > div.sc-gsnTZi.bVAMue > div > form > div.sc-gsnTZi.dtELat > div > div.sc-hAZoDl.gkYMgE > div.sc-fEOsli.dqyedd > div:nth-child(9)");

    public static final By addUserEmail = By.cssSelector("#root > div.sc-gsnTZi.bVAMue > div > form > div.sc-gsnTZi.dtELat > button");

    public static final By submitEmailBtn = By.cssSelector("#createKudoCard");

    public static final By playRetrospectiveIcon = By.cssSelector("#root > div.sc-gsnTZi.bVAMue > div > table > tbody > tr > td:nth-child(6) > div > button.sc-dkzDqf.bqSdoT > svg");

    public static final By emailRetrospectiveIcon = By.cssSelector("#root > div.sc-gsnTZi.bVAMue > div > table > tbody > tr > td:nth-child(6) > div > button > svg > path");

    public static final By editRetrospectiveIcon = By.cssSelector("#root > div.sc-bczRLJ.jnamFA > div > table > tbody > tr > td:nth-child(6) > div > button.sc-dkzDqf.dwbvGA > svg");

    public static final By deleteRetrospectiveIcon = By.cssSelector("#root > div.sc-bczRLJ.jnamFA > div > table > tbody > tr > td:nth-child(6) > div > button.sc-dkzDqf.jLxQrP > svg");

    // VALIDAÇÕES:

    public static final By comSucessoMsg = By.cssSelector("#RETROSPECTIVA");

    public static final By titleErrorMsg = By.cssSelector("#root > div.sc-gsnTZi.hZqPym > div > form > div.sc-breuTD.etXVWC > span");

    public static final By retrospectiveDateErrorMsg = By.cssSelector("#root > div.sc-gsnTZi.hZqPym > div > form > div.sc-gsnTZi.kTpPpx > div > span");

    public static final By retrospectivePageComSucessoMsg = By.cssSelector("#root > div.sc-gsnTZi.hZqPym > div > form > div.sc-gsnTZi.kTpPpx > div > span");


    //==================================================================================================================

    // MÉTODOS:

    // Preencher com dados válidos:

    public void preencherTitleCorreto() {
        BaseTest.sendKeys(titleField, "Reunião de levantamento de requisitos");
    }

    public void preencherDateCorreto() {
        BaseTest.sendKeys(retrospectiveDateField, "31/12/2022");
    }

    public void preencherTitleEditado() {
        BaseTest.sendKeys(titleField, "- Planejamento Inicial");
    }


    // Dados vazios:

    public void preencherTitleVazio() {
        BaseTest.sendKeys(titleField, "");
    }

    public void preencherDateVazio() {
        BaseTest.sendKeys(retrospectiveDateField, "");
    }


    // Dados mínimo e máximo de caractereres/ inválidos:

    public void preencherTitleMinCaracteres() {
        BaseTest.sendKeys(titleField, "qa");
    }

    public void preencherTitleMaxCaracteres() {
        BaseTest.sendKeys(titleField, "Lorem ipsum dolor sit amet, consectetur adipiscing elit nunc.");
    }

    public void preencherDateIncompleta() {
        BaseTest.sendKeys(retrospectiveDateField, "2022");
    }

    public void preencherDatePassado() {
        BaseTest.sendKeys(retrospectiveDateField, "19/05/1988");
    }

    // Selector:

    public void selecionarCampoUsuario() {
        BaseTest.click(chooseUserSelector);
    }

    public void selecionarUsuario() {
        BaseTest.click(userChoosedSelector);
    }

    public void clicarAdicionarUsuario() {
        BaseTest.click(addUserEmail);
    }

    public void clicarConfirmarEnviarEmail() {
        BaseTest.click(submitEmailBtn);
    }


    // Clique Buttons:

    public void clicarSelecionarSprint() {
        BaseTest.click(sprintSelector);
    }

    public void clicarCriarNovaRetrospectivaBtn() {
        BaseTest.click(createRetrospectiveBtn);
    }

    public void clicarConfirmarCriarRetrospectivaBtn() {
        BaseTest.click(submitRetrospectiveBtn);
    }

    public void clicarEnviarEmailIcon() {
        BaseTest.click(emailRetrospectiveIcon);
    }

    public void clicarEditarRetrospectivaIcon() {
        BaseTest.click(editRetrospectiveIcon);
    }

    public void clicarDeletarRetrospectivaIcon() {
        BaseTest.click(deleteRetrospectiveIcon);
    }

    public void clicarVoltarBtn() {
        BaseTest.click(backToRetrospectiveBtn);
    }

    public void clicarMudarStatusIcon() {
        BaseTest.click(playRetrospectiveIcon);
    }

    public void clicarConfirmarBtn() {
        BaseTest.click(confirmBtn);
    }

    public void clicarCancelarBtn() {
        BaseTest.click(cancelBtn);
    }


    // Clear:
    public void clearTitleField() {
        BaseTest.limparCampoForce(titleField);
    }

    public void clearDateField() {
        BaseTest.limparCampoForce(retrospectiveDateField);
    }


    // Validações:
    public String validarCriarRetrospectivaComSucesso() {
        return BaseTest.getText(comSucessoMsg);
    }

    public String validarCadastrarSemSucessoTitleError() {
        return BaseTest.getText(titleErrorMsg);
    }

    public String validarCadastrarSemSucessoDateError() {
        return BaseTest.getText(retrospectiveDateErrorMsg);
    }

    public String validarNavegacaoComSucesso() {
        return BaseTest.getText(retrospectivePageComSucessoMsg);
    }


}

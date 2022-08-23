package pages;

import org.openqa.selenium.By;
import util.BaseTest;

public class UsuarioPage {
    //==================================================================================================================
    //                                                USUÁRIOS
    //==================================================================================================================

    // DECLARAÇÃO DOS CAMPOS:

    public static final By usersBtn = By.cssSelector("#logout");

    public static final By userSelector = By.cssSelector("#root > div.sc-gsnTZi.bzRQSr > div > table > tbody > tr:nth-child(4) > td:nth-child(2)");

    public static final By roleSelector = By.cssSelector("#root > div.sc-gsnTZi.imAYeS > div > form > div.sc-gsnTZi.dtELat > div > div.sc-hAZoDl.gkYMgE > div.sc-fnykZs.JxLuG");

    public static final By memberSelect = By.cssSelector("#root > div.sc-gsnTZi.imAYeS > div > form > div.sc-gsnTZi.dtELat > div > div.sc-hAZoDl.gkYMgE > div.sc-fEOsli.dqyedd > div:nth-child(1)");

    public static final By facilitatorSelect = By.cssSelector("#root > div.sc-gsnTZi.imAYeS > div > form > div.sc-gsnTZi.dtELat > div > div.sc-hAZoDl.gkYMgE > div.sc-fEOsli.dqyedd > div:nth-child(1)");

    public static final By editRoleBtn = By.cssSelector("#createKudoCard");

    public static final By voltarBtn = By.cssSelector("#backToKudoBoxFromKudoCard");

    // VALIDAÇÕES:

    public static final By titleUsuariosMsg = By.cssSelector("#root > div.sc-gsnTZi.bzRQSr > div > div.sc-gsnTZi.imxZTL > h1");

    public static final By selectorErrorMsg = By.cssSelector("#root > div.sc-gsnTZi.imAYeS > div > form > div.sc-gsnTZi.dtELat > div > div.sc-breuTD.etXVWC > span");

    //==================================================================================================================

    // MÉTODOS:

    // Clique Buttons:

    public void clicarUsuariosBtn() {
        BaseTest.click(usersBtn);
    }

    public void selecionarUsuario() {
        BaseTest.click(userSelector);
    }

    public void clicarSeletorCargo() {
        BaseTest.click(roleSelector);
    }

    public void selecionarCargoMember() {
        BaseTest.click(memberSelect);
    }

    public void selecionarCargoFacilitator() {
        BaseTest.click(facilitatorSelect);
    }

    public void clicarEditarCargoBtn() {
        BaseTest.click(editRoleBtn);
    }

    public void clicarVoltarBtn() {
        BaseTest.click(voltarBtn);
    }


    // Validações:

    public String validarComSucesso() {
        return BaseTest.getText(titleUsuariosMsg);
    }

    public String validarSemSucesso() {
        return BaseTest.getText(selectorErrorMsg);
    }


}

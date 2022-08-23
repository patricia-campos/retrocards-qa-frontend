package steps;

import org.junit.Assert;
import org.junit.Test;
import pages.LoginPage;
import util.Browser;

public class LoginSteps extends Browser {

    LoginPage loginPage = new LoginPage();

    //==================================================================================================================
    //                                                 LOGIN
    //==================================================================================================================

    @Test
    public void logarComSucessoAdmin() {

        loginPage.preencherEmailCorretoAdmin();
        loginPage.preencherPasswordCorreto();
        loginPage.clicarLoginBtn();

        Assert.assertEquals(loginPage.validarLoginComSucesso().substring(0,9), "Bem vindo");
    }

    @Test
    public void logarComSucessoFacilitator() {

        loginPage.preencherEmailCorretoFacilitator();
        loginPage.preencherPasswordCorreto();
        loginPage.clicarLoginBtn();

        Assert.assertEquals(loginPage.validarLoginComSucesso().substring(0,9), "Bem vindo");
    }

    @Test
    public void logarComSucessoMember() {

        loginPage.preencherEmailCorretoMember();
        loginPage.preencherPasswordCorreto();
        loginPage.clicarLoginBtn();

        Assert.assertEquals(loginPage.validarLoginComSucesso().substring(0,9), "Bem vindo");
    }

    //==================================================================================================================

    @Test
    public void logarSemSucessoEmailVazio() {

        loginPage.preencherEmailVazio();
        loginPage.preencherPasswordCorreto();
        loginPage.clicarLoginBtn();

        Assert.assertEquals(loginPage.validarLoginSemSucessoEmailVazio(), "Campo Obrigatório");
    }

    //==================================================================================================================

    @Test
    public void logarSemSucessoPasswordVazio() {

        loginPage.preencherEmailCorretoFacilitator();
        loginPage.preencherPasswordVazio();
        loginPage.clicarLoginBtn();

        Assert.assertEquals(loginPage.validarLoginSemSucessoPasswordVazio(), "Campo Obrigatório");
    }

    //==================================================================================================================

    @Test
    public void logarSemSucessoEmailInvalido() {

        loginPage.preencherEmailInvalido();
        loginPage.preencherPasswordCorreto();
        loginPage.clicarLoginBtn();

        Assert.assertEquals(loginPage.validarLoginSemSucessoEmailInvalido(), "Insira um email válido");
    }

    //==================================================================================================================

    @Test
    public void logarSemSucessoEmailNaoCadastrado() {

        loginPage.preencherEmailNaoCadastrado();
        loginPage.preencherPasswordCorreto();
        loginPage.clicarLoginBtn();

        Assert.assertEquals(loginPage.validarLoginSemSucessoEmailNaoCadastrado(), "Login");
    }

    //==================================================================================================================

    @Test
    public void logarSemSucessoPasswordIncorreto() {

        loginPage.preencherEmailCorretoFacilitator();
        loginPage.preencherPasswordIncorreto();
        loginPage.clicarLoginBtn();

        Assert.assertEquals(loginPage.validarLoginSemSucessoPasswordIncorreto(), "Login");
    }

    //==================================================================================================================

    @Test
    public void logoutComSucesso() {

        logarComSucessoFacilitator();
        loginPage.clicarLogoutBtn();

        Assert.assertEquals(loginPage.validarLogoutComSucesso(), "Login");
    }

    //==================================================================================================================

    @Test
    public void loginPosLogoutComSucesso() {

        logoutComSucesso();
        logarComSucessoFacilitator();

        Assert.assertEquals(loginPage.validarLoginComSucesso(), "Bem vindo Facilitator");
    }
}

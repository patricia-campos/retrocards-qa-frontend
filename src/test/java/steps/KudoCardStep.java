package steps;

import org.junit.Assert;
import org.junit.Test;
import pages.KudoCardPage;
import pages.LoginPage;
import util.Browser;

public class KudoCardStep extends Browser {

    LoginPage loginPage = new LoginPage();

    KudoCardPage kudoCardPage = new KudoCardPage();

    //==================================================================================================================
    //                                              KUDO CARD
    //==================================================================================================================

    @Test
    public void ciarKudoCardComSucesso() {

        loginPage.preencherEmailCorretoMember();
        loginPage.preencherPasswordCorreto();
        loginPage.clicarLoginBtn();

        kudoCardPage.escolherSprint();
        kudoCardPage.selecionarAbaKudoBox();
        kudoCardPage.escolherKudoBox();
        kudoCardPage.clicarCriarKudoCard();
        kudoCardPage.preencherTitulo();
        kudoCardPage.preencherDescricao();
        kudoCardPage.selecionarCampoUsuario();
        kudoCardPage.selecionarUsuarioEscolhido();
        kudoCardPage.clicarRegistrarBtn();

        Assert.assertEquals(kudoCardPage.validarCriarKudoCardComSucesso().substring(0, 9), "Mostrando");
    }

    //==================================================================================================================

    @Test
    public void ciarKudoCardSemSucesso() {

        loginPage.preencherEmailCorretoMember();
        loginPage.preencherPasswordCorreto();
        loginPage.clicarLoginBtn();

        kudoCardPage.escolherSprint();
        kudoCardPage.selecionarAbaKudoBox();
        kudoCardPage.escolherKudoBox();
        kudoCardPage.clicarCriarKudoCard();
        kudoCardPage.preencherTitleVazio();
        kudoCardPage.preencherDescriptionVazia();
        kudoCardPage.selecionarCampoUsuario();
        kudoCardPage.selecionarUsuarioEscolhido();
        kudoCardPage.clicarRegistrarBtn();

        Assert.assertEquals(kudoCardPage.validarTitleError(), "Campo Obrigatório");
        Assert.assertEquals(kudoCardPage.validarDescriptionError(), "Campo Obrigatório");
    }

    //==================================================================================================================

    @Test
    public void editarKudoCardComSucesso() {

        loginPage.preencherEmailCorretoMember();
        loginPage.preencherPasswordCorreto();
        loginPage.clicarLoginBtn();

        kudoCardPage.escolherSprint();
        kudoCardPage.selecionarAbaKudoBox();
        kudoCardPage.escolherKudoBox();
        kudoCardPage.clicarKudoCardIcon();
        kudoCardPage.preencherDescricaoEditada();
        kudoCardPage.selecionarCampoUsuario();
        kudoCardPage.selecionarUsuarioEscolhido();
        kudoCardPage.clicarRegistrarBtn();

        Assert.assertEquals(kudoCardPage.validarCriarKudoCardComSucesso().substring(0, 9), "Mostrando");
    }

    //==================================================================================================================

    @Test
    public void deletarKudoCardComSucesso() {

        loginPage.preencherEmailCorretoMember();
        loginPage.preencherPasswordCorreto();
        loginPage.clicarLoginBtn();

        kudoCardPage.escolherSprint();
        kudoCardPage.selecionarAbaKudoBox();
        kudoCardPage.escolherKudoBox();
        kudoCardPage.clicarDeleteKudoCardIcon();
        kudoCardPage.clicarKudoCardDeleteBtn();

        Assert.assertEquals(kudoCardPage.validarCriarKudoCardComSucesso().substring(0, 9), "Mostrando");
    }
}


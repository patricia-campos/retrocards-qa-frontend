package steps;

import org.junit.Assert;
import org.junit.Test;
import pages.LoginPage;
import pages.UsuarioPage;
import util.Browser;

public class UsuarioSteps extends Browser {

    LoginPage loginPage = new LoginPage();

    UsuarioPage usuarioPage = new UsuarioPage();

    //==================================================================================================================
    //                                                 USUARIO
    //==================================================================================================================

    @Test
    public void alterarCargoComSucesso() {

        loginPage.preencherEmailCorretoAdmin();
        loginPage.preencherPasswordCorreto();
        loginPage.clicarLoginBtn();

        usuarioPage.clicarUsuariosBtn();
        usuarioPage.selecionarUsuario();
        usuarioPage.clicarSeletorCargo();
        usuarioPage.selecionarCargoMember();
        usuarioPage.clicarEditarCargoBtn();

        Assert.assertEquals(usuarioPage.validarComSucesso(), "Usuários");
    }

    //==================================================================================================================

    @Test
    public void navegarTelaUsuarios() {

        loginPage.preencherEmailCorretoAdmin();
        loginPage.preencherPasswordCorreto();
        loginPage.clicarLoginBtn();

        usuarioPage.clicarUsuariosBtn();
        usuarioPage.selecionarUsuario();
        usuarioPage.clicarVoltarBtn();

        Assert.assertEquals(usuarioPage.validarComSucesso(), "Usuários");
    }

    //==================================================================================================================

    @Test
    public void alterarCargoSemSucessoSeletorVazio() {

        loginPage.preencherEmailCorretoAdmin();
        loginPage.preencherPasswordCorreto();
        loginPage.clicarLoginBtn();

        usuarioPage.clicarUsuariosBtn();
        usuarioPage.selecionarUsuario();
        usuarioPage.clicarEditarCargoBtn();

        Assert.assertEquals(usuarioPage.validarSemSucesso(), "Campo Obrigatório");
    }
}

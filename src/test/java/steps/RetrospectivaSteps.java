package steps;

import org.junit.Assert;
import org.junit.Test;
import pages.LoginPage;
import pages.RetrospectivaPage;
import util.Browser;

public class RetrospectivaSteps extends Browser {

    LoginPage loginPage = new LoginPage();

    RetrospectivaPage retrospectivaPage = new RetrospectivaPage();

    //==================================================================================================================
    //                                                RETROSPECTIVA
    //==================================================================================================================

    @Test
    public void criarRetrospectivaComSucesso() {

        loginPage.preencherEmailCorretoFacilitator();
        loginPage.preencherPasswordCorreto();
        loginPage.clicarLoginBtn();

        retrospectivaPage.clicarSelecionarSprint();
        retrospectivaPage.clicarCriarNovaRetrospectivaBtn();
        retrospectivaPage.clearTitleField();
        retrospectivaPage.preencherTitleCorreto();
        retrospectivaPage.clearDateField();
        retrospectivaPage.preencherDateCorreto();
        retrospectivaPage.clicarConfirmarCriarRetrospectivaBtn();

        Assert.assertEquals(retrospectivaPage.validarCriarRetrospectivaComSucesso(), "Retrospectiva");
    }

    //==================================================================================================================

    @Test
    public void criarRetrospectivaSemSucessoCamposVazios() {

        loginPage.preencherEmailCorretoFacilitator();
        loginPage.preencherPasswordCorreto();
        loginPage.clicarLoginBtn();

        retrospectivaPage.clicarSelecionarSprint();
        retrospectivaPage.clicarCriarNovaRetrospectivaBtn();
        retrospectivaPage.preencherTitleVazio();
        retrospectivaPage.preencherDateVazio();
        retrospectivaPage.clicarConfirmarCriarRetrospectivaBtn();

        Assert.assertEquals(retrospectivaPage.validarCadastrarSemSucessoTitleError(), "Campo Obrigatório");
        Assert.assertEquals(retrospectivaPage.validarCadastrarSemSucessoDateError(), "Campo Obrigatório");
    }

    //==================================================================================================================

    @Test
    public void navegarTelaRetrospectiva() {

        loginPage.preencherEmailCorretoFacilitator();
        loginPage.preencherPasswordCorreto();
        loginPage.clicarLoginBtn();

        retrospectivaPage.clicarSelecionarSprint();
        retrospectivaPage.clicarCriarNovaRetrospectivaBtn();
        retrospectivaPage.clicarVoltarBtn();

        Assert.assertEquals(retrospectivaPage.validarCriarRetrospectivaComSucesso(), "Retrospectiva");
    }

    //==================================================================================================================

    @Test
    public void criarRetrospectivaSemSucessoMinCaracteres() {

        loginPage.preencherEmailCorretoFacilitator();
        loginPage.preencherPasswordCorreto();
        loginPage.clicarLoginBtn();

        retrospectivaPage.clicarSelecionarSprint();
        retrospectivaPage.clicarCriarNovaRetrospectivaBtn();
        retrospectivaPage.preencherTitleMinCaracteres();
        retrospectivaPage.preencherDateIncompleta();
        retrospectivaPage.clicarConfirmarCriarRetrospectivaBtn();

        Assert.assertEquals(retrospectivaPage.validarCadastrarSemSucessoTitleError(), "Insira um título de no mínimo 3 caracteres");
        Assert.assertEquals(retrospectivaPage.validarCadastrarSemSucessoDateError(), "Data Inválida");
    }

    //==================================================================================================================

    @Test
    public void criarRetrospectivaSemSucessoMaxCaracteres() {

        loginPage.preencherEmailCorretoFacilitator();
        loginPage.preencherPasswordCorreto();
        loginPage.clicarLoginBtn();

        retrospectivaPage.clicarSelecionarSprint();
        retrospectivaPage.clicarCriarNovaRetrospectivaBtn();
        retrospectivaPage.preencherTitleMaxCaracteres();
        retrospectivaPage.preencherDateCorreto();
        retrospectivaPage.clicarConfirmarCriarRetrospectivaBtn();

        Assert.assertEquals(retrospectivaPage.validarCadastrarSemSucessoTitleError(), "Insira um título de no máximo 60 caracteres");
    }

    //==================================================================================================================

    @Test
    public void criarRetrospectivaSemSucessoDataPassada() {

        loginPage.preencherEmailCorretoFacilitator();
        loginPage.preencherPasswordCorreto();
        loginPage.clicarLoginBtn();

        retrospectivaPage.clicarSelecionarSprint();
        retrospectivaPage.clicarCriarNovaRetrospectivaBtn();
        retrospectivaPage.preencherTitleCorreto();
        retrospectivaPage.preencherDatePassado();
        retrospectivaPage.clicarConfirmarCriarRetrospectivaBtn();

        Assert.assertEquals(retrospectivaPage.validarCadastrarSemSucessoDateError(), "Data não pode ser no passado");
    }

    //==================================================================================================================

    @Test
    public void editarRetrospectivaComSucesso() {

        loginPage.preencherEmailCorretoFacilitator();
        loginPage.preencherPasswordCorreto();
        loginPage.clicarLoginBtn();

        retrospectivaPage.clicarSelecionarSprint();
        retrospectivaPage.clicarEditarRetrospectivaIcon();
        retrospectivaPage.clearTitleField();
        retrospectivaPage.preencherTitleEditado();
        retrospectivaPage.clearDateField();
        retrospectivaPage.preencherDateCorreto();
        retrospectivaPage.clicarConfirmarBtn();

        Assert.assertEquals(retrospectivaPage.validarCriarRetrospectivaComSucesso(), "Retrospectiva");
    }

    //==================================================================================================================

    @Test
    public void editarRetrospectivaSemSucesso() {

        loginPage.preencherEmailCorretoFacilitator();
        loginPage.preencherPasswordCorreto();
        loginPage.clicarLoginBtn();

        retrospectivaPage.clicarSelecionarSprint();
        retrospectivaPage.clicarEditarRetrospectivaIcon();
        retrospectivaPage.clearTitleField();
        retrospectivaPage.preencherTitleVazio();
        retrospectivaPage.clearDateField();
        retrospectivaPage.preencherDateVazio();
        retrospectivaPage.clicarConfirmarBtn();

        Assert.assertEquals(retrospectivaPage.validarCadastrarSemSucessoTitleError(), "Campo Obrigatório");
        Assert.assertEquals(retrospectivaPage.validarCadastrarSemSucessoDateError(), "Campo Obrigatório");
    }

    //==================================================================================================================

    @Test
    public void editarStatusRetrospectivaComSucesso() {

        loginPage.preencherEmailCorretoFacilitator();
        loginPage.preencherPasswordCorreto();
        loginPage.clicarLoginBtn();

        retrospectivaPage.clicarSelecionarSprint();
        retrospectivaPage.clicarMudarStatusIcon();
        retrospectivaPage.clicarConfirmarBtn();

        Assert.assertEquals(retrospectivaPage.validarCriarRetrospectivaComSucesso(), "Retrospectiva");
    }

    //==================================================================================================================

    @Test
    public void enviarEmailRetrospectivaComSucesso() {

        loginPage.preencherEmailCorretoFacilitator();
        loginPage.preencherPasswordCorreto();
        loginPage.clicarLoginBtn();

        retrospectivaPage.clicarSelecionarSprint();
        retrospectivaPage.clicarEnviarEmailIcon();
        retrospectivaPage.selecionarCampoUsuario();
        retrospectivaPage.selecionarUsuario();
        retrospectivaPage.clicarAdicionarUsuario();
        retrospectivaPage.clicarConfirmarEnviarEmail();

        Assert.assertEquals(retrospectivaPage.validarCriarRetrospectivaComSucesso(), "Retrospectiva");
    }

    //==================================================================================================================

    @Test
    public void deletarRetrospectivaComSucesso() {

        loginPage.preencherEmailCorretoFacilitator();
        loginPage.preencherPasswordCorreto();
        loginPage.clicarLoginBtn();

        retrospectivaPage.clicarSelecionarSprint();
        retrospectivaPage.clicarDeletarRetrospectivaIcon();
        retrospectivaPage.clicarConfirmarBtn();

        Assert.assertEquals(retrospectivaPage.validarCriarRetrospectivaComSucesso(), "Retrospectiva");
    }

}

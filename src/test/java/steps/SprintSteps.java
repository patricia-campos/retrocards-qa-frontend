package steps;

import org.junit.Assert;
import org.junit.Test;
import pages.LoginPage;
import pages.SprintPage;
import util.Browser;

public class SprintSteps extends Browser {

    LoginPage loginPage = new LoginPage();

    SprintPage sprintPage = new SprintPage();


    //==================================================================================================================
    //                                                 SPRINT
    //==================================================================================================================

    @Test
    public void criarSprintComSucesso() {

        loginPage.preencherEmailCorretoFacilitator();
        loginPage.preencherPasswordCorreto();
        loginPage.clicarLoginBtn();

        sprintPage.clicarCriarBtn();
        sprintPage.preencherTitleCorreto();
        sprintPage.preencherStartDateCorreto();
        sprintPage.preencherEndDateCorreto();
        sprintPage.clicarCadastrarBtn();

        Assert.assertEquals(sprintPage.validarCadastrarSprintComSucesso(), "+ Criar");
    }

    //==================================================================================================================

    @Test
    public void criarSprintSemSucessoCamposVazios() {

        loginPage.preencherEmailCorretoFacilitator();
        loginPage.preencherPasswordCorreto();
        loginPage.clicarLoginBtn();

        sprintPage.clicarCriarBtn();
        sprintPage.preencherTitleBranco();
        sprintPage.preencherStartDateBranco();
        sprintPage.preencherEndDateBranco();
        sprintPage.clicarCadastrarBtn();

        Assert.assertEquals(sprintPage.validarCadastrarSemSucessoTitleError(), "Campo Obrigatório");
        Assert.assertEquals(sprintPage.validarCadastrarSemSucessoStartDateError(), "Campo Obrigatório");
        Assert.assertEquals(sprintPage.validarCadastrarSemSucessoEndDateError(), "Campo Obrigatório");
    }

    //==================================================================================================================

    @Test
    public void navegarTelaSprint() {

        loginPage.preencherEmailCorretoFacilitator();
        loginPage.preencherPasswordCorreto();
        loginPage.clicarLoginBtn();

        sprintPage.clicarCriarBtn();
        sprintPage.clicarVoltarBtn();

        Assert.assertEquals(sprintPage.validarNavegacaoComSucesso().substring(0, 9), "Mostrando");
    }

    //==================================================================================================================

    @Test
    public void visualizarSprintsPaginadosComSucesso() {

        loginPage.preencherEmailCorretoFacilitator();
        loginPage.preencherPasswordCorreto();
        loginPage.clicarLoginBtn();

        Assert.assertEquals(sprintPage.validarNavegacaoComSucesso().substring(0, 9), "Mostrando");
    }

    //==================================================================================================================

    @Test
    public void criarSprintSemSucessoMinCaracteres() {

        loginPage.preencherEmailCorretoFacilitator();
        loginPage.preencherPasswordCorreto();
        loginPage.clicarLoginBtn();

        sprintPage.clicarCriarBtn();
        sprintPage.preencherTitleMinimo();
        sprintPage.preencherStartDateMinimo();
        sprintPage.preencherEndDateMinimo();
        sprintPage.clicarCadastrarBtn();

        Assert.assertEquals(sprintPage.validarCadastrarSemSucessoTitleError(), "Insira um título de no mínimo 3 caracteres");
        Assert.assertEquals(sprintPage.validarCadastrarSemSucessoStartDateError().substring(0, 26), "Insira uma data no formato");
        Assert.assertEquals(sprintPage.validarCadastrarSemSucessoEndDateError().substring(0, 26), "Insira uma data no formato");
    }

    //==================================================================================================================

    @Test
    public void criarSprintSemSucessoMaxCaracteres() {

        loginPage.preencherEmailCorretoFacilitator();
        loginPage.preencherPasswordCorreto();
        loginPage.clicarLoginBtn();

        sprintPage.clicarCriarBtn();
        sprintPage.preencherTitleMaximo();
        sprintPage.preencherStartDateCorreto();
        sprintPage.preencherEndDateCorreto();
        sprintPage.clicarCadastrarBtn();

        Assert.assertEquals(sprintPage.validarCadastrarSemSucessoTitleError(), "Insira um título de no máximo 60 caracteres");
    }

    //==================================================================================================================

    @Test
    public void criarSprintSemSucessoStartDatePassado() {

        loginPage.preencherEmailCorretoFacilitator();
        loginPage.preencherPasswordCorreto();
        loginPage.clicarLoginBtn();

        sprintPage.clicarCriarBtn();
        sprintPage.preencherTitleCorreto();
        sprintPage.preencherStartDatePassado();
        sprintPage.preencherEndDateCorreto();
        sprintPage.clicarCadastrarBtn();

        Assert.assertEquals(sprintPage.validarCadastrarSemSucessoStartDateError(), "Data não pode ser no passado");
    }

    //==================================================================================================================

    @Test
    public void criarSprintSemSucessoEndDatePassado() {

        loginPage.preencherEmailCorretoFacilitator();
        loginPage.preencherPasswordCorreto();
        loginPage.clicarLoginBtn();

        sprintPage.clicarCriarBtn();
        sprintPage.preencherTitleCorreto();
        sprintPage.preencherStartDateCorreto();
        sprintPage.preencherEndDatePassado();
        sprintPage.clicarCadastrarBtn();

        Assert.assertEquals(sprintPage.validarCadastrarSemSucessoEndDatePassado(), "Data não pode ser no passado");
    }

    //==================================================================================================================

    @Test
    public void criarSprintSemSucessoDataInicioPosteriorDataConclusao() {

        loginPage.preencherEmailCorretoFacilitator();
        loginPage.preencherPasswordCorreto();
        loginPage.clicarLoginBtn();

        sprintPage.clicarCriarBtn();
        sprintPage.preencherTitleCorreto();
        sprintPage.preencherStartDatePosteriorEndDate();
        sprintPage.preencherEndDateCorreto();
        sprintPage.clicarCadastrarBtn();

        Assert.assertEquals(sprintPage.validarCadastrarSemSucessoStartDatePosterior(), "Data final não pode ser antes que a inicial");
    }

    //==================================================================================================================

    @Test
    public void editarSprintComSucesso() {

        loginPage.preencherEmailCorretoFacilitator();
        loginPage.preencherPasswordCorreto();
        loginPage.clicarLoginBtn();

        sprintPage.clicarEditarIcon();
        sprintPage.preencherTitleEditado();
        sprintPage.preencherStartDateCorreto();
        sprintPage.preencherEndDateCorreto();
        sprintPage.clicarEditarBtn();

        Assert.assertEquals(sprintPage.validarEditarSprintComSucesso(), "+ Criar");
    }

    //==================================================================================================================

    @Test
    public void editarSprintSemSucesso() {

        loginPage.preencherEmailCorretoFacilitator();
        loginPage.preencherPasswordCorreto();
        loginPage.clicarLoginBtn();

        sprintPage.clicarEditarIcon();
        sprintPage.preencherTitleBranco();
        sprintPage.preencherStartDateCorreto();
        sprintPage.preencherEndDateCorreto();
        sprintPage.clicarEditarBtn();

        Assert.assertEquals(sprintPage.validarEditarSemSucessoTitleError(), "Campo Obrigatório");
    }

    //==================================================================================================================

    @Test
    public void deletarSprintComSucesso() {

        loginPage.preencherEmailCorretoFacilitator();
        loginPage.preencherPasswordCorreto();
        loginPage.clicarLoginBtn();

        sprintPage.clicarDeletarIcon();
        sprintPage.clicarDeletarBtn();

        Assert.assertEquals(sprintPage.validarEditarSprintComSucesso(), "+ Criar");
    }

    //==================================================================================================================

    @Test
    public void runCrudComSucesso() {

        loginPage.preencherEmailCorretoFacilitator();
        loginPage.preencherPasswordCorreto();
        loginPage.clicarLoginBtn();

        sprintPage.clicarCriarBtn();
        sprintPage.preencherTitleCorreto();
        sprintPage.preencherStartDateCorreto();
        sprintPage.preencherEndDateCorreto();
        sprintPage.clicarCadastrarBtn();

        sprintPage.clicarEditarIcon();

        sprintPage.preencherTitleEditado();
        sprintPage.preencherStartDateCorreto();
        sprintPage.preencherEndDateCorreto();
        sprintPage.clicarEditarBtn();

        sprintPage.clicarDeletarIcon();
        sprintPage.clicarDeletarBtn();

        Assert.assertEquals(sprintPage.validarEditarSprintComSucesso(), "+ Criar");
    }

}

package steps;

import org.junit.Assert;
import org.junit.Test;
import pages.KudoBoxPage;
import pages.LoginPage;
import util.Browser;

public class KudoBoxSteps extends Browser {

    LoginPage loginPage = new LoginPage();

    KudoBoxPage kudoBoxPage = new KudoBoxPage();

    //==================================================================================================================
    //                                                 KUDO BOX
    //==================================================================================================================

    @Test
    public void criarKudoBoxComSucesso() {

        loginPage.preencherEmailCorretoFacilitator();
        loginPage.preencherPasswordCorreto();
        loginPage.clicarLoginBtn();

        kudoBoxPage.clicarSelecionarSprint();
        kudoBoxPage.selecionarAbaKudoBoxBtn();
        kudoBoxPage.clicarCriarKudoBoxBtn();
        kudoBoxPage.clearTitleField();
        kudoBoxPage.preencherTitleCorreto();
        kudoBoxPage.clearDateField();
        kudoBoxPage.preencherEndDateCorreto();
        kudoBoxPage.clicarRegistarKudoBoxBtn();

        Assert.assertEquals(kudoBoxPage.validarCadastrarKudoBoxComSucesso(), "+ Criar Kudos Box");
    }

    //==================================================================================================================

    @Test
    public void criarKudoBoxSemSucessoCamposVazios() {

        loginPage.preencherEmailCorretoFacilitator();
        loginPage.preencherPasswordCorreto();
        loginPage.clicarLoginBtn();

        kudoBoxPage.clicarSelecionarSprint();
        kudoBoxPage.selecionarAbaKudoBoxBtn();
        kudoBoxPage.clicarCriarKudoBoxBtn();
        kudoBoxPage.preencherTitleBranco();
        kudoBoxPage.preencherEndDateBranco();
        kudoBoxPage.clicarRegistarKudoBoxBtn();

        Assert.assertEquals(kudoBoxPage.validarCadastrarSemSucessoTitleError(), "Campo Obrigatório");
        Assert.assertEquals(kudoBoxPage.validarCadastrarSemSucessoDateError(), "Campo Obrigatório");
    }

    //==================================================================================================================

    @Test
    public void navegarTelaKudoBox() {

        loginPage.preencherEmailCorretoFacilitator();
        loginPage.preencherPasswordCorreto();
        loginPage.clicarLoginBtn();

        kudoBoxPage.clicarSelecionarSprint();
        kudoBoxPage.selecionarAbaKudoBoxBtn();
        kudoBoxPage.clicarCriarKudoBoxBtn();
        kudoBoxPage.clicarVoltarKudoBoxBtn();

        Assert.assertEquals(kudoBoxPage.validarCadastrarKudoBoxComSucesso(), "+ Criar Kudos Box");
    }

    //==================================================================================================================

    @Test
    public void criarKudoBoxSemSucessoMinCaracteres() {

        loginPage.preencherEmailCorretoFacilitator();
        loginPage.preencherPasswordCorreto();
        loginPage.clicarLoginBtn();

        kudoBoxPage.clicarSelecionarSprint();
        kudoBoxPage.selecionarAbaKudoBoxBtn();
        kudoBoxPage.clicarCriarKudoBoxBtn();
        kudoBoxPage.preencherTitleMinimo();
        kudoBoxPage.preencherEndDateMinimo();
        kudoBoxPage.clicarRegistarKudoBoxBtn();

        Assert.assertEquals(kudoBoxPage.validarCadastrarSemSucessoTitleError(), "Insira um título de no mínimo 3 caracteres");
        Assert.assertEquals(kudoBoxPage.validarCadastrarSemSucessoDateError().substring(0, 26), "Insira uma data no formato");
    }

    //==================================================================================================================

    @Test
    public void criarKudoBoxSemSucessoMaxCaracteres() {

        loginPage.preencherEmailCorretoFacilitator();
        loginPage.preencherPasswordCorreto();
        loginPage.clicarLoginBtn();

        kudoBoxPage.clicarSelecionarSprint();
        kudoBoxPage.selecionarAbaKudoBoxBtn();
        kudoBoxPage.clicarCriarKudoBoxBtn();
        kudoBoxPage.preencherTitleCorreto();
        kudoBoxPage.preencherEndDateCorreto();
        kudoBoxPage.clicarRegistarKudoBoxBtn();

        Assert.assertEquals(kudoBoxPage.validarCadastrarSemSucessoTitleError(), "Insira um título de no máximo 60 caracteres");
    }

    //==================================================================================================================

    @Test
    public void criarKudoBoxSemSucessoDataFimPassado() {

        loginPage.preencherEmailCorretoFacilitator();
        loginPage.preencherPasswordCorreto();
        loginPage.clicarLoginBtn();

        kudoBoxPage.clicarSelecionarSprint();
        kudoBoxPage.selecionarAbaKudoBoxBtn();
        kudoBoxPage.clicarCriarKudoBoxBtn();
        kudoBoxPage.preencherTitleCorreto();
        kudoBoxPage.preencherEndDatePassado();
        kudoBoxPage.clicarRegistarKudoBoxBtn();

        Assert.assertEquals(kudoBoxPage.validarCadastrarSemSucessoDateError(), "Data não pode ser no passado");
    }

    //==================================================================================================================

    @Test
    public void criarKudoBoxSemSucessoDataPassada() {

        loginPage.preencherEmailCorretoFacilitator();
        loginPage.preencherPasswordCorreto();
        loginPage.clicarLoginBtn();

        kudoBoxPage.clicarSelecionarSprint();
        kudoBoxPage.selecionarAbaKudoBoxBtn();
        kudoBoxPage.clicarCriarKudoBoxBtn();
        kudoBoxPage.preencherTitleCorreto();
        kudoBoxPage.preencherEndDateFuturo();
        kudoBoxPage.clicarRegistarKudoBoxBtn();

        Assert.assertEquals(kudoBoxPage.validarCadastrarSemSucessoDateError(), "Data não pode ser antes ou depois da sprint");
    }

    //==================================================================================================================

    @Test
    public void editarKudoBoxComSucesso() {

        loginPage.preencherEmailCorretoFacilitator();
        loginPage.preencherPasswordCorreto();
        loginPage.clicarLoginBtn();

        kudoBoxPage.clicarSelecionarSprint();
        kudoBoxPage.selecionarAbaKudoBoxBtn();
        kudoBoxPage.clicarEditarIcon();
        kudoBoxPage.preencherTitleEditado();
        kudoBoxPage.preencherEndDateCorreto();
        kudoBoxPage.clicarRegistarKudoBoxBtn();

        Assert.assertEquals(kudoBoxPage.validarCadastrarKudoBoxComSucesso(), "+ Criar Kudos Box");
    }


    //==================================================================================================================

    @Test
    public void deletarKudoBoxComSucesso() {

        loginPage.preencherEmailCorretoFacilitator();
        loginPage.preencherPasswordCorreto();
        loginPage.clicarLoginBtn();

        kudoBoxPage.clicarSelecionarSprint();
        kudoBoxPage.selecionarAbaKudoBoxBtn();
        kudoBoxPage.clicarDeletarIcon();
        kudoBoxPage.clicarDeletarBtn();

        Assert.assertEquals(kudoBoxPage.validarCadastrarKudoBoxComSucesso(), "+ Criar Kudos Box");
    }

}


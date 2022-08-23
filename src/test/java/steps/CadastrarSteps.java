package steps;

import org.junit.Assert;
import org.junit.Test;
import pages.CadastrarPage;
import util.Browser;

public class CadastrarSteps extends Browser {

    CadastrarPage cadastrarPage = new CadastrarPage();

    //==================================================================================================================
    //                                                 CADASTRAR
    //==================================================================================================================

    @Test
    public void cadastrarUsuarioComSucesso() {

        cadastrarPage.clicarCreateAccountBtn();
        cadastrarPage.clicarCreateBtn();
        cadastrarPage.preencherNameCadastroCorreto();
        cadastrarPage.preencherEmailCadastroCorreto();
        cadastrarPage.preencherPasswordCadastrarCorreto();
        cadastrarPage.clicarCreateBtn();

        Assert.assertEquals(cadastrarPage.validarCadastroComSucesso(), "Login");
    }

    //==================================================================================================================

    @Test
    public void cadastrarUsuarioSemSucessoNameEmBranco() {

        cadastrarPage.clicarCreateAccountBtn();
        cadastrarPage.preencherNameCadastroVazio();
        cadastrarPage.preencherEmailCadastroCorreto();
        cadastrarPage.preencherPasswordCadastrarCorreto();
        cadastrarPage.clicarCreateBtn();

        Assert.assertEquals(cadastrarPage.validarCadastroSemSucessoNameVazio(), "Campo Obrigatório");
    }

    //==================================================================================================================

    @Test
    public void cadastrarUsuarioSemSucessoEmailEmBranco() {

        cadastrarPage.clicarCreateAccountBtn();
        cadastrarPage.preencherNameCadastroCorreto();
        cadastrarPage.preencherEmailCadastroVazio();
        cadastrarPage.preencherPasswordCadastrarCorreto();
        cadastrarPage.clicarCreateBtn();

        Assert.assertEquals(cadastrarPage.validarCadastroSemSucessoEmailVazio(), "Campo Obrigatório");
    }

    //==================================================================================================================

    @Test
    public void cadastrarUsuarioSemSucessoPasswordEmBranco() {

        cadastrarPage.clicarCreateAccountBtn();
        cadastrarPage.preencherNameCadastroCorreto();
        cadastrarPage.preencherEmailCadastroCorreto();
        cadastrarPage.preencherPasswordCadastroVazio();
        cadastrarPage.clicarCreateBtn();

        Assert.assertEquals(cadastrarPage.validarCadastroSemSucessoPasswordVazio(), "Campo Obrigatório");
    }

    //==================================================================================================================

    @Test
    public void cadastrarUsuarioSemSucessoCaracteresMinimos() {

        cadastrarPage.clicarCreateAccountBtn();
        cadastrarPage.preencherNameMinCaracteres();
        cadastrarPage.preencherEmailCadastroCorreto();
        cadastrarPage.preencherPasswordMinCaracteres();
        cadastrarPage.clicarCreateBtn();

        Assert.assertEquals(cadastrarPage.validarCadastroSemSucessoNameMin(), "O nome precisa de pelo menos 3 caracteres");
        Assert.assertEquals(cadastrarPage.validarCadastroSemSucessoPasswordMin(), "A senha precisa de pelo menos 5 caracteres");
    }

    //==================================================================================================================

    @Test
    public void cadastrarUsuarioSemSucessoCaracteresMaximos() {

        cadastrarPage.clicarCreateAccountBtn();
        cadastrarPage.preencherNameCadastroCorreto();
        cadastrarPage.preencherEmailCadastroCorreto();
        cadastrarPage.preencherPasswordMaxCaracteres();
        cadastrarPage.clicarCreateBtn();

        Assert.assertEquals(cadastrarPage.validarCadastroSemSucessoPasswordMax(), "A senha precisa ter menos de 20 caracteres");
    }

    //==================================================================================================================

    @Test
    public void cadastrarUsuarioSemSucessoEmailInvalido() {

        cadastrarPage.clicarCreateAccountBtn();
        cadastrarPage.preencherNameCadastroCorreto();
        cadastrarPage.preencherEmailInválido();
        cadastrarPage.preencherPasswordCadastrarCorreto();
        cadastrarPage.clicarCreateBtn();

        Assert.assertEquals(cadastrarPage.validarCadastroSemSucessoEmailInvalido(), "Insira um email válido");
    }

}



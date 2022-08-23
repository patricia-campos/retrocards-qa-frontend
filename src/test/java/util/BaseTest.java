package util;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class BaseTest extends Elements{

    public static void click(By by) {
        waitElement(by);
        element(by).click();
    }

    public static String getText(By by) {
        waitElement(by);
        return  element(by).getText();
    }

    public static void sendKeys(By by, String texto) {
        waitElement(by);
        element(by).sendKeys(texto);
    }

    public static void clear(By by){waitElement(by);
        element(by).clear();
    }

    protected static void selecionoBackSpace(By by) {
        element(by).sendKeys(Keys.BACK_SPACE);
    }

    public static void limparCampoForce(By by){
        for(int i = 0; i < 60; i++) {
            BaseTest.selecionoBackSpace(by);
        }
    }


}

package co.com.sofka.userinterface.login;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Login extends PageObject {



    public static final Target SIGNOUT = Target
            .the("Signout")
            .located(By.linkText("Sign out"));

    public static final Target EMAILLOGIN = Target
            .the("Email")
            .located(By.id("email"));

    public static final Target PASSWD = Target
            .the("passwd")
            .located(By.id("passwd"));

    public static final Target SUBMITLOGIN = Target
            .the("SubmitLogin")
            .located(By.cssSelector("#SubmitLogin > span"));


    public static final Target PASSWDERROR = Target
            .the("passwderror")
            .located(By.cssSelector("ol > li"));

    public static final Target INFOACCOUNTLOG = Target
            .the("InfoAccountlog")
            .located(By.cssSelector(".info-account"));



}

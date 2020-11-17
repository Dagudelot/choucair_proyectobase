package co.com.choucair.certification.academy.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChoucairLoginPage extends PageObject {

    public static final Target LOGIN_BUTTON     = Target.the( "button that shows us the form to login" ).located( By.xpath("/html/body/div[1]/div[2]/div/section/div[2]/header/div[1]/nav/ul[2]/li/a") );
    public static final Target INPUT_USERNAME   = Target.the( "input to type in the username" ).located( By.id("username") );
    public static final Target INPUT_PASSWORD   = Target.the( "input to type in the password" ).located( By.id("password") );
    public static final Target ACCESS_BUTTON    = Target.the( "button to log in to the platform" ).located( By.xpath("//*[@id=\"Ingresar\"]/div/div/div[2]/div[2]/form/div[3]/button") );
}

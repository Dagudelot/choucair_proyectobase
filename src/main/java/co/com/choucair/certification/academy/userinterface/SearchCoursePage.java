package co.com.choucair.certification.academy.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage {

    public static final Target COURSES_MODULE  = Target.the("text that redirects us to the courses list page").located( By.xpath("//*[@id=\"certificaciones\"]/div[1]/a") );
    public static final Target SEARCH_INPUT    = Target.the("input to type in the course name").located( By.id("coursesearchbox") );
    public static final Target SEARCH_BUTTON   = Target.the("button to search the course").located( By.xpath("//*[@id=\"coursesearch\"]/fieldset/button") );
    public static final Target COURSE_RESULT   = Target.the("result of the course").located( By.cssSelector("a[href='https://operacion.choucairtesting.com/academy/course/view.php?id=1279']") );
    public static final Target COURSE_NAME     = Target.the("the name of the course").located( By.xpath("//*[@id=\"page-header\"]/div/div/div[2]/div[1]/div[1]/a/div/div/h1") ) ;
}
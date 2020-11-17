package co.com.choucair.certification.academy.tasks;

import co.com.choucair.certification.academy.userinterface.SearchCoursePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Search implements Task {

    private final String course;

    public Search(String course) {
        this.course = course;
    }

    public static Search the(String course) {
        return Tasks.instrumented( Search.class, course );
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on( SearchCoursePage.COURSES_MODULE ),
                Enter.theValue(this.course).into( SearchCoursePage.SEARCH_INPUT ),
                Click.on( SearchCoursePage.SEARCH_BUTTON ),
                Click.on( SearchCoursePage.COURSE_RESULT )
        );
    }
}

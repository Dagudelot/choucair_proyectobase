package co.com.choucair.certification.academy.questions;

import co.com.choucair.certification.academy.userinterface.SearchCoursePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {

    private String question;

    public Answer(String question) {
        this.question = question;
    }

    public static Answer toThe(String question) {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        boolean result;
        String courseName = Text.of(SearchCoursePage.COURSE_NAME).viewedBy(actor).asString();

        result = question.equals(courseName);

        return result;
    }
}

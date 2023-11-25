import io.restassured.response.Response;
import org.testng.annotations.Test;
import queries.Languages;
import static org.hamcrest.Matchers.*;

public class LanguagesQueryTest extends BaseTest{

    @Test
    public void shouldReturnStatus200() {

        Response response = Languages.getLanguageQuery(requestSpec);

        response.then().
                assertThat().
                statusCode(200);
    }

    @Test
    public void shouldReturnCodeAF() {

        Response response = Languages.getLanguageQuery(requestSpec);

        response.then().
                assertThat().
                body("data.language.code", is ("af"));
    }

    @Test
    public void shouldReturnNameAfrikaans() {

        Response response = Languages.getLanguageQuery(requestSpec);

        response.then().
                assertThat().
                body("data.language.name", is ("Afrikaans"));
    }
}
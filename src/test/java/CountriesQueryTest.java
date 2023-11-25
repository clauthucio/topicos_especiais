import io.restassured.response.Response;
import org.testng.annotations.Test;
import queries.Countries;

public class CountriesQueryTest extends BaseTest{

    @Test
    public void shouldReturnStatus200() {

        Response response = Countries.getCountryQuery(requestSpec);

        response.then().
                assertThat().
                statusCode(200);
    }
}
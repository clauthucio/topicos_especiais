package queries;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.given;

public class Languages {

    public static Response getLanguageQuery(RequestSpecification requestSpec) {
        return given().
                spec(requestSpec).
                body("{\"query\":\"query Language {\\r\\n    language(code: \\\"af\\\") {\\r\\n        code\\r\\n        name\\r\\n        native\\r\\n        rtl\\r\\n    }\\r\\n}\",\"variables\":{}}").
                when().
                post();
    }
}

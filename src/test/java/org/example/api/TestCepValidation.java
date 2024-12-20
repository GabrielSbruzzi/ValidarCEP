package org.example.api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestCepValidation {

    private static final String BASE_URL = "https://viacep.com.br/ws/";

    @Test
    public void testarCepValido() {
        Response response = RestAssured.get(BASE_URL + "91740840/json/");

        assertNotNull(response);
        assertEquals(200, response.getStatusCode());

        assertTrue(response.getBody().asString().contains("Rua Joaquim de Carvalho"));
    }

    @Test
    public void testarCepInvalido() {
        Response response = RestAssured.get(BASE_URL + "00000000/json/");

        assertNotNull(response);
        assertEquals(400, response.getStatusCode());
    }
}

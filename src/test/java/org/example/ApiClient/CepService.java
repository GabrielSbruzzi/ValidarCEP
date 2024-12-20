package org.example.ApiClient;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.example.models.Cep;

public class CepService {

    public static final String BASE_URL = "https://viacep.com.br/ws/";

    public Cep buscarCep(String cep) {
        Response response = RestAssured
                .given()
                .baseUri(BASE_URL)
                .basePath(cep + "/json/")
                .get();

        Cep cepResponse = response.as(Cep.class);
        return cepResponse;
    }
}

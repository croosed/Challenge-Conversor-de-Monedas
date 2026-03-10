package pe.jsaire.exchange;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ExchangeApi {

    public static ExchangeResponse exchange(){

        String API_KEY="2a81419b35565c6cd8b94570";

        //Default convert USD
        String baseCode="USD";

        String direccion="https://v6.exchangerate-api.com/v6/"+API_KEY+"/latest/"+baseCode;

        HttpClient client = HttpClient.newHttpClient();


        try {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(direccion))
                    .build();

            var response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());


            Gson gson = new Gson();

            return gson.fromJson( response.body(),ExchangeResponse.class);


        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}

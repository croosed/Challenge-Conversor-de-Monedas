package pe.jsaire.exchange;

import com.google.gson.annotations.SerializedName;

import java.util.Map;

public record ExchangeResponse(
        String result,

        @SerializedName("base_code")
        String baseCode,

        @SerializedName("conversion_rates")
        Map<String, Double> conversionRates
) {
}

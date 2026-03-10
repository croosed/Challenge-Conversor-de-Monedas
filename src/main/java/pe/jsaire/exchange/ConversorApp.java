package pe.jsaire.exchange;

import java.util.Scanner;

public class ConversorApp {
    public static void main(String[] args) {


        var sc= new Scanner(System.in);

        ExchangeResponse rates = ExchangeApi.exchange();


        int opcion;

        do {
            mensaje();
            opcion = sc.nextInt();
            switch (opcion) {
                case 1 -> convertir(sc, rates, "USD", "PEN");
                case 2 -> convertir(sc, rates, "PEN", "USD");
                case 3 -> convertir(sc, rates, "USD", "ARS");
                case 4 -> convertir(sc, rates, "ARS", "USD");
                case 5 -> convertir(sc, rates, "USD", "BRL");
                case 6 -> convertir(sc, rates, "BRL", "USD");
                case 7 -> System.out.println("Gracias por usar el conversor");
                default -> System.out.println("Opción inválida");
            }

        }while (opcion !=7);

        sc.close();
    }
    public static void convertir(Scanner sc, ExchangeResponse rates, String from, String to) {

        System.out.print("Ingrese monto: ");
        double monto = sc.nextDouble();

        double tasa;

        if (from.equals("USD")) {
            tasa = rates.conversionRates().get(to);
        } else {
            tasa = 1 / rates.conversionRates().get(from);
        }

        double resultado = monto * tasa;


        System.out.printf("Resultado %.2f %s",resultado,to);
        //System.out.println("Resultado: " + resultado + " " + to);
        System.out.println();
    }

    public static void mensaje(){

        String texto = """
                      *********************************************************************
                      Sea Bienvenido/a al Convesor de Moneda
                      1) Dólar =>> Soles
                      2) Soles =>> Dólar
                      3) Dólar =>> Peso argentino
                      4) Perso argentino =>> Dólar
                      5) Dólar =>> Real brasileño
                      6) Real brasileño =>> Dólar
                      7) Salir
                      Elija una opción valida:
                      *********************************************************************
              """;
        System.out.println(texto);
    }
}

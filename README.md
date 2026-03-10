# ExchangeRate - Conversor de Monedas

Este es un proyecto simple en Java que permite convertir monedas utilizando tasas de cambio en tiempo real. La aplicación interactúa con la **ExchangeRate-API** para obtener las tasas de conversión actuales.

## 🚀 Características

La aplicación es una herramienta de consola que permite realizar las siguientes conversiones:

*   Dólar (USD) a Sol Peruano (PEN)
*   Sol Peruano (PEN) a Dólar (USD)
*   Dólar (USD) a Peso Argentino (ARS)
*   Peso Argentino (ARS) a Dólar (USD)
*   Dólar (USD) a Real Brasileño (BRL)
*   Real Brasileño (BRL) a Dólar (USD)

## 🛠️ Tecnologías Utilizadas

*   **Java 21**: Lenguaje de programación principal.
*   **Maven**: Gestión de dependencias y construcción del proyecto.
*   **Gson**: Biblioteca para el manejo y parseo de JSON.
*   **Java HTTP Client**: Para realizar peticiones a la API de tasas de cambio.

## 📋 Requisitos Previos

*   Java Development Kit (JDK) 21 o superior.
*   Maven instalado.
*   Conexión a internet para consultar la API.

## 🔧 Configuración y Ejecución

1.  **Clonar el repositorio:**
    ```bash
    git clone https://github.com/croosed/Challenge-Conversor-de-Monedas.git
    cd Challenge-Conversor-de-Monedas
    ```

2.  **Compilar el proyecto:**
    ```bash
    mvn clean install
    ```

3.  **Ejecutar la aplicación:**
    Puedes ejecutar la clase principal `ConversorApp` desde tu IDE favorito o mediante línea de comandos si has generado el jar.

    Desde el IDE, localiza y ejecuta:
    `src/main/java/pe/jsaire/exchange/ConversorApp.java`

## ⚙️ Funcionamiento

Al iniciar la aplicación, se mostrará un menú con las opciones de conversión disponibles. Selecciona el número correspondiente a la conversión deseada e ingresa el monto a convertir.

La aplicación consultará la API para obtener la tasa de cambio actual y mostrará el resultado en pantalla.

## ⚠️ Nota

El proyecto utiliza una API Key de prueba para `exchangerate-api.com`. Asegúrate de revisar los límites de uso o reemplazarla con tu propia clave si es necesario en la clase `ExchangeApi.java`.

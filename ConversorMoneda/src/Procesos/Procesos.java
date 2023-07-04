package Procesos;

import Menu.ConversorDeMonedas;
import javax.swing.JOptionPane;

public class Procesos {
    public static void reiniciar(){
        ConversorDeMonedas.main(null);
    }
//Metodos para conversion de temperatura
    public static void celsiusAFahrenheit(){
        double cantidad = obtenerCantidadT("Celsius", "Fahrenheit");
        double resultado = (cantidad * 1.8) + 32; // (0 °C × 9/5) + 32 
        mostrarResultadoT("Celsius", "Fahrenheit", cantidad, resultado);
        reiniciar();
    }
     public static void celsiusAKelvin(){
        double cantidad = obtenerCantidadT("Celsius", "Kelvin");
        double resultado = cantidad + 273.15; // 0 °C + 273.15
        mostrarResultadoT("Celsius", "Kelvin", cantidad, resultado);
        reiniciar();
    }
    public static void fahrenheitACelsius(){
        double cantidad = obtenerCantidadT("Fahrenheit", "Celsius");
        double resultado = (cantidad -32) * 5/9; // (0 °F − 32) × 5/9
        mostrarResultadoT("Fahrenheit", "Celsius", cantidad, resultado);
        reiniciar();
    }
    public static void kelvinACelsius(){
        double cantidad = obtenerCantidadT("Kelvin", "Celsius");
        double resultado = cantidad - 273.15; // 0 °C - 273.15  (0 K − 273.15) × 9/5 + 32
        mostrarResultadoT("Kelvin", "Celsius", cantidad, resultado);
        reiniciar();
    }
    public static void kelvinAFahrenheit(){
        double cantidad = obtenerCantidadT("Kelvin", "Fahrenheit");
        double resultado = (cantidad - 273.15) * 1.8 + 32; // (0 K − 273.15) × 9/5 + 32
        mostrarResultadoT("Kelvin", "Fahrenheit", cantidad, resultado);
        reiniciar();
    }
    public static void fahrenheitAKelvin(){
        double cantidad = obtenerCantidadT("Fahrenheit", "Kelvin");
        double resultado = (cantidad - 32) * 5/9 + 273.15; // (0 °F − 32) × 5/9 + 273.15
        mostrarResultadoT("Fahrenheit", "Kelvin", cantidad, resultado);
        reiniciar();
    }
    public static double obtenerCantidadT(String temperaturaOrigen, String temperaturaDestino) {
        String cantidadStr = JOptionPane.showInputDialog(null, "Ingresa los grados " + temperaturaOrigen + "° a convertir a grados " + temperaturaDestino + "° :");
        return Double.parseDouble(cantidadStr);
        
    }
    // Método auxiliar para mostrar el resultado de la conversión
    public static void mostrarResultadoT(String temperaturaOrigen, String temperaturaDestino, double cantidad, double resultado) {
        JOptionPane.showMessageDialog(null, cantidad + " grados " + temperaturaOrigen + " equivale a " + String.format("%.2f", resultado) + " grados " + temperaturaDestino + ".");
    }
    
    
//Metodos para converison de moneda
    public static void pesoMexicanoADolar() {
        double cantidad = obtenerCantidad("Pesos Mexicano", "Dólares Americanos");
        double resultado = cantidad * 0.059; // Tipo de cambio actual
        mostrarResultado("Pesos Mexicanos", "Dólares Americanos", cantidad, resultado);
        reiniciar();
    }
    public static void pesoMexicanoAEuros() {
        double cantidad = obtenerCantidad("Pesos Mexicanos", "Euros");
        double resultado = cantidad * 0.054; // Tipo de cambio actual
        mostrarResultado("Pesos Mexicanos", "Euros", cantidad, resultado);
        reiniciar();
    }
    public static void pesoMexicanoALibrasEsterlinas() {
        double cantidad = obtenerCantidad("Pesos Mexicanos", "Libras Esterlinas");
        double resultado = cantidad * 0.046; // Tipo de cambio actual
        mostrarResultado("Pesos Mexicanos", "Libras Esterlinas", cantidad, resultado);
        reiniciar();
    }
    public static void pesoMexicanoAYenJapones() {
        double cantidad = obtenerCantidad("Pesos Mexicanos", "Yens Japonéses");
        double resultado = cantidad * 8.48; // Tipo de cambio actual
        mostrarResultado("Pesos Mexicanos", "Yens Japonéses", cantidad, resultado);
        reiniciar();
    }
    public static void pesoMexicanoAWonSulCoreano() {
        double cantidad = obtenerCantidad("Pesos Mexicanos", "Wons sul-coreanos");
        double resultado = cantidad * 76.35; // Tipo de cambio actual
        mostrarResultado("Pesos Mexicanos", "Wons sul-coreanos", cantidad, resultado);
        reiniciar();
    }
    // Métodos de conversión de otras monedas a Peso Mexicano
    public static void dolarAPesoMexicano() {
        double cantidad = obtenerCantidad("Dólares Americanos", "Pesos Mexicanos");
        double resultado = cantidad / 0.059; // Tipo de cambio actual
        mostrarResultado("Dólares Americanos", "Pesos Mexicanos", cantidad, resultado);
        reiniciar();
    }
    public static void eurosAPesoMexicano() {
        double cantidad = obtenerCantidad("Euros", "Pesos Mexicanos");
        double resultado = cantidad / 0.054; // Tipo de cambio actual
        mostrarResultado("Euros", "Pesos Mexicanos", cantidad, resultado);
        reiniciar();
    }
    public static void librasEsterlinasAPesoMexicano() {
        double cantidad = obtenerCantidad("Libras Esterlinas", "Pesos Mexicanos");
        double resultado = cantidad / 0.046; // Tipo de cambio actual
        mostrarResultado("Libras Esterlinas", "Pesos Mexicanos", cantidad, resultado);
        reiniciar();
    }
    public static void yenJaponesAPesoMexicano() {
        double cantidad = obtenerCantidad("Yens Japonéses", "Pesos Mexicanos");
        double resultado = cantidad / 8.48; // Tipo de cambio actual
        mostrarResultado("Yens Japonéses", "Pesos Mexicanos", cantidad, resultado);
        reiniciar();
    }
    public static void wonSulCoreanoAPesoMexicano() {
        double cantidad = obtenerCantidad("Wons sul-coreanos", "Pesos Mexicanos");
        double resultado = cantidad / 76.35; // Tipo de cambio actual
        mostrarResultado("Wons sul-coreanos", "Pesos Mexicanos", cantidad, resultado);
        reiniciar();
    }
    // Método auxiliar para obtener la cantidad a convertir
    public static double obtenerCantidad(String monedaOrigen, String monedaDestino) {
        String cantidadStr = JOptionPane.showInputDialog(null, "Ingresa la cantidad de " + monedaOrigen + " a convertir a " + monedaDestino + ":");
        return Double.parseDouble(cantidadStr);
    }
    // Método auxiliar para mostrar el resultado de la conversión
    public static void mostrarResultado(String monedaOrigen, String monedaDestino, double cantidad, double resultado) {
        JOptionPane.showMessageDialog(null, cantidad + " " + monedaOrigen + " equivale a " + String.format("%.2f", resultado) + " " + monedaDestino + ".");
    }
    private Procesos() {
        
    }
    
}

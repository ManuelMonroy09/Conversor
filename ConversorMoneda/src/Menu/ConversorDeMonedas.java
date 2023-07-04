package Menu;

import static Procesos.Procesos.*;
import javax.swing.JOptionPane;

public class ConversorDeMonedas {

    public static void main(String[] args) {
        // Mostrar el menú de opciones
        int menu = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número de la opción que deseé: \n\n"
                + "0.- Conversor de Moneda \n"
                + "1.- Conversor de Temperatura \n"
                + "2.- Salir \n\n"));
        if (menu == 0) {
            int seleccion = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número de la conversion a realizar: \n\n"
                    + "0.- Peso Mexicano a Dólar Americano \n"
                    + "1.- Peso Mexicano a Euros \n"
                    + "2.- Peso Mexicano a Libras Esterlinas \n"
                    + "3.- Peso Mexicano a Yen Japonéses \n"
                    + "4.- Peso Mexicano a Won sul-coreano \n"
                    + "5.- Dólar Americano a Peso Mexicano \n"
                    + "6.- Euros a Peso Mexicano \n"
                    + "7.- Libras Esterlinas a Peso Mexicano \n"
                    + "8.- Yen Japonéses a Peso Mexicano \n"
                    + "9.- Won sul-coreano a Peso Mexicano \n"
                    + "10.- Salir del sistema \n\n", "Conversor de Moneda", 3));
            // Realizar la conversión según la opción seleccionada
            switch (seleccion) {
                case 0 ->
                    pesoMexicanoADolar();
                case 1 ->
                    pesoMexicanoAEuros();
                case 2 ->
                    pesoMexicanoALibrasEsterlinas();
                case 3 ->
                    pesoMexicanoAYenJapones();
                case 4 ->
                    pesoMexicanoAWonSulCoreano();
                case 5 ->
                    dolarAPesoMexicano();
                case 6 ->
                    eurosAPesoMexicano();
                case 7 ->
                    librasEsterlinasAPesoMexicano();
                case 8 ->
                    yenJaponesAPesoMexicano();
                case 9 ->
                    wonSulCoreanoAPesoMexicano();
                case 10 ->
                    System.exit(0);
            }
        } else if (menu == 1) {
            int seleccion = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número de la conversion a realizar: \n\n"
                    + "0.- Grados Celsius a Fahrenheit \n"
                    + "1.- Grados Celsius a kelvin \n"
                    + "2.- Grados Fahrenheit a Celsius \n"
                    + "3.- Grados Kelvin a Celsius \n"
                    + "4.- Kelvin a Fahrenheit \n"
                    + "5.- Fahrenheit a Klevin \n"
                    + "6.- Salir del sistema \n\n", "Conversor de Moneda", 3));
            // Realizar la conversión según la opción seleccionada
            switch (seleccion) {
                case 0 ->
                    celsiusAFahrenheit();
                case 1 ->
                    celsiusAKelvin();
                case 2 ->
                    fahrenheitACelsius();
                case 3 ->
                    kelvinACelsius();
                case 4 ->
                    kelvinAFahrenheit();
                case 5 ->
                    fahrenheitAKelvin();
                case 6 ->
                    System.exit(0);
            }
        }else if(menu == 2){
            System.exit(0);
        }
    }
}

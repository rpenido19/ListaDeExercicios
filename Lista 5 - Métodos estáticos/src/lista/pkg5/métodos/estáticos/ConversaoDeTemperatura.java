package lista.pkg5.métodos.estáticos;

public class ConversaoDeTemperatura {

    // Métodos
    // De graus Celsius (C) para graus Fahrenheit (F): F = (9×C/5)+32)
    public static double CelsiusParaFahrenheit(double c) {

        double f = ((9 * c / 5) + 32);
        System.out.println(c + " graus Celsius equivale a " + f + "graus Fahrenheit. ");
        return f;

    }
    // De graus Fahrenheit (F) para graus Celsius (C): C = (F −32)×+5/9

    public static double FahrenheitParaCelsius(double f) {

        double c = (f - 32) * 5 / 9;
        System.out.println(f + " graus Fahrenheit equivale a " + c + "graus Celsius. ");
        return c;

    }
    // De graus Celsius (C) para graus Kelvin (K): K =C+273.15

    public static double CelsiusParaKelvin(double c) {

        double k = c + 273.15;
        System.out.println(c + " graus Celsius equivale a " + k + "graus Kelvin. ");
        return k;

    }
    // De graus Kelvin (K) para graus Celsius (C): C = K−273.15

    public static double KelvinParaCelsius(double k) {

        double c = k - 273.15;
        System.out.println(k + " graus Kelvin equivale a " + c + "graus Celsius. ");
        return c;

    }

}

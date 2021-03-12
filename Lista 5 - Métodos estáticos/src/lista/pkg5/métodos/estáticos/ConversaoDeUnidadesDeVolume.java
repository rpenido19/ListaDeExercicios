package lista.pkg5.métodos.estáticos;

public class ConversaoDeUnidadesDeVolume {

    // 1- Litros para centímetros cúbicos
    public static double LitrosParaCentimetrosCubicos(double litro) {

        double centimetrosCubicos = litro * 1000;
        return centimetrosCubicos;

    }

    // 2- Metros cúbicos para litros
    public static double MetrosCubicosParaLitros(double metroCubico) {

        double litros = metroCubico * 1000;
        return litros;

    }

    // 3- Metros cúbicos para pés cúbicos
    public static double MetrosCubicosParaPesCubicos(double metroCubico) {

        double pesCubicos = metroCubico * 35.32;
        return pesCubicos;

    }

    // 4- Galões americanos para polegadas cúbicas
    public static double GaloesAmericanosParaPolegadasCubicas(double galoesAmericanos) {

        double polegadasCubicas = galoesAmericanos * 231;
        return polegadasCubicas;

    }

    // 5- Galões americanos para litros
    public static double GaloesAmericanosParaLitros(double galoesAmericanos) {

        double litros = galoesAmericanos * 3.785;
        return litros;

    }

}

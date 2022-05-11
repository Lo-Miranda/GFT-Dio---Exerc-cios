public class Quadrilatero {

    public static void areaLado(double lado) {
        System.out.println("Área do quadrado: " + lado * lado);

    }

    public static void areaLado(double lado1, double lado2) {
        System.out.println("Área do retângulo: " + lado1 * lado2);
    }

    public static void areaLado(double baseMaior, double baseMenor, double altura) {
        System.out.println("Área do Trapézio: " + ((baseMaior+baseMenor)*altura) / 2);
    }
}

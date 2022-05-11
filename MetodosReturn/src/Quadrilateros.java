public class Quadrilateros {

    public static double areaLado(double lado) {
        return lado * lado;
    }

    public static double areaLado(double lado1, double lado2) {
        return lado1 * lado2;
    }

    public static double areaLado(double baseMaior, double baseMenor, double altura) {
        return ((baseMaior+baseMenor)*altura)/2;
    }
}

public class Main {

    public static void main(String[] args) {

        double areaQuadrado = Quadrilateros.areaLado(6);
        System.out.println("Área do quadrado: " + areaQuadrado);

        double areaRetangulo = Quadrilateros.areaLado(9, 6);
        System.out.println("Área do retângulo: " + areaRetangulo);

        double areaTrapezio = Quadrilateros.areaLado(9, 6, 8);
        System.out.println("[Area do trapézio: " + areaTrapezio);
    }
}

public class Main {

    public static void main(String[] args) {

        Calculadora calc = new Calculadora();

        // 2 parámetros
        System.out.println("Suma (2): " + calc.sumar(7, 5));
        System.out.println("Resta (2): " + calc.restar(14, 5));
        System.out.println("Multiplicación (2): " + calc.multiplicar(10, 5));
        System.out.println("División: " + calc.dividir(10, 5));

        System.out.println();

        // 3 parámetros
        System.out.println("Suma (3): " + calc.sumar(16, 5, 2));
        System.out.println("Resta (3): " + calc.restar(6, 5, 2));
        System.out.println("Multiplicación (3): " + calc.multiplicar(10, 5, 2));

        System.out.println();

        // 4 parámetros
        System.out.println("Suma (4): " + calc.sumar(10, 5, 2, 3));
        System.out.println("Resta (4): " + calc.restar(10, 5, 2, 3));
        System.out.println("Multiplicación (4): " + calc.multiplicar(10, 5, 2, 3));
    }
}
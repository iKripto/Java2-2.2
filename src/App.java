import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Base do retangulo: ");
        double base = sc.nextDouble();

        System.out.print("Altura do retangulo: ");
        double altura = sc.nextDouble();

        Retangulo r = new Retangulo(base, altura);

        System.out.printf("AREA = %.4f\n", r.calcularArea());
        System.out.printf("PERIMETRO = %.4f\n", r.calcularPerimetro());
        System.out.printf("DIAGONAL = %.4f\n", r.calcularDiagonal());

        sc.close();
    }
}

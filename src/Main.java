import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Ingrese el nombre del paciente:");
            String nombre = scanner.nextLine();

            System.out.println("Ingrese el peso del paciente en kg:");
            double peso = scanner.nextDouble();

            System.out.println("Ingrese la altura del paciente en metros:");
            double altura = scanner.nextDouble();

            Paciente paciente = new Paciente(nombre, peso, altura);

            System.out.println("El IMC de " + paciente.getNombre() + " es: " + paciente.calcularIMC());
            System.out.println("Diagnóstico: " + paciente.obtenerDiagnostico());

        } catch (InputMismatchException e) {
            System.out.println("Error: Ingresaste un valor no válido. Asegúrate de ingresar números para peso y altura.");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error inesperado: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestorEmpleados gestor = new GestorEmpleados();
        
        // Agregar empleados
        System.out.println("Ingrese el número de empleados a agregar:");
        int cantidad = scanner.nextInt();

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese el nombre del empleado:");
            String nombre = scanner.next();
            
            System.out.println("Ingrese la edad del empleado:");
            int edad = scanner.nextInt();
            
            System.out.println("Ingrese el salario del empleado:");
            double salario = scanner.nextDouble();

            // Crear un objeto Empleado y agregarlo al gestor
            Empleado empleado = new Empleado(nombre, edad, salario);
            gestor.agregarEmpleado(empleado);
        }

        // Mostrar empleados
        System.out.println("Detalles de los empleados agregados:");
        gestor.mostrarEmpleados();
        
        scanner.close();
    }
}

import java.util.ArrayList;
import java.util.List;

public class GestorEmpleados {
    // Lista para almacenar objetos de tipo Empleado
    private List<Empleado> empleados;

    // Constructor
    public GestorEmpleados() {
        empleados = new ArrayList<>();
    }

    // Método para agregar un empleado a la lista
    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    // Método para mostrar los detalles de todos los empleados
    public void mostrarEmpleados() {
        for (Empleado empleado : empleados) {
            empleado.imprimirInformacion();
            System.out.println(); // Espacio entre empleados
        }
    }
}

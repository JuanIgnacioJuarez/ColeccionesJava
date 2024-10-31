import java.util.HashSet;
import java.util.Scanner;
public class CPU {
    static Scanner sc = new Scanner(System.in);
    public static Computadora computadora = new Computadora();
    public static void costoComputadora(){
        System.out.println("Ingrese la marca de la computadora: ");
        String marca = sc.nextLine();
        computadora.setMarca(marca);
        System.out.println("Ingrese el modelo de la computadora: ");
        String modelo = sc.nextLine();
        computadora.setModelo(modelo);
        System.out.println("Ingrese la cantidad de componentes del CPU: ");
        int cantComponentes = sc.nextInt();
        for (int i = 0; i<cantComponentes; i++){
            ComponenteCPU componente = new ComponenteCPU();
            sc.nextLine();
            System.out.println("Ingrese nombre del componente " + (i+1) + ": ");
            String nombreComponente = sc.nextLine();
            componente.setComponente(nombreComponente);
            System.out.println("Ingrese marca del componente: ");
            String marcaComponente = sc.nextLine();
            componente.setMarca(marcaComponente);
            System.out.println("Ingrese cantidad de componentes: ");
            int cantComponente = sc.nextInt();
            componente.setCantidad(cantComponente);
            System.out.println("Ingrese precio del componente (1): ");
            double precioComponente = sc.nextDouble();
            componente.setPrecio(precioComponente);
            
            ComponenteCPU.cargarComponente(componente);
        }

        System.out.println("-----------COMPUTADORA-----------");
        marca = computadora.getMarca();
        System.out.println("Marca: " + marca);
        modelo = computadora.getModelo();
        System.out.println("Modelo: " + modelo);
        System.out.println("Componentes: ");
        for (int i = 0; i<cantComponentes; i++){
            String marcaComponente = ComponenteCPU.getMarca();
            int cantComponente = componenteCPU.getCantidad();
            double precioComponente = componenteCPU.getPrecio();
            System.out.print("Componente: " + componente +
                    " / Marca: " + marcaComponente +
                    " / Cantidad: " + cantComponente +
                    " / Precio por unidad: " + precioComponente);
        }
    }
}

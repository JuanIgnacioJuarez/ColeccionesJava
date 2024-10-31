import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        menu();
    }
    public static void menu(){
        System.out.println("Ingrese que opción desea realizar: ");
        System.out.println("----------------------------------");
        System.out.println("1- Ejercicio agenda.\n" +
                            "2- Ejercicio CPU.\n" +
                            "3- Salir.");
        System.out.println("----------------------------------");
        int opc = sc.nextInt();
        switch (opc){
            case 1:
                Ajenda.menu();
                menu();
            case 2:
                CPU.costoComputadora();
                menu();
            case 3:
                break;
            default:
                System.out.println("Opción invalida. Intente nuevamente.");
                menu();
        }
    }
}
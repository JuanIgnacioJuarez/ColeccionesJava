import java.util.HashMap;
import java.util.Scanner;

public class Ajenda {
    static Scanner sc = new Scanner(System.in);
    static HashMap<String,Long> agenda = new HashMap<String,Long>();
    public static void menu(){
        System.out.println("Ingrese que opción desea realizar: ");
        System.out.println("----------------------------------");
        System.out.println("1- Cargar datos en la agenda.\n" +
                "2- Buscar teléfono por nombre.\n" +
                "3- Listar agenda.\n" +
                "4- Salir.");
        System.out.println("----------------------------------");
        int opc = sc.nextInt();
        switch (opc){
            case 1:
                opcionUno(agenda);
                menu();
            case 2:
                opcionDos(agenda);
                break;
            case 3:
                for (String i : agenda.keySet()) {
                    System.out.println("key: " + i + " value: " + agenda.get(i));
                }
                menu();
            case 4:
                break;
            default:
                System.out.println("Opción invalida. Intente nuevamente.");
                menu();
        }
    }
    public static HashMap<String, Long> opcionUno(HashMap<String, Long> agenda){
        sc.nextLine();
        boolean vuelta = true;
        do {
            System.out.println("Ingrese nombre: ");
            String nombre = sc.nextLine();
            Long numero = null;
            while (numero == null){
                System.out.println("Ingrese número de teléfono: ");
                try{
                    numero = sc.nextLong();
                }catch (Exception e){
                    System.out.println("Por favor, ingrese un número válido.");
                    sc.next();
                }
            }
            if(agenda.get(nombre) == null)
                agenda.put(nombre, numero);
            else
                System.out.println("El contacto ya fue agendado");
            sc.nextLine();
            System.out.println("¿Desea agregar otro dato a la agenda? (SI: 'S' / NO: 'N')");
            String opc;
            do {
                opc = sc.nextLine().toUpperCase();
                if (opc.equals("N")){
                    vuelta = false;
                } else if (!opc.equals("S") && !opc.equals("N")) {
                    System.out.println("Caracter inválido.");
                }
            } while (!opc.equals("S") && !opc.equals("N"));
        } while (vuelta);
        return agenda;
    }
    public static void opcionDos(HashMap<String, Long> agenda) {
        sc.nextLine();
        System.out.println("Ingrese el nómbre que desea buscar: ");
        String nombreBuscado = sc.nextLine();
        Long numero = agenda.get(nombreBuscado);
        if (numero != null){
            System.out.println("El número de " + nombreBuscado + " es: " + numero);
        }else{
            System.out.println("Nombre no encontrado en la agenda.");
        }
        menu();
    }
}

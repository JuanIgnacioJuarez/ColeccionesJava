import java.util.HashSet;
import java.util.Scanner;

public class Computadora {
    private String marca;
    private String modelo;
    private static HashSet<ComponenteCPU> componenteCPU = new HashSet<ComponenteCPU>();

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public static HashSet<ComponenteCPU> getComponenteCPU() {
        return componenteCPU;
    }
    public static void setComponenteCPU(HashSet<ComponenteCPU> componenteCPU) {
        Computadora.componenteCPU = componenteCPU;
    }

}


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.IOException;

public class MaquinaSoldar {

    private BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    //Atributos
    private String marca;
    private String modelo;
    private double potencia;
    private String[] metales;

    //Métodos
    //Constructor
    public MaquinaSoldar(String marca, String modelo, double potencia, int cantidadMetales){
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
        this.metales = new String[cantidadMetales];
    }

    // Constructor alterno: recibe directamente los metales que puede soldar
    public MaquinaSoldar(String marca, String modelo, double potencia, String... metales){
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
        this.metales = metales;
    }

    //Getters
    public String getMarca(){ return marca; }

    public String getModelo(){ return modelo; }

    public double getPotencia() { return potencia; }

    public String[] getMetales() { return metales; }

    //Setters
    public void setMarca(String marca) { this.marca = marca; }

    public void setModelo(String modelo) { this.modelo = modelo; }

    public void setPotencia(double potencia) { this.potencia = potencia; }

    
    //equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof MaquinaSoldar)) return false;
        MaquinaSoldar otra = (MaquinaSoldar) obj;
        return this.marca.equals(otra.marca) && this.modelo.equals(otra.modelo);
    }

    @Override
    public int hashCode() { return marca.hashCode() * 31 + modelo.hashCode(); }

    //toString()
    @Override 
    public String toString() {
        return "Marca: " + marca + "\nModelo: " + modelo + "\nPotencia: " + potencia + "\nMetales: " + Arrays.toString(metales);
    }

    public void definirMetales() throws IOException {
        for (int i = 0; i < metales.length; i ++ ){
            System.out.println("Ingrese el metal " + (i + 1) + ": ");
            metales[i] = entrada.readLine();
        }
    }

    public void soldar(String metal){
        for (int i = 0; i < metales.length; i++){
            if (metal.equals(metales[i])){
                System.out.println("La máquina de soldar " + marca + " " + modelo + " solda el " + metal + ".\n");
                return;
            }
        }
        System.out.println("La máquina de soldar " + marca + " " + modelo + " no puede soldar " + metal + ".\n");
    }
}

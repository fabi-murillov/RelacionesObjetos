import java.time.LocalDate;

public class Pasaporte {

    //Atributos
    private String numero;
    private String nacionalidad;
    private LocalDate fechaEmision;
    private LocalDate fechaVencimiento;

    //Métodos
    //Constructor
    public Pasaporte(String numero, String nacionalidad, String fechaEmision, byte anios){
        this.numero = numero;
        this.nacionalidad = nacionalidad;
        this.fechaEmision = LocalDate.parse(fechaEmision);
        fechaVencimiento = this.fechaEmision.plusYears(anios);
    }


    //Getters
    public String getNumero(){ return numero; }

    public String getNacionalidad (){ return nacionalidad; }

    public LocalDate getFechaEmision (){ return fechaEmision; }

    public LocalDate getFechaVencimiento (){ return fechaVencimiento; }

    //Setters
    public void setNumero(String numero) { this.numero = numero; }

    public void setNacionalidad(String nacionalidad) { this.nacionalidad = nacionalidad; }

    public void setFechaEmision(LocalDate fechaEmision) { this.fechaEmision = fechaEmision; }

    public void setFechaVencimiento(LocalDate fechaVencimiento) { this.fechaVencimiento = fechaVencimiento; }

    //equals()
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Pasaporte)) return false;
        return this.numero.equals(((Pasaporte) obj).numero);
    }

    @Override
    public int hashCode() { return numero.hashCode(); }

    //toString()
    @Override 
    public String toString(){
        return "Número: " + numero + "\nNacionalidad: " + nacionalidad + 
        "\nFecha de emisión: " + fechaEmision.toString() + 
        "\nFecha de vencimiento: " + fechaVencimiento.toString() + "\n";
    }

    public boolean estaVigente(){
        return LocalDate.now().isBefore(fechaVencimiento);
    }

}

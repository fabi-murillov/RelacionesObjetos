public class Mascota {

    //Atributos
    private String nombre;
    private String especie;
    private byte edad;

    //Métodos
    //Constructor 
    public Mascota(String nombre, String especie, byte edad){
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    //Getters
    public String getNombre(){ return nombre; }

    public String getEspecie(){ return especie; }

    public byte getEdad(){ return edad; }

    //Setters
    public void setNombre(String nombre) { this.nombre = nombre; }

    public void setEspecie(String especie) { this.especie = especie; }

    public void setEdad(byte edad) { this.edad = edad; }

    //equals
    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (!(obj instanceof Mascota)) return false;
        Mascota otra = (Mascota) obj;
        return this.nombre.equals(otra.nombre) && this.especie.equals(otra.especie) &&
            this.edad == otra.edad;
    }

    @Override
    public int hashCode() { return nombre.hashCode() * 31 + especie.hashCode(); }

    //toString()
    @Override 
    public String toString(){
        return "Nombre: " + nombre + "\nEspecie: " + especie + "\nEdad: " + edad + "\n"; 
    }

}

public class Persona {
    //Atributos
    private String nombreCompleto;
    private Pasaporte pasaporte;
    private Mascota mascota;

    //Métodos
    //Constructor
    public Persona(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
        pasaporte = null;
        mascota = null;
    }

    //Getters
    public String getNombreCompleto(){
        return nombreCompleto;
    }

    public Pasaporte getPasaporte(){
        return pasaporte;
    }

    public Mascota getMascota(){
        return mascota;
    }

    //Setters
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    //equals()
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Persona)) return false;
        return this.nombreCompleto.equals(((Persona) obj).nombreCompleto);
    }

    @Override
    public int hashCode() { return nombreCompleto.hashCode(); }

    //toString()
    @Override 
    public String toString(){
        return "Nombre completo: " + nombreCompleto + "\n";
    }

    public void sacarPasaporte(String numero, String nacionalidad, String fechaEmision, byte anios){
        this.pasaporte = new Pasaporte(numero, nacionalidad, fechaEmision, anios);
    }

    public void tomarVuelo(String destino) {
        if (pasaporte == null || !pasaporte.estaVigente()) System.out.println(nombreCompleto + " no puede tomar el vuelo, ya que su pasaporte no está vigente.");
        else System.out.println(nombreCompleto + " toma un vuelo a "+ destino + ".");
    }

    public void adoptarMascota (Mascota mascota) {
       this.mascota = mascota;
    }

    public void jugar(){
        if (mascota == null) System.out.println(nombreCompleto + " no tiene mascota con la cual jugar.");
        else System.out.println(nombreCompleto + " juega con su "+ mascota.getEspecie() + " " + mascota.getNombre() +".");
    }


    public void soldar(MaquinaSoldar maquinaSoldar, String metal){
        if (maquinaSoldar == null) System.out.println(nombreCompleto + " no puede soldar sin una máquina.\n");
        else {
            System.out.println(nombreCompleto + " intenta soldar " + metal + ".");
            maquinaSoldar.soldar(metal);
        }
    }



}

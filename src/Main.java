public class Main {

    public static void main(String[] args) {

        //Dos personas
        Persona romario = new Persona("Romario Salas Cerdas");
        Persona ana = new Persona("Ana Mora Jiménez");

        //Pasaportes: el de Romario está vigente; el de Ana ya venció
        romario.sacarPasaporte("A1234567", "Costarricense", "2024-03-15", (byte) 10);
        ana.sacarPasaporte("B7654321", "Costarricense", "2010-05-10", (byte) 5);

        //Vuelos con distinto resultado
        romario.tomarVuelo("España");
        ana.tomarVuelo("Japón");
        System.out.println();

        //Una misma mascota para ambas personas
        Mascota rocky = new Mascota("Rocky", "perro", (byte) 4);
        romario.adoptarMascota(rocky);
        ana.adoptarMascota(rocky);
        romario.jugar();
        ana.jugar();
        System.out.println("¿Comparten la misma mascota? " + (romario.getMascota() == ana.getMascota()));
        System.out.println();

        //Máquina de soldar: hierro y acero sí, titanio no
        MaquinaSoldar maquina = new MaquinaSoldar("Miller Electric", "ME123X", 5500, "hierro", "acero");

        //Romario intenta soldar dos veces, con distinto resultado
        romario.soldar(maquina, "hierro");
        romario.soldar(maquina, "titanio");
    }
}

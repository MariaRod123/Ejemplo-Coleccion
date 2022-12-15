import java.util.HashSet;
import java.util.Set;

public class Veterinaria {

    public static void main(String[] args) {
        //creacion de objetos

        DatosPaciente mascota1= new DatosPaciente("TOBY", "MACHO", 2, "PERRO" );
        DatosPaciente mascota2= new DatosPaciente("CHARLY", "MACHO", 10, "PERRO" );
        DatosPaciente mascota3= new DatosPaciente("MIMI", "HEMBRA", 5, "GATO" );
        DatosPaciente mascota4= new DatosPaciente("YAKI", "HEMBRA", 7, "PERRO" );

        //creación de la colección
        Set<DatosPaciente> datos_mascotas= new HashSet<DatosPaciente>();
        datos_mascotas.add(mascota1); //agrega los objetos mascota a la colección
        datos_mascotas.add(mascota2);
        datos_mascotas.add(mascota3);
        datos_mascotas.add(mascota4);

        //recorriendo la colección usando bucle foreach
        for (DatosPaciente mascotas: datos_mascotas) {
            //muestra en consola los datos de las mascotas
            System.out.println("Nombre de la mascota: " + mascotas.getNomb_mascota() + " | " + " sexo: " + mascotas.getSexo() + " | " + " edad : " + mascotas.getEdad() + " | " + " tipo de mascota : " + mascotas.getTipo_mascota());

        }




    }
}

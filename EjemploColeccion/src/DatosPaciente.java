public class DatosPaciente {

    //atributos: nomb_mascota, sexo, edad, tipo_mascota
    private String nomb_mascota;
    private String sexo;
    private Integer edad;
    private String tipo_mascota;


    //constructor
    public DatosPaciente(String nomb_mascota, String sexo, Integer edad, String tipo_mascota) {
        this.nomb_mascota = nomb_mascota;
        this.sexo=sexo;
        this.edad=edad;
        this.tipo_mascota=tipo_mascota;
    }

    public String getNomb_mascota() {
        return nomb_mascota;
    }

    public void setNomb_mascota(String nomb_mascota) {
        this.nomb_mascota = nomb_mascota;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getTipo_mascota() {
        return tipo_mascota;
    }

    public void setTipo_mascota(String tipo_mascota) {
        this.tipo_mascota = tipo_mascota;
    }
}

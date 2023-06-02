package ClasesCaC;

public class Persona {
    private String nombre;
    private String apellido;
    private int dni;
    private int comision;

    public Persona(String nombre, String apellido, int dni, int comision) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.comision = comision;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getComision() {
        return comision;
    }

    public void setComision(int comision) {
        this.comision = comision;
    }

    @Override
    public String toString() {
        return "El nombre es " + nombre + '\'' +
                " y su apellido es " + apellido + '\'' +
                " con dni " + dni +
                " y pertenece a  la comision " + comision + '\n';
    }

}
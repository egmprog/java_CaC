package ClasesCaC;

public class alumnos2 {
    String nombre;
    String comisión;


    public alumnos2(String nombre, String comisión) {
        this.nombre = nombre;
        this.comisión = comisión;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getComisión() {
        return this.comisión;
    }

    public void setComisión(String comisión) {
        this.comisión = comisión;
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", comisión='" + getComisión() + "'" +
            "}";
    }

}

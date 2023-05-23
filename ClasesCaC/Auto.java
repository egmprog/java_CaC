package ClasesCaC;

public class Auto{
//atributos
String color, modelo;

    public Auto() {
    }

    public Auto(String color, String modelo) {
        this.color = color;
        this.modelo = modelo;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "{" +
            " color='" + getColor() + "'" +
            ", modelo='" + getModelo() + "'" +
            "}";
    }




}
package ClasesCaC;

public class Operacion {
    // atributos

    private int num1;
    private int num2;
    private int operador;
    private int resultado;

    public void sumar(int num1, int num2) {
        this.resultado = num1 + num2;
    }

    public void restar(int num1, int num2) {
        this.resultado = num1 - num2;
    }

    public void multiplicar(int num1, int num2) {
        this.resultado = num1 * num2;
    }

    public void dividir(int num1, int num2) {
        if (num2 != 0) {
            this.resultado = num1 / num2;
        } else {
            this.resultado = 0;
        }

    }

    public Operacion(int num1, int num2, int operador, int resultado) {
        this.num1 = num1;
        this.num2 = num2;
        this.operador = operador;

    }

    @Override
    public String toString() {
        return "{" + num1 + " , " + num2 + " , " + operador + " , " + resultado + "}";
    }

}

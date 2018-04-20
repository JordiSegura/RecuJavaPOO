public class Escaleno extends Triangulo {
    private String tipo;

    public Escaleno() {
        super();
        tipo="Escaleno";

    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "tipo='" + tipo;
    }

}

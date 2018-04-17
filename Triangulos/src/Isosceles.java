public class Isosceles extends Triangulo{
    private String tipo;


    public Isosceles() {
        super();
        tipo = "Isosceles";
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "tipo='" + tipo + '\'';
    }
}

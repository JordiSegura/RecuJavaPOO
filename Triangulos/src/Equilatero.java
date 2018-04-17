public class Equilatero extends Triangulo {
    private String tipo;
    public Equilatero(  ) {
        super();
        tipo="Equilatero";

    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }



    @Override
    public String toString() {
        return
                "tipo='" + tipo + '\'' +
                '}';
    }
}

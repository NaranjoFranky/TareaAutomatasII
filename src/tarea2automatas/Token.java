package tarea2automatas;

public class Token {
    //Geter y seter Privados

    private String valor;
    private Tipos tipo;

    /**
     * @return the valor
     */
    public String getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(String valor) {
        this.valor = valor;
    }

    /**
     * @return the tipo
     */
    public Tipos getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(Tipos tipo) {
        this.tipo = tipo;
    }

    //Creamos un enumerador
    enum Tipos {
        VARIABLES("[W-Zw-z]"),
        NUMERO("[0-9]+"),
        OPERADOR("[*|/|+|-|^]"),
        CONSTANTE("\\b(pi|e)"),
        ANÓNIMO("^(?!(pi|e)$)[^W-Zw-z0-9*/^/+\\-].*$");


        public final String patron;

        Tipos(String s) {
            this.patron = s;

        }
    }
}

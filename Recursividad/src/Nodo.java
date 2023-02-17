public class Nodo {

    public int nodo;
    private Nodo siguienteEnLista;

    public Nodo() {
    }

    public Nodo(int nodo) {
        this.nodo = nodo;
        this.siguienteEnLista = null;
    }

    public int getNodo() {
        return nodo;
    }

    public void setNodo(int nodo) {
        this.nodo = nodo;
    }

    public Nodo getSiguienteEnLista() {
        return siguienteEnLista;
    }

    public void setSiguienteEnLista(Nodo siguienteEnLista) {
        this.siguienteEnLista = siguienteEnLista;
    }

}
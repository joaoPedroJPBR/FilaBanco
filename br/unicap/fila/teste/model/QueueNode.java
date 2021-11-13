package br.unicap.fila.teste.model;

public class QueueNode <T> {

    private T info;//informacao do nó atual
    private QueueNode<T> prox;//referencia para o proximo nó

    QueueNode (T info, QueueNode<T> prox) {
        this.info = info;
        this.prox = prox;
    }

    public QueueNode (T info) {
        this.info = info;
    }

    public T getInfo() {
        return info;
    }
    void setInfo(T info) {
        this.info = info;
    }
    public QueueNode<T> getProx() {
        return prox;
    }
    public void setProx(QueueNode<T> prox) {
        this.prox = prox;
    }

    @Override
    public String toString() {
        return "Info ="+info+"/n"
        +" Prox = "+prox;
    }

}

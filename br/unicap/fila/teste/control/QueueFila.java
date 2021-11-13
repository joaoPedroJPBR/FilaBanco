package br.unicap.fila.teste.control;

import br.unicap.fila.teste.model.QueueNode;

public class QueueFila <T> {
    
    private QueueNode<T> first;
    private QueueNode<T> last;

    public boolean isFull () {
        return false;
    }

    public boolean isEmpty () {
        if(first == null) {
            return true;
        }
        else {
            return false;
        }
    }

    public void enqueue (T valor) {//inserir no final
        QueueNode<T> novo = new QueueNode(valor);

        if(isEmpty()) {
            first = novo;
            last = novo;
        }
        else {//ñ está vazia!!!
            if(valor.equals(last.getInfo())) {
                System.out.println("Valor repetido. Impossivel inserir!");
            }
            else {//Inseirindo no final
                last.setProx(novo);
                last = novo;
            }
        }
    }

    public T dequeue () {//desinfileirar 
        QueueNode<T> aux = first;

        if(first == last) {
            first = null;
            last = null;
        }
        else {
            first = first.getProx();
        }
        return aux.getInfo();
    }
}

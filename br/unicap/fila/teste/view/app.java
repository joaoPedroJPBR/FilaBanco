package br.unicap.fila.teste.view;
import java.util.Scanner;

import br.unicap.fila.teste.control.QueueFila;
/*
by joaopedrojpbr
*/
public class app {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        QueueFila <Integer> fila = new QueueFila();
        int op, senha = 0;

        do {
        menuView.menu();
        System.out.print("Digite sua opção:");
        op = s.nextInt();
            switch(op) {
                case 1://Gerar senha
                    if(senha <=10) {
                        senha++;
                        fila.enqueue(senha);
                        System.out.println("Senha gerada!");
                    }
                    else {
                        System.out.println("Por questão de segurança, só podemos atender\n"
                            + " 10 clientes por vez. Tente novamente mais tarde!");
                    }
                    break;
                case 2://Chamar senha
                        int valor;
                        if(senha > 0) {
                            valor = fila.dequeue();
                            System.out.println("A senha "+valor+" será atendida!");
                            senha--;
                        }
                        else {
                            System.out.println("Não há mais senhas para serem atendidas!");
                        }
                    break;
                case 0:
                    System.out.println("Obrigado. Volte sempre!");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }while(op != 0);
    }
}

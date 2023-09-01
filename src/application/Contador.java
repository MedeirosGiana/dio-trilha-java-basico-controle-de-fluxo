package application;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o primeiro parâmetro:");
        int parametroUm = sc.nextInt();

        System.out.println("Informe o segundo parâmetro:");
        int parametroDois = sc.nextInt();

        try {
            //chamando o método contendo a lógica de contagem
            contar(parametroUm,parametroDois);

        }catch ( ParametrosInvalidosException exception) {
            System.out.println(exception.getMessage());
        }

        sc.close();

    }
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUm >= parametroDois){
            throw new ParametrosInvalidosException();
        }
        int contagem = parametroDois - parametroUm;
        //realizar o for para imprimir os números com base na variável contagem
        for (int i = 1; i <= contagem; i++){
            System.out.println("Imprimindo o número " + i);
        }
    }
     static class ParametrosInvalidosException extends Exception{
         public ParametrosInvalidosException() {
             super("O segundo parâmetro deve ser maior que o primeiro");
         }
     }

}


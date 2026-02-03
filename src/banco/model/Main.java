package banco.model;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        //cria uma conta para teste
        System.out.println("--- Bem-vindo ao Banco Bancos ---");
        System.out.print("Digite o nome do titular: ");
        String nome = sc.nextLine();
        
        ContaCorrente minhaConta = new ContaCorrente(123, nome, 500.0);
        
        int opcao = 0;

        while (opcao != 4) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Consultar Saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Saldo atual: R$ " + minhaConta.getSaldo());
                    break;
                case 2:
                    System.out.print("Valor do depósito: ");
                    double valorDep = sc.nextDouble();
                    minhaConta.depositar(valorDep);
                    System.out.println("Depósito realizado!");
                    break;
                case 3:
                    System.out.print("Valor do saque: ");
                    double valorSaque = sc.nextDouble();
                    minhaConta.sacar(valorSaque);
                    break;
                case 4:
                    System.out.println("Sistema encerrado");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
        
        sc.close();
    }
}
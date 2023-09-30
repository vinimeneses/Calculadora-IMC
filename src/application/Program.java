package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import utilities.Calculadora;

public class Program {
    public static void main(String[] args) {
        try {
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            System.out.println("Bem-vindo à nossa calculadora de Índice de Massa Corporal (IMC).\n"
                + "O IMC é uma medida simples, porém importante, para avaliar se você está dentro \n"
                + "de uma faixa de peso saudável. Ao fornecer seu peso e altura, nosso programa \n"
                + "calculará seu IMC e fornecerá informações valiosas sobre sua condição física.\n"
                + "Descubra se você está no caminho certo para uma vida mais saudável!\n");

            System.out.print("Digite seu nome: ");
            String nome = sc.nextLine();
            System.out.print("Peso(kg): ");
            Integer kilos = sc.nextInt();
            System.out.print("Altura em metros (ex: 1.70): ");
            Double altura = sc.nextDouble();

            Pessoa pessoa = new Pessoa(nome, kilos, altura);
            Calculadora calculadora = new Calculadora();
            double imc = calculadora.calculoIMC(pessoa);

            System.out.printf("Muito bem %s! Seu IMC é: %.2f\n", pessoa.getNome(), imc);
            System.out.println("Grau de obesidade: " + calculadora.determinarGrauObesidade(imc));
            
            sc.close();   
        } 
        catch (IllegalArgumentException e) {
            System.err.println("Erro: " + e.getMessage());
            
        }
        catch (Exception e) {
            System.err.println("Erro inesperado: " + e.getMessage());
        }
    }
}
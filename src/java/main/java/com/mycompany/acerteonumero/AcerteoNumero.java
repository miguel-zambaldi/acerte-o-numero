package com.mycompany.acerteonumero;

import java.util.Scanner;

public class AcerteoNumero {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
      
        String respostaUsarNovamente = "sim";
        
        while(respostaUsarNovamente.toLowerCase().startsWith("s")){
            System.out.println("Bem-Vindo ao programa Acerte O Numero");
            int numeroAleatorioEscolhido =(int) (Math.random() * 1000);
            boolean acertou = false;
            
            while ( !acertou ){
                System.out.print("Descubrar o numero escolhido: ");
                int numeroDigitado=scanner.nextInt();
                scanner.nextLine();

                if(numeroDigitado == numeroAleatorioEscolhido){
                    System.out.println("Voce acertou");
                    acertou = true;
                }
                else if(numeroDigitado > numeroAleatorioEscolhido){
                    System.out.println("O numero escolhido e menor");
                }
                else{
                    System.out.println("o numero escolhido e maior");
                }
            }

            System.out.print("Deseja usar novamente o programa [S = Sim, N = Não]? ");
            respostaUsarNovamente = scanner.nextLine();
        }
        
        System.out.println("Fim do programa!");
    }
}

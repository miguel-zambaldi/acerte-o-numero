package estudos.acerteonumero;

import java.util.Scanner;

public class AcerteoNumero
{
    private static final int NUMERO_MINIMO = 10;
    private static final int NUMERO_MAXIMO = 100;
    
    public static void main(String[] args)
    {
        System.out.println("Bem-Vindo ao programa Acerte O Numero");
        var scanner = new Scanner(System.in);

        var respostaUsarNovamente = "s"; // Por padrão eu começo o programa querendo usá-lo!
        while(respostaUsarNovamente.toLowerCase().startsWith("s"))
        {
            var numeroAleatorioEscolhido = NUMERO_MINIMO + (int)(Math.random() * (NUMERO_MAXIMO - NUMERO_MINIMO));

            var acertou = false;
            while (!acertou)
            {
                System.out.print("Tente descobrir o numero que eu escolhi entre " + NUMERO_MINIMO + " e " + NUMERO_MAXIMO + ": ");
                var numeroDigitado = scanner.nextInt();
                scanner.nextLine();

                if(numeroDigitado == numeroAleatorioEscolhido)
                {
                    System.out.println("Voce acertou! Eu escolhi o numero " + numeroAleatorioEscolhido);
                    acertou = true;
                }
                else if(numeroDigitado > numeroAleatorioEscolhido)
                {
                    System.out.println("O numero que escolhi e menor (<)");
                }
                else
                {
                    System.out.println("O numero que escolhi e maior (>)");
                }
            }

            System.out.print("Deseja usar novamente o programa [S = Sim, N = Nao]? ");
            respostaUsarNovamente = scanner.nextLine();
        }
        
        System.out.println("Fim do programa!");
    }
}

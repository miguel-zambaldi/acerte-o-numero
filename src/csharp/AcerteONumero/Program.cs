namespace estudos.acerteonumero;

using System;

public class AcerteoNumero
{
	private static readonly int NUMERO_MAXIMO = 100;

	public static void Main(String[] args)
	{
		Console.WriteLine("Bem-Vindo ao programa Acerte O Numero");

		var respostaUsarNovamente = "s"; // Por padrão eu começo o programa querendo usá-lo!
		while (respostaUsarNovamente.ToLower().StartsWith("s"))
		{
			var numeroAleatorioEscolhido = (int)(Random.Shared.NextDouble() * NUMERO_MAXIMO);

			var acertou = false;
			while (!acertou)
			{
				Console.Write("Tente descobrir o numero que eu escolhi entre 0 e " + NUMERO_MAXIMO + ": ");
				var numeroDigitado = Convert.ToInt32(Console.ReadLine());

				if (numeroDigitado == numeroAleatorioEscolhido)
				{
					Console.WriteLine("Voce acertou! Eu escolhi o numero " + numeroAleatorioEscolhido);
					acertou = true;
				}
				else if (numeroDigitado > numeroAleatorioEscolhido)
				{
					Console.WriteLine("O numero que escolhi e menor (<)");
				}
				else
				{
					Console.WriteLine("O numero que escolhi e maior (>)");
				}
			}

			Console.Write("Deseja usar novamente o programa [S = Sim, N = Nao]? ");
			respostaUsarNovamente = Console.ReadLine();
		}

		Console.WriteLine("Fim do programa!");
	}
}

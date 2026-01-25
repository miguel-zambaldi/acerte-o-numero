namespace com.mycompany.acerteonumero;

using System;

public class AcerteoNumero
{

	public static void Main(String[] args)
	{

		String respostaUsarNovamente = "sim";

		while (respostaUsarNovamente.ToLower().StartsWith("s"))
		{
			Console.WriteLine("Bem-Vindo ao programa Acerte O Numero");
			int numeroAleatorioEscolhido = (int)(Random.Shared.NextDouble() * 50);
			bool acertou = false;

			while (!acertou)
			{
				Console.Write("Descubrar o numero escolhido: ");
				int numeroDigitado = Convert.ToInt32(Console.ReadLine());

				if (numeroDigitado == numeroAleatorioEscolhido)
				{
					Console.WriteLine("Voce acertou");
					acertou = true;
				}
				else if (numeroDigitado > numeroAleatorioEscolhido)
				{
					Console.WriteLine("O numero escolhido e menor");
				}
				else
				{
					Console.WriteLine("o numero escolhido e maior");
				}
			}

			Console.Write("Deseja usar novamente o programa [S = Sim, N = Não]? ");
			respostaUsarNovamente = Console.ReadLine();
		}

		Console.WriteLine("Fim do programa!");
	}
}

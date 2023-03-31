package modulo11EBAC;

/**
 * @author Caio Farias
 * Foi acionado a Classe Scanner para utilizar o método de leitura do console.
 * Foi necessário utilizar s.nextLine para ler toda a linha digitada pelo usuário
 * pois é necessário que o mesmo digite diversos nomes separador por vírgulas.
 * Para splitar a String strNomes, utilizamos o split para criar uma Array de SubStrings alocada em nomes
 * nomes são ordenados pelo sort
 * As substrings da array "nomes" são alocadas na variável "nome" no método for.
 * Assim, os nomes são printados em ordem alfabética e sem espaços digitados acidentalmente pelo usuário
 * graças ao método trim. 
 * 
 * 
 */



import java.util.Scanner;
import java.util.Arrays;


public class OrdenarNomes {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite os nomes, separados com vírgulas: ");
		String strNomes = s.nextLine();
		strNomes.trim();
		
		String[] nomes = strNomes.split(",");
		
		
		Arrays.sort(nomes);
		
		System.out.println("Nomes em ordem alfabética: \n");
		
		for(String nome : nomes) {
			
			System.out.println(nome);
			
		}
		
		s.close();
		

	}

}

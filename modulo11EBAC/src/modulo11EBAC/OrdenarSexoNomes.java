package modulo11EBAC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class OrdenarSexoNomes {
	

		    public static void main(String[] args) {

		        Scanner scanner = new Scanner(System.in);

		        boolean repetir = true;

		        while (repetir) {

		            System.out.println("Digite os nomes e sexos das pessoas separados por traço (-) e vírgula (,): \n Ex: Julia-F,Caio-M,Ana-F");
		            String entrada = scanner.nextLine();
		            
		            System.out.println(entrada);

		            ArrayList<String> homens = new ArrayList<String>();
		            ArrayList<String> mulheres = new ArrayList<String>();
		            
		            
		            String[] dados = entrada.split(",");
		            
		            
		            

		            for (String dado : dados) {
		                String[] nomeSexo = dado.split("-");
		                String nome = nomeSexo[0];
		                String sexo = nomeSexo[1];
		                if (sexo.equalsIgnoreCase("M")) {
		                    homens.add(nome);
		                } else {
		                    mulheres.add(nome);
		                }
		            }

		            Collections.sort(homens);
		            Collections.sort(mulheres);

		            System.out.println("Homens:");
		            for (String homem : homens) {
		                System.out.println(homem);
		            }

		            System.out.println("Mulheres:");
		            for (String mulher : mulheres) {
		                System.out.println(mulher);
		            }

		            System.out.println("Deseja repetir o programa? Digite 'sim' ou 'nao':");
		            String resposta = scanner.nextLine();
		            if (resposta.equalsIgnoreCase("nao")) {
		                repetir = false;
		            }

		        }

		        scanner.close();

		    }

		


	}



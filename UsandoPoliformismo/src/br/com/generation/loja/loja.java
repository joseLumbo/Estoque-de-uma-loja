package br.com.generation.loja;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class loja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String produtos1 = " Banana";
		String produtos2 = " Maça";
		String produtos3 = " Ananas";
		
		ArrayList<String> produtos = new ArrayList<>();
		produtos.add(produtos1);
		produtos.add(produtos2);
		produtos.add(produtos3);
				
		System.out.println("LISTAS DE PRODUTOS: " +produtos);
		
		try (Scanner leia = new Scanner(System.in)) {
			System.out.println("Voce deseja adicionar mais produtos? Dugite 1 para sim e 2 para não");
			int num = leia.nextInt();
			
			
			System.out.println("Quantos produtos voce quer adicionar? ");
			if(num == 1) {
				System.out.println("Numeero do produto:");
				String produto = leia.next();
				produtos.add(produto);
			
			}
else if ( num == 2) {
				
				System.out.println("Qual produto voce que remover?");
				int quantidade = produtos.size();
				for(int i = 0; i < quantidade; i ++) {
					System.out.println((i + 1) +produtos.get(i));
				}
				
				System.out.println("Digite o numero correspondente ao produto: ");
				int numProduto = leia.nextInt();
				produtos.remove(numProduto - 1);
				System.out.println();
				System.out.println("A nva lista é: "+produtos);
				
			}
			
else {
System.out.println("mensagem invalida!");
}
		}
		Collections.sort(produtos);
		System.out.println("produtos " +produtos);
		
	
		}

	}



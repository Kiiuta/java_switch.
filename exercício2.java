import java.util.Scanner;

public class exercício2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner leitor  = new Scanner(System.in);
		
		
	int codigo , quantidade;
	
	System.out.println("Digite o código do produto: ");
	codigo=leitor.nextInt();
	
	System.out.println("Digite a quantidade solicitada do produto: ");
	quantidade=leitor.nextInt();
	
	
switch (codigo) {
	
	case 100:
		
		System.out.println("Cachorro Quente Preço: 3,20 Reais");
		System.out.println("quantidade: "+quantidade+"");
		System.out.println(" Total a pagar: "+3.2*quantidade+" reais");

		break;
		
	case 101:
		
		System.out.println("Bauru simples  Preço: 4,20 reais");
		System.out.println("quantidade: "+quantidade+"");
		System.out.println("Total a pagar: "+4.3*quantidade+" Reais");
		
		break;
		
	case 102:
		
		System.out.println("Bauru com ovo  Preço: 5,50");
		System.out.println("quantidade: "+quantidade+"");
		System.out.println("Total a pagar: "+5.5*quantidade+" Reais");
		
		break;
		
	case 103:
		
		System.out.println("Hambúrguer  Preço: 3,20");
		System.out.println("quantidade: "+quantidade+"");
		System.out.println("Total a pagar: "+3.2*quantidade+"");
		
		break;
		
	case 104:
		
		System.out.println("Cheeserburguer  Preço: 4,30");
		System.out.println("quantidade: "+quantidade+"");
		System.out.println("Total a pagar: "+4.30*quantidade+"");
		
		break;
		
	case 105:
		
		System.out.println("Refrigerante  Preço: 4,30");
		System.out.println("quantidade: "+quantidade+"");
		System.out.println("Total a pagar: "+4.3*quantidade+"");
		
		break;
		
	default:
			
			System.out.println("Produto não cadastrado");
			
		break;
		
	
	}
	

		
		
		

	
		
		
		
		
	}

}

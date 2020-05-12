import java.util.Scanner;

public class exercício1 {

				
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			Scanner leitor = new Scanner(System.in);

			
			
				int codigo;
				
			System.out.println("Digite o código do produto");
			codigo=leitor.nextInt();
			
			
			 switch (codigo){
				 
			 case 001:
				 
			 	System.out.println("Parafuso");
			 	break;
			
			 case 002:
				 
				 System.out.println("Porca");
				 break;
				 
			 case 003:
				 
				 System.out.println("Prego");
				 break;
				 
			 case 004:
				 
				 System.out.println("Ferramenta");
				 break;
				 
			 default:
				 
				 System.out.println("Diversos");
				 break;
				 
				 
			 
			 	 
			 }


		
		
		
		
		
		
		
		
		
		
	}

}

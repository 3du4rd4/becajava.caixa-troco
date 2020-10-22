package Caixatroco;

import java.util.Scanner;

public class CaixaTroco {

	public static void main(String[] args) {
		int valor;
		int pagamento;
		int troco;
		
		//Entrada
		Scanner leitura = new Scanner (System.in);
			
			
			
			do {
				System.out.println("Digite o valor do produto");
				valor = leitura.nextInt();
				
				System.out.println("Digite o valor do pagamento");
				pagamento = leitura.nextInt();
						
	
				
				if(pagamento <valor) {
					System.out.println("Valor insuficiente!");
				} 
            else if(pagamento > valor) {
                troco = pagamento - valor;
                System.out.println("O seu troco é "+ troco+ ".");

            }
            else if(pagamento == valor) {
                System.out.println("Obrigado, volte sempre.");

            }
        }
			while(pagamento <= valor);

    }

}
	



package List_4;
import java.util.Scanner;
public class List_4c {

	public static void main(String[] args) {
		
		Scanner ler  = new Scanner(System.in);
		
		String[] Frasesm;
		int op, cont=0;
		String Frase;
		
		System.out.println("Digite uma frase para ser avaliada: ");
		Frase=ler.next();
		Frasesm=Frase.split(",");
		
		ArrayList<String> nomesArrayList = new ArrayList<>();
		
		for (int i = 0; i < Frasesm.length; i++){
			Frase=Frasesm[i];
			
			nomesArrayList.add(Frase);
		
			System.out.println("(1) N�mero de senten�as (ponto final, exclama��o e interroga��o) ");
			System.out.println("(2) N�mero de Palavras ");
			System.out.println("(3) N�mero de Vogais ");
			System.out.println("(4) N�mero de Consoantes ");
			System.out.println("(5) Sair ");
			op=ler.nextInt();
		
			switch(op) {
				case 1:
				if(Frase.equals(".") || Frase.equals("!")|| Frase.equals("?")){
					cont++;
					}
				else
					System.out.println(" N�o possui senten�as");
				break;
			
				case 2:
					int var = Frase.split(" ", -1).length - 1;
					System.out.println((var+1) + " palavras");
				break;
			
				case 3:
				break;
			
				case 4:
				break;
			
				default:
					System.out.print("Finalizado");
			
				
			}	
		
		
		}
	}
}

package view;
import stack.Pilha;
public class Principal {
	public static void main(String[ ]args) throws Exception{
		
		int[] vetor = {14,26,38,15,5,39,11,25,22,20,17,1};
		
		Pilha pilha = new Pilha(vetor);
		int num = 0;
		while (!pilha.isEmpty()) {
			if (pilha.top()>num) {
				num = pilha.pop();
			} else {
				pilha.pop();
			}
											
		}
		System.out.println("numero maior: "+ num);
	}
		
}

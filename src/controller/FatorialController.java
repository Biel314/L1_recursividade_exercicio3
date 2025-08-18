package controller;

public class FatorialController {

	public FatorialController() {
		super();
	}
	
	public int fatorial(int n) {
		//A condicao de parada e definida quando o numero chega a 0, retornando 1.
		if(n == 0) {
			return 1;
		//A chamada ocorre quando o numero ainda pode continuar indo ate o 0 (n!=0), e depois volta multiplicando
		// todos os outros termos
		} else {
			return n*fatorial(n-1);
		}
	
	}

	
}

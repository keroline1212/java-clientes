package empresa;

public class ExibeImpar {

	public static void main(String[] args) {
         ExibeImpar ei;
         ei = new ExibeImpar();
         ei.exibir();
	}        
  
	public void exibir() {
    	int contador = 1;
    	
    	while (contador <20) {
    		if (contador %2 !=0 ) {
    			System.out.println(contador + " é impar");
    		}
    		contador ++;
    	}
    
         
	}

}

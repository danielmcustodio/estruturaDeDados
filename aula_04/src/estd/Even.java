package estd;

public class Even {
	
	public int countEvens(int[] nums) {
		
		int contador = 0;
		
		for (int num : nums) {
			
			if(num % 2 == 0){
				//� par
				contador++;
			}else{
				//� impar
			}
			
		}
		
		return contador;
	}
	
	

}

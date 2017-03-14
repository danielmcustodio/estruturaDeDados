package estd;

public class bigDiff {
	
	public int bigDiff(int[] nums) {
		
		int maior = 0;
		int menor = 0;
		
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] > maior){
				maior = nums[i];
			}
			if(i == 0){
				menor = nums[i];
			}else{
				if(nums[i] < menor){
					menor = nums[i];
				}
			}
		}
		
		
		
		return maior - menor;
	}

}

package java07_4week;

import java.util.Arrays;

public class java0730_2 {
	
	public static void main(String[] args) {
		/* 1) 두 정수에 대해 자신을 제외한 약수의 합이 서로 상대의방의 수 가 될 때, 이 두수를 친화수라 한다.
		 * 2) 이러한 친화수를 구하는 코드를 작성하시오.
		 * 3) 220의 약수의 합은 284이고 284의 약수의 합은 220이다.
		 * 4) 1만 이하의 수로 가정한다.
		 */
		int[] nums = new int[9999];
		int sum = 0;
		int[] intArr = new int[9999];

		for(int a = 0; a<nums.length; a++){
		   nums[a] = a+2;
		  }
		
		for(int b = 0; b<nums.length; b++){
		    sum = 0;
		    
		    for (int i = 1; i < nums[b]; i++) {
		    	if (nums[b] % i == 0) {
		    		sum += i;
		    	}
		    }
		    intArr[b] = sum;
		}

		int count = 0;

		for(int j = 0; j<intArr.length; j++){

			for(int k = 0; k<nums.length; k++){

				if( intArr[j]==nums[k] && intArr[k]==nums[j] && nums[k] != intArr[k]){

					count ++;

					System.out.println(count + "번째 친화수 : "+(j+2) + " :" + nums[k]);

					//total += nums[k];
				}
			}
		}	
	}
}

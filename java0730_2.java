package java07_4week;

import java.util.Arrays;

public class java0730_2 {
	
	public static void main(String[] args) {
		/* 1) �� ������ ���� �ڽ��� ������ ����� ���� ���� ����ǹ��� �� �� �� ��, �� �μ��� ģȭ���� �Ѵ�.
		 * 2) �̷��� ģȭ���� ���ϴ� �ڵ带 �ۼ��Ͻÿ�.
		 * 3) 220�� ����� ���� 284�̰� 284�� ����� ���� 220�̴�.
		 * 4) 1�� ������ ���� �����Ѵ�.
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

					System.out.println(count + "��° ģȭ�� : "+(j+2) + " :" + nums[k]);

					//total += nums[k];
				}
			}
		}	
	}
}

package 어어;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	        
		// line에 값을 입력, line만큼 길이의 1차 배열 snail  생성
	        int line = scan.nextInt();
	        int[] snail = new int[line];
	        
	        for(int i = 0; i < line; i++) {
	        	  snail [i] = scan.nextInt();
	        	  //snail[0]=첫번째로 입력받는 값 snail[1]은 두번째로 입력받는 값 ...snail[i-1]
	        			} 	 
	        	//배열 순서대로 앞에서 가져오기, 첫 번째 배열 값이 num 변수로 작용
	        for(int num: snail) {
	        	  int[][] dal = new int[num][num]; 
	        
	        	  for(int i = 0; i < num; i++) {
	        		  for(int j = 0; j < num; j++) {
	        			  dal[i][j] = j + 1 + i * num;
	        			  
	        			  
	        			  System.out.print(dal[i][j] + " ");
	        			  
	        		  }
	        		  System.out.println();
	        	  } System.out.println("---");
	        }	  
	        	
	}
}



package PreceptronAI;

import java.util.Random;

public class Preceptron {
	
	int [] weight ;
	
	public Preceptron (int len){
		weight = new int [len];
		Random rand = new Random (System.nanoTime());
		for(int pro = 0 ; pro < len ; pro ++)
		{
			weight [pro] = rand.nextInt(3)-1;// means ran can only be -1 , 0 , 1
		}
	}
		
		public void setWeight (int input [] , int ans){
			
			
			int error = ans - guess(input) ;
			
			for (int pro = 0 ; pro < weight.length ; pro ++){
				
				weight[pro] += error * input[pro]; 
				//System.out.println(pro +"  "+ weight[pro]);
			}
		}
		
		public int guess (int input[]){
			
			int data = 0;
			for (int pro = 0 ; pro < weight.length ; pro ++){
				data +=  weight[pro] * input[pro]; 
			}
			
			if (data/2 > 0){
				return 1;
			}
			else return -1;
		}
		
		
	

}

package PreceptronAI;

public class Trainer {
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getAns() {
		return ans;
	}

	int x ;
	int y;
	int ans;
	
	int calcAns (){
		if (2*x > y) return 1;
		else return -1;
	}
	
	public Trainer (int x , int y ){
		this.x = x;
		this.y = y;
		this.ans = calcAns();
		
	}
	
	

}

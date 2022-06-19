public class ApowB{


	static int aPowB(int a, int b ){
	
		if(b==0){
		
			return 1;
		}else if(b<0){
		
			return 0;
		}else{
		
			return a*aPowB(a,b-1);
		}
	
	}

	public static void main(String[] args){
	
		//complexity of this program is O(b);
		//because function is being called b times;
		//multiplication with a is a constant operation
		System.out.println(aPowB(2,3));
	}
}

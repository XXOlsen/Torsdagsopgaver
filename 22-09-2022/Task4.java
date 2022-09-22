public class Task4{

	static int n1 = 0;
	static int n2 = 1; 
	static int n3 = 0;
	static int max = 1000;


	static public void LoopFab (){

		if(n1 + n2 < max){
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3; 
			System.out.print(n3 + " ");
				LoopFab();	
		}

	}



	public static void main(String[] args) {
		LoopFab();	

	}	
}
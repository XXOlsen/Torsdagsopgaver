public class Task4{

	int n1 = 0;
	int n2 = 1;
	int n3 = 0;
	int max = 1000;

	public void LoopFab(){
		if(n1 + n2 < max ){
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			LoopFab();
		}
	}

	public static void main(String[] args) {
		LoopFab();
	}
}

public class Task2{
	public static void main(String[] args) {

		String word = "Supercalifragilisticexpialidocious";
		int indexstart = 0;
		int amount = 5;

		String result = printPartOfWord(word, indexstart, amount);
		System.out.println(result);

	}

	public static String printPartOfWord(String word, int indexstart, int amount){

		return((word.substring(indexstart,amount)));
	}
}
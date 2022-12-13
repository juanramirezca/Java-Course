import java.util.Scanner;
import java.util.ArrayList;

public class UniqueCharacters{
	public static void main(String args[]){

		// 1. Create a scanner
		Scanner sc = new Scanner(System.in);
		String input;
		input = sc.nextLine();

		// 2. Create an ArrayList
		ArrayList<Character> uniqueCharList = new ArrayList<>();
		Set<Character> uniqueCharList = new HashSet<>();

		// 3. Loop to iterate to look for a new character
		for(Character letter : input.toCharArray()){
			if(!uniqueCharList.contains(letter)){
				uniqueCharList.add(letter);
			}

		}
		System.out.println(uniqueCharList);

		// 4. Print the ArrayList

		
	}
}

// Conjunto -> No acepta elementos repetidos. 
// Se agregan elementos sin ORDEN.
// ArrayList -> Sí se aceptan elementos repetidos.
// Se agregan elementos en el ORDEN en el que aparecen.
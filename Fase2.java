import java.util.ArrayList;
public class Fase2 {
	  public static void main(String[] args) {
			String vowels = "Vowel.";
			String consonants = "Consonant.";
			String numbers = "People names do not contain numbers.";
			String space = "Empty space.";
		    ArrayList<Character> fullName = new ArrayList<Character>();
		    fullName.add('B');
		    fullName.add('A');
		    fullName.add('V');
		    fullName.add('A');
			fullName.add('S');
		    fullName.add('T');
		    fullName.add('R');
		    fullName.add('O');
			fullName.add(' ');
			fullName.add('N');
		    fullName.add('A');
		    fullName.add('V');
		    fullName.add('O');
			fullName.add('N');
		    fullName.add('E');
			fullName.add(' ');
		    fullName.add('G');
		    fullName.add('A');
		    fullName.add('B');
			fullName.add('R');
		    fullName.add('I');
			fullName.add('E');
		    fullName.add('L');
		    fullName.add('E');
		    fullName.add(' ');
		    fullName.add('1');
		    fullName.add('9');
		    fullName.add('8');
		    fullName.add('4');
		    for (Character i : fullName) 
			if (i == 'A'|| i == 'E' || i == 'I' || i == 'O' || i == 'U' || i == 'Y') System.out.println(vowels);
			else if (i == 'B' || i == 'C'|| i == 'D' || i == 'F' ||
			i == 'G' || i == 'H' || i == 'L' || i == 'M' || i == 'N' || i == 'P'||
			i == 'Q' || i == 'R' || i == 'S' || i == 'T' || i == 'V' || i == 'X' || i == 'Z' || i == 'J') System.out.println(consonants);
			else if (i == ' ') System.out.println(space); 
			else System.out.println(numbers);
		  }
		}
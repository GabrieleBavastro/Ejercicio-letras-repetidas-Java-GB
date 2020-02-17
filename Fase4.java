import java.util.ArrayList;
public class Fase4 {
  public static void main(String[] args) {
	ArrayList<String> firstName = new ArrayList<String>();
	ArrayList<String> surname = new ArrayList<String>();
	String space = ("");
    surname.add("B");
    surname.add("A");
    surname.add("V");
    surname.add("A");
	surname.add("S");
    surname.add("T");
    surname.add("R");
    surname.add("O");
	surname.add("");
	surname.add("N");
    surname.add("A");
    surname.add("V");
    surname.add("O");
	surname.add("N");
    surname.add("E");
    surname.add("");
	firstName.add("G");
    firstName.add("A");
    firstName.add("B");
	firstName.add("R");
    firstName.add("I");
    firstName.add("E");
    firstName.add("L");
    firstName.add("E");
    ArrayList<String> fullName = new ArrayList<String>();
    fullName.addAll(surname);
    fullName.addAll(firstName);
    System.out.println(fullName);
  }
}
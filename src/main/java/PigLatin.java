import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class PigLatin {
    
    public void tester() {
        // String[] lines = loadStrings("words.txt");
        String[] lines = new String[8]; 
        try{
            File myFile = new File("words.txt");
            Scanner myReader = new Scanner(myFile);
            int counter = 0;
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                lines[counter] = data;
                counter++;
            }
            myReader.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
	    System.out.println("there are " + lines.length + " lines");
	    for (int i = 0 ; i < lines.length; i++) {
	        System.out.println(pigLatin(lines[i]));
	    }
    }
    public int findFirstVowel(String sWord) {
        //precondition: sWord is a valid String of length greater than 0.
        //postcondition: returns the position of the first vowel in sWord.  If there are no vowels, returns -1
	    // your code goes here
         for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u') {
                return i;
            }
           }
        return -1;
    }

    public String pigLatin(String Word) {
        //precondition: sWord is a valid String of length greater than 0
        //postcondition: returns the pig latin equivalent of sWord
        // more code should go here
  if(findFirstVowel(word) == -1)
  {
    return word + "ay";
  }
  else if(findFirstVowel(word) == 0){
    return word + "way";
  }
        if (word.startsWith("qu")) {
            return word.substring(2) + "quay";
        }
      else if(findFirstVowel(word) != -1){
    return word.substring(findFirstVowel(word)) + word.substring(0,findFirstVowel(word)) + "ay";
  }
  else
  {
    return "ERROR!";
  }
    }
}//end PigLatin class

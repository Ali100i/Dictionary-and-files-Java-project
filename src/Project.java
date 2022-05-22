import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
// Name: Ali Al Marzouq
// ID: 201942110, Section: 54
public class Project {
	
	public static void main(String args[]){
		Dictionary dictionary = new Dictionary();
		
		Scanner input = new Scanner(System.in);
		int choice = 0;
		// a continuous while loop that will stop when the 7th choice is chosen.
		while(choice != 7) {
			System.out.println("=====================================================================================");
			System.out.println("Choose one of the following options: ");
			System.out.println("1.	Insert a new word with its meanings\r\n"
					+ "2.	Search for a word\r\n"
					+ "3.	Delete a word and its meanings\r\n"
					+ "4.	Modify the meanings of a word\r\n"
					+ "5.	Print all words with a given suffix and their meanings\r\n"
					+ "6.	Print the contents of the dictionary sorted in lexicographic order\r\n"
					+ "7.	Exit\r\n"
					+ "");
			System.out.println("=====================================================================================");

			choice = input.nextInt();
			
			// choice 1 will use the insert method, if the word exists an error message will appear.
			if(choice == 1) {
				System.out.println("Enter the word with its meanings: ");
				String word = input.next();
				String meanings = input.nextLine();
				WordPair newPair = new WordPair(word,meanings);
				boolean result = dictionary.insert(newPair);
				if(result) {
					System.out.println("The word "+word+" is successfully inserted.");
				}
				else {
					System.out.println("The word is already in the dictionary.");
				}
			}
			// choice 2 uses the find method.
			else if (choice == 2) {
				System.out.println("Enter the word you are looking for: ");
				String word = input.next();
				
				// if the word doesn't exist the following message will appear.
				if(dictionary.find(word) == null)
					System.out.println("the word "+word+" is not in the dictionary.");
				else
					// otherwise the word will be printed with its meanings.
					System.out.println(dictionary.find(word)); 
			}
			// choice 3 uses the delete method.
			else if (choice == 3) {
				System.out.println("Enter the word you want to delete: ");
				String word = input.next();
				
				// since delete is a boolean method we will get true if it was deleted, otherwise it is false.
				boolean result = dictionary.delete(word);
				
				// I'm using the result of the method to give the proper message.
				if(result)
					System.out.println("the word "+word+" is successfully deleted from the dictionary.");
				else
					System.out.println("the word "+word+" is not in the dictionary.");
			}
			// choice 4 uses modifyWord method.
			else if (choice == 4) {
				System.out.println("Enter the word you want to modify with its new meaning: ");
				String word = input.next();
				String meaning = input.nextLine();
				
				// if the word exists then it will proceed to modify the meaning, otherwise another message will appear informing the user that the word doesn't exist.
				boolean result = dictionary.modifyWord(word, meaning);
				if(result)
					System.out.println("the word "+word+" meanings are successfully modified.");
				else
					System.out.println("the word "+word+" is not in the dictionary.");
			}
			// choice 5 uses printAll method that checks if the word starts with the given suffix and print it.
			// if no word starts with the given suffix a message will appear.
			else if (choice == 5) {
				System.out.println("Enter the suffix: ");
				String suffix = input.next();
				dictionary.printAll(suffix);
			}
			// choice 6 uses printSorted method which will print the dictionary in the alphabetical order.  
			else if (choice == 6) {
				dictionary.printSorted();
			}
		}
		// the exit method will save all the changes to (dictionary.txt) file.
		dictionary.Exit();
		System.out.println("done, All changes have been saved to dictionary.txt file.");
	}

}

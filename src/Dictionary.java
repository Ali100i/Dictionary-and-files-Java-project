import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Dictionary {
	// I used AVlTree class to store WordPair Objects 
	private AVLTree<WordPair> dictionary;
	private int size;
	
	public Dictionary() {
		File file = new File("D:\\Eclipse\\Lab_Project\\res\\dictionary.txt");
		dictionary = new AVLTree<WordPair>();
		
		// reading file strings and making WordPair objects
		try (Scanner fileInput = new Scanner(file)){
			while(fileInput.hasNext()) {
				String word = fileInput.next();
				
				String meanings = fileInput.nextLine();
				WordPair pair = new WordPair(word,meanings);
				
				// Storing WordPair objects into an avl tree
				dictionary.insert(pair);
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public boolean isEmpty() {
		return dictionary.isEmpty();
	}
	public int getSize() {
		BTNode<WordPair> node = dictionary.root;
		size = 0;
		// the tree is unbalanced to the right, so that made it easier to iterate through it and get the size.
		while(node != null) {
			size++;
			node = node.right;
		}
		return size;
	}
	public boolean insert (WordPair wordpair) {
		BTNode<WordPair> node = dictionary.root;
		BTNode<WordPair> newNode = new BTNode<WordPair>();
		newNode.data = wordpair;
		String word = wordpair.getWord();
		while(node.right != null) {
			if(node.data.getWord().equals(word)) {
				return false;
			}
			else {
				node = node.right;
			}
		}
		node.right = newNode;
		
		return true;
	}
	public WordPair find(String word) {
		BTNode<WordPair> node = dictionary.root;
		while(node != null) {
			// I made a getWord method in the WordPair class so that makes it easier for me to search by using it.
			if(word.equals(node.data.getWord()))
				break;
			node = node.right;
		}
		return node.data;
		
	}
	public boolean delete(String word) {
		BTNode<WordPair> node = dictionary.root;
		while(node != null) {
			// when the word matches with the parameter it will be deleted.
			if(node.data.getWord().equals(word)){
				dictionary.deleteByCopying(node.data);
				return true;
			}
			else {
				node = node.right;
			}
		}
		return false;
	}
	public boolean modifyWord(String word, String newMeanings) {
		BTNode<WordPair> node = dictionary.root;
		while(node != null) {
			if(node.data.getWord().equals(word)) {
				
				// I created a setMeaning method in WordPair class so that I can change wordMeanings string into a new one.
				node.data.setMeaning(newMeanings);
				return true;
			}
			else {
				node = node.right;
			}
		}
		return false;
	}
	
	public void printSorted() {
		// starting from the root.
		BTNode<WordPair> node = dictionary.root;
		
		// the following while loops will print the words with their meanings going by the alphabetical order for the first character of each word.
		while(node != null) {
			if(node.data.getWord().charAt(0) == 'A' || node.data.getWord().charAt(0) == 'a')
				System.out.println(node.data);
				node = node.right;
		}
		// it will restart from the beginning for each character.
		node = dictionary.root;
		while(node != null) {
			if(node.data.getWord().charAt(0) == 'B' || node.data.getWord().charAt(0) == 'b')
				System.out.println(node.data);
				node = node.right;
		}
		node = dictionary.root;
		while(node != null) {
			if(node.data.getWord().charAt(0) == 'C' || node.data.getWord().charAt(0) == 'c')
				System.out.println(node.data);
				node = node.right;
		}
		node = dictionary.root;
		while(node != null) {
			if(node.data.getWord().charAt(0) == 'D' || node.data.getWord().charAt(0) == 'd')
				System.out.println(node.data);
				node = node.right;
		}
		node = dictionary.root;
		while(node != null) {
			if(node.data.getWord().charAt(0) == 'E' || node.data.getWord().charAt(0) == 'e')
				System.out.println(node.data);
				node = node.right;
		}
		node = dictionary.root;
		while(node != null) {
			if(node.data.getWord().charAt(0) == 'F' || node.data.getWord().charAt(0) == 'f')
				System.out.println(node.data);
				node = node.right;
		}
		node = dictionary.root;
		while(node != null) {
			if(node.data.getWord().charAt(0) == 'G' || node.data.getWord().charAt(0) == 'g')
				System.out.println(node.data);
				node = node.right;
		}
		node = dictionary.root;
		while(node != null) {
			if(node.data.getWord().charAt(0) == 'H' || node.data.getWord().charAt(0) == 'h')
				System.out.println(node.data);
				node = node.right;
		}
		node = dictionary.root;
		while(node != null) {
			if(node.data.getWord().charAt(0) == 'I' || node.data.getWord().charAt(0) == 'i')
				System.out.println(node.data);
				node = node.right;
		}
		node = dictionary.root;
		while(node != null) {
			if(node.data.getWord().charAt(0) == 'J' || node.data.getWord().charAt(0) == 'j')
				System.out.println(node.data);
				node = node.right;
		}
		node = dictionary.root;
		while(node != null) {
			if(node.data.getWord().charAt(0) == 'K' || node.data.getWord().charAt(0) == 'k')
				System.out.println(node.data);
				node = node.right;
		}
		node = dictionary.root;
		while(node != null) {
			if(node.data.getWord().charAt(0) == 'L' || node.data.getWord().charAt(0) == 'l')
				System.out.println(node.data);
				node = node.right;
		}
		node = dictionary.root;
		while(node != null) {
			if(node.data.getWord().charAt(0) == 'M' || node.data.getWord().charAt(0) == 'm')
				System.out.println(node.data);
				node = node.right;
		}
		node = dictionary.root;
		while(node != null) {
			if(node.data.getWord().charAt(0) == 'N' || node.data.getWord().charAt(0) == 'n')
				System.out.println(node.data);
				node = node.right;
		}
		node = dictionary.root;
		while(node != null) {
			if(node.data.getWord().charAt(0) == 'O' || node.data.getWord().charAt(0) == 'o')
				System.out.println(node.data);
				node = node.right;
		}
		node = dictionary.root;
		while(node != null) {
			if(node.data.getWord().charAt(0) == 'P' || node.data.getWord().charAt(0) == 'p')
				System.out.println(node.data);
				node = node.right;
		}
		node = dictionary.root;
		while(node != null) {
			if(node.data.getWord().charAt(0) == 'Q' || node.data.getWord().charAt(0) == 'q')
				System.out.println(node.data);
				node = node.right;
		}
		node = dictionary.root;
		while(node != null) {
			if(node.data.getWord().charAt(0) == 'R' || node.data.getWord().charAt(0) == 'r')
				System.out.println(node.data);
				node = node.right;
		}
		node = dictionary.root;
		while(node != null) {
			if(node.data.getWord().charAt(0) == 'S' || node.data.getWord().charAt(0) == 's')
				System.out.println(node.data);
				node = node.right;
		}
		node = dictionary.root;
		while(node != null) {
			if(node.data.getWord().charAt(0) == 'T' || node.data.getWord().charAt(0) == 't')
				System.out.println(node.data);
				node = node.right;
		}
		node = dictionary.root;
		while(node != null) {
			if(node.data.getWord().charAt(0) == 'U' || node.data.getWord().charAt(0) == 'u')
				System.out.println(node.data);
				node = node.right;
		}
		node = dictionary.root;
		while(node != null) {
			if(node.data.getWord().charAt(0) == 'V' || node.data.getWord().charAt(0) == 'v')
				System.out.println(node.data);
				node = node.right;
		}
		node = dictionary.root;
		while(node != null) {
			if(node.data.getWord().charAt(0) == 'W' || node.data.getWord().charAt(0) == 'w')
				System.out.println(node.data);
				node = node.right;
		}
		node = dictionary.root;
		while(node != null) {
			if(node.data.getWord().charAt(0) == 'X' || node.data.getWord().charAt(0) == 'x')
				System.out.println(node.data);
				node = node.right;
		}
		node = dictionary.root;
		while(node != null) {
			if(node.data.getWord().charAt(0) == 'Y' || node.data.getWord().charAt(0) == 'y')
				System.out.println(node.data);
				node = node.right;
		}
		node = dictionary.root;
		while(node != null) {
			if(node.data.getWord().charAt(0) == 'Z' || node.data.getWord().charAt(0) == 'z')
				System.out.println(node.data);
				node = node.right;
		}
		
	}
	
	public void Exit() {
		try {
			// using FileWriter class this method will overwrite the dictionary.txt file and save the current changes.
			FileWriter writer = new FileWriter("D:\\\\Eclipse\\\\Lab_Project\\\\res\\\\dictionary.txt");
			BTNode<WordPair> node = dictionary.root;
			
			while(node != null) {
				writer.write(node.data.getWord()+node.data.getMeanings()+"\n");
				node = node.right;
			}
			writer.close();
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void printAll(String suffix) {
		BTNode<WordPair> node = dictionary.root;
		// I created a variable to keep up with the loop, if it reaches the size of the dictionary, that means no word starts with this suffix.
		int count = 0;
		while(node != null) {
			if(node.data.getWord().startsWith(suffix)) {
				count--;
				System.out.println(node.data);
			}
			count++;
			node = node.right;
		}
		if(count == getSize()) {
			System.out.println("No word starts with this suffix.");
		}
	}
	
}

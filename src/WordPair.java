
public class WordPair implements Comparable<WordPair> {
    private String word;
    private String  wordMeanings;
    
    public WordPair(String word,String wordMeanings) {
    	this.word = word;
    	this.wordMeanings = wordMeanings;
    }
    // this method returns the word.
    public String getWord() {
    	return word;
    }
    // this method returns the meanings.
    public String getMeanings() {
    	return wordMeanings;
    }
    // this method changes the meanings.
    public void setMeaning(String NewMeaning) {
    	this.wordMeanings = NewMeaning;
    }
    
	@Override
	public int compareTo(WordPair o) {
		// TODO Auto-generated method stub
		if(this.word.compareTo(o.word) > 0) 
			return 1;
		
		else if (this.word.compareTo(o.word) < 0)
			return -1;
		else
			return 0;
	}
	@Override
	public String toString() {
		return "Word: "+word+", Meanings: "+wordMeanings;
	}

}

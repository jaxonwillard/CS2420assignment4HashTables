public class WordInfo implements Comparable<WordInfo> {

    private String word;
    private int totalScore;
    private int numberOccurrences;

    public WordInfo(String word){
        this.word = word;
    }

    private void calculateTotalScore(){
        this.totalScore = 0;

    }

    public String getWord(){
        return this.word;
    }

    @Override
    public int compareTo(WordInfo word2){
        return this.word.compareTo(word2.word);
    }


}

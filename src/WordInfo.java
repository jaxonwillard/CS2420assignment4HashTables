public class WordInfo {
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


}

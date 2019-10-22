import java.util.Arrays;
import java.util.Scanner;



import java.io.*;
import java.util.Set;
import java.util.TreeSet;

public class Reviews {

    public Reviews() {

        H = new QuadraticProbingHashTable<String, WordInfo>();

    }



    public String toString() {
        int LIMIT = 20;
        return name + "\n" + H.toString(LIMIT);
    }

    public int getWordInfoReviewOccurences(String word){
        return H.find(word).reviewOccurences;
    }

    private String name;
    private QuadraticProbingHashTable<String, WordInfo> H;
    private int totalReviews;

    public void readReviews(String filename)
            throws FileNotFoundException, IOException {
        BufferedReader in = new BufferedReader(new FileReader(filename));
        String name = null;
        String line;
        String[] words = null;

        int score = -1;
        int line_count = 0;
        while ((line = in.readLine()) != null) {
            line_count++;
            totalReviews++;

            words = line.split("\\s+");
            try {
                score = Integer.parseInt(words[0]);
            } catch (NumberFormatException e) {
                throw new NumberFormatException("Expected integer at line " + line_count + " in file " + filename);
            }
            ReviewInfo r = new ReviewInfo(score, words);
            insertReviewInHashTable(r);

//            System.out.println(r.toString());
//            System.out.println(H.toString(9));
        }

    }

    public int getTotalReviews() {
        return totalReviews;
    }

    private void insertReviewInHashTable(ReviewInfo r){

        for (int i=1; i < r.words.length; i++){
            if (!H.contains(r.words[i])){
                H.insert(r.words[i], new WordInfo(r.words[i]));
            }
             H.find(r.words[i]).update(r.score);
        }
        Set<String> uniqWords = new TreeSet<String>();
        uniqWords.addAll(Arrays.asList(r.words));
        for (String word : uniqWords){
//            System.out.println(word);
            if (H.contains(word)){
            H.find(word).iterateReviewOccurences();}
        }
    }


    public QuadraticProbingHashTable getH(){return H;}

    public int getWordInfoAvg(String word){
        return H.find(word).totalScore / H.find(word).numberOfOccurences;
    }


    private static class ReviewInfo {
        int score;
        String[] words;

        // Constructors
        ReviewInfo(int score, String[] words) {
            this.score = score;
            this.words = words;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Review " + score+ " Length of Review " + (words.length -1) + " ");
            for (int i = 1; i < 11 & i < words.length; i++)
                sb.append(words[i] + " ");
            return sb.toString();
        }
    }

    private static class WordInfo {
        int reviewOccurences;
        int totalScore;
        int numberOfOccurences;
        String word;

        // Constructors
        WordInfo(String word) {
            this.word = word;
            totalScore=0;
            numberOfOccurences = 0;
        }

        public void update(int score){
            this.totalScore+=score;
            this.numberOfOccurences++;
        }
        public void iterateReviewOccurences(){this.reviewOccurences ++;}
        public int getReviewOccurences(){return reviewOccurences;}

        /*
        print to screen: [average score, number of occurences]
         */
        public String toString() {
            return "Word " + word + " [" + totalScore / numberOfOccurences +", " + numberOfOccurences+"]";
        }
    }


    }





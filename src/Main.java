import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        try {
            Reviews r1 = new Reviews();

            r1.readReviews("movieReviews.txt");
//            System.out.println(r1.getH().toString(100));
            System.out.println("Enter a review!");
            Scanner input = new Scanner(System.in);
            String userReview = input.nextLine();
            double userReviewTotalScore = 0;
            String[] words = userReview.split("\\s+");
            for (String word : words) {
                if (r1.getH().contains(word)) {
                    if (r1.getWordInfoReviewOccurences(word) / r1.getTotalReviews() < .1){
                        userReviewTotalScore += r1.getWordInfoAvg(word);

                    }
                }
            }
            System.out.println("REVIEW: " + userReview);
            double userReviewAvgScore = userReviewTotalScore / words.length;
            System.out.printf("The review has an average value of %.2f \n", (userReviewAvgScore));
            if (userReviewAvgScore <= 1.75) System.out.println("Negative");
            if (userReviewAvgScore < 1.75 && userReviewAvgScore > 2.25) System.out.println("Neutral");
            if (userReviewAvgScore >= 2.25) System.out.println("Positive");


//            System.out.println(r1);


        } catch (IOException e) {
            e.printStackTrace();
        }

//        WordInfo w = new WordInfo("fat");
//        w.update(4);
//        System.out.println(w.toString());


    }
    public String describeReview(double actualScore){
        if (actualScore < 1.75){return "Negative";}
        if (actualScore > 1.75 && actualScore < 2.25){return "Neutral";}
        return "Positive";
    }


}
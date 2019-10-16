import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main{
    // Simple main
    public static void main (String [ ] args ) throws FileNotFoundException, IOException
    {
        Reviews reviews = new Reviews();
        reviews.readReviews("movieReview");


//        QuadraticProbingHashTable<WordInfo> H = new QuadraticProbingHashTable<>( );
//
//
//        BufferedReader in = new BufferedReader(new FileReader("movieReview.txt"));
//
//        String line;
//
//        while ((line = in.readLine()) != null){
////            System.out.println(line);
//            String[] wordsInLine = line.split(" ");
//            for (String word : wordsInLine){
//                System.out.println(word);
//            }
//        }
//        System.out.println(H.size());













//        long startTime = System.currentTimeMillis( );
//
//        final int NUMS = 2000000;
//        final int GAP  =   37;
//
//        System.out.println( "Checking... (no more output means success)" );


//        for( int i = GAP; i != 0; i = ( i + GAP ) % NUMS )
//            H.insert( ""+i );

//        for( int i = GAP; i != 0; i = ( i + GAP ) % NUMS )
//            if( H.insert( ""+i ) )
//                System.out.println( "OOPS!!! " + i );
//        for( int i = 1; i < NUMS; i+= 2 )
//            H.remove( ""+i );
//
//        for( int i = 2; i < NUMS; i+=2 )
//            if( !H.contains( ""+i ) )
//                System.out.println( "Find fails " + i );
//
//        for( int i = 1; i < NUMS; i+=2 )
//        {
//            if( H.contains( ""+i ) )
//                System.out.println( "OOPS!!! " +  i  );
//        }
//
//        long endTime = System.currentTimeMillis( );
//
//        System.out.println( "Elapsed time: " + (endTime - startTime) );
//        System.out.println( "H size is: " + H.size( ) );
//        System.out.println( "Array size is: " + H.capacity( ) );
    }

}
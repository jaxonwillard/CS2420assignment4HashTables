import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    // Simple main
    public static void main( String [ ] args ) throws FileNotFoundException, IOException
    {
        QuadraticProbingHashTable<String> H = new QuadraticProbingHashTable<>( );

        BufferedReader in = new BufferedReader(new FileReader("movieReview.txt"));

        String line;

        while ((line = in.readLine()) != null){
//            System.out.println(line);
            String[] wordsInLine = line.split(" ");
            for (String word : wordsInLine){
                WordInfo wordInfo = new WordInfo(word);
                Integer eight = 8;
                if (!H.contains(wordInfo.getWord())){ }
            }
        }
        System.out.println(H.size());




//        long startTime = System.currentTimeMillis( );
//
//        final int NUMS = 2000000;
//        final int GAP  =   37;
//
//        System.out.println( "Checking... (no more output means success)" );
//
//
//        for( int i = GAP; i != 0; i = ( i + GAP ) % NUMS )
//            H.insert( ""+i );
//        for( int i = GAP; i != 0; i = ( i + GAP ) % NUMS )
//            if( H.insert( ""+i ) )
//                System.out.println( "OOPS!!! " + i );
//        for( int i = 1; i < NUMS; i+= 2 )
//            H.remove( ""+i );

//        for( int i = 2; i < NUMS; i+=2 )
//            if( !H.contains( ""+i ) )
//                System.out.println( "Find fails " + i );

//        for( int i = 1; i < NUMS; i+=2 )
//        {
//            if( H.contains( ""+i ) )
//                System.out.println( "OOPS!!! " +  i  );
//        }

//        long endTime = System.currentTimeMillis( );
//
//        System.out.println( "Elapsed time: " + (endTime - startTime) );
//        System.out.println( "H size is: " + H.size( ) );
//        System.out.println( "Array size is: " + H.capacity( ) );
//        System.out.println(H.find("109"));
//        H.insert("109");
//        System.out.println(H.find("109"));
//        H.remove("109");
//        System.out.println(H.find("109"));
//        System.out.println(H.toString(10));
    }

}
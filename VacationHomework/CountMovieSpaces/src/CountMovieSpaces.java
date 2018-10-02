public class CountMovieSpaces {
    public int numberOfSpaces ( String movieQuote , char theCharThatHasToBeChecked ){
        char [] text = movieQuote.toCharArray();
        int counter = 0 ;
        for ( int i = 0 ; i < text.length ; i++){
            if ( text[i] == theCharThatHasToBeChecked){
                counter ++ ;
            }
        }
        return counter;
    }

    public int numberOfSpacesOfAQuoteFromUser ( String movieQuote , char theCharThatHasToBeChecked ){
        char [] text = movieQuote.toCharArray();
        int counter = 0 ;
        for ( int i = 0 ; i < text.length ; i++){
            if ( text[i] == theCharThatHasToBeChecked){
                counter ++ ;
            }
        }
        return counter;
    }
}

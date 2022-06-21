import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;


public class TDDConcept {
    @Test
    public void testMovieBase() {
        Movie movie = new Movie();
        assertNotEquals(movie.getFirstMovieTitle(), movie.getSecondMovieTile());
    }
}

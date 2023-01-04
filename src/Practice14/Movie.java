package Practice14;

public class Movie {

    final String movie_name;
    final String Release_date;
    float rate;
    String Genre;
    static int movie_counter;
    static final int RatingForOscar = 9;

    public Movie(String movie_name, String release_date, float rate, String genre) {
        this.movie_name = movie_name;
        this.Release_date = release_date;
        this.rate = rate;
        this.Genre = genre;
        ++movie_counter;
    }

    public String toString() {
        return "Movie{movie_name='" + this.movie_name + "', Release_date='" + this.Release_date + "', rate=" + this.rate + ", Genre='" + this.Genre + "'}";
    }

    public void resetCounter() {
        movie_counter = 0;
    }

    public boolean isWonOscar() {
        if (this.rate <= 9.0F) {
            System.out.println("didnt win");
            return false;
        } else {
            System.out.println("won");
            return true;
        }
    }
}

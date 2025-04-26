import java.time.Year;
import java.util.Date;

public final class Rating {
    private int id;
    private Year year;
    private char Rating;

    public Rating(int id, Year year, char rating) {
        this.id = id;
        this.year = year;
        Rating = rating;
    }

    public int getId() {
        return id;
    }

    public Year getYear() {
        return year;
    }

    public char getRating() {
        return Rating;
    }

    @Override
    public String toString() {
        return "Rating{" +
                "id=" + id +
                ", year=" + year +
                ", Rating=" + Rating +
                '}';
    }
}

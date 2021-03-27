package movierating.models;

public class Review {

    public final User user;
    public final int rating;

    public Review(User user, int rating) {
        this.user = user;
        this.rating = rating;
    }

    public User getUser() {
        return user;
    }

    public int getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Review{" +
                "user=" + user +
                ", rating=" + rating +
                '}';
    }


}

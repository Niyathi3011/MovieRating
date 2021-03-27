package movierating.models;

public class Review {

    private final User user;
    private final int rating;

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

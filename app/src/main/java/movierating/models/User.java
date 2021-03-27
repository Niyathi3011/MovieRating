package movierating.models;

public class User {
    private final String userName;
    private int totalReviews;
    private UserType userType;

    public User(String userName) {
        this.userName = userName;
        this.totalReviews = 0;
        this.userType = UserType.VIEWER;
    }

    public String getUserName() {
        return userName;
    }

    public UserType getUserType() {
        return userType;
    }

    public void incrementTotalReviewsAndPromoteUserType() {
        this.totalReviews++;
        if (this.totalReviews == 3) {
            this.userType = UserType.CRITIC;
            System.out.println(getUserName() + "is promoted to critic");
        }
    }


    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", noOfReviews=" + totalReviews +
                ", userType=" + userType +
                '}';
    }

}

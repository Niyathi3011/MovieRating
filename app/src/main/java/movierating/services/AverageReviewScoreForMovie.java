package movierating.services;

import movierating.models.Movie;
import movierating.repositories.MovieRepository;

public class AverageReviewScoreForMovie {

    private final MovieRepository movieRepository;

    public AverageReviewScoreForMovie(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public int getAverageReviewScoreByYear(int releaseYear){

        int reviewScore=0,count=0;
        for(Movie movie : movieRepository.getMovies().values()){
            if(movie.getReleaseYear()==releaseYear){
                count+=movie.getReviewList().size();
                reviewScore+=movie.getTotalReviewScore();
            }
        }

        return reviewScore/count;
    }
}

package movierating.testcases;

import movierating.models.MovieTestCase;
import movierating.models.ReviewTestCase;
import movierating.models.UserTestCase;

import java.util.ArrayList;
import java.util.List;

public class MovieRatingTestCases {

     public static List<MovieTestCase> getMovieTestCases(){

         List<MovieTestCase> movieTestCaseList =new ArrayList<>();

         movieTestCaseList.add(new MovieTestCase("Don",2006, "Action"));
         movieTestCaseList.add(new MovieTestCase("Tiger",2008, "Drama"));
         movieTestCaseList.add(new MovieTestCase("Padmaavat",2006, "Comedy"));
         movieTestCaseList.add(new MovieTestCase("LunchBox",2021, "Drama"));
         movieTestCaseList.add(new MovieTestCase("Metro",2006, "Romance"));

         return movieTestCaseList;
     }

     public static List<UserTestCase> getUserTestCases(){
         List<UserTestCase> userTestCaseList = new ArrayList<>();
         userTestCaseList.add(new UserTestCase("SRK"));
         userTestCaseList.add(new UserTestCase("Salman"));
         userTestCaseList.add(new UserTestCase("Deepika"));

         return userTestCaseList;
     }

     public static List<ReviewTestCase> getReviewTestCases(){

         List<ReviewTestCase> reviewTestCaseList=new ArrayList<>();
         reviewTestCaseList.add(new ReviewTestCase("SRK","Don",2));
         reviewTestCaseList.add(new ReviewTestCase("SRK","Padmaavat",8));
         reviewTestCaseList.add(new ReviewTestCase("Salman","Don",5));
         reviewTestCaseList.add(new ReviewTestCase("Deepika","Don",9));
         reviewTestCaseList.add(new ReviewTestCase("SRK","Don",10));
         return reviewTestCaseList;

     }
}

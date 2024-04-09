package com.microservice.review.service;

import com.core.microservicecore.core.Review.Review;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ReviewService {
    public List<Review> getProductReview() {
        return new ArrayList<>(
                List.of(
                        new Review(1,1,"Himanshu","Quality","Awesome","House no 1 Dubai"),
                        new Review(1,2,"Harshit","Quality","Nice","House no 2 Dubai"))
        );
    }
}

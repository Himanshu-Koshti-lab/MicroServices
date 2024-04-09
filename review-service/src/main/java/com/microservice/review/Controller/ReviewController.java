package com.microservice.review.Controller;

import com.core.microservicecore.core.Review.Review;
import com.microservice.review.service.ReviewService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ReviewController {

    ReviewService reviewService;

    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @GetMapping("getProductReview")
    public List<Review> getProductReview(){
        return reviewService.getProductReview();
    }
}

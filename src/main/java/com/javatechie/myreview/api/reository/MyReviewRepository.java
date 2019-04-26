package com.javatechie.myreview.api.reository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javatechie.myreview.api.model.Review;

public interface MyReviewRepository extends JpaRepository<Review, Integer>{

}

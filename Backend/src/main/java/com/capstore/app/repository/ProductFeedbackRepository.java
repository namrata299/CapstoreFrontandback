package com.capstore.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capstore.app.models.ProductFeedback;


@Repository
public interface ProductFeedbackRepository extends JpaRepository<ProductFeedback, Integer> {

}

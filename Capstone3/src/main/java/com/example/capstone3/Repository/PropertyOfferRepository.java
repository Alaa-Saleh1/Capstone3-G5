package com.example.capstone3.Repository;

import com.example.capstone3.Model.PropertyOffer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PropertyOfferRepository extends JpaRepository<PropertyOffer, Integer> {
}

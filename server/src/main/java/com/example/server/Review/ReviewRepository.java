package com.example.server.Review;
import com.example.server.User.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ReviewRepository  extends JpaRepository<Review, Long> {
    @Query("select r from Review r where r.user= ?1")
    Optional<Review> findByUserId(Long id);
}
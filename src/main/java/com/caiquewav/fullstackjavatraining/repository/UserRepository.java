package com.caiquewav.fullstackjavatraining.repository;

import com.caiquewav.fullstackjavatraining.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

package com.api.kakeibo_api.repo;

import com.api.kakeibo_api.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
    /**
     * Repository which finds User by Username.
     * Other methods are within the JPA repository extension
     * @param Username
     * @return
     */
    User findByUsername(String Username);
}

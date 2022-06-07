package com.api.kakeibo_api.repo;

import com.api.kakeibo_api.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepo extends JpaRepository<Role, Long> {
    /**
     * Repository which finds User by Username.
     * Other methods are within the JPA repository extension
     * @param name
     * @return Role
     */
    Role findByName(String name);
}

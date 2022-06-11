package com.api.kakeibo_api.service;

import com.api.kakeibo_api.domain.Role;
import com.api.kakeibo_api.domain.User;
import com.api.kakeibo_api.repo.RoleRepo;
import com.api.kakeibo_api.repo.UserRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service @RequiredArgsConstructor @Transactional @Slf4j
public class UserServiceImplementation implements UserService {
    private final UserRepo userRepo;
    private final RoleRepo roleRepo;
//    private final PasswordEncoder passwordEncoder;
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        User user = userRepo.findByUsername(username);
//        if(user == null) {
//            log.error("user not found in database");
//            throw new UsernameNotFoundException("user not found database");
//        } else {
//            log.info("user was found in database: {}", username);
//        }
//        Collection<SimpleGrantedAuthority> authorities = new ArrayList<>();
//        user.getRole().forEach(
//            role -> { authorities.add(new SimpleGrantedAuthority(role.getName()));
//        });
//        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), authorities);
//    }

    @Override
    public User saveUser(User user) {
        log.info("Saving New User {}", user.getFirst_name());
//        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepo.save(user);
    }

    @Override
    public User getUser(String username) {
        log.info("Getting User");
        return userRepo.findByUsername(username);
    }

    @Override
    public Role saveRole(Role role) {
        log.info("Saving New Role {}", role.getName());
        return roleRepo.save(role);
    }

    @Override
    public void addRoleToUser(String username, String roleName) {
        log.info("Adding Role {} to User {}", roleName, username);
        User user = userRepo.findByUsername(username);
        Role role = roleRepo.findByName(roleName);
        user.getRole().add(role);
    }

    @Override
    public List<User> getAllUsers() {
        log.info("fetching all users");
        return userRepo.findAll();
    }

//    @Override
//    public Page<User> getPageOfUsers(Pageable pageOfUsers) {
//        log.info("fetching a page of users");
//        return userRepo.findPageOfUsers(pageOfUsers);
//    }
}

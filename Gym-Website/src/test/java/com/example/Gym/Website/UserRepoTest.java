package com.example.Gym.Website;

import com.example.Gym.Website.pojo.User;
import com.example.Gym.Website.repo.UserRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class UserRepoTest {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private TestEntityManager entityManager;

    @Test
    public void testFindByUserEmail() {
        // Prepare test data
        User user = new User();
        user.setUsername("testUser");
        user.setUserEmail("test@example.com");
        user.setPassword("testPassword");
        entityManager.persist(user);

        // Perform repository method
        List<User> foundUsers = userRepo.findByUserEmail("test@example.com");

        // Assert the result
        assertThat(foundUsers).hasSize(1);
        assertThat(foundUsers.get(0).getUsername()).isEqualTo("testUser");
    }

    // Add more test methods for other scenarios...
}

package es.remoran.dev.springboot2intro.repo;

import es.remoran.dev.springboot2intro.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import static org.assertj.core.api.Assertions.*;

@DataJpaTest
public class UserRepoTest {

    @Autowired
    private TestEntityManager testEntityManager;

    @Autowired
    private UserRepository userRepository;

    @Test
    public void findByUsername_HappyPath_ShouldReturn1User() throws Exception {
        // Given
        User user = new User();
        user.setUsername("shazin");
        user.setPassword("shaz980");
        user.setRole("USER");
        testEntityManager.persist(user);
        testEntityManager.flush();

        // When
        User actual = this.userRepository.findByUsername("shazin");

        // Then
        assertThat(actual).isEqualTo(user);
    }

    @Test
    public void save_HappyPath_ShouldSave1User() throws Exception {
        // Given
        User user = new User();
        user.setUsername("shazin");
        user.setPassword("shaz980");
        user.setRole("USER");

        // When
        User actual = this.userRepository.save(user);

        //Then
        assertThat(actual).isNotNull();
        assertThat(actual.getId()).isNotNull();
    }
}

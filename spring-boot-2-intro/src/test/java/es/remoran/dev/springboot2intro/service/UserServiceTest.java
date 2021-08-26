package es.remoran.dev.springboot2intro.service;

import es.remoran.dev.springboot2intro.model.User;
import es.remoran.dev.springboot2intro.repo.UserRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.test.context.junit4.SpringRunner;
import static org.mockito.Mockito.*;
import static org.assertj.core.api.Assertions.*;

@RunWith(SpringRunner.class)
public class UserServiceTest {

    @MockBean
    private UserRepository userRepository;

    private UserService userService;

    @Before
    public void init() {
        this.userService = new UserService(userRepository);
    }

    @Test
    public void getAllCommentsForToday_HappyPath_ShouldReturn1Comment() {
        // Given
        User user = new User();
        user.setUsername("shazin");
        user.setPassword("sha908");
        user.setRole("USER");
        when(userRepository.findByUsername("shazin")).thenReturn(user);

        // When
        UserDetails actual = userService.loadUserByUsername("shazin");

        // Then
        verify(userRepository, times(1)).findByUsername("shazin");
    }
}

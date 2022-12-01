package sesac.mohaji.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sesac.mohaji.domain.User;
import sesac.mohaji.repository.UserRepository;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
public class UserService {

    private final UserRepository userRepository;

    public void signup(User user) {
        userRepository.save(user);
    }
    
    public Optional login(String id, String password) {
        return userRepository.findByIdAndPassword(id, password);
    }
}

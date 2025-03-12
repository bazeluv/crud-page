package crud.portfolio.service;

import java.time.Instant;
import java.util.UUID;

import org.springframework.stereotype.Service;

import crud.portfolio.controller.CreateUserDTO;
import crud.portfolio.entity.User;
import crud.portfolio.repository.UserRepository;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UUID createUser(CreateUserDTO createUserDTO) {

        // transformar o dto em entity

        var entity = new User(UUID.randomUUID(),
                createUserDTO.username(),
                createUserDTO.description(),
                Instant.now(),
                null);

        var userSaved = userRepository.save(entity);

        return userSaved.getUserId();
    }
}


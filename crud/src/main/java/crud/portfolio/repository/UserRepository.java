package crud.portfolio.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import crud.portfolio.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {
}
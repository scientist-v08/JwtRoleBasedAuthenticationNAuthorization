package scientist.v08.jwtspringsecurity.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import scientist.v08.jwtspringsecurity.entity.OurUsers;

public interface OurUsersRepository extends JpaRepository<OurUsers, Integer> {
    Optional<OurUsers> findByEmail(String email);
}

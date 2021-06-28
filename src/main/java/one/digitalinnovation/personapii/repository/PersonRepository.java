package one.digitalinnovation.personapii.repository;

import one.digitalinnovation.personapii.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}

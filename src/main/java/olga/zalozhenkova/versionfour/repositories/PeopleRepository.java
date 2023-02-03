package olga.zalozhenkova.versionfour.repositories;

import olga.zalozhenkova.versionfour.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeopleRepository extends JpaRepository<Person, Integer> {

}
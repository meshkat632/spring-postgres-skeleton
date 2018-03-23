package org.acme.springpostgresskeleton.repository;


import org.acme.springpostgresskeleton.model.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GreetingRepository extends JpaRepository<Greeting, Long> {

}

package edu.devoteam.geo.repository;

import edu.devoteam.geo.domain.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.Optional;

//@RepositoryRestResource(collectionResourceRel = "country", path = "country")
public interface CountryRestRepository extends JpaRepository<Country, Long> {

    //@RestResource(path = "name")
    Optional<Country> findCountriesByNameContaining(String name);
}

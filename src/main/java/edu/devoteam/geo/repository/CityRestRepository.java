package edu.devoteam.geo.repository;

import edu.devoteam.geo.domain.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRestRepository extends JpaRepository<City, Long> {
}

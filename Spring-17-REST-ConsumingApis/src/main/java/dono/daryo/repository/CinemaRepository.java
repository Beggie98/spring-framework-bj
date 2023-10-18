package dono.daryo.repository;

import dono.daryo.entity.Cinema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CinemaRepository extends JpaRepository<Cinema, Long> {

    // ------------------- DERIVED QUERIES ------------------- //

    //Write a derived query to get cinema with a specific name

    Cinema findByName(String name);

    //Write a derived query to read sorted the top 3 cinemas that contains a specific sponsored name

    List<Cinema> findTop3BySponsoredName(String sponsoredName);

    //Write a derived query to list all cinemas in a specific country

    List<Cinema> findByLocation_Country(String country);

    //Write a derived query to list all cinemas with a specific name or sponsored name

    List<Cinema> findByNameOrSponsoredName(String name, String sponsoredName);


    // ------------------- JPQL QUERIES ------------------- //

    //Write a JPQL query to read the cinema name with a specific id

    @Query("SELECT c FROM Cinema c WHERE c.id = ?1")
    Cinema getCinema(Long id);


    // ------------------- Native QUERIES ------------------- //

    //Write a native query to read all cinemas by location country

//    @Query(value = "SELECT * FROM CINEMA c INNER JOIN LOCATION l ON l.cinema_id = c.location_id WHERE l.country = ?1", nativeQuery = true)
//    List<Cinema> getCinemaCountry(String country);


    //Write a native query to read all cinemas by name or sponsored name contains a specific pattern

    @Query(value = "SELECT * FROM CINEMA WHERE NAME LIKE %:pattern% OR SPONSORED_NAME LIKE %:pattern%", nativeQuery = true)
    List<Cinema> getCinemaByNameOrSponsoredNameContaining(@Param("pattern") String pattern);

    //Write a native query to sort all cinemas by name

    @Query(value = "SELECT * FROM CINEMA ORDER BY NAME", nativeQuery = true)
    List<Cinema> sortCinemaByName();

    //Write a native query to distinct all cinemas by sponsored name

    @Query(value = "SELECT * FROM CINEMA ORDER BY SPONSORED_NAME", nativeQuery = true)
    List<Cinema> getDistinctBySponsoredName();


}

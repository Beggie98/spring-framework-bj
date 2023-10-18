package dono.daryo.repository;

import dono.daryo.entity.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GenreRepository extends JpaRepository<Genre, Long> {

    // ------------------- JPQL QUERIES ------------------- //

    //Write a JPQL query that return all genres
//    @Query("SELECT g FROM Genre g")
//    List<Genre> getAllGenres();


    // ------------------- Native QUERIES ------------------- //

    //Write a native query that returns genres by containing name


}

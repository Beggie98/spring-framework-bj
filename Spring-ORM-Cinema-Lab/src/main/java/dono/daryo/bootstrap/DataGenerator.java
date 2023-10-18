package dono.daryo.bootstrap;

import dono.daryo.repository.AccountDetailsRepository;
import dono.daryo.repository.CinemaRepository;
import dono.daryo.repository.GenreRepository;
import dono.daryo.repository.MovieCinemaRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataGenerator implements CommandLineRunner {

    private final AccountDetailsRepository accountDetailsRepository;
    private final CinemaRepository cinemaRepository;
    private final GenreRepository genreRepository;
    private final MovieCinemaRepository movieCinemaRepository;

    public DataGenerator(AccountDetailsRepository accountDetailsRepository, CinemaRepository cinemaRepository, GenreRepository genreRepository, MovieCinemaRepository movieCinemaRepository) {
        this.accountDetailsRepository = accountDetailsRepository;
        this.cinemaRepository = cinemaRepository;
        this.genreRepository = genreRepository;
        this.movieCinemaRepository = movieCinemaRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("---------------- ACCOUNT START ------------------");

//        System.out.println(accountRepository.findByCountryAndState("United States", "New York"));

//        System.out.println(accountDetailsRepository.findByAgeLessThanEqual(35));

        System.out.println("---------------- ACCOUNT END ------------------");

        System.out.println("---------------- CINEMA START ------------------");

        System.out.println("----------------- DERIVED QUERY -------------------");

        System.out.println(cinemaRepository.findByName("Hall 3 - STREET 14"));

        System.out.println("------------------------------------");

        cinemaRepository.findTop3BySponsoredName("PlayStation").forEach(System.out::println);

        System.out.println("------------------------------------");

        cinemaRepository.findByLocation_Country("United States").forEach(System.out::println);

        System.out.println("------------------------------------");

        cinemaRepository.findByNameOrSponsoredName("Hall 3 - EMPIRE", "MySpace").forEach(System.out::println);

        System.out.println("----------------- JPQL -------------------");

        System.out.println(cinemaRepository.getCinema(10l));

        System.out.println("----------------- NATIVE QUERIES -------------------");

//        cinemaRepository.getCinemaCountry("United States").forEach(System.out::println);

        System.out.println("---------------------------------------------");

        cinemaRepository.getCinemaByNameOrSponsoredNameContaining("STREET").forEach(System.out::println);

        System.out.println("---------------------------------------------");

        cinemaRepository.sortCinemaByName().forEach(System.out::println);

        System.out.println("---------------- CINEMA END ------------------");

        System.out.println("---------------- GENRE START ------------------");

//        genreRepository.getAllGenres().forEach(System.out::println);

        System.out.println("---------------------------------------------");

        System.out.println("---------------- GENRE END ------------------");

        System.out.println("---------------- MOVIECINEMA START ------------------");

        System.out.println(movieCinemaRepository.findById(10l));

        System.out.println("------------------------------------------------------");


        System.out.println("---------------- MOVIECINEMA END ------------------");


    }
}

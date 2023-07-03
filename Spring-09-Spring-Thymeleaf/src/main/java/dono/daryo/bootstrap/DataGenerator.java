package dono.daryo.bootstrap;

import com.github.javafaker.Faker;
import dono.daryo.model.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataGenerator {

    public static List<Student> createStudent(){

        List<Student> students = Arrays.asList(
                new Student(new Faker().name().firstName(),new Faker().name().lastName(),new Faker().number().numberBetween(20,50),new Faker().address().state()),
                new Student(new Faker().name().firstName(),new Faker().name().lastName(),new Faker().number().numberBetween(20,50),new Faker().address().state()),
                new Student(new Faker().name().firstName(),new Faker().name().lastName(),new Faker().number().numberBetween(20,50),new Faker().address().state()),
                new Student(new Faker().name().firstName(),new Faker().name().lastName(),new Faker().number().numberBetween(20,50),new Faker().address().state()),
                new Student(new Faker().name().firstName(),new Faker().name().lastName(),new Faker().number().numberBetween(20,50),new Faker().address().state())
        );

        return students;

    }

}

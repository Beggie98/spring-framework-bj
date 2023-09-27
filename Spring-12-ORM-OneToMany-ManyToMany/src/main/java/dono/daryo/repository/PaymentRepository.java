package dono.daryo.repository;

import dono.daryo.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {

    //query

    // method --- > sql ---> derive query   findById(int id) -> select * from payment where id = ...

//    List<Payment> getAllBy

    // sql query - @Query

    //JPQL - Java Persistence Query Language - @Query



}

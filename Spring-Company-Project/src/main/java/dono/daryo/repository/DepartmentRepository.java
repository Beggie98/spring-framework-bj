package dono.daryo.repository;

import dono.daryo.entity.Department;
import dono.daryo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

    //Display all departments in the furniture deparment
    List<Department> findByDepartment(String department);

    //Display all departments in the Health Division
    List<Department> findByDivisionEquals(String division);
    List<Department> findByDivisionIs(String division);

    //Display top 3 departments with division name includes 'Hea' without duplicates
    List<Department> findDistinctTop3ByDivisionContains(String pattern);

    @Query("SELECT d FROM Department d WHERE d.division IN ?1")
    List<Department> getDepartmentDivision(List<String> division);

    List<Department> retrieveDepartmentByDivision(String division);

    @Query(nativeQuery = true)
    List<Department> retrieveDepartmentByDivisionContain(@Param("pattern") String pattern);

}

package dono.daryo.bootstrap;

import dono.daryo.entity.Department;
import dono.daryo.entity.Employee;
import dono.daryo.entity.Region;
import dono.daryo.enums.Gender;
import dono.daryo.repository.DepartmentRepository;
import dono.daryo.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class DataGenerator implements CommandLineRunner {

    EmployeeRepository employeeRepository;
//    DepartmentRepository departmentRepository;


    public DataGenerator(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void run(String... args) throws Exception {


        List<Employee> employeeList = new ArrayList<>();
        List<Department> departmentList = new ArrayList<>();

        Employee employee1 = new Employee("Barrie","Manueau","bmanueau@dion.ne.jp", LocalDate.of(2006,04,20), Gender.FEMALE,154864);
        Employee employee2 = new Employee("Aeriell","McNee","amcnee1@google.es", LocalDate.of(2009,01,26),Gender.FEMALE, 56752);
        Employee employee3 = new Employee("Sydeny","Symonds","ssymonds2@hhs.gov",LocalDate.of(2010,05,17),Gender.FEMALE,95313);
        Employee employee4 = new Employee("Avrom","Rowantree",null,LocalDate.of(2014,03,02),Gender.MALE,119764);
        Employee employee5 = new Employee("Feliks","Morffew","fmorffew4@a8.net",LocalDate.of(2003,01,14),Gender.MALE,55307);

        Department department1 = new Department("Sports","Outdoors");
        Department department2 = new Department("Tools","Hardware");
        Department department3 = new Department("Clothing","Home");
        Department department4 = new Department("Phones & Tablets","Electronics");
        Department department5 = new Department("Computers","Electronics");

        Region region1 = new Region("Southwest","United States");
        Region region2 = new Region("Central","United States");
        Region region3 = new Region("Northwest","United States");
        Region region4 = new Region("Quebec","Canada");
        Region region5 = new Region("Central","Asia");


        employee1.setDepartment(department1);
        employee2.setDepartment(department2);
        employee3.setDepartment(department3);
        employee4.setDepartment(department4);
        employee5.setDepartment(department5);

        employee1.setRegion(region1);
        employee2.setRegion(region2);
        employee3.setRegion(region3);
        employee4.setRegion(region4);
        employee5.setRegion(region5);


        employeeList.addAll(Arrays.asList(employee1,employee2,employee3,employee4,employee5));
        departmentList.addAll(Arrays.asList(department1,department2,department3,department4,department5));

        employeeRepository.saveAll(employeeList);
//        departmentRepository.saveAll(departmentList);


    }
}

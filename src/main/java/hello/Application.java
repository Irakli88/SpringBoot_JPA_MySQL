package hello;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.dao.StudentRepository;
import com.dao.TeachersRepository;
import com.model.Student;
import com.model.Teacher;

@SpringBootApplication
@EnableJpaRepositories(basePackages = { "com.dao" })
@EntityScan(basePackages = "com.model")
public class Application implements CommandLineRunner {

	/*
	 * @Autowired CustomerRepository repository;
	 */

	@Autowired
	StudentRepository studentDao;
	@Autowired
	TeachersRepository teachersDao;

	public static void main(String[] args) {
		SpringApplication.run(Application.class);
	}

	@Override
	public void run(String... strings) throws Exception {

		/*Student student = studentDao.findOne(5L);
		System.out.println(student);
		System.out.println("Name: " + student.getName() + "; Age: " + student.getAge());*/
		
		/*for (Student std : studentDao.findAll()) {
			System.out.println(std);
		}*/
			
		
		/*for (Student std : studentDao.findByName("Ira*")) {
			System.out.println(std);
		}*/
		
		
		List<Student> students = new ArrayList<Student>();
		for (int i = 0; i < 10; i++) {
			Student s = new Student(23L + i, "Test name " + i, new Date(), "admin");
			students.add(s);
		}
		studentDao.save(students);
		
		
		List<Teacher> teachers = new ArrayList<Teacher>();
		for (int i = 0; i < 10; i++) {
			Teacher t = new Teacher("Marina", "Tsomaia", "Math teacher", new Date(), "admin");
			teachers.add(t);
		}
		teachersDao.save(teachers);
		/*
		 * // save a couple of customers repository.save(new Customer("Jack",
		 * "Bauer")); repository.save(new Customer("Chloe", "O'Brian"));
		 * repository.save(new Customer("Kim", "Bauer")); repository.save(new
		 * Customer("David", "Palmer")); repository.save(new
		 * Customer("Michelle", "Dessler")); repository.save(new
		 * Customer("Irakli", "Tsomaia"));
		 * 
		 * 
		 * // fetch all customers
		 * System.out.println("Customers found with findAll():");
		 * System.out.println("-------------------------------"); for (Customer
		 * customer : repository.findAll()) { System.out.println(customer); }
		 * System.out.println();
		 * 
		 * // fetch an individual customer by ID Customer customer =
		 * repository.findOne(1L);
		 * System.out.println("Customer found with findOne(1L):");
		 * System.out.println("--------------------------------");
		 * System.out.println(customer); System.out.println();
		 * 
		 * // fetch customers by last name
		 * System.out.println("Customer found with findByLastName('Bauer'):");
		 * System.out.println("--------------------------------------------");
		 * for (Customer bauer : repository.findByLastName("Bauer")) {
		 * System.out.println(bauer); }
		 * 
		 * // fetch customers by first name
		 * System.out.println("Customer found with findByFirstName('Irakli'):");
		 * System.out.println("--------------------------------------------");
		 * for (Customer bauer : repository.findByFirstName("Irakli")) {
		 * System.out.println(bauer); }
		 */
	}

}

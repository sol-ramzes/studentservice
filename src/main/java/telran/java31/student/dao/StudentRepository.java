package telran.java31.student.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;

import com.mongodb.connection.Stream;

import telran.java31.student.model.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {
	
java.util.stream.Stream<Student>findByName(String name);
}

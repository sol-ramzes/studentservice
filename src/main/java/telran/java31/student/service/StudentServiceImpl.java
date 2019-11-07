package telran.java31.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import telran.java31.student.dao.StudentRepository;
import telran.java31.student.dto.ScoreDto;
import telran.java31.student.dto.StudentDto;
import telran.java31.student.dto.StudentNotFoundException;
import telran.java31.student.dto.StudentResponseDto;
import telran.java31.student.dto.StudentUpdateDto;
import telran.java31.student.model.Student;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepository;

	@Override
	public boolean addStudent(StudentDto studentDto) {
		
		if (!studentRepository.existsById(studentDto.getId()) ) {
			Student student = new Student(studentDto.getId(),
					studentDto.getName(), studentDto.getPassword());
			studentRepository.save(student);
			return true;
		}else {
			return false;
		}
	}

	@Override
	public StudentResponseDto deleteStudent(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StudentResponseDto findStudent(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StudentDto editStudent(Integer id, StudentUpdateDto studentUpdateDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addScore(Integer id, ScoreDto scoreDto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<StudentResponseDto> findStudentsByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

//	@Override
//	public StudentResponseDto deleteStudent(Integer id) {
//		Student student = studentRepository.remove(id);
//		return studentToStudentResponseDto(student);
//	}

//	@Override
//	public StudentResponseDto findStudent(Integer id) {
//		Student student = studentRepository.findById(id);
//		return studentToStudentResponseDto(student);
//	}

//	private StudentResponseDto studentToStudentResponseDto(Student student) {
//		return new StudentResponseDto(student.getId(),
//				student.getName(), student.getScores());
//	}

//	@Override
//	public StudentDto editStudent(Integer id, StudentUpdateDto studentUpdateDto) {
//		Student student = studentRepository.findById(id);
//		if (studentUpdateDto.getName() != null) {
//			student.setName(studentUpdateDto.getName());
//		}
//		if (studentUpdateDto.getPassword() != null) {
//			student.setPassword(studentUpdateDto.getPassword());
//		}
//		studentRepository.update(student);
//		return studentToStudentDto(student);
//	}

//	private StudentDto studentToStudentDto(Student student) {
//		return StudentDto.builder()
//				.id(student.getId())
//				.name(student.getName())
//				.password(student.getPassword())
//				.build();
//	}

//	@Override
//	public boolean addScore(Integer id, ScoreDto scoreDto) {
//		Student student = studentRepository.findById(id);
//		if(student == null) {
//			throw new StudentNotFoundException(id);
//		}
//		boolean res = student.addScore(scoreDto.getExamName(), scoreDto.getScore()); 
//		studentRepository.update(student);
//		return res;
//	}

}

package in.lakshay.service;


import org.springframework.data.domain.Page;

import in.lakshay.entity.Student;  

public interface IStudentService {  

	Long createStudent(Student student);  
	Student findOneStudent(Long id);  
	void deleteOneStudent(Long id);  
	void updateStudent(Student student); 
	int updateStudentName(String sname, Long sid);
	Page<Student> findStudentsWithPagination(int page, int size); 
}


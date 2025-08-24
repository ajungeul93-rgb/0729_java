package practice2.student.controller;

import java.util.ArrayList;
import java.util.List;

import practice2.modle.vo.Student;

public class StudentController {
	
	List<Student> students = new ArrayList();
	
	public boolean addStudent(String name, int kor, int eng, int math) {
		
		try {
			Student stu = new Student(name, kor, eng, math);
			students.add(stu);
			return true;
		} catch(Exception e) {
			return false;
		}
		
	}

	public List<Student> getAllStudents() {
		
		return students;
	}

	public String getStudentScore(String name) {
		
		for(Student stu : students) {
			if(stu.getName().equals(name)) {
				int sum = stu.getKor() + stu.getEng() + stu.getMath();
				double average = sum / 3.0;
				
				return String.format("%s의 총점은 %d점, 평균은 %.2f점 입니다.", stu.getName(), sum, average );
			}
		}
		
		return null;
	}

}

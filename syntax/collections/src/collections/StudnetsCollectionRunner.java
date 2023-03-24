package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class DescendingStudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student student1, Student student2) {
	return Integer.compare(student2.getId(), student1.getId());
    }

}

public class StudnetsCollectionRunner {

    public static void main(String[] args) {

	List<Student> students = List.of(new Student(1, "Hanee"),
					new Student(30, "Sorrel"),
					new Student(15 , "Jiyou"));

	List<Student> studentAl = new ArrayList<>(students);

	System.out.println(studentAl);

	Collections.sort(studentAl);
	System.out.println("오름차순: " + studentAl);

	Collections.sort(studentAl, new DescendingStudentComparator());
	System.out.println("내림차순: " + studentAl);

	System.out.println();

	studentAl.sort(new DescendingStudentComparator());
	System.out.println("내림차순: " + studentAl);

    } //main
}

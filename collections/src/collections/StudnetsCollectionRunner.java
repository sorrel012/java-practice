package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudnetsCollectionRunner {

    public static void main(String[] args) {

	List<Student> students = List.of(new Student(1, "Hanee"),
					new Student(30, "Sorrel"),
					new Student(15 , "Jiyou"));

	List<Student> studentAl = new ArrayList<>(students);

	System.out.println(studentAl);

	Collections.sort(studentAl);
	System.out.println(studentAl);

    } //main
}

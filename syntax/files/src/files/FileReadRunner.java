package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReadRunner {
	public static void main(String[] args) throws IOException {

		Path pathFileToRead = Paths.get("./resources/data.txt");

//		List<String> lines = Files.readAllLines(pathFileToRead);
//		System.out.println(lines);

		Files.lines(pathFileToRead).filter(str -> str.contains("s")).forEach(System.out::println);
		System.out.println();

		Files.lines(pathFileToRead).map(String::toUpperCase).forEach(System.out::println);

	}
}

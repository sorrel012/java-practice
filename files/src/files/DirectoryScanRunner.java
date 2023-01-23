package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryScanRunner {
	public static void main(String[] args) throws IOException {
		Path currentDirectory = Paths.get(".");

//		Files.list(currentDirectory).forEach(System.out::println); //파일, 디렉토리 탐색

//		Files.walk(currentDirectory, 4).forEach(System.out::println); // 파일,디렉토리 깊이 설정하여 탐색

//		Files.walk(currentDirectory, 4).filter(path -> String.valueOf(path).contains(".java")) // 파일 골라내기
//				.forEach(System.out::println);

		Files.find(currentDirectory, 4, (path, attributes) -> String.valueOf(path).contains(".java"))// 파일 골라내기
				.forEach(System.out::println);
	}
}

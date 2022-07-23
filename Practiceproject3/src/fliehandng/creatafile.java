package fliehandng;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class creatafile {

	public static void main(String[] args) throws IOException {
		createFileUsingFileClass();
		createFileUsingFileOutputStreamClass();
		createFileIn_NIO();
	}

	private static void createFileUsingFileClass() throws IOException {
		File f1 = new File("E:\\JAVAFSD\\java-fsd-assistedprojects-\\f1.txt");
		if (f1.createNewFile()) {
			System.out.println("File is created!");
		} else {
			System.out.println("File already exists.");
		}
		FileWriter w = new FileWriter(f1);
		w.write("Shakti tiwari");
		w.close();
	}

	private static void createFileUsingFileOutputStreamClass() throws IOException {
		String data = "Test data";
		FileOutputStream out = new FileOutputStream("E:\\JAVAFSD\\java-fsd-assistedprojects-\\f2.txt");
		out.write(data.getBytes());
		out.close();
	}

	private static void createFileIn_NIO() throws IOException {
		String data = "shree ram";
		Files.write(Paths.get("E:\\JAVAFSD\\java-fsd-assistedprojects-\\f3.txt"), data.getBytes());
		List<String> lines = Arrays.asList("1st line", "2nd line");
		Files.write(Paths.get("f6.txt"), lines, StandardCharsets.UTF_8, StandardOpenOption.CREATE,
				StandardOpenOption.APPEND);
	}

}

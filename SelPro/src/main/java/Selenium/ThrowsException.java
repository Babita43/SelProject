package Selenium;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsException {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		FileError();
	}

	static void FileError() throws FileNotFoundException {
		System.out.println("Start the program");
		String path = "C://Users//bavia//Downloads/abc.txt";
		File file = new File(path);
		FileReader i = new FileReader(file);
		System.out.println("End the program");
	}

}

package com.test.composition;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) {
		Employee c = new Employee("Suresh", "E123", new Department());
		File outFile = new File("employee.ser");
		try {
			FileOutputStream fs = new FileOutputStream(outFile);
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(c);
			os.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

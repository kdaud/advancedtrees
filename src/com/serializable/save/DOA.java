package com.serializable.save;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class DOA {
	
	public void dosave() throws IOException {
		Student obj = new Student();
		obj.setStudentId(10);
		obj.setName("Daud Kakumirizi");
		obj.setCourse("Software Engineering");
		
		//saving the state of an object in the file
		File file = new File("student.txt");
		FileOutputStream outputStream= new FileOutputStream(file);
		ObjectOutputStream objectOutputStream=new ObjectOutputStream(outputStream);
		objectOutputStream.writeObject(obj);
	}
	
}

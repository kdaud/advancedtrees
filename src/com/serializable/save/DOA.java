package com.serializable.save;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DOA {
	
	static {
		System.out.println("From DAO Class");
	}
	
	public static void dosave() throws IOException, Exception {
		Student obj = new Student();
		obj.setStudentId(10);
		obj.setName("Daud Kakumirizi");
		obj.setCourse("Software Engineering");
		
		Student obf = new Student();
		obf.setStudentId(14);
		obf.setName("Gama Richard");
		obf.setCourse("Computer Science");
		
		//saving the state of an object in the file
		File file = new File("student.txt");
		FileOutputStream outputStream= new FileOutputStream(file);
		ObjectOutputStream objectOutputStream=new ObjectOutputStream(outputStream);
		objectOutputStream.writeObject(obj);
		objectOutputStream.writeObject(obf);
		
		//retrieving the data from the file
		FileInputStream fileInputStream= new FileInputStream(file);
		ObjectInputStream objectInputStream= new ObjectInputStream(fileInputStream);
		Student objs = (Student) objectInputStream.readObject();
		System.out.println(objs.getName() + "\n" + objs.getCourse() + "\n" + objs.getStudentId());
		System.out.println(obf.getName() + "\np " + obf.getCourse());
	}
	
}

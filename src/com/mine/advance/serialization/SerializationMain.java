package com.mine.advance.serialization;

import java.io.*;

public class SerializationMain {

    public static void main(String[] args) {
        Student ali = new Student("ali", 12, new Address("islamabad", "pakistan"));

        // Create stream and write the object
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("file.txt");

            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(ali);
            objectOutputStream.flush();
            objectOutputStream.close();

            System.out.println("WRITING DONE");

            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("file.txt"));

            Student s = (Student) objectInputStream.readObject();
            System.out.println(s.getName() + " | " + s.getAge());


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package com.mine.oopConcepts.staticKeyword;

public class Student {

    private static String college;
    public static int studentCounter;

    private String name;
    private String id;

    static {
        college = "ICB";
        studentCounter = 0;
    }

    public Student(String name, String id) {
        this.name = name;
        this.id = id;

        studentCounter++;
    }

    public static int getNumberOfStudents() {
        return studentCounter;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", college='" + college + '\'' +
                '}';
    }

    static class NestedStudent {

        @Override
        public String toString() {
            System.out.println("College in inner class :: " + college);
            return super.toString();
        }
    }
}

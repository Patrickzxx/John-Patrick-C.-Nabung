package MyObjectProject;

public class MyMainClass {
    public static void main(String[] args) {
        Person adviser = new Person("Ireneo", "David", "Seraspe");
        Person s1 = new Person("John", "Patrick", "Nabung");
        Person s2 = new Person("John", "Carl", "Nabung");
        Person s3 = new Person("Jemarc", "Barboza", "Garcia");
        Person s4 = new Person("justine", "Carl", "Oaing");
        Person s5 = new Person("Michael", "David", "Wilson");

        Section section = new Section("PRECISION", adviser, s1, s2, s3, s4, s5);

        System.out.println("Section Name: " + section.getSectionName());
        System.out.println("Adviser: " + section.getAdviserTeacher().fullName());
        System.out.println("Student 1: " + section.getStudent1().fullName());
        System.out.println("Student 2: " + section.getStudent2().fullName());
        System.out.println("Student 3: " + section.getStudent3().fullName());
        System.out.println("Student 4: " + section.getStudent4().fullName());
        System.out.println("Student 5: " + section.getStudent5().fullName());
    }
}

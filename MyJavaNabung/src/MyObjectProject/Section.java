package MyObjectProject;

public class Section {
    private String sectionName;
    private Person adviserTeacher;
    private Person student1;
    private Person student2;
    private Person student3;
    private Person student4;
    private Person student5;

    public Section(String sectionName, Person adviserTeacher,
                   Person student1, Person student2, Person student3,
                   Person student4, Person student5) {

        this.sectionName = sectionName;
        this.adviserTeacher = adviserTeacher;
        this.student1 = student1;
        this.student2 = student2;
        this.student3 = student3;
        this.student4 = student4;
        this.student5 = student5;
    }

    public String getSectionName() {
        return sectionName;
    }

    public Person getAdviserTeacher() {
        return adviserTeacher;
    }

    public Person getStudent1() {
        return student1;
    }

    public Person getStudent2() {
        return student2;
    }

    public Person getStudent3() {
        return student3;
    }

    public Person getStudent4() {
        return student4;
    }

    public Person getStudent5() {
        return student5;
    }
}

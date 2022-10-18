public class Main {
    public static void main(String[] args) {
        System.out.println("My first maven project");

        Student student = new Student();
        student.getAge();
//        student.setAge(12);

//        Student student1 = new Student("Mark", 20);
        Student student2 = Student.builder().name("Mark").build();
        Student student3 = Student.builder().age(12).build();
        Student student4 = Student.builder().age(12).name("Mark").schoolName("MIT").build();
    }
}

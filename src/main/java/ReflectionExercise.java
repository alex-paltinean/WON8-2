import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class ReflectionExercise {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

        Student student = Student.builder().age(23).build();
        Field age = Student.class.getDeclaredField("age");
        age.setAccessible(true);
        age.set(student, 14);
        System.out.println(student.getAge());

        MyFirstAnnotation annotation = Student.class.getAnnotation(MyFirstAnnotation.class);
        System.out.println(annotation.flag());
    }
}

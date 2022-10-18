import lombok.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@EqualsAndHashCode
@MyFirstAnnotation(flag = false)
public class Student {
    @MyFirstAnnotation
    private String name;
    private int age;
    private String schoolName;
    private int maxGrade;
    private int newField;

    @MyFirstAnnotation
    public void doSomething() {

    }
}

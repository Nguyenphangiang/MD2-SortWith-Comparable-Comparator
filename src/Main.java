import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Giang",28,"HN");
        Student student1 = new Student("Tuan",27,"HN");
        Student student2 = new Student("Chau",29,"HN");
        Student student3 = new Student("Long",26,"NA");

        List<Student> list = new ArrayList<>();
        list.add(student);
        list.add(student1);
        list.add(student2);
        list.add(student3);
        Collections.sort(list);
        for (Student st : list){
            System.out.println(st.toString());
        }
        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(list,ageComparator);
        System.out.println("So Sanh Theo Tuổi: ");
        for (Student st : list){
            System.out.println(st.toString());
        }
    }
}

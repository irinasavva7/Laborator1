import java.util.ArrayList;

public class University {
    String name;
    int foundationYear;
    ArrayList <Student> students = new ArrayList<>();

    double notaMedie() {
        int studentsNumber = students.size();
        double notaMedie = 0;

        for (int i = 0; i < studentsNumber; i++){
            notaMedie += this.students.get(i).mark;
        }
        notaMedie /= studentsNumber;
        return notaMedie;
    }
}

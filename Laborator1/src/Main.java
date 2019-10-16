public class Main {

    public static void main(String[] args) {

        Monitor monitor1 = new Monitor(50, 100);
        Monitor monitor2 = new Monitor(55, 90);

        if (monitor1.height > monitor2.height) {
            System.out.println("Monitor 1 has the height greater than Monitor 2");
        } else {
            System.out.println("The height of the Monitor 2 si greater");
        }

        University UTM = new University();
        University MIT = new University();
        University Medicina = new University();

        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();

        student1.mark = 8.02;
        student2.mark = 9.60;
        student3.mark = 8.59;

        UTM.students.add(student1);
        UTM.students.add(student2);
        Medicina.students.add(student3);
        MIT.students.add(student4);

        double media = (UTM.notaMedie() + Medicina.notaMedie() + MIT.notaMedie())/3;
        System.out.println("Media: " + media);
    }
}


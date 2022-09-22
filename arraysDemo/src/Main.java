public class Main {

    public static void main(String[] args) {
        String student1 = "Emir";
        String student2 = "Fatih";
        String student3 = "Yusuf";

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

        System.out.println("---------------------");

        String[] students = new String[3];
        students[0] = "Emir";
        students[1] = "Fatih";
        students[2] = "Yusuf";

        for(int i=0; i<students.length; i++) {
            System.out.println(students[i]);
        }

        System.out.println("---------------------");

        for(String student:students) {
            System.out.println(student);
        }

    }
}
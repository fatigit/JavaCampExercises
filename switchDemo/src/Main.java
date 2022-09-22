public class Main {
    public static void main(String[] args) {
        char grade = 'A';

        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Great");
                break;
            case 'C':
                System.out.println("Good");
                break;
            case 'D':
                System.out.println("Not bad");
                break;
            case 'F':
                System.out.println("You failed");
                break;
            default:
                System.out.println("You entered an invalid letter grade");

        }
    }
}
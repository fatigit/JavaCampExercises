public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[] {1,2,5,7,9,0};
        int search = 5;
        boolean isItExists = false;

        for(int number:numbers) {
            if(number==search) {
                isItExists = true;
                break;
            }
        }

        if (isItExists) {
            System.out.println("This number is exists");
        }else{
            System.out.println("This number is not exists!");
        }
    }
}
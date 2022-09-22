public class Main {
    public static void main(String[] args) {
        String message = "Weather is great today.";
        System.out.println(message);

        //character number of our message
        System.out.println("Character number: " + message.length());

        //printing the character in the specified index
        System.out.println("5. character: " + message.charAt(4));

        //adding a new instant sentence to our message
        System.out.println(message.concat(" I am happy!"));

        //which character does our message begin or end with
        System.out.println(message.startsWith("W"));
        System.out.println(message.endsWith("."));

        //print the sentence up to the specified order
        char[] characters = new char[7];
        message.getChars(0,7,characters,0);
        System.out.println(characters);

        //show that the specified element is in the order in which it escaped
        System.out.println(message.indexOf('a'));
        System.out.println(message.lastIndexOf("e"));

        //replace new character to selected character
        String newMessage = message.replace(' ', '-');
        System.out.println(newMessage);

        //substring = getting a fragment from a text
        System.out.println(message.substring(5, 15));

        //split = breaking the text into parts. We just divided for spaces
        for (String word : message.split(" ")) {
            System.out.println(word);
        }

        //to lowercase and uppercase
        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());

        //if we have spaces into our message, it trims and prints reformatted version
        System.out.println(message.trim());
    }
}
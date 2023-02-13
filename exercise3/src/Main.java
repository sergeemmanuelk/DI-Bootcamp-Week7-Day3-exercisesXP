public class Main {
    public static void main(String[] args) {
        String word = "HIPPOPOTAMUS";
        StringBuilder reversedWord = new StringBuilder(word);
        reversedWord = reversedWord.reverse();

        System.out.println("The word 'HIPPOPOTAMUS' backwards is: " + reversedWord);
    }
}
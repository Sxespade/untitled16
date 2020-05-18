package lesson3.Task2.stack;

public class Main {
    public static void main(String[] args) {
        String s = "adebop";
        Stack<Character> stack = new StackImpl<>(s.length());

        StringBuilder reverseWord = reversMethod(s, stack);
        System.out.println(reverseWord);
    }

    private static StringBuilder reversMethod(String s, Stack<Character> stack) {
        for (char wordChar : s.toCharArray()) {
            stack.push(wordChar);
        }
        StringBuilder reverseWord = new StringBuilder();
        while (!stack.isEmpty()) {
            reverseWord.append(stack.pop());
        }
        return reverseWord;
    }
}

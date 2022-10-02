import java.util.Stack;

public class StackStructure {
    public static void main(String[] args) {
        // Stack is LIFO (Last In First Out) Vertical structure

        Stack<String> books = new Stack<>();

        books.push("book 1");
        books.push("book 2");
        books.push("book 3");
        books.push("book 4");
        books.push("book 5");

        books.pop();

        // GEt the top item
        System.out.println(books.peek());

        System.out.println(books.search("book 4"));

        System.out.println(books.size());
    }
}

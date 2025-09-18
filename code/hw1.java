import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // пустой вектор 
        ArrayList<Integer> stack = new ArrayList<>();
        
        // внедряем переменные 1 2 3 в стек
        stack.add(1);      
        stack.add(2);      
        stack.add(3);
        
        // выводим переменные стека
        System.out.print("Переменные стека: ");
        for (int i = 0; i < stack.size(); i++) {
            System.out.print(stack.get(i) + " ");
        }
        System.out.println();
    }

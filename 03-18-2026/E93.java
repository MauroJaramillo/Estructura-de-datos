import java.util.Stack;

public class E93 {
    public static boolean estaBalanceado(String expresion) {
        Stack<Character> pila = new Stack<>();
        for (char c : expresion.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                pila.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (pila.isEmpty())
                    return false;

                char tope = pila.pop();
                if ((c == ')' && tope != '(') ||
                        (c == '}' && tope != '{') ||
                        (c == ']' && tope != '[')) {
                    return false;
                }
            }
        }
        return pila.isEmpty();
    }

    public static void main(String[] args) {
        String exp = "((a+b)*5) - 7";

        if (estaBalanceado(exp)) {
            System.out.println("Expresión balanceada");
        } else {
            System.out.println("Expresión NO balanceada");
        }
    }
}
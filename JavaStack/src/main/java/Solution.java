
import java.util.Scanner;
import java.util.Stack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Elvin Aliyev
 */
public class Solution {

    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String input = sc.next();
            Stack<Character> stacky = new Stack<>();
            for (int i = 0; i < input.length(); i++) {
                if (!stacky.isEmpty()) {
                    switch (input.charAt(i)) {
                        case '}':
                            if (stacky.peek() == '{') {
                                stacky.pop();
                            }
                            break;
                        case ']':
                            if (stacky.peek() == '[') {
                                stacky.pop();
                            }
                            break;
                        case ')':
                            if (stacky.peek() == '(') {
                                stacky.pop();
                            }
                            break;
                        default:
                            stacky.push(input.charAt(i));
                    }
                } else {
                    stacky.push(input.charAt(i));
                }
            }
            System.out.println(stacky.isEmpty());
        }

    }
}

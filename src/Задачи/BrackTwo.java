package Задачи;

import java.util.Arrays;
import java.util.List;

public class BrackTwo {
    static String areBracketsBalanced(String expr) {

        StringBuilder stringBuilder1 = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder();
        int count = 0;
        for (int i = 0; i < expr.length(); i++) {
            char c = expr.charAt(i);

            if (c == '(') {
                if (expr.substring(i).contains("" + ')')) {
                    stringBuilder1.append(c);
                    count++;
                }
            }

            if (c == ')' && count > 0) {
                stringBuilder1.append(c);
                count--;
            }

            if (count == 0) {
                stringBuilder2.append(stringBuilder1);
                stringBuilder1.setLength(0);
            }

            if (count > 0 && i == expr.length() - 1) {
                while (count > 0) {
                    stringBuilder1.deleteCharAt(stringBuilder1.indexOf("("));
                    count--;
                }
                stringBuilder2.append(stringBuilder1);
            }

            if (count < 0 && i == expr.length() - 1) {
                while (count < 0) {
                    stringBuilder1.deleteCharAt(stringBuilder1.indexOf(")"));
                    count--;
                }
                stringBuilder2.append(stringBuilder1);
            }
        }
        return stringBuilder2.length() + " - " + stringBuilder2;
    }

//    static boolean allCharactersSame(String s) {
//        int n = s.length();
//        for (int i = 1; i < n; i++)
//            if (s.charAt(i) != s.charAt(0))
//                return false;
//        return true;
//    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("(()", ")()())", ")(()())", ")(", "())(()())(()");
        for (String s : list) {
            System.out.println("Input string " + s + ", REZULT = " + areBracketsBalanced(s));
        }
    }
}
//    bool balanced(const std::string &s) {
//        std::stack<char> stack;
//        for (char c : s) {
//            switch (c) {
//
//                case '(': stack.push(')'); break;
//                case '[': stack.push(']'); break;
//                case '{': stack.push('}'); break;
//                case '<': stack.push('>'); break;
//
//                case ')':
//                case ']':
//                case '}':
//                case '>':
//                    if (stack.empty() || stack.top() != c) {
//                        return false;
//                    }
//                    stack.pop();
//                    break;
//                default:
//                    break;
//            }
//        }
//        return stack.empty();
//    }
//
//    void test(const std::string& s) {
//        std::cout << '"' << s << "" " << (balanced(s) ? "yes" : "no") << '\n';
//    }
//
//    int main() {
//        test("");
//        test("a(b[c]d)e");
//        test("a(b[c)d]e");
//        test("a(b[c]d");
//        test("b[c]d)e");
//    }

//    вот метод где уже нет символов кроме скобок
//    public boolean isValid(String s) {
//        Stack<Character> stack = new Stack<>();
//        if(s.length() % 2 != 0) {
//            return false;
//        }
//
//        for (int i = 0; i < s.length(); i++) {
//            if(s.charAt(i) == '('  s.charAt(i) == '['  s.charAt(i) == '{') {
//                stack.push(s.charAt(i));
//                continue;
//            }
//
//            if(stack.empty()) {
//                return false;
//            }
//            Character buf = stack.pop();
//            if(!(s.charAt(i) == ')' && buf == '('
//            s.charAt(i) == ']' && buf == '['
//            s.charAt(i) == '}' && buf == '{')) {
//                return false;
//            }
//        }
//
//        return stack.empty();
//    }


/**bool balanced(const std::string &s) {
 std::stack<char> stack;
 for (char c : s) {
 switch (c) {

 case '(': stack.push(')'); break;
 case '[': stack.push(']'); break;
 case '{': stack.push('}'); break;
 case '<': stack.push('>'); break;

 case ')':
 case ']':
 case '}':
 case '>':
 if (stack.empty() || stack.top() != c) {
 return false;
 }
 stack.pop();
 break;
 default:
 break;
 }
 }
 return stack.empty();
 }

 void test(const std::string& s) {
 std::cout << '"' << s << "" " << (balanced(s) ? "yes" : "no") << '\n';
 }

 int main() {
 test("");
 test("a(b[c]d)e");
 test("a(b[c)d]e");
 test("a(b[c]d");
 test("b[c]d)e");
 }
 [16:44]
 Используйте стек двигаясь по строке слева на право. Когда приходит открывающая скобка, поместите соответствующую закрывающую скобку в стек. Когда приходит закрывающая скобка сравните её с вершиной стека и удалите вершину. В конце не забудьте проверить что стек пуст:
 [16:46]
 если видишь( помещаешь в стек )
 [16:46]
 вот суть
 [16:46]
 case '(': stack.push(')'); break;*/
package hw12;
/*Написать метод `String reverse(String s) {...}`.

Входящий параметр: s - строка которая состоит из слов через пробел

Метод должен вернуть слова в обратном порядке

Пример:

"man has dog" => "dog has man"
*/

public class Main {
    public static String reverse(String message) {
        String[] strings = message.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = strings.length - 1; i >= 0; i--) {
            sb.append(strings[i] + " ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        String message  = "man has dog";
        System.out.println(message);
        message = reverse(message);
        System.out.println(message);
    }
}

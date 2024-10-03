public class ejercicio8 {
    public static void main(String[] args) throws Exception {
        char char1, char2, char3, char4, char5;
        char1 = '*';
        char2 = 'º';
        char3 = '?';
        char4 = '!';
        char5 = '-';
        String string1 = Character.toString(char1);
        string1 = string1 + Character.toString(char2);
        string1 = string1 + Character.toString(char3);
        string1 = string1 + Character.toString(char4);
        string1 = string1 + Character.toString(char5);
        System.out.println(string1);
    }
}

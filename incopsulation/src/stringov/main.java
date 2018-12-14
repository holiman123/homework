package stringov;

public class main {
    public static void main(String[] args) {
        String text = "ИИИПривет, меня зовут Даниил. Я понятия не имею что мне написать!";
        char ch = 'и';
        text = text.toLowerCase();
        for (int i = 0; i < text.length(); i++) {
            if((text.charAt(i)) == ch) {
                System.out.println(i);
            }
        }
    }
}

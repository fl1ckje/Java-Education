package DataTypes;

public class DataTypes {
    public DataTypes() {
        boolean isActive = true;
        isActive = false;

        byte a = 3;
        short b = 8;
        int c = 4;
        long d = 10;
        double e = 2.7f;
        float f = 3.14f;
        char g = 'g';

        System.out.println(isActive);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);

        char fSymbol = 102;
        String text = "Hello...";

        System.out.println(fSymbol);
        System.out.println(text);

        String textWithNewLine = "\nWorld!";

        System.out.println(textWithNewLine);

        String sumOfStrings = "First word!\n" + "Second word!\n" + "Third word!";

        System.out.println(sumOfStrings);

        String multilineTextBlock = """
                My list of languages, which I learned to junior level:
                [*] C#
                [*] Kotlin
                [*] Java
                [*] Python
                [*] Rust
                """;

        System.out.println(multilineTextBlock);
    }
}

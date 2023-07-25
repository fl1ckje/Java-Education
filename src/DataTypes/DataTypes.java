package DataTypes;

import static java.lang.System.out;

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

        out.println(isActive);
        out.println(a);
        out.println(b);
        out.println(c);
        out.println(d);
        out.println(e);
        out.println(f);
        out.println(g);

        char fSymbol = 102;
        String text = "Hello...";

        out.println(fSymbol);
        out.println(text);

        String textWithNewLine = "\nWorld!";

        out.println(textWithNewLine);

        String sumOfStrings = "First word!\n" + "Second word!\n" + "Third word!";

        out.println(sumOfStrings);

        String multilineTextBlock = """
                My list of languages, which I learned to junior level:
                [*] C#
                [*] Kotlin
                [*] Java
                [*] Python
                [*] Rust
                """;

        out.println(multilineTextBlock);
    }
}

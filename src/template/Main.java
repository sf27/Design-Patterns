package template;

public class Main {

    public static void main(String[] args) {

        Parser lexical = new ParserLexical();

        Parser syntactic = new ParserSyntactic();

        Parser semantic = new ParserSemantic();

        lexical.execute();

        syntactic.execute();

        semantic.execute();
    }
}

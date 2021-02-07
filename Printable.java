package markup;

public interface Printable {
    void toMarkdown(StringBuilder stringBuilder);
    void toTex(StringBuilder stringBuilder);
}
package markup;
import java.util.List;

public class Emphasis extends Markup {
    public Emphasis(List<Printable> content) {
        super(content);
    }

    @Override
    public void toMarkdown(StringBuilder stringBuilder) {
        super.toMarkdown(stringBuilder, "*");
    }
    @Override
    public void toTex(StringBuilder stringBuilder) {
        super.toTex(stringBuilder, "\\emph{", "}");
    }
}
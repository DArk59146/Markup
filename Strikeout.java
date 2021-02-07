package markup;
import java.util.List;

public class Strikeout extends Markup {
    public Strikeout(List<Printable> content) {
        super(content);
    }

    @Override
    public void toMarkdown(StringBuilder stringBuilder) {
        super.toMarkdown(stringBuilder, "~");
    }
    @Override
    public void toTex(StringBuilder stringBuilder) {
        super.toTex(stringBuilder, "\\textst{", "}");
    }
}
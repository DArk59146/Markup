package markup;
import java.util.List;

public class Strong extends Markup {
    public Strong(List<Printable> content) {
        super(content);
    }

    @Override
    public void toMarkdown(StringBuilder stringBuilder) {
        super.toMarkdown(stringBuilder, "__");
    }
    @Override
    public void toTex(StringBuilder stringBuilder) {
        super.toTex(stringBuilder, "\\textbf{", "}");
    }
}

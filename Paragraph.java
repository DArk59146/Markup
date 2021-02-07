package markup;
import java.util.List;

public class Paragraph implements TeXable, ItemOfListItem {
    protected List<Printable> content;

    public Paragraph(List<Printable> content) {
        this.content = content;
    }

    public void toMarkdown(StringBuilder stringBuilder) {
        for (Printable item : content) {
            item.toMarkdown(stringBuilder);
        }
    }

    public void toTex(StringBuilder stringBuilder) {
        for (Printable item : content) {
            item.toTex(stringBuilder);
        }
    }
}

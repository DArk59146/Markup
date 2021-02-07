package markup;
import java.util.List;

public abstract class Markup implements Printable {
    protected List<Printable> content;

    public Markup(List<Printable> content) {
        this.content = content;
    }

    public void toMarkdown(StringBuilder stringBuilder, String markMark) {
        stringBuilder.append(markMark);
        for (Printable item : content) {
            item.toMarkdown(stringBuilder);
        }
        stringBuilder.append(markMark);
    }

    public void toTex(StringBuilder stringBuilder, String markTeXOpen, String markTeXClose) {
        stringBuilder.append(markTeXOpen);
        for (Printable item : content) {
            item.toTex(stringBuilder);
        }
        stringBuilder.append(markTeXClose);
    }
}

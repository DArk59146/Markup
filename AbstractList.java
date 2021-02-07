package markup;

import java.util.List;

public abstract class AbstractList implements TeXable, ItemOfListItem {
    protected List<ListItem> content;

    public AbstractList(List<ListItem> content) {
        this.content = content;
    }

    public void toTex(StringBuilder stringBuilder, String markTeXOpen, String markTeXClose) {
        stringBuilder.append(markTeXOpen);
        for (ListItem item : content) {
            item.toTex(stringBuilder);
        }
        stringBuilder.append(markTeXClose);
    }
}

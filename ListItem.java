package markup;

import java.util.List;

public class ListItem implements TeXable {
    protected List<ItemOfListItem> content;

    public ListItem(List<ItemOfListItem> content) {
        this.content = content;
    }

    public void toTex(StringBuilder stringBuilder) {
        stringBuilder.append("\\item ");
        for (ItemOfListItem item : content) {
            item.toTex(stringBuilder);
        }
    }
}
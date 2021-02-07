package markup;

import java.util.List;

public class OrderedList extends AbstractList {
    public OrderedList(List<ListItem> content) {
        super(content);
    }
    @Override
    public void toTex(StringBuilder stringBuilder) {
        super.toTex(stringBuilder, "\\begin{enumerate}", "\\end{enumerate}");
    }
}
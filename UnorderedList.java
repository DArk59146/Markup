package markup;

import java.util.List;

public class UnorderedList extends AbstractList {
    public UnorderedList(List<ListItem> content) {
        super(content);
    }
    @Override
    public void toTex(StringBuilder stringBuilder) {
        super.toTex(stringBuilder, "\\begin{itemize}", "\\end{itemize}");
    }
}
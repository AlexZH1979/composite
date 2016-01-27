package ru.yandex.zhmyd;

/**
 * Created by USER on 27.01.2016.
 */
public class HtmlBulderUtil {

    private HtmlBulderUtil() {
    }

    public static String buildHtml(Tag tag) {
        StringBuilder sb = new StringBuilder();

        getTagName(tag, sb);
        return sb.toString();
    }

    private static void getTagName(Tag tag, StringBuilder sb) {
        sb.append("<").append(tag.getName()).append(">\n");
        for (Tag child : tag.getChilds()) {
            getTagName(child, sb);
        }
        sb.append("</").append(tag.getName()).append(">\n");

    }
}

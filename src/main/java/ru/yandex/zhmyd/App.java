package ru.yandex.zhmyd;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Tag html = new Tag("html");
        Tag body = new Tag("body");
        Tag head = new Tag("head");
        Tag title = new Tag("title");
        Tag h1 = new Tag("h1");
        Tag img =new Tag("img");
        Tag p1 = new Tag("p");
        Tag p2 = new Tag("p");
        Tag button = new Tag("button");

        Tag b = new TagBody();

        List<Tag> htmlChild = html.getChilds();
        htmlChild.add(head);
        htmlChild.add(body);

        List<Tag> headChild = head.getChilds();
        headChild.add(title);

        List<Tag> bodyChild = body.getChilds();
        bodyChild.add(h1);
        bodyChild.add(p1);

        bodyChild.add(b);
        String s = HtmlBulderUtil.buildHtml(html);

        System.out.println(s);

    }
}

package ru.yandex.zhmyd;

import java.util.ArrayList;
import java.util.List;

public class Tag {
    private final String name;

    private final List<Tag> childs = new ArrayList<Tag>();

    public Tag(){
        name = "";
    }
    public Tag(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Tag> getChilds() {
        return childs;
    }

    @Override
    public String toString() {
        return name;
    }
}

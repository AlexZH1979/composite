package ru.yandex.zhmyd;

/**
 * Created by USER on 27.01.2016.
 */
public class TagBody extends Tag{
    private final String name = "body";

    public TagBody() {
    }

    @Override
    public  String getName(){
        return name;
    }
}

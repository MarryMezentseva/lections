package lect2Plushki.singleton;

import java.util.Set;

public class SingApp {
    public static void main(String[] args) {
        Set<Color> colors1 = AwailableColors.getInstance();
        colors1.add(new Color("black"));
        Set<Color> colors2 = AwailableColors.getInstance();
        Set<Color> colors3 = AwailableColors.getInstance();
        System.out.println();
    }
}

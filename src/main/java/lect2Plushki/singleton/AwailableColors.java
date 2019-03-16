package lect2Plushki.singleton;

import java.util.*;

public class AwailableColors {

    private static Set<Color> colors;

    private AwailableColors() {
    }

    public static Set<Color> getInstance(){
        if (Objects.isNull(colors)){
            colors = new HashSet<>(Arrays.asList(
                    new Color("red"),
                    new Color("green"),
                    new Color("blue")));

            return colors;
        }else {
            return colors;
        }
    }
}

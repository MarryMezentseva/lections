package lect3TestNg;

public interface Transformer {
    DefinedUser convert(User user);
    int getUserHash(User user);
}

package lect3TestNg;

import java.util.Date;
import java.util.UUID;

public class TransformerImpl implements Transformer {

    @Override
    public DefinedUser convert(User user){
        DefinedUser definedUser = new DefinedUser();
        definedUser.setUuid(UUID.randomUUID());
        definedUser.setConvertedDate(new Date());
        definedUser.setFullName(user.getId() +" " + user.getName() + " " + user.getDescription());
        return definedUser;
    }

    @Override
    public int getUserHash(User user) {
        return (user.getId() + user.getDescription() + user.getName()).length();
    }
}

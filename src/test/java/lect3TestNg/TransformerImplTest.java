package lect3TestNg;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.IOUtils;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import static org.testng.Assert.*;

public class TransformerImplTest {

    private static final String JSON_FILE = "testUsers.json";
    private static final String CSV_FILE = "testHash.csv";
    private Transformer sut;

    @BeforeClass
    public void setUp() {
        sut = new TransformerImpl();
    }

    @Test(dataProvider = "userProvider")
    public void testConvert(User user) {
        DefinedUser definedUser = sut.convert(user);
        assertNotNull(definedUser.getConvertedDate());
        assertNotNull(definedUser.getFullName());
        assertNotNull(definedUser.getUuid());
        assertTrue(new Date().compareTo(definedUser.getConvertedDate()) >= 0);
    }

    @Test(dataProvider = "hashUserProvider")
    public void testHash(User user, Integer expectedResult) throws IOException {
        Integer hash = sut.getUserHash(user);
        assertEquals(expectedResult, hash);
    }

    @DataProvider(name = "userProvider")
    public Object[][] getProvider() throws IOException {
        List<User> users = getUsersFromJson();
        Object[][] objects = new Object[users.size()][1];
        for (int i = 0; i < users.size(); i++) {
            User user = users.get(i);
            objects[i][0] = user;
        }
        return objects;
    }

    @DataProvider(name = "hashUserProvider")
    public Object[][] getHashUserProvider() throws IOException {
        InputStream is = TransformerImplTest.class.getResourceAsStream(CSV_FILE);
        String lines = IOUtils.toString(is, "UTF-8");
        String[] strings = lines.split("\n");

        List<String> stringList = Arrays.stream(strings)
                .filter(s -> s.split(",")[3].equalsIgnoreCase("true"))
                .collect(Collectors.toList());

        Object[][] objects = new Object[stringList.size()][2];

        for (int i = 0; i < stringList.size(); i++) {
            String line = stringList.get(i);
            String[] params = line.split(",");
            Integer id = Integer.valueOf(params[0]);
            String name = params[1];
            String desc = params[2];
            Integer exp = Integer.valueOf(params[4].trim());
            User user = new User(id, name, desc);

            objects[i][0] = user;
            objects[i][1] = exp;
        }

        return objects;
    }

    private List<User> getUsersFromJson() throws IOException {
        InputStream is = TransformerImplTest.class.getResourceAsStream(JSON_FILE);
        return new ObjectMapper().readValue(is, new TypeReference<List<User>>() {
        });
    }


}
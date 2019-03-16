package lect3TestNg;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

import static org.testng.Assert.*;

public class TransformerImplTest {
    private static final String JSON_FILE = "testUsers.json";
    private List<User> users;
    private Transformer sut;

    @BeforeClass
    public void setUp() throws IOException {
        sut = new TransformerImpl();
        InputStream is = TransformerImplTest.class.getResourceAsStream(JSON_FILE);
        users = new ObjectMapper().readValue(is, new TypeReference<List<User>>() {
        });
    }

    @Test
    public void testConvert_1() {
        User user = users.get(0);
        DefinedUser definedUser = sut.convert(user);
        assertNotNull(definedUser.getConvertedDate());
        assertNotNull(definedUser.getFullName());
        assertNotNull(definedUser.getUuid());
        assertTrue(new Date().compareTo(definedUser.getConvertedDate()) >= 0);
    }

    @Test
    public void testConvert_2() {
        User user = users.get(1);
        DefinedUser definedUser = sut.convert(user);
        assertNotNull(definedUser.getConvertedDate());
        assertNotNull(definedUser.getFullName());
        assertNotNull(definedUser.getUuid());
        assertTrue(new Date().compareTo(definedUser.getConvertedDate()) >= 0);
    }

    @Test
    public void testConvert_3() {
        User user = users.get(2);
        DefinedUser definedUser = sut.convert(user);
        assertNotNull(definedUser.getConvertedDate());
        assertNotNull(definedUser.getFullName());
        assertNotNull(definedUser.getUuid());
        assertTrue(new Date().compareTo(definedUser.getConvertedDate()) >= 0);
    }

    @Test
    public void testConvert_4() {
        User user = users.get(3);
        DefinedUser definedUser = sut.convert(user);
        assertNotNull(definedUser.getConvertedDate());
        assertNotNull(definedUser.getFullName());
        assertNotNull(definedUser.getUuid());
        assertTrue(new Date().compareTo(definedUser.getConvertedDate()) >= 0);
    }

    @Test
    public void testConvert_5() {
        User user = users.get(4);
        DefinedUser definedUser = sut.convert(user);
        assertNotNull(definedUser.getConvertedDate());
        assertNotNull(definedUser.getFullName());
        assertNotNull(definedUser.getUuid());
        assertTrue(new Date().compareTo(definedUser.getConvertedDate()) >= 0);
    }

    @Test
    public void testConvert_6() {
        User user = users.get(5);
        DefinedUser definedUser = sut.convert(user);
        assertNotNull(definedUser.getConvertedDate());
        assertNotNull(definedUser.getFullName());
        assertNotNull(definedUser.getUuid());
        assertTrue(new Date().compareTo(definedUser.getConvertedDate()) >= 0);
    }
}
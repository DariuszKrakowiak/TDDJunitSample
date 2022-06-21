import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TDDSampleClass {
@Test
    public void test(){
    int number = 5;
    int secondNumber = 5;
    assertEquals(number, secondNumber);
}
@Test
    public void secondTest(){
    String name = "Pawel";
    String secondName = "Pawel";
    assertEquals(name,secondName);
}
@Test
    public void thirdTest() {
    assertNotEquals(1, 3);
    assertNotEquals("SDA", "CodersLab");
    assertTrue(45 == 45);
    assertTrue("a" == "a");
    assertFalse(1 == 2);
    assertFalse("a" == "b");
}
@Test
        public void FourthTest(){
    assertAll(
            () ->assertEquals(1,1),
            () ->assertEquals(2,2),
            () ->assertNotEquals(2,1)
            );
}

}

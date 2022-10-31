package $org.example;

import org.junit.jupiter.api.Test;

public class ApppTest{

    private App app = new App();
    @Test
    public void testAddSuccess{
    var result = app.add(10, 10);
    }
}
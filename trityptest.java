import static org.junit.Assert.*;

public class TriangTest {
    trityp tri=new trityp();
    @Test
    public void triang() {
    assertEquals(4,tri.Triang(0,5,2));
    assertEquals(1,tri.Triang(3,4,5));
    assertEquals(2,tri.Triang(4,4,6));
    assertEquals(2,tri.Triang(4,6,4));
    assertEquals(2,tri.Triang(6,4,4));
    assertEquals(3,tri.Triang(5,5,5));
    assertEquals(4,tri.Triang(3,5,10));
    };
}

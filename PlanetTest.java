import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;

public class PlanetTest
{
  Planet testPlanet;

  @Before
  public void before()
  {
    testPlanet = new Planet("Jupiter", 80);
  }

  @Test
  public void hasName()
  {
    assertEquals("Jupiter", testPlanet.getName());
  }

  @Test
  public void hasSize()
  {
    assertEquals(80, testPlanet.getSize());
  }

  @Test
  public void explodesLikeABoss()
  {
    assertEquals("Boom! Jupiter has exploded.", testPlanet.explode());
  }
}
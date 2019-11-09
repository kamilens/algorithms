package algorithms.warmup;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GetRidOfVowelsTest {

  private GetRidOfVowels c;

  @BeforeEach
  public void a() {
    c = new GetRidOfVowels();
  }

  @Test
  void filter() {
    assertEquals("qwrt", c.filter("qwerty") );
  }
}

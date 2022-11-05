package ba.rpr;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MockTest {
    @Mock
    HashMap<String, String> mapa = mock(HashMap.class);

    @Test
    void mapaTest() {
        when(mapa.get("test")).thenReturn("mock");
        assertEquals("mock", mapa.get("test"));
    }
    @Mock
    Bazna bazna = mock(Bazna.class);

    @Test
    void izvedenaTest(){
        when(bazna.pozivaIzvedenuMetodu()).thenReturn("Pozvana metoda izvedene");
        assertEquals( "Pozvana metoda izvedene", bazna.pozivaIzvedenuMetodu());
    }


}

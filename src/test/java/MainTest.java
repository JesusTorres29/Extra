import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

public class MainTest extends TestCase {
    @Test
    public void Test1(){
        logistica prueba1= new logistica();
        prueba1.setPeso_mercancia(100);
        prueba1.numeropositivo();
        assertEquals(100,prueba1.getPeso_mercancia(),100);
    }
    @Test
    public void Test2(){
        logistica prueba2= new logistica();
        prueba2.setPeso_mercancia(100);
        prueba2.distanciapositiva();
        assertEquals(100,prueba2.getDistancia(),100);
    }

    @Test
    public void test3(){
        logistica prueba3= new logistica();
        prueba3.setPeso_mercancia(200);


    }
}

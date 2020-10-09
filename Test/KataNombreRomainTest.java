import org.junit.Test;
import static org.junit.Assert.*;
import org.hamcrest.core.Is;

public class KataNombreRomainTest {

    protected static KataNombreRomain KataNombreRomain = new KataNombreRomain();


    @Test
    public void convert1(){
        assertThat(KataNombreRomain.convert(1), Is.is("I"));
    }

    @Test
    public void convert2(){
        assertThat(KataNombreRomain.convert(2), Is.is("II"));
    }

    @Test
    public void convert3(){
        assertThat(KataNombreRomain.convert(3), Is.is("III"));
    }

    @Test
    public void convert10(){
        assertThat(KataNombreRomain.convert(10), Is.is("X"));
    }

    @Test
    public void convert24(){
        assertThat(KataNombreRomain.convert(24), Is.is("XXIV"));
    }



    @Test
    public void convert30(){
        assertThat(KataNombreRomain.convert(30), Is.is("XXX"));
    }

    @Test
    public void convert32(){
        assertThat(KataNombreRomain.convert(32), Is.is("XXXII"));
    }

    @Test
    public void convert40(){
        assertThat(KataNombreRomain.convert(40), Is.is("XL"));
    }

    @Test
    public void convert50(){
        assertThat(KataNombreRomain.convert(50), Is.is("L"));
    }

    @Test
    public void convert90(){
        assertThat(KataNombreRomain.convert(90), Is.is("XC"));
    }

    @Test
    public void convert100(){
        assertThat(KataNombreRomain.convert(100), Is.is("C"));
    }

    @Test
    public void convert400(){
        assertThat(KataNombreRomain.convert(400), Is.is("CD"));
    }

    @Test
    public void convert448(){
        assertThat(KataNombreRomain.convert(448), Is.is("CDXLVIII"));
    }

    @Test
    public void convert500(){
        assertThat(KataNombreRomain.convert(500), Is.is("D"));
    }

    @Test
    public void convert900(){
        assertThat(KataNombreRomain.convert(900), Is.is("CM"));
    }

    @Test
    public void convert1000(){
        assertThat(KataNombreRomain.convert(1000), Is.is("M"));
    }

    @Test
    public void convert2751(){
        assertThat(KataNombreRomain.convert(2751), Is.is("MMDCCLI"));
    }

    @Test
    public void convert2020(){
        assertThat(KataNombreRomain.convert(2020), Is.is("MMXX"));
    }


}
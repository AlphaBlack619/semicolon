import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Sep26Test {
    @Test
    void collector() {
        Sep26 sep26 = new Sep26();
        String name = "Alpha Nero Akpan", outPut = "A.N.AKPAN";
        assertEquals(outPut,sep26.collector(name));
    }
    @Test
    void checkIfCollectorCanReturnWithTwoNamesGiven(){
        Sep26 sep26 = new Sep26();
        String name = "Alpha Nero", outPut = "A.NERO";
        assertEquals(outPut,sep26.collector(name));
    }
}
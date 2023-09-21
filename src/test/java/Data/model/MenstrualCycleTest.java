//package Data.model;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import java.time.LocalDate;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class MenstrualCycleTest {
//    MenstrualCycle app = new MenstrualCycle("Moyin", 24);
//    @BeforeEach
//    @Test
//    void testForAppCreation(){
////        MenstrualCycle app = new MenstrualCycle("Esther", 24);
//        assertNotNull(app);
//    }
//
//    @Test
//    void getUserName() {
//        assertSame("Moyin",app.getUserName());
//    }
//
//    @Test
//    void setUserName() {
//        assertSame("Moyin",app.getUserName());
//        app.setUserName("Esther");
//        assertSame("Esther",app.getUserName());
//    }
//
//    @Test
//    void getAge() {
//        assertEquals(24,app.getAge());
//    }
//
//    @Test
//    void setAge() {
//        assertEquals(24,app.getAge());
//        app.setAge(27);
//        assertEquals(27,app.getAge());
//    }
//    @Test
//    void getMentstrualFlowStartDate(){
//        LocalDate flowStartDate = app.getMentstrualFlowStartDate("2023-03-01");
//        String date = flowStartDate.toString();
//        assertEquals(date,"2023-03-29");}
//    @Test
//    void getMenstruationEndDate(){
//        LocalDate flowStartDate = app.getMentstrualFlowStartDate("2023-03-01");
//        String startDateString = flowStartDate.toString();
//        assertEquals(startDateString,"2023-03-29");
//        LocalDate flowEndDate = app.getMentstrualFlowEndDate("2023-03-01",5);
//        String endDateString = flowEndDate.toString();
//        assertEquals(endDateString,"2023-04-03");
//    }
//    @Test
//    void getOvulationDate(){
//        LocalDate ovulationDate = app.getOvulationDate("2023-03-01");
//        String startDateString = ovulationDate.toString();
//        assertEquals(startDateString,"2023-03-15");}
//    @Test
//    void getSafePeriodStartDate(){
//      LocalDate localDate = app.getSafePeriodStartDate("2023-03-01");
//      String safePeriodStartDate = localDate.toString();
//      assertEquals("2023-03-19",safePeriodStartDate);
//    }
//    @Test
//    void getSafePeriodEndDate(){
//        LocalDate localDate = app.getSafePeriodEndDate("2023-03-01");
//        String localDateString = localDate.toString();
//        assertEquals(localDateString,"2023-03-26");
//    }
//}
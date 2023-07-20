package tdd;
import org.junit.jupiter.api.Test;
import org.testng.annotations.BeforeTest;
import static org.junit.jupiter.api.Assertions.*;

public class NokiaTest {
    Phone nokia = new Phone();
    @BeforeTest
    @Test
    public void checkPhoneExist(){
        Phone nokia = new Phone();
        assertNotNull(nokia);
    }
    @Test
    public void checkPhoneCanOnAndOff(){
        nokia.checkPower();
        assertFalse(nokia.checkPower());
        nokia.power();
        assertTrue(nokia.checkPower());
        nokia.power();
        assertFalse(nokia.checkPower());
    }
    @Test
    public void checkPhoneHasMenu(){
        assertFalse(nokia.checkPower());
        nokia.power();
        assertTrue(nokia.checkPower());
        nokia.display();
        assertSame(nokia.display(),"Menu Function List: (1) Phonebook (2) Messages (3) Chat (4) CallRegister (5)Tones (6) Setting (7)Call Divert (8) Reminder (9) Calculator (10) Clock  (11) Sim Services (12) Profile (13) Game");
    }
    @Test
    public void checkPhoneCanScrollBetweenMenuFunctionList(){
        assertFalse(nokia.checkPower());
        nokia.power();
        assertTrue(nokia.checkPower());
        nokia.display();
        assertSame(nokia.display(),"Menu Function List: (1) Phonebook (2) Messages (3) Chat (4) CallRegister (5)Tones (6) Setting (7)Call Divert (8) Reminder (9) Calculator (10) Clock  (11) Sim Services (12) Profile (13) Game");
        nokia.functionList("2");
        assertSame(nokia.functionList("2"),"Messages Menu:(1) Write messages (2) Inbox (3) Outbox (4) Picture Message (5) Template (6) Smileys (7)Messages Setting (8) Info Service (9) Voice Mail Number (10)Services Command Editor");
        nokia.functionList("3");
        assertSame( "(1)New chat (2)Chat Name (3)Chat History",nokia.chat());
    }
    @Test
    public void checkPhoneCanAccessFunctionsInTheFunctionMenu() {
        assertFalse(nokia.checkPower());
        nokia.power();
        assertTrue(nokia.checkPower());
        nokia.display();
        assertSame(nokia.display(), "Menu Function List: (1) Phonebook (2) Messages (3) Chat (4) CallRegister (5)Tones (6) Setting (7)Call Divert (8) Reminder (9) Calculator (10) Clock  (11) Sim Services (12) Profile (13) Game");
        nokia.functionList("1");
        assertSame("PhoneBook Menu: (1) Search (2) Service Nos (3) Add name (4) Erase (5) Edit (6) Assign tone (7) Send B'card (8) Option (9) Speed (10) Voice tags", nokia.functionList("1"));
        nokia.phonebook("8");
        assertSame("Option: (1)Type Of View (2) Memory Status", nokia.phonebook("8"));
    }
    @Test
    public void checkPhoneCanAccessInnerFunctionsInPhoneFunction(){
        assertFalse(nokia.checkPower());
        nokia.power();
        assertTrue(nokia.checkPower());
        nokia.display();
        assertSame(nokia.display(), "Menu Function List: (1) Phonebook (2) Messages (3) Chat (4) CallRegister (5)Tones (6) Setting (7)Call Divert (8) Reminder (9) Calculator (10) Clock  (11) Sim Services (12) Profile (13) Game");
        nokia.functionList("2");
        assertSame("Messages Menu:(1) Write messages (2) Inbox (3) Outbox (4) Picture Message (5) Template (6) Smileys (7)Messages Setting (8) Info Service (9) Voice Mail Number (10)Services Command Editor",nokia.functionList("2"));
        nokia.message("7");
        assertSame("Message Setting: (1) Set Message (2) Set Common",nokia.message("7"));
        nokia.messageSetting("1");
        assertSame("Set Message: (1) Message centre number (2) Messages sent as (3)  Message validity",nokia.messageSetting("1"));
    }
    @Test
    public void checkPhoneCanNotBeAccessWhenOff(){
        nokia.checkPower();
        assertFalse(nokia.checkPower());
        nokia.display();
        assertSame("Power Is Off",nokia.display());
    }
    @Test
    public void checkPhoneForFunctionSetting(){
        assertFalse(nokia.checkPower());
        nokia.power();
        assertTrue(nokia.checkPower());
        nokia.display();
        assertSame(nokia.display(), "Menu Function List: (1) Phonebook (2) Messages (3) Chat (4) CallRegister (5)Tones (6) Setting (7)Call Divert (8) Reminder (9) Calculator (10) Clock  (11) Sim Services (12) Profile (13) Game");
        nokia.functionList("6");
        assertSame("Setting:(1) Call Setting (2) Phone Setting (3) Security Setting (4) Restore Factory Setting",nokia.functionList("6"));
        nokia.setting("3");
        assertSame("Security settings:(1) PIN code request (2) Call barring service (3) Fixed dialling (4) Closed user group (5)  Phone security (6) Change access codes",nokia.setting("3"));
    }
    @Test
    public void checkPhoneForFunctionCallRegister(){
        assertFalse(nokia.checkPower());
        nokia.power();
        assertTrue(nokia.checkPower());
        nokia.display();
        assertSame(nokia.display(), "Menu Function List: (1) Phonebook (2) Messages (3) Chat (4) CallRegister (5)Tones (6) Setting (7)Call Divert (8) Reminder (9) Calculator (10) Clock  (11) Sim Services (12) Profile (13) Game");
        nokia.functionList("4");
        assertSame("Call Register:(1) Missed Calls (2) Received Calls (3) Dialled Calls (4) Erase Recent Call List (5) Show Call's Duration (6) Show All Call Costs (7) Call Cost setting (8) Prepaid Credit",nokia.functionList("4"));
        nokia.callRegister("7");
        assertSame("Call cost settings: (1) Call cost limit (2) Show costs in",nokia.callRegister("7"));
    }
    @Test
    public void checkForGameInPhone(){
        assertFalse(nokia.checkPower());
        nokia.power();
        assertTrue(nokia.checkPower());
        nokia.display();
        assertSame(nokia.display(), "Menu Function List: (1) Phonebook (2) Messages (3) Chat (4) CallRegister (5)Tones (6) Setting (7)Call Divert (8) Reminder (9) Calculator (10) Clock  (11) Sim Services (12) Profile (13) Game");
        nokia.functionList("13");
        assertSame("(1)Snake|| (2)Space Impact (3)Bantu-mi (4)Pairs|| (5)Game Setting",nokia.functionList("13"));
    }
    @Test
    public void checkPhoneCanBeBack(){
        assertFalse(nokia.checkPower());
        nokia.power();
        assertTrue(nokia.checkPower());
        nokia.display();
        assertSame(nokia.display(), "Menu Function List: (1) Phonebook (2) Messages (3) Chat (4) CallRegister (5)Tones (6) Setting (7)Call Divert (8) Reminder (9) Calculator (10) Clock  (11) Sim Services (12) Profile (13) Game");
        nokia.functionList("13"); 
    }
    }

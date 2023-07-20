package tdd;

import java.util.Objects;

public class Phone {


    private boolean power;

    public boolean checkPower() {
        return power;
    }

    public void power() {
        power = !power;
    }

    public String display() {
        if (power) {
            return "Menu Function List: (1) Phonebook (2) Messages (3) Chat (4) CallRegister (5)Tones (6) Setting (7)Call Divert (8) Reminder (9) Calculator (10) Clock  (11) Sim Services (12) Profile (13) Game";
        }
        return "Power Is Off";
    }

    public String functionList(String functionListCommand) {
        if (power) {
            if (Objects.equals(functionListCommand, "1")) {
                return "PhoneBook Menu: (1) Search (2) Service Nos (3) Add name (4) Erase (5) Edit (6) Assign tone (7) Send B'card (8) Option (9) Speed (10) Voice tags";
            } else if (Objects.equals(functionListCommand, "2")) {
                return "Messages Menu:(1) Write messages (2) Inbox (3) Outbox (4) Picture Message (5) Template (6) Smileys (7)Messages Setting (8) Info Service (9) Voice Mail Number (10)Services Command Editor";
            } else if (Objects.equals(functionListCommand, "3")) {
                return chat();
            } else if (Objects.equals(functionListCommand, "12")) {
                return profile();
            } else if (Objects.equals(functionListCommand, "4")) {
                return "Call Register:(1) Missed Calls (2) Received Calls (3) Dialled Calls (4) Erase Recent Call List (5) Show Call's Duration (6) Show All Call Costs (7) Call Cost setting (8) Prepaid Credit";
            } else if (Objects.equals(functionListCommand, "5")) {
                return tone();
            } else if (Objects.equals(functionListCommand, "6")) {
                return "Setting:(1) Call Setting (2) Phone Setting (3) Security Setting (4) Restore Factory Setting";
            } else if (Objects.equals(functionListCommand, "7")) {
                return callDivert();
            } else if (Objects.equals(functionListCommand, "13")) {
                return games();
            } else if (Objects.equals(functionListCommand, "8")) {
                return reminder();
            } else if (Objects.equals(functionListCommand, "9")) {
                return calculator();
            } else if (Objects.equals(functionListCommand, "10")) {
                return clock();
            } else if (Objects.equals(functionListCommand, "11")) {
                return simService();
            } else if (Objects.equals(functionListCommand, "0")) {
                return display();
            }
            return "Invalid Menu Function Command";
        }
        return "Power Is Off";
    }

    public String phonebook(String phoneBookCommand) {
        if (power) {
            String a = "PhoneBook Search", b = "Service Nos", c = "Add name", d = "Erase", e = "Edit", f = "Assign tone", g = "Send B'card ", h = "Option: (1)Type Of View (2) Memory Status", i = "Speed", j = "Voice Tags";
            if (Objects.equals(phoneBookCommand, "1")) {
                return a;
            } else if (Objects.equals(phoneBookCommand, "2")) {
                return b;
            } else if (Objects.equals(phoneBookCommand, "3")) {
                return c;
            } else if (Objects.equals(phoneBookCommand, "4")) {
                return d;
            } else if (Objects.equals(phoneBookCommand, "5")) {
                return e;
            } else if (Objects.equals(phoneBookCommand, "6")) {
                return f;
            } else if (Objects.equals(phoneBookCommand, "7")) {
                return g;
            } else if (Objects.equals(phoneBookCommand, "8")) {
                return h;
            } else if (Objects.equals(phoneBookCommand, "9")) {
                return i;
            } else if (Objects.equals(phoneBookCommand, "10")) {
                return j;
            }
            return "Invalid Phonebook Command";
        }
        return "Power Is Off";
    }

    public String message(String messageCommand) {
        if (power) {
            String a = "Write messages", b = "Inbox", c = "Outbox", d = "Picture messages", e = "Templates", f = "Smileys", g = "Message Setting: (1) Set Message (2) Set Common", h = "Info Service", i = "Voice Mail Number", j = "Service Command Editor";
            if (Objects.equals(messageCommand, "1")) {
                return a;
            } else if (Objects.equals(messageCommand, "2")) {
                return b;
            } else if (Objects.equals(messageCommand, "3")) {
                return c;
            } else if (Objects.equals(messageCommand, "4")) {
                return d;
            } else if (Objects.equals(messageCommand, "5")) {
                return e;
            } else if (Objects.equals(messageCommand, "6")) {
                return f;
            } else if (Objects.equals(messageCommand, "7")) {
                return g;
            } else if (Objects.equals(messageCommand, "8")) {
                return h;
            } else if (Objects.equals(messageCommand, "9")) {
                return i;
            } else if (Objects.equals(messageCommand, "10")) {
                return j;
            }
            return "Invalid Message Command";
        }
        return "Power Is Off";
    }

    public String messageSetting(String messageSettingCommand) {
        if (Objects.equals(messageSettingCommand, "1")) {
            return "Set Message: (1) Message centre number (2) Messages sent as (3)  Message validity";
        } else if (Objects.equals(messageSettingCommand, "2")) {
            return "Set Common: (1) Delivery reports (2)  Reply via same centre (3) Character support";
        } else return "Invalid Message Setting Command";
    }

    public String setting(String settingCommand) {
        if (power) {
            String a = "Call settings: (1) Automatic redial (2) Speed dialling (3) Call waiting options (4) Own number sending (5) Phone line in use (6)  Automatic answer ";
            String b = "Phone settings: (1) Language (2) Cell info display (3)  Welcome note (4)  Network selection (5) Lights (6) Confirm SIM service actions";
            String c = "Security settings:(1) PIN code request (2) Call barring service (3) Fixed dialling (4) Closed user group (5)  Phone security (6) Change access codes", d = "Restore factory settings";
            if (Objects.equals(settingCommand, "1")) {
                return a;
            } else if (Objects.equals(settingCommand, "2")) {
                return b;
            } else if (Objects.equals(settingCommand, "3")) {
                return c;
            } else if (Objects.equals(settingCommand, "4")) {
                return d;
            } else return "invalid Setting Command";
        }
        return "Power Is Off";
    }

    public String callRegister(String callRegisterCommand) {
        if (power) {
            String a = "Missed Calls", b = "Received Calls", c = "Dialled Calls", d = "Erase Recent Call List", e = "Show call Duration:(1)  Last call duration (2)  All calls duration (3) Received calls duration (4) Dialled calls duration (5) Clear timer";
            String f = "Show call costs: (1) Last call cost (2) All calls cost (3) Clear counters", g = "Call cost settings: (1) Call cost limit (2) Show costs in", h = "Prepaid credit";
            if (Objects.equals(callRegisterCommand, "1")) {
                return a;
            } else if (Objects.equals(callRegisterCommand, "2")) {
                return b;
            } else if (Objects.equals(callRegisterCommand, "3")) {
                return c;
            } else if (Objects.equals(callRegisterCommand, "4")) {
                return d;
            } else if (Objects.equals(callRegisterCommand, "5")) {
                return e;
            } else if (Objects.equals(callRegisterCommand, "6")) {
                return f;
            } else if (Objects.equals(callRegisterCommand, "7")) {
                return g;
            } else if (Objects.equals(callRegisterCommand, "8")) {
                return h;
            } else return "Invalid CallRegisterCommand";
        }
        return "Power Is Off";
    }

    public String games() {
        if (power) {
            return "(1)Snake|| (2)Space Impact (3)Bantu-mi (4)Pairs|| (5)Game Setting";
        }
        return "Power Is Off";
    }

    public String clock() {
        if (power) {
            return "(1)AlarmClock (2) Clock settings (3) Date setting (4) Stopwatch (5) Countdown timer (6) Auto update of date and time";
        }
        return "Power Is Off";
    }

    public String profile() {
        if (power) {
            return "(1)General (2)Silent (3)Personalise";
        }
        return "Power Is Off";
    }

    public String chat() {
        if (power) {
            return "(1)New chat (2)Chat Name (3)Chat History";
        }
        return "Power Is Off";
    }

    public String tone() {
        if (power) {
            return "(1)Ring Tone (2)Ring Volume (3)Income Message Alert Tone (3)Incoming Call Alert (4)Keypad Tone (5)Warning Tone (7)Composer (8)Vibrating alert(9) Screen Server";
        }
        return "Power Is Off";
    }

    public String callDivert() {
        if (power) {
            return "(1)Divert When Busy (2)Divert All Not Reachable Call(3)Cancel All Divert";
        }
        return "Power Is Off";
    }

    public String calculator() {
        if (power) {
            return "(1)Arithmetic (2)Currency Conversion";
        }
        return "Power Is Off";
    }

    public String reminder() {
        if (power) {
            return "(1)Add New (2)Erase (3)View All (4)Edit (5)Send (6)Snooze";
        }
        return "Power Is Off";
    }

    public String simService() {
        if (power) {
            return null;
        }
        return "Power Is Off";
    }

}

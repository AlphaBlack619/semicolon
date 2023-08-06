import java.util.ArrayList;
import java.util.List;
public class Person {
    private List<Problem> problemList;
    public Person( List<Problem>problemList){
        this.problemList = new ArrayList<Problem>();
    }
    public List good(){
        return problemList;
    }

    public static void main(String[] args) {
        Person okon = new Person(new ArrayList<>());
    }
}

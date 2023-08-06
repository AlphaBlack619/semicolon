public class Problem {
    private boolean isStatus;
    private String name;
    private Type problemType;
    Problem (boolean isStatus, String name, Type problemType){
        this.name = name;
        this.isStatus = isStatus;
        this.problemType = problemType;
    }

    public void setStatus(boolean status) {
        isStatus = status;
    }

    public boolean isStatus() {
        return isStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProblemType(Type problemType) {
        this.problemType = problemType;
    }
    public Type getProblemType(){
        return problemType;
    }
}

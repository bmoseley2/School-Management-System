public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    public Student(int id, String name, int grade) {
        feesPaid = 0;
        feesTotal = 30000;
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    // public void setId(int newId) {
    //     this.id = newId;
    // }

    public String getName() {
        return name;
    }

    // public void setName(String newName) {
    //     this.name = newName;
    // }

    public int getFeesPaid() {
        return feesPaid;
    }

    // public void setFeesPaid(int feesPaid) {
    //     this.feesPaid = feesPaid;
    // }
    
    public int getGrade() {
        return grade;
    }

    // public void setGrade(int grade) {
    //     this.grade = grade;
    // }

    public int getFeesTotal() {
        return feesTotal;
    }

    // public void setFeesTotal(int feesTotal) {
    //     this.feesTotal = feesTotal;
    // }


    public void payFees(int fees) {
        feesPaid += fees;
        School.updateTotalMoneyEarned(feesPaid);
    }

    public int getRemainingFees() {
        return feesTotal - feesPaid;
    }

    public String toString() {
        return "Student's name is " + name + " total fees paid so far $" + feesPaid;
    }
    
}
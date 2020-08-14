public class Grades {

private int[] grades;
private int size;
double gradeAverage;

public Grades() {
    this.grades = new int[10];
    this.size = 0;
}

    //Dodanie oceny do tablicy

    public void addGrade(int value) {
        if(this.size == 10) {
            return;
        }
        else {

        //podobno values[] to błąd w materiałach
        this.grades[this.size] = value;
        this.size++;
        }
    }

    //Zwracanie ostatniej dodanej oceny

    public void returnLatest() {

    if(this.size == grades[grades.length - 1]) {
        return;
    }

    }

    //Zwracanie średniej ocen

    public void gradeAvg() {
    if(this.size == 0) {
        return;
    }
    else {
    double sum = 0;
    for (int value:grades) {
        sum += value;
    }
    this.gradeAverage = sum / this.size;
    return;

    }
}

public static void main(String[] args) {

    Grades grades = new Grades();

    //1
    grades.addGrade(4);
    grades.returnLatest();
    grades.gradeAvg();

    //2
    grades.addGrade(5);
    grades.returnLatest();
    grades.gradeAvg();

    //3
    grades.addGrade(3);
    grades.returnLatest();
    grades.gradeAvg();

    //4
    grades.addGrade(3);
    grades.returnLatest();
    grades.gradeAvg();

    //5
    grades.addGrade(2);
    grades.returnLatest();
    grades.gradeAvg();

    //6
    grades.addGrade(5);
    grades.returnLatest();
    grades.gradeAvg();

    //7
    grades.addGrade(4);
    grades.returnLatest();
    grades.gradeAvg();

    //8
    grades.addGrade(4);
    grades.returnLatest();
    grades.gradeAvg();

    //9
    grades.addGrade(3);
    grades.returnLatest();
    grades.gradeAvg();

    //10
    grades.addGrade(4);
    grades.returnLatest();
    grades.gradeAvg();

    //11
    grades.addGrade(2);
    grades.returnLatest();
    grades.gradeAvg();


}

}

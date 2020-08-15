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
            //values[] to błąd w materiałach
            this.grades[this.size] = value;
            this.size++;

    }
    //Zwracanie ostatniej dodanej oceny

    public int returnLatest() {

        if(this.size == 0) {
            return 0;
        }
        return this.grades[grades.length-1];
    }

    //Zwracanie średniej ocen

    public double gradeAvg() {
        if(this.size == 0) {
            return 0;
        }
            double sum = 0;
            for (int value:grades) {
                sum += value;
            }
            this.gradeAverage = sum / this.size;
            return this.gradeAverage;
    }


    public static void main(String[] args) {
        Grades gradesTable = new Grades();
        //1
        gradesTable.addGrade(4);
        gradesTable.returnLatest();
        gradesTable.gradeAvg();
        //2
        gradesTable.addGrade(5);
        gradesTable.returnLatest();
        gradesTable.gradeAvg();
        //3
        gradesTable.addGrade(3);
        gradesTable.returnLatest();
        gradesTable.gradeAvg();
        //4
        gradesTable.addGrade(3);
        gradesTable.returnLatest();
        gradesTable.gradeAvg();
        //5
        gradesTable.addGrade(2);
        gradesTable.returnLatest();
        gradesTable.gradeAvg();
        //6
        gradesTable.addGrade(5);
        gradesTable.returnLatest();
        gradesTable.gradeAvg();
        //7
        gradesTable.addGrade(4);
        gradesTable.returnLatest();
        gradesTable.gradeAvg();
        //8
        gradesTable.addGrade(4);
        gradesTable.returnLatest();
        gradesTable.gradeAvg();
        //9
        gradesTable.addGrade(3);
        gradesTable.returnLatest();
        gradesTable.gradeAvg();
        //10
        gradesTable.addGrade(4);
        gradesTable.returnLatest();
        gradesTable.gradeAvg();
        //11
        gradesTable.addGrade(2);
        gradesTable.returnLatest();
        gradesTable.gradeAvg();

    }


}
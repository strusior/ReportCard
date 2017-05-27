package com.example.android.reportcard;

import java.util.ArrayList;

public class ReportCard {

    //students names
    private String adam = "Adam";
    private String mark = "Mark";
    private String steven = "Steven";

    //stores classes of adam
    private ArrayList<String> adamsClasses = new ArrayList<String>();

    //allows to add classes to adams list of classes,
    //don't know why "add" does not work
    //it works when I use "protected void onCreate(Bundle savedInstanceState) {
    //super.onCreate(savedInstanceState);" but then other things don't work :-/
    adamsClasses.add(0, "history");
    adamsClasses.add(1, "math");
    adamsClasses.add(2, "biology");

    //stores classes of mark
    private ArrayList<String> marksClasses = new ArrayList<String>();

    //allows to add classes to marks list of classes
    marksClasses.add(0, "history");
    marksClasses.add(1, "math");
    marksClasses.add(2, "physics");

    //stores classes of steven
    private ArrayList<String> stevensClasses = new ArrayList<String>();

    //allows to add classes to stevens list of classes
    stevensClasses.add(0, "history");
    stevensClasses.add(1, "math");
    stevensClasses.add(2, "english");

    //stores grades of Adam from each classes
    private ArrayList<Integer> adamsGradesInHistory = new ArrayList<Integer>();

    //allows to add grades
    adamsGradesInHistory.add(0, 2);
    adamsGradesInHistory.add(1, 2);
    adamsGradesInHistory.add(2, 4);
    adamsGradesInHistory.add(3, 3);

    ArrayList<Integer> adamsGradesInMath = new ArrayList<Integer>();
    adamsGradesInMath.add(0, 5);
    adamsGradesInMath.add(1, 5);
    adamsGradesInMath.add(2, 5);
    adamsGradesInMath.add(3, 5);

    ArrayList<Integer> adamsGradesInBiology = new ArrayList<Integer>();
    adamsGradesInBiology.add(0, 3);
    adamsGradesInBiology.add(1, 2);
    adamsGradesInBiology.add(2, 4);
    adamsGradesInBiology.add(3, 4);

    // gets Classes of selected student
    private static String getClasses (ArrayList<String> arrayList){
        String courses = null;
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.get(i);
            courses = courses + arrayList.get(i) + ", ";
        }
        return courses;
    }

    //gets grades of selected student from selected classes
    private static String getGrades (ArrayList<Integer> arrayList, String studentName){
        String grades = null;
        for (int j = 0; j < arrayList.size(); j++) {
            grades = grades + " " + String.valueOf(arrayList.get(j)); //instead of toString()
        }
        return studentName + " grades are: " + grades;
    }

    //replaces one classes name in a specific list of classes
    private static void setClasses (ArrayList<String> arrayList, String nameOfClasses, int index){
        arrayList.set(index, nameOfClasses);
    }

    //constructor - is it ok? what could it be used for? I would appreciate some example
    public ReportCard (String adam,
                       String steven,
                       String mark,
                       ArrayList<String> adamsClasses,
                       ArrayList<String> stevensClasses,
                       ArrayList<String> marksClasses,
                       ArrayList<Integer> adamsGradesInHistory,
                       ArrayList<Integer> adamsGradesInMath,
                       ArrayList<Integer> adamsGradesInBiology){
        this.adam = adam;
        this.steven = steven;
        this.mark = mark;
        this.adamsClasses = adamsClasses;
        this.stevensClasses = stevensClasses;
        this.marksClasses = marksClasses;
        this.adamsGradesInHistory = adamsGradesInHistory;
        this.adamsGradesInMath = adamsGradesInMath;
        this.adamsGradesInBiology = adamsGradesInBiology;
    }
}


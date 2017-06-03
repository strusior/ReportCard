package com.example.android.reportcard;

import java.util.ArrayList;

public class ReportCard {

    //students names
    final private String adam = "Adam";
    final private String mark = "Mark";
    final private String steven = "Steven";

    //stores classes of adam
    private ArrayList<String> adamsClasses = new ArrayList<String>();

    //allows to add classes to adams list of classes,
    //don't know why "add" does not work
    //it works when I use "protected void onCreate(Bundle savedInstanceState) {
    //super.onCreate(savedInstanceState);" but then other things don't work :-/

    public void addAdamClasses (){
        adamsClasses.add(0, "history");
        adamsClasses.add(1, "math");
        adamsClasses.add(2, "biology");}
    //stores classes of mark
    private ArrayList<String> marksClasses = new ArrayList<String>();


    //allows to add classes to marks list of classes
    public void addMarkClasses () {
    marksClasses.add(0, "history");
    marksClasses.add(1, "math");
    marksClasses.add(2, "physics");}

    //stores classes of steven
    private ArrayList<String> stevensClasses = new ArrayList<String>();


    //allows to add classes to stevens list of classes
    public void addStevenClases (){
    stevensClasses.add(0, "history");
    stevensClasses.add(1, "math");
    stevensClasses.add(2, "english");}

    //stores grades of Adam from each classes
    private ArrayList<Integer> adamsGradesInHistory = new ArrayList<Integer>();

    //allows to add grades

    public void addAdamGradesInHistory (){
    adamsGradesInHistory.add(0, 2);
    adamsGradesInHistory.add(1, 2);
    adamsGradesInHistory.add(2, 4);
    adamsGradesInHistory.add(3, 3);}

    ArrayList<Integer> adamsGradesInMath = new ArrayList<Integer>();
    public void addAdamGradesInMath (){
    adamsGradesInMath.add(0, 5);
    adamsGradesInMath.add(1, 5);
    adamsGradesInMath.add(2, 5);
    adamsGradesInMath.add(3, 5);}

    ArrayList<Integer> adamsGradesInBiology = new ArrayList<Integer>();

    public void addAdamGradesInBiology (){
    adamsGradesInBiology.add(0, 3);
    adamsGradesInBiology.add(1, 2);
    adamsGradesInBiology.add(2, 4);
    adamsGradesInBiology.add(3, 4);}

    // gets Classes of selected student
    public String getClasses (ArrayList<String> arrayList){
        String courses = null;
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.get(i);
            courses = courses + arrayList.get(i) + ", ";
        }
        return courses;
    }

    //gets grades of selected student from selected classes
    public String getGrades (ArrayList<Integer> arrayList, String studentName){
        String grades = null;
        for (int j = 0; j < arrayList.size(); j++) {
            grades = grades + " " + String.valueOf(arrayList.get(j));
        }
        return studentName + " grades are: " + grades;
    }

    //toString method for Adams grades in math
    @Override //what would happen if I didn't write "@Override"?
    public  String toString (){

        return getGrades(adamsGradesInMath, adam);
    }

    //replaces one classes name in a specific list of classes
    public void setClasses (ArrayList<String> arrayList, String nameOfClasses, int index){
        arrayList.set(index, nameOfClasses);
    }

    //constructor
    public ReportCard (String adam,
                       String steven,
                       String mark,
                       ArrayList<String> adamsClasses,
                       ArrayList<String> stevensClasses,
                       ArrayList<String> marksClasses,
                       ArrayList<Integer> adamsGradesInHistory,
                       ArrayList<Integer> adamsGradesInMath,
                       ArrayList<Integer> adamsGradesInBiology){

        this.adamsClasses = adamsClasses;
        this.stevensClasses = stevensClasses;
        this.marksClasses = marksClasses;
        this.adamsGradesInHistory = adamsGradesInHistory;
        this.adamsGradesInMath = adamsGradesInMath;
        this.adamsGradesInBiology = adamsGradesInBiology;
    }
}


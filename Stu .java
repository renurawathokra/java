# java class Stu 
 {

private int numID, year;
private String userName, course;

public Student(int numID, int year, String userName, String course) {

    this.numID = numID;
    this.year = year;
    this.userName = userName;
    this.course = course;

}


public int getNumID() {
    return numID;
}

public void setNumID(int numID) {
    this.numID = numID;
}

public int getYear() {
    return year;
}

public void setYear(int year) {
    this.year = year;
}

public String getUserName() {
    return userName;
}

public void setUserName(String userName) {
    this.userName = userName;
}

public String getCourse() {
    return course;
}

public void setCourse(String course) {
    this.course = course;
}

}

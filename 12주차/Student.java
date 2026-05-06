public class Student {
  private int CURRENT_YEAR = 2026;
  private String name;
  private int id;
  private int yearOfbirth;
  public static int numStudents = 0;

  Student(String name, int yearOfbirth) {
    this.name = name;
    this.yearOfbirth = yearOfbirth;
    numStudents += 1;
    id = numStudents;
  }

  // getter
  public String getName() {
    return name;
  }

  public int getId() {
    return id;
  }

  public int getAge() {
    return CURRENT_YEAR - yearOfbirth;
  }

  // 그 외 함수
  public String toString() {
    return "Student[name = " + name + ", id = " + Integer.toString(id) + ", age = " + Integer.toString(getAge()) + "]";
  }

  public static int getNumStudent() {
    return numStudents;
  }
}

// UndergradStudent
class UndergradStudent extends Student {
  private String residenceHall;
  public static int numStudents = 0;

  UndergradStudent(String name, int yearOfbirth, String residenceHall) {
    super(name, yearOfbirth);
    this.residenceHall = residenceHall;
    numStudents += 1;
  }

  // getter
  public String getResidenceHall() {
    return residenceHall;
  }

  // setter
  public void setResidenceHall(String residenceHall) {
    this.residenceHall = residenceHall;
  }

  // 그 외 함수
  public static int getNumStudent() {
    return numStudents;
  }
}


class GradStudent extends Student{
  private String advisor;
  private String areaOfResearch;
  public static int numStudents = 0;

  GradStudent(String name, int yearOfbirth, String advisor, String areaOfReserach) {
    super(name, yearOfbirth);
    this.advisor = advisor;
    this.areaOfResearch = areaOfReserach;
    numStudents += 1;
  }

  // getter
  public String getAdvisor() {
    return advisor;
  }

  public String getAreaOfResearch() {
    return areaOfResearch;
  }

  // setter
  public void setAdvisor(String advisor) {
    this.advisor = advisor;
  }
  
  public void setAreaOfReserach(String areaOfResearch) {
    this.areaOfResearch = areaOfResearch;
  }

  // 그 외 함수
  public String toString() {
    return "Student[name = " + getName() + ", id = " + Integer.toString(getId()) + ", age = " + Integer.toString(getAge()) + ", residenceHall = " + residenceHall +"]";
  }

  public static int getNumStudent() {
    return numStudents;
  }
}
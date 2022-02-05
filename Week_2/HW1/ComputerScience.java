public class ComputerScience{

    //Class Data
    int course_id, credits;
    private String name, semester; 
    
    //Constructor
    public ComputerScience(String coursename, int numcourse_id, int numcredits, String whensemester){ 
        name = coursename;
        course_id = numcourse_id; 
        credits = numcredits;  
        semester = whensemester; 
    }

    //toString 
    public String toString(){
        return "| Course: " + name + " | ID: " + course_id + " | Credits: " + credits + " | Semester: " + semester + " |";  
    } 

    //---------------------------------SETTERS---------------------------------
    //Setter Name
    public void setCourseName(String coursename){
        name = coursename;
    }
    //Setter ID
    public void setCourseId(int numcourse_id){
        course_id = numcourse_id;  
    }
     //Setter Credits
     public void setCredits(int numcredits){
        credits = numcredits;  
    }
    //Setter Semester
    public void setSemester(String whensemester){
        semester = whensemester; 
    }

    //---------------------------------GETTERS---------------------------------
    //Getter Name 
    public String getCourseName(){
        return name; 
    }
    //Getter ID 
    public int getCourseId(){
        return course_id; 
    }
    //Getter Name 
    public int getCredits(){
        return credits; 
    }
    //Getter Semester  
    public String getSemester(){
        return semester; 
    }
}
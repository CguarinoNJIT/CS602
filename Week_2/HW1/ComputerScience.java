public class ComputerScience{

    //Class Data
    int course_id, credits;
    private String name, semester, description; 
    
    //Constructor
    public ComputerScience(String coursename, int numcourse_id, int numcredits, String whensemester, String coursedescription){ 
        name = coursename;
        course_id = numcourse_id; 
        credits = numcredits;  
        semester = whensemester; 
        description = coursedescription; 
    }

    //toString 
    public String toString(){
        return "Course: " + name + "\nID: " + course_id + "\nCredits: " + credits + "\nSemester: " + semester + "\nDescription: " + description + "\n";  
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
    //Setter Description 
    public void setDescription(String coursedescription){
        description = coursedescription; 
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
    //Getter Description 
    public String getDescription(){
        return description; 
    }
}
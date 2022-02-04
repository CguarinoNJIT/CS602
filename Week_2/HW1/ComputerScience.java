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

    // //Setter - Not Needed
    // public void setCourse(String coursename, int numcourse_id, int numcredits, String whensemester){
       
    //     name = coursename;
    //     course_id = numcourse_id;  
    //     credits = numcredits;  
    //     semester = whensemester;
    // }

    //Getter 
    public String toString(){
        return "| Course: " + name + " | ID: " + course_id + " | Credits: " + credits + " | Semester: " + semester + " |";  
    } 

}
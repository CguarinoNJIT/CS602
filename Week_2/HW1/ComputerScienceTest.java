public class ComputerScienceTest { 

    public static void main(String[] args){
        ComputerScience course1 = new ComputerScience("Applications of Database Systems", 731, 3, "Summer", "Restricted to students who are specializing in computer and information systems management. Comparative study of different models of database management systems and their applications. Emphasis on the functions of the database administrator. Includes a survey of physical and logical organization of data, methods of accessing data, characteristics of different models of generalized database management systems, and case studies using these systems from various applications. Student teams design database systems for class projects."); 
        ComputerScience course2 = new ComputerScience("Data Mining and Management in Bioinformatics", 744, 3, "Spring", "Concepts and principles of bioinformatic data mining and management with focus on efficiency and scalability. Methods for indexing and querying biological databases, biological data mining, and algorithmic development for bimolecular and phlyogenetic data analysis. Trends and advances in areas such as functional genomics and proteomics, genetic engineering, and large-scale gene expression data analysis."); 
        ComputerScience course3 = new ComputerScience("Artifical Intelligence", 670, 3, "Spring", "Fundamental concepts and general techniques in artificial intelligence. Main topics include goal tree search, logic and deduction, adduction, uncertainty, fuzzy logic, knowledge representations, machine learning, vision, and action planning. The LISP programming language is used extensively. Students are required to do programming assignments, complete a programming term project, and review case studies."); 

        //Initialized Objects
        System.out.println(course1); 
        System.out.println(course2); 
        System.out.println(course3);
        System.out.println(); 

        //Getter Example 
        System.out.println(course2.getCourseName()); 
        System.out.println(); 

        //Setter Example 
        course3.setSemester("Fall");
        course3.setCourseId(677);
        course3.setDescription("This course covers current topics in data science. The topics include but are not limited to parallel programming on GPU and CPU multi-cores, deep learning, representation learning, optimization algorithms, and algorithms for big datasets. Students will present recent papers in data science, work on programming assignments, and do a machine learning/deep learning/data science project.");
        course3.setCourseName("Deep Learning");

        //Modified Object Print
        System.out.println(course3);
    }
    
}

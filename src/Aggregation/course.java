package Aggregation;

public class course {
    private String courseName;
    private instructor instructor;
    private textbook textbook;

    public course(){}
    public course(String courseName, instructor instructor, textbook textbook)
    {
        this.courseName = courseName;
        this.instructor = instructor;
        this.textbook = textbook;
    }

    public String toString()
    {
        return ("Course: " + courseName + " " + instructor.toString() + " " +textbook.toString());
    }

    public void setCourseName(String courseName)
    {
        this.courseName = courseName;
    }

    public String getCourseName()
    {
        return courseName;
    }

    public void setInstructor(instructor instructor)
    {
        this.instructor = instructor;
    }

    public instructor getInstructor()
    {
        return instructor;
    }

    public void setTextbook(textbook textbook)
    {
        this.textbook = textbook;
    }

    public textbook getTextbook()
    {
        return textbook;
    }

}

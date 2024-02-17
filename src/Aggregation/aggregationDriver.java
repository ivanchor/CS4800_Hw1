package Aggregation;

public class aggregationDriver
{
    public static void main(String[] args)
    {
        //instructor instructor1 = new instructor("Nima", "Davarpanah", "3-2636");
        //textbook textbook1 = new textbook("Clean Code", "Robert Cecil Martin", "Pearson");
        //course course1 = new course("CS 4800", instructor1, textbook1);

        instructor instructor1 = new instructor();
        instructor1.setFirstName("Nima");
        instructor1.setLastName("Davarpanah");
        instructor1.setOfficeNumber("3-2636");

        textbook textbook1 = new textbook();
        textbook1.setBookTitle("Clean Code");
        textbook1.setAuthor("Robert Cecil Martin");
        textbook1.setPublisher("Pearson");

        course course1 = new course();
        course1.setCourseName("CS 4800");
        course1.setInstructor(instructor1);
        course1.setTextbook(textbook1);


        System.out.println(course1.toString());

        //instructor instructor2 = new instructor("John", "Do", "3-54");
        //textbook textbook2 = new textbook("Yearbook", "School", "CPP");
        //course course2 = new course("CS 0000", instructor2, textbook2);

        instructor instructor2 = new instructor();
        instructor2.setFirstName("John");
        instructor2.setLastName("Do");
        instructor2.setOfficeNumber("3-54");

        textbook textbook2 = new textbook();
        textbook2.setBookTitle("Yearbook");
        textbook2.setAuthor("School");
        textbook2.setPublisher("CPP");

        course course2 = new course();
        course2.setCourseName("CS 0000");
        course2.setInstructor(instructor2);
        course2.setTextbook(textbook2);


        System.out.println(course2.toString());
    }
}

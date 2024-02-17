package Composition;

public class file
{

    private String fileName;

    public file(){}

    public file(String fileName)
    {
        this.fileName = fileName;
    }

    public void printName()
    {
       System.out.println(" File: " + fileName);
    }

    public String getFileName()
    {
        return fileName;
    }

    public void setFileName(String fileName)
    {
        this.fileName = fileName;
    }
}

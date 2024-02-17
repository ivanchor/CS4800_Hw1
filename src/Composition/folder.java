package Composition;

import java.util.ArrayList;
import java.util.List;

public class folder
{


    private String folderName;
    private List<file> files= new ArrayList<file>();
    private List<folder> subfolders = new ArrayList<folder>();

    public folder(){}

    public folder(String folderName)
    {
        this.folderName = folderName;
        this.files = new ArrayList<file>();
        this.subfolders = new ArrayList<folder>();
    }

    public void addSubFolder(folder subFolder)
    {
        subfolders.add(subFolder);
    }

    public void addFile(file file) {
        files.add(file);
    }

    public void printFolder(String spacing)
    {
        System.out.println(spacing + "Folder: " + this.folderName + ",");
        for(file file : files)
        {
            file.printName();
        }
        for(folder subfolder: subfolders)
        {
            subfolder.printFolder(spacing + "  ");
        }
    }

    public String getFolderName()
    {
        return folderName;
    }

    public void setFolderName(String folderName)
    {
        this.folderName = folderName;
    }
}

/*  FIG 17.3     */

import java.io.File;
import java.util.Scanner;

public class FileDemo 
  {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter file or dorectory name: ");
        analyzePath(input.nextLine());
     }
    
    public static void analyzePath(String path)
      {
    File name = new File(path);
    if (name.exists())
        {
        System.out.printf("%s%s\n%s\n%s\n%s\n%s\n%s%s\n%s%s\n%s%s\n%s%s", name.getName(),
                "exists", (name.isFile()? "is a file":"is not a file"),
                (name.isDirectory()? "is a directory": "is not a directory"),
                (name.isAbsolute()?"is absolute path" : "is not absolute path"),
               "Last modified: ", name.lastModified(),
               "Length: ",
               name.length(),
               "Path: ", name.getPath(),
               "Absolute path: ", name.getAbsolutePath(),
               "Parent: ",  name.getParent());
        if(name.isDirectory())
             {
            String[] directory = name.list();
            System.out.println("\n\nDirectory contents: \n");
               for (String directoryName : directory)
                   System.out.println(directoryName);
              }
               
            else//not file or directory, output error message
           {
         System.out.printf("%s %s", path, "does not exist.");
            
           }
       }
     }
  }
    


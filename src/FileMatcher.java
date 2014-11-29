/**
 * [ MIT LICENSE ]
 * @author kshitijkarthick
 * @email kshitij.karthick@gmail.com
 * Search Functionality for the Search Tool.
 */
import java.io.File;
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class FileMatcher {
    private String path;
    
    /**
     * Constructor which Sets the Path for Searching.
     * @param path denotes the Path where the Search Operation takes place.
     */
    public FileMatcher(String path){
        setPath(path);
    }
    
    /**
     * Constructor which Sets the Path for Searching as Current Directory.
     */
    public FileMatcher(){
        setPath(".");
    }
    
    /**
     * Setter Function for Data Member( path ).
     * @param path Search Functionality on the Specified Path.
     */
    public void setPath(String path){
        this.path=path;
    }
    
    /**
     * We can Obtain the List of Files in the path Directory.
     * @return Array[File]
     */
    private File[] ListFiles(){
        File f=new File(path);
        //System.out.println(f.getPath()+"->"+(f.listFiles()[0]).getName());
        return f.listFiles();
    }
    
    /**
     * Searches Files which ends with a Specified Pattern.
     * @param pattern Pattern to be Searched for in the List of Files.
     * @return LinkedList[ File ]
     */
    public LinkedList endsWithPattern(String pattern){
        LinkedList list=new LinkedList();
        for(File filename:ListFiles()){
            if(filename.getName().endsWith(pattern))
                list.add(filename);
        }
        return list;
    }
    
    /**
     * Searches Files which Contains a Specified Pattern.
     * @param pattern Pattern to be Searched for in the List of Files.
     * @return LinkedList [ File ]
     */
    public LinkedList containsPattern(String pattern){
        LinkedList list=new LinkedList();
        for(File filename:ListFiles()){
            if(filename.getName().contains(pattern))
                list.add(filename);
        }
        return list;
    }
    
    /**
     * Searches Files which matches the Regular Expression.
     * @param pattern Regular Expression to be Searched for in the List of Files.
     * @return LinkedList [ File ]
     */
    public LinkedList regExPattern(String pattern){
        Pattern r = Pattern.compile(pattern);
        LinkedList list=new LinkedList();
        for(File filename:ListFiles()){
            Matcher m = r.matcher(filename.getName());
            if(m.matches()){
                list.add(filename);
                //System.out.println(filename);
            }
        }
        return list;
    }
}

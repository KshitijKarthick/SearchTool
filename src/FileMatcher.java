/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kshitijkarthick
 */
import java.io.File;
import java.util.LinkedList;
public class FileMatcher {
    private String path;
    public FileMatcher(String path){
        setPath(path);
    }
    public FileMatcher(){
        setPath(".");
    }
    public void setPath(String path){
        this.path=path;
    }
    private File[] ListFiles(){
        File f=new File(path);
        //System.out.println(f.getPath()+"->"+(f.listFiles()[0]).getName());
        return f.listFiles();
    }
    public LinkedList endsWithPattern(String pattern){
        LinkedList list=new LinkedList();
        for(File filename:ListFiles()){
            if(filename.getName().endsWith(pattern))
                list.add(filename);
        }
        return list;
    }
    public LinkedList containsPattern(String pattern){
        LinkedList list=new LinkedList();
        for(File filename:ListFiles()){
            if(filename.getName().contains(pattern))
                list.add(filename);
        }
        return list;
    }
     public LinkedList regExPattern(String pattern){
        LinkedList list=new LinkedList();
        for(File filename:ListFiles()){
            if(filename.getName().matches(pattern)){
                list.add(filename);
                System.out.println(filename);
            }
        }
        return list;
    }
}

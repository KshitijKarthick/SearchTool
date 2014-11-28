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
    public void FileMatcher(){
        setPath(".");
    }
    public void FileMatcher(String path){
        setPath(path);
    }
    public void setPath(String path){
        this.path=path;
    }
    public File[] ListFiles(){
        return this.ListFiles();
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
}

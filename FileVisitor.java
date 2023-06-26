package algorithms.chapterone;

import java.awt.*;
import java.io.File;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

/**
 * User: Nabeel Bhatti
 * Date: 23/06/2023
 */
public class FileVisitor {

    public void visitor(Queue<String> q , File[] files, int depth, String format){
        for (File file : files) {
            if(file.isDirectory()){
                q.add(format + file.getName() + File.separator);
                visitor(q, Objects.requireNonNull(file.listFiles()),depth+1, format+"\t");
            }else {
                q.add(format+ file.getName());
            }
        }
    }

    public static void main(String[] args) {
        FileVisitor fileVisitor = new FileVisitor();
        Queue<String> q = new LinkedList<>();
        File file = new File("src");
        q.add(file.getName());
        fileVisitor.visitor(q,file.listFiles(),0,"");
        q.forEach(System.out::println);

    }

}

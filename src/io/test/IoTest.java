
package io.test;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class IoTest {
public static void main(String[] args) throws FileNotFoundException {
    
    
    System.out.println(System.getProperties());
    System.out.println(System.nanoTime());
    FileReader f = new FileReader ("C:\\Documents and Settings\\ahmed samir\\Desktop\\car 2.txt");
       File e = new File("C:/Documents and Settings/ahmed samir/Desktop/car 2.txt");
         File w = new File("Desktop/calc.txt");
         
//         File q= new File(w);

System.out.println(w.canRead());
System.out.println(w.exists());
System.out.println(e.canRead());
System.out.println(w.isDirectory());
System.out.println(e.setReadOnly());

System.out.println(e.compareTo(e));
System.out.println(e.getAbsolutePath());
    try {
        System.out.println(e.getCanonicalPath());
    } catch (IOException ex) {
        Logger.getLogger(IoTest.class.getName()).log(Level.SEVERE, null, ex);
    }
       
    try {
        System.out.println(e.getCanonicalFile());
    } catch (IOException ex) {
        Logger.getLogger(IoTest.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    System.out.println(e.getName());
    System.out.println(e.getParent());
    try {
        System.out.println(e.getCanonicalFile());
    } catch (IOException ex) {
        Logger.getLogger(IoTest.class.getName()).log(Level.SEVERE, null, ex);
    }
    System.out.println(e.toURI());
    File d = new File ("C:/Documents and Settings/ahmed samir/Desktop/El-Donia.Donitna.akoam.com.mp3");
    
    System.out.println(d.toURI());
    try {
        System.out.println(d.createNewFile());
    } catch (IOException ex) {
        Logger.getLogger(IoTest.class.getName()).log(Level.SEVERE, null, ex);
    }
    File a = new  File ("C:/Documents and Settings/ahmed samir/Desktop/El-Donia.Ddonitna.akoam.com.mp3");
    System.out.println(a.toURI());
    try {
        System.out.println(a.createNewFile());
    } catch (IOException ex) {
        Logger.getLogger(IoTest.class.getName()).log(Level.SEVERE, null, ex);
    }

        System.out.println(a.exists());
        File s = new File("C:/Documents and Settings/ahmed samir/Desktop/Newfolder/");

    System.out.println(s.isDirectory());
    try {
        System.out.println(s.createNewFile());
    } catch (IOException ex) {
        Logger.getLogger(IoTest.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    System.out.println(s.mkdir());
    System.out.println(s.delete());
    System.out.println(s.mkdirs());
File newfile = new File (s,"mp3.mp3");
    try {
        System.out.println(newfile.createNewFile());
    } catch (IOException ex) {
        Logger.getLogger(IoTest.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    System.out.println(newfile.renameTo(a));
    File dir = new File ("C:/Documents and Settings/ahmed samir/");
    System.out.println(dir.list());
    for(String folder : dir.list())
    {
        System.out.println(folder);
    }
    for(File r : dir.listFiles())
    {
        System.out.println(r);
    }
    File io = new File("C:/Documents and Settings/ahmed samir/My Documents/NetBeansProjects/io test");
    System.out.println(io.isDirectory());
    FileInputStream file = new FileInputStream ("C:/Documents and Settings/ahmed samir/Desktop/3 Idiots 2010 720p 5.1 AAC x264 BRRip GokU61 [Z Warriors Release].mp4");
    int readed;
    byte [] buf = new byte [1024*1204*10];
//    FileOutputStream out = new FileOutputStream (io);
    try {
        while((readed= file.read(buf))!=-1)
        {
            if(readed!= buf.length)
                break;
//            out.write(readed);
            }
        file.close();
//        out.close();
          }
    catch (IOException ex) {
        Logger.getLogger(IoTest.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    byte [] buffer= new byte[1024];
    try {
        file.read(buffer);
    } catch (IOException ex) {
        Logger.getLogger(IoTest.class.getName()).log(Level.SEVERE, null, ex);
    }
     
    System.out.println("ahmed");
    System.out.flush();
    
    }
    
}

import java.io.*;

public class CopyFile {
    public static void main(String[] args) throws Exception{
        File f1 = new File("test");
        File f2 = new File("test");

        FileInputStream fin = new FileInputStream(f1);
        FileOutputStream fout = new FileOutputStream(f2);
     
        byte[] date = new byte[102400];
        int len;
        
        while(!((len = fin.read(date)) == -1))
            fout.write(date,0,len);

        fin.close();
        fout.close();
    }
}

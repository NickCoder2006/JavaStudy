package chapter01;

import java.io.*;

/**
 * Created by Nick
 * explain
 * Datetime: 2018/6/5 11:11
 */
public class FileStreamClass {
    public void use(){
        writeFile();
    }

    public void writeFile(){
        try {
            File f = new File("writefiletest.txt");
            FileOutputStream fop = new FileOutputStream(f);
            OutputStreamWriter writer = new OutputStreamWriter(fop, "UTF-8");
            writer.append("中文输入");
            writer.append("\r\n");
            writer.append("English");
            writer.close();
            fop.close();

            FileInputStream fip = new FileInputStream(f);
            InputStreamReader reader = new InputStreamReader(fip, "UTF-8");
            StringBuffer sb = new StringBuffer();
            while (reader.ready()) {
                sb.append((char) reader.read());
            }
            System.out.println(sb.toString());
            reader.close();
            fip.close();
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}

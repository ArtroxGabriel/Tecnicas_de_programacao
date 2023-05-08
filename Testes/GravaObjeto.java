import java.io.*;

public class GravaObjeto {
    public static void main(String args[]) {
        Serial s = new Serial(1, "Alo");

        FileOutputStream fo = new FileOutputStream("serial.obj");
        ObjectOutputStream os = new ObjectOutputStream(fo);
    
        os.writeObject(s);

        FileInputStream fi = new FileInputStream("serial.obj");
        ObjectInputStream oi = new ObjectInputStream(fi);

        Serial s1 = (Serial) oi.readObject();
        sysout(s1.a);
    }
}

class Serial implements Serializable {
    int a;
    String b;

    Serial(int a, String b) {

    }
}
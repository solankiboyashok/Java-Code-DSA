import java.io.*;

public class W7 {

public static void main(String[] args) {

try {

PrintWriter writer = new PrintWriter(System.out);

writer.write(9 + 97);

writer.close();

} catch (Exception e) {

System.out.println(e);

}

}

} 
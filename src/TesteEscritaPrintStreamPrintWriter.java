import java.io.*;

public class TesteEscritaPrintStreamPrintWriter {
    public static void main(String[] args) throws IOException {
       /* OutputStream fos = new FileOutputStream("lorem.txt");
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);*/
        PrintStream ps = new PrintStream("lorem2.txt");


        ps.println("jhennyfer Silva Sobrinho");
        ps.println("Marcus Antunius Mendes Fernandes Ferreira de Souza");
        ps.print("Cássia Fernandes Sobrinho");
        ps.close();


    }
}

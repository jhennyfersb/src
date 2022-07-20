import java.io.*;

public class TesteCopiarArquivo {
    public static void main(String[] args) throws IOException {
        /*InputStream fis = System.in;
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        OutputStream fos = new FileOutputStream("lorem2.txt");
        Writer osr = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osr);

        String linha = br.readLine();

        while (linha!= null && !linha.isEmpty()){
            bw.write(linha);
            bw.newLine();
            bw.flush();
            linha = br.readLine();
        }
        br.close();
        bw.close();*/

        //FileWriter fw = new FileWriter("lorem2.txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));

        bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
        bw.newLine();
        bw.write("tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam");
        bw.close();




    }
}

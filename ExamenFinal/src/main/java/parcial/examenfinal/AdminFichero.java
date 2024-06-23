package parcial.examenfinal;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class AdminFichero {
    private String filePath;
    private boolean append;
    private PrintWriter printWriter;

    public AdminFichero(String filePath, boolean append) {
        this.filePath = filePath;
        this.append = append;
    }

    public void CrearArchivo() throws IOException {
        FileWriter fileWriter = new FileWriter(filePath, append);
        this.printWriter = new PrintWriter(fileWriter);
        System.out.println("Archivo creado: " + filePath); // Mensaje de depuración
    }

    public PrintWriter getPrintWriter() {
        return printWriter;
    }

    public void close() {
        if (printWriter != null) {
            printWriter.close();
            System.out.println("Archivo cerrado: " + filePath); // Mensaje de depuración
        }
    }
}

package structural.decorator;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class FileDataSource implements DataSource {
    private String data;

    public FileDataSource(String data) {
        this.data = data;
    }

    @Override
    public void writeData(String data) {
        File file = new File(data);
        try (OutputStream fos = new FileOutputStream(file)) {
            fos.write(data.getBytes(StandardCharsets.UTF_8), 0, data.length());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String readData() {
        char[] buffer = null;
        File file = new File(data);
        try (FileReader reader = new FileReader(data)) {
            buffer = new char[(int) file.length()];
            reader.read(buffer);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return new String(buffer);
    }
}
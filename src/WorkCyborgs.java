import java.io.*;

public class WorkCyborgs {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Cyborg fedor = new Cyborg("Fedor","Junior",80);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream ous = new ObjectOutputStream(baos);

        ous.writeObject(fedor);
        ous.close();
        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);

        Cyborg cloneFedor = (Cyborg)ois.readObject();
        System.out.println(fedor);
        System.out.println(cloneFedor);
        System.out.println("-----------------------------------------------");
        cloneFedor.setRange("Junior");

        System.out.println(fedor);
        System.out.println(cloneFedor);
    }
}
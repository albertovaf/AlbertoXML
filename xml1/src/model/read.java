package model;
import java.util.List;

import model.model;
public class read {
	public static void main(String args[]) {
        StaXParser read = new StaXParser();
        List<model> readConfig = read.readConfig("C:\\alberto\\Clientes.xml");
        for (model item : readConfig) {
            System.out.println(item);
        }
    }
}

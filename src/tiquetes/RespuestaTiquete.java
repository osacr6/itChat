
package tiquetes;


import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class RespuestaTiquete {
    
     private ArrayList<String[]> tiquetePreguntas = null;
    private String encabezados[] = new String[]{
        "Codigo",
        "ID Usuario",
        "Descripcion",
        "Estado"
    };
    public RespuestaTiquete(ArrayList<String[]> respuestas) {
        this.tiquetePreguntas = respuestas;
    }
    
    public DefaultTableModel getModelo() {
        DefaultTableModel nuevoModelo = new DefaultTableModel();
        nuevoModelo.setColumnIdentifiers(encabezados);

        for (int i = 0; i < tiquetePreguntas.size(); i++) {
            String[] datos = tiquetePreguntas.get(i);
            nuevoModelo.addRow(new Object[]{
                datos[0].toString(),
                datos[1].toString(),
                datos[2].toString(),
                datos[3].toString(),
            });
        }

        return nuevoModelo;
    }
    
    
    
    
}

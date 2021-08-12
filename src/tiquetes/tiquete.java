
package tiquetes;

public class tiquete {
     protected String descripcion;
    protected String Estado;

    public tiquete() {
        this.Estado = "";
        this.descripcion= "";
    }

    @Override
    public String toString() {
        return "tiquete{" + "descripcion=" + descripcion + ", Estado=" + Estado + '}';
    }
    
}

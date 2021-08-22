
package tiquetes;


public class tiquetes extends tiquete{
     protected String Usuario; 
     protected int Id;

    public tiquetes() {
        this.Usuario = "";
        this.Id = 0;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    @Override
    public String toString() {
        return "Usuario{" + "Usuario=" + Usuario + ", Id=" + Id + '}';
    }
    
    
    
}

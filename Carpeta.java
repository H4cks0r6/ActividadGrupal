

  import java.util.TreeSet;

// Estamos instanciando un TreeSet por cada objecto que creamos, ¿Debería ser así?
public class Carpeta {

    protected String nombre;
    TreeSet<Carpeta> carpetas;
    TreeSet<Archivo> archivos;

    public Carpeta(String nombre) {
        this.nombre = nombre;
        carpetas = new TreeSet<>(new HelperCarpeta());
        archivos = new TreeSet<>(new HelperArchivo());
    }

    public void agregarCarpeta(Carpeta carpeta) {
        this.carpetas.add(carpeta);
    }

    public void agregarArchivo(Archivo archivo) {
        this.archivos.add(archivo);
    }

    public void mostrarDirectorio() {
        System.out.println("/ " + this.nombre);
        carpetas.forEach(s -> System.out.println("<dir> " + s.nombre));
        archivos.forEach(s -> System.out.println("<file> " + s.name));
    }
      public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

import java.util.TreeSet;

public class Carpeta {

  protected String nombre;
  TreeSet<Carpeta> carpetas;
  TreeSet<Archivo> archivos;

  public Carpeta(String nombre) {
    this.nombre = nombre;
    carpetas = new TreeSet<>(new ComparatorCarpeta());
    archivos = new TreeSet<>(new ComparatorArchivo());
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
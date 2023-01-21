public class Archivo {
  
  public String name;
  private int Size;
  public Archivo icono;
  public Carpeta folder;
  
  public Archivo(String Name, int Size, Carpeta folder) {
    this.name = Name;
    this.Size = Size;
    this.folder = folder;
  }
  
  public Archivo(String Name, int Size, Carpeta folder, Archivo icono) {
    this.name = Name;
    this.Size = Size;
    this.folder = folder;
    this.icono = icono;
  }
  
  public int getSize() {
    return Size;
  }
  
  public void setSize() {
    this.Size = Size;
  }
}
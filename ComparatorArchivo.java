import java.util.Comparator;

class ComparatorArchivo implements Comparator<Archivo> {
  
  @Override
  public int compare(Archivo str1, Archivo str2){
    return str2.name.compareTo(str1.name);
  }
}
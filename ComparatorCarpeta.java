import java.util.Comparator;

class ComparatorCarpeta implements Comparator<Carpeta> {
  
  @Override
  public int compare(Carpeta str1, Carpeta str2){
    return (str2.getNombre()).compareTo(str1.getNombre());
  }
}
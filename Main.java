class Main {
  
  public static void main(String[] args) {
    Carpeta d1 = new Carpeta("C:");
    Carpeta d2 = new Carpeta("Carpeta 1");
    Carpeta d3 = new Carpeta("Carpeta 3");
    Carpeta d4 = new Carpeta("Carpeta 2");
    Carpeta d5 = new Carpeta("Carpeta 11");
    Carpeta d6 = new Carpeta("Windows");
    Carpeta d7 = new Carpeta("System32");
    Carpeta d8 = new Carpeta("Programs Files");
    Carpeta d9 = new Carpeta("Documents");
    Carpeta d10 = new Carpeta("Desktop");
    Archivo a1 = new Archivo("Archivo 1", 20, d1);
    Archivo a2 = new Archivo("Archivo 2", 40, d2);
    Archivo a3 = new Archivo("Merendula", 20, d1);
    Archivo a4 = new Archivo("Fondo de pantalla.jpg", 40, d2);
    Archivo a5 = new Archivo("discord.exe", 20, d1);
    Archivo a6 = new Archivo("El 43.txt", 40, d2);
    d1.agregarCarpeta(d2);
    d1.agregarCarpeta(d3);
    d1.agregarCarpeta(d4);
    d1.agregarCarpeta(d5);
    d1.agregarArchivo(a1);
    d1.agregarArchivo(a2);
    d3.agregarCarpeta(d10);
    d3.agregarCarpeta(d8);
    d4.agregarCarpeta(d9);
    d4.agregarCarpeta(d6);
    d4.agregarCarpeta(d7);
    d4.agregarArchivo(a4);
    d4.agregarArchivo(a5);
    d9.agregarArchivo(a3);
    d9.agregarArchivo(a6);
    System.out.println("----Carpeta d1----");
    d1.mostrarDirectorio();
    System.out.println("----Carpeta d3----");
    d3.mostrarDirectorio();
    System.out.println("----Carpeta d4----");
    d4.mostrarDirectorio();
    System.out.println("----Carpeta d9----");
    d9.mostrarDirectorio();
  }
  
}
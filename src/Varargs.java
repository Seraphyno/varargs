public class Varargs {
  
  public static void main(String[] args) {
  
    System.out.println("Suma fara arg: " + suma());
    System.out.println("Suma 1: " + suma(1));
    System.out.println("Suma 1,2: " + suma(1,2));
    System.out.println("Suma 1,2,3: " + suma(1,2,3));
    System.out.println("Suma 1,2,3,4: " + suma(1,2,3,4));
    System.out.println("Suma 1,2,3,4,5: " + suma(1,2,3,4,5));
    System.out.println("Suma 1,2,3,4,5,6: " + suma(1,2,3,4,5,6));
  }
  
  //se marcheaza prin "..." dupa tipul de date, urmat de numele parametrului
  //se comporta ca un array de acel tip
  //accepta intre 0 si oricati parametri de acel tip
  static int suma(int... argumente) {
    int suma = 0;
    for (int temp : argumente) {
      suma += temp;
    }
    return suma;
  }
}

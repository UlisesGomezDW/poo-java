import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Tools tools = new Tools(10);
    
    int i = 0;
    int j = 0;
    Scanner sc = new Scanner(System.in);

    do{
      i++;
      System.out.println("Escribe el nombre:");
      String name = sc.nextLine();

      System.out.println("Ingresa la salud:");
      double health = sc.nextDouble();

      System.out.println("Ingresa la energia:");
      double energy = sc.nextDouble();

      System.out.println("Ingresa la posición:");
      int position = sc.nextInt();
      sc.nextLine();

      Character item = new Character(name, health, energy);

      tools.addItem(item, position);
    }
    while(i < tools.getTools().length);

    System.out.println("\nPERSONAJES\n");
    for(j = 0; j<tools.getTools().length; j++){
      System.out.println(tools.getTools()[j].convertToString()+ "\n");
    }

  }

}
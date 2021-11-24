import java.util.Scanner;

public class Tools {
  private Character tools[];
  public Tools(){}

  public Tools(int length){
    this.tools = new Character[length];
  }

  public Character[] getTools(){
    return this.tools;
  }

  public void addItem(Character item){
    int max = tools.length - 1;
    int position = this.askPosition();
    if(position >= 0 && position <= max){
      tools[position] = item;
    }else{
      System.out.println("Error, el personaje no puede escribirse en la posición " + position + ". Intenta con posiciones que correspondan del 0 al " + max +".");
      this.addItem(item);
    }
  }
  
  public int askPosition(){
      Scanner sc = new Scanner(System.in);
      System.out.println("Ingresa la posición:");
      int position = sc.nextInt();
      return position;
  }
}
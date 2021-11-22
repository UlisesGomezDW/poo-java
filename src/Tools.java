public class Tools {
  private Character tools[];
  public Tools(){}

  public Tools(int length){
    this.tools = new Character[length];
  }

  public Character[] getTools(){
    return this.tools;
  }

  public void addItem(Character item, int position){
    int max = tools.length - 1;
    if(position >= 0 && position <= max){
      tools[position] = item;
    }else{
      System.out.println("Error, el personaje no puede escribirse en la posición " + position + ". Intenta con posiciones que correspondan del 0 al " + max +".");
    }
  }
}
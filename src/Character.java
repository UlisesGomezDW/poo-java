public class Character {
  private String name;
  private double health;
  private double energy;

  public Character(){}

  public Character(String name, double health, double energy){
    this.name = name;
    this.health = health;
    this.energy = energy;
  }

  //setters
  public void setName(String name){
      this.name = name;
  }

  public void setHealth(double health){
      this.health = health;
  }

  public void setEnergy(double energy){
      this.energy = energy;
  }

  //getters
  public String getName(){
    return this.name;
  }

  public double getHealth(){
    return this.health;
  }

  public double getEnergy(){
    return this.energy;
  }

  //actions
  public void run(double km){
    if(this.energy > 10){
      this.setEnergy(this.getEnergy() - (0.5 * km));
      this.setHealth(this.getHealth() - (0.1 * km));
    }
    else {
      System.out.println("No cuenta con energia suficiente para correr.");
    }
  }

  public void jump(int amount){
    if(this.energy > 0){
      this.setEnergy(this.getEnergy() - (0.5 * amount));
      this.setHealth(this.getHealth() - (0.1 * amount));
    }
    else {
      System.out.println("No cuenta con energia suficiente para saltar.");
    }
  }

  public String convertToString(){
    return "-" + this.getName()  + "\nSalud: " + this.getHealth() + "\nEnergia: " + this.getEnergy();
  }
}
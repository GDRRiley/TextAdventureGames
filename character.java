public class character {
private String name="";
private int health=0;
private double playerAtack = 1.0;
private int level=0;
public character(String n, int h, double pa){
 name=n; 
 health=h;
  playerAtack=pa;
 level=1;
}

public double getHealth(){
return health;
}
public void changeHealth(double i){
health+=i;
}
public void addLevel(){
level++;
}
public int getLevel(){
return level;
}
public String getName(){
return name;
}
public void changeAtack(double i){
playerAtack=i;
}
public double getAtack(){
return playerAtack;
}



}

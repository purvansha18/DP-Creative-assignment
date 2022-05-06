public abstract class Dosa
{
 final public void prepareDosa()
 {
  createBatter();
  fermentation();
  cook();
  addMasalaOrCheese();
  serve();
 }

public void createBatter()
{
  System.out.println("Making batter for dosa...");
}
public void fermentation()
 {
  System.out.println("After making batter for dosa keep it for fermentation process...");
 }

 public void cook()
 {
  System.out.println("Spread batter on pan in a round shape and cook it...");
 }

 
 abstract void addMasalaOrCheese();

 public void serve()
 {
  System.out.println("Serve dosa with sambhaar and chutney..");
 }
} 

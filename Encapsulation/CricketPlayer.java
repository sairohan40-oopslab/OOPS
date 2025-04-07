class CricketPlayer {
 private String name;
 private int runs;
 private int wickets;
 public void setName(String name) {
 this.name = name;
 }
 public void setRuns(int runs) {
 this.runs = runs;
 }
 public void setWickets(int wickets) {
 this.wickets = wickets;
 }
 public void getName() {
 System.out.println("Player Name: " + name);
 }
 public void getRuns() {
 System.out.println("Total Runs: " + runs);
 }
 public void getWickets() {
 System.out.println("Total Wickets: " + wickets);
 }
}
public class Main {
 public static void main(String[] args) {
 CricketPlayer player = new CricketPlayer();
 player.setName("Virat Kohli");
 player.setRuns(12000);
 player.setWickets(4);
 player.getName();
 player.getRuns();
 player.getWickets();
 }
}

/*
This program represents a playlist that adds, removes, and shuffles songs
Created by Emma on Feb. 23th, 2020
Intermediate Programming - Block 8
*/
import java.util.ArrayList;

class Playlist {

  public static void main(String[] args) {
    //new playlist
    ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
    //adding songs
    desertIslandPlaylist.add("six feet under");
    desertIslandPlaylist.add("bury a friend");
    desertIslandPlaylist.add("ocean eyes");
    desertIslandPlaylist.add("come out and play");
    desertIslandPlaylist.add("lovely");
    desertIslandPlaylist.add("I Lost a Friend");
    desertIslandPlaylist.add("Wonderwall");
    desertIslandPlaylist.add("You Will Be Found");
    //printing out list
    System.out.println(desertIslandPlaylist);
    //getting rid of songs
    desertIslandPlaylist.remove(1);
    desertIslandPlaylist.remove(1);
    desertIslandPlaylist.remove(3);
    //printing out list
    System.out.println(desertIslandPlaylist);
    //swapping songs
    int indexA = desertIslandPlaylist.indexOf("lovely");
    int indexB = desertIslandPlaylist.indexOf("Wonderwall");
    String tempA = "lovely";
    desertIslandPlaylist.set(indexA, "Wonderwall");
    desertIslandPlaylist.set(indexB, tempA);
    System.out.println(desertIslandPlaylist);

  }

}

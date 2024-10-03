/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package likedsongs;

import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author conor
 */

public class LikedSongs implements LikedSongsIF2 {
    
    public String name;
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    
    public ArrayList<String> songs;

    public LikedSongs() {
        songs = new ArrayList<String>();
    }
    
    public boolean isEmpty() {
        return songs.isEmpty();
    }

    public int size() {
        return songs.size();

    }

    
    /**
     * always false as there is no limit on the size of this ArrayList based
     * stack
     */
    public boolean isFull() {
        return false;
    }

    /**
     * removes the item from the top of the stack and returns it
     */
    public String pop() {
        if (!(songs.isEmpty())) {
            return songs.remove(0);
        } else {
            return null;
        }
    }

    /**
     * puts an item onto the top of the stack
     */
    public void push(Object newItem) {
        songs.add(0, (String) newItem);
    }


    // removes all elements from the stack
    public void emptyStack() {
        while (!songs.isEmpty()) {
            pop();
        }
    }

    // return a String object that consists of all elements from the stack
    // a FOR loop is used here, but you can use an Iterator instead
    public String displayStack() {
        int iCount;
        String sMessage = "";
        if (songs.isEmpty()) {
            sMessage = sMessage.concat("The Playist is EMPTY!");
        } else {
            sMessage = "The playlist contains: ";
            for (iCount = 0; iCount < songs.size(); iCount++) {
                sMessage = sMessage.concat(songs.get(iCount));
                sMessage = sMessage.concat("; ");
            }
        }
        return sMessage;
    }
    public void searchSong(){
   if (songs.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Sorry, There are no songs to search.");
        } else {
            String searchTerm = JOptionPane.showInputDialog(null, "Please enter a song name to search:");
            boolean found = false;
            for (String song : songs) {
                if (song.equalsIgnoreCase(searchTerm)) {
                    JOptionPane.showMessageDialog(null, "Song '" + searchTerm + "' found!");
                    found = true;
                    break;
                }
            }
            if (!found) {
                JOptionPane.showMessageDialog(null, "Song '" + searchTerm + "' not found.");
            }
        }
   }
   
}

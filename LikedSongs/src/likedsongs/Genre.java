/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package likedsongs;

import java.util.ArrayList;

/**
 *
 * @author conor
 */
public class Genre extends LikedSongs implements LikedSongsIF {

    public ArrayList<String> genreA;
    
    
    public Genre() {
        genreA = new ArrayList<String>();
        
    }

    public int size() {        
        return genreA.size();
    }
    
    public boolean isEmpty() {
        return genreA.isEmpty();
    }
    
    public Object frontElement() {
        if (genreA.size() > 0){
            return genreA.get(0).toString();
        } else {
            return null;
        }
    }
    
    public void enqueue(Object newsong) {
        genreA.add((String) newsong);
    }
    
    public Object dequeue() {
        if (genreA.size() > 0){
            return genreA.remove(0);
        } else {
            return null;
        }
    }
    
}

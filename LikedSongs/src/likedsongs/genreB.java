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
public class genreB extends LikedSongs implements LikedSongsIF{
    public ArrayList<String> genreB;
    
    public genreB() {
        genreB = new ArrayList<String>();
        
    }

    public int size() {        
        return genreB.size();
    }
    
    public boolean isEmpty() {
        return genreB.isEmpty();
    }
    
    public Object frontElement() {
        if (genreB.size() > 0){
            return genreB.get(0).toString();
        } else {
            return null;
        }
    }
    
    public void enqueue(Object newsong) {
        genreB.add((String) newsong);
    }
    
    public Object dequeue() {
        if (genreB.size() > 0){
            return genreB.remove(0);
        } else {
            return null;
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package likedsongs;

/**
 *
 * @author conor
 */
//Stack interface for liked Songs
public interface LikedSongsIF2{
    
    public boolean isEmpty();

    public boolean isFull();

    public void push(Object newItem);

    public Object pop();

    public int size();

    public void emptyStack();

    public String displayStack();
    
    public void searchSong();
}

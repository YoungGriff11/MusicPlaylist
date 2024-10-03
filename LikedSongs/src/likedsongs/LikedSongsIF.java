/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package likedsongs;

/**
 *
 * @author conor
 */
//Queue for Genre playlists
public interface LikedSongsIF {
    
    public boolean isEmpty();

    public int size();

    public Object frontElement();

    public void enqueue(Object newSong);

    public Object dequeue();

    
}

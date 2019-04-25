package com.kodilla.good.patterns.playlist;

import java.util.ArrayList;

public class ApplicationPlaylist {
    public static void main(String[] args) {

       // Music music = new Music();

        SubPlaylist subPlaylist = new SubPlaylist();

        ArrayList<Playable> nestedPlaylist = new ArrayList<>();
        nestedPlaylist.add(new Music("Muzyka:The Beatles 'Lucy in the Sky With Diamonds'"));
        nestedPlaylist.add(new Music("Muzyka:Rolling Stones 'Paint It Black' "));
        nestedPlaylist.add(new Music("Muzyka:The Beatles 'Imagine'"));
        nestedPlaylist.add(new Movie("Film: 'Pandora's Box'"));
        nestedPlaylist.add(new Music("Muzyka:The Beatles 'Yesterday'"));

        subPlaylist.multiplyNestedPlaylist(nestedPlaylist);
        subPlaylist.shufflePlaylist(nestedPlaylist);

        Playlist playlist = new Playlist();

        ArrayList<Playable> thePlaylist = new ArrayList<>();
        thePlaylist.add(new Music("Muzyka:Rolling Stones 'Brown Sugar' "));
        thePlaylist.addAll(nestedPlaylist);
        thePlaylist.add(new Movie("Film: 'Casablanca'"));

        playlist.playInLoop(thePlaylist);
        //playlist.playRandomly(thePlaylist);
        //playlist.playSequentially(thePlaylist);
    }
}
package com.design;

import java.util.ArrayList;
import java.util.List;

//this is a magic box
public class MediaBox {
    private Player player;
    private User usr;

    public MediaBox(User user ){
        this.usr = user;
    }

    public void playPopular(){
        System.out.println("User "+usr+" begin to play popular songs");

        //get popular play list for user
        Song song = new Song("hello","Peter","2019","USA","BBN");
        Song song1 = new Song("going","Jam","2018","Japan","CCV");
        //
        List<Song> myList = new ArrayList<>();
        myList.add(song);
        myList.add(song1);

        PlayList playList = new PlayList(myList);
        player = new Player(playList);
        player.playAll();



    }
}


package com.design;

import java.util.concurrent.CompletableFuture;

public class Player {
    private PlayList playList;

    public Player(PlayList playList){
        this.playList = playList;
    }

    public PlayList getPlayList() {
        return playList;
    }

    public void setPlayList(PlayList playList) {
        this.playList = playList;
    }
    public void playAll(){
        while(true){
            if(!playSong()){
                break;
            }
        }

    }


    public boolean playSong(){

            Song song = playList.getNext();
            if (null == song) {
                System.out.println("no song to play");
                return false;
            }

            System.out.println("begin play song: " + song);
            return true;


    }

    public void addSong(Song song){
        playList.queueToPlay(song);
    }


}

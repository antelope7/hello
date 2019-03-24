package com.design;

import java.util.List;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class PlayList {
    private Song song;
    private Queue<Song> queue = new ArrayBlockingQueue<Song>(1000);
    public PlayList(Song song){
        this.song = song;
    }
    public PlayList(List<Song> list){
        for(Song s:list){
            queue.add(s);
        }

    }

    public Song getNext(){
        if(queue.isEmpty()){
            return null;
        }
        return queue.poll();
    }

    public void queueToPlay(Song song){
        queue.add(song);
    }


}

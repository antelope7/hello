package com.design;

public class Main {
    public static void main(String[] args){
        User user = new User("Lily","9999");
        MediaBox mb = new MediaBox(user);
        mb.playPopular();
    }
}

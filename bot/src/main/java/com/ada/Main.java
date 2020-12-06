package com.ada;

/*
 * Created by contemplativemimosa on 12/4/20.
 */

import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;

public class Main {
    public static void main(String[] args){

        DiscordApi api = new DiscordApiBuilder()
                .setToken("")
                .login().join();

        api.addListener(new Listener());


    }
}

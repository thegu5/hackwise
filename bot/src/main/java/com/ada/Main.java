package com.ada;

/**
 * Created by contemplativemimosa on 12/4/20.
 */

import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;
import org.javacord.api.event.message.MessageCreateEvent;

public class Main {
    public static void main(String[] args){

        DiscordApi api = new DiscordApiBuilder()
                .setToken("Nzg0NTgwODQzMjU5NTU5OTU2.X8rX2Q.Vxj6Fa402efm8xBoqGemaFFEqNA")
                .login().join();

        api.addListener(new Listener());


    }
}

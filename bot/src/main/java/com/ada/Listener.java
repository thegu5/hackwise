package com.ada;

import java.util.*;
import org.javacord.api.event.message.MessageCreateEvent;
import org.javacord.api.listener.message.MessageCreateListener;

/**
 * Created by nhe on 12/4/20.
 */

public class Listener implements MessageCreateListener {

    @Override
    public void onMessageCreate(MessageCreateEvent event) {
        System.out.println("event is ]  " + event);

        if (event.getMessageContent().equalsIgnoreCase("!easteregg")) {
            Random r = new Random();
            int n = r.nextInt(5);
            switch (n) {
                case 0:
                    event.getChannel().sendMessage("https://www.khanacademy.org/college-careers-more/personal-finance");
                case 1:
                    event.getChannel().sendMessage("https://www.khanacademy.org/college-careers-more/learnstorm-growth-mindset-activities-us");
                case 2:
                    event.getChannel().sendMessage("https://www.youtube.com/watch?v=H6u0VBqNBQ8");
                case 3:
                    event.getChannel().sendMessage("https://www.khanacademy.org/humanities/high-school-civics");
                case 4:
                    event.getChannel().sendMessage("https://www.youtube.com/watch?v=BNYJQaZUDrI&list=PL8dPuuaLjXtNgK6MZucdYldNkMybYIHKR");
            }
        }

        //choose a class
        else if (event.getMessageContent().equalsIgnoreCase("!studygrammar")) {
            event.getChannel().sendMessage("https://www.khanacademy.org/humanities/grammar");
        } else if (event.getMessageContent().equalsIgnoreCase("!studyCS")) {
            event.getChannel().sendMessage("https://www.khanacademy.org/computing/computer-programming");
        } else if (event.getMessageContent().equalsIgnoreCase("!studyHistory")) {
            event.getChannel().sendMessage("I've linked both US and World below\n" +
                    "https://www.khanacademy.org/humanities/us-history\n" +
                    "https://www.khanacademy.org/humanities/world-history");
        } else if (event.getMessageContent().equalsIgnoreCase("!studyMath")) {
            event.getChannel().sendMessage("https://www.khanacademy.org/math");
        } else if (event.getMessageContent().equalsIgnoreCase("!studyELA")) {
            event.getChannel().sendMessage("https://www.khanacademy.org/ela");
        } else if (event.getMessageContent().equalsIgnoreCase("!studyScience")) {
            event.getChannel().sendMessage("https://www.khanacademy.org/science");

        }
        //command dictionary
        else if (event.getMessageContent().equalsIgnoreCase("!help")) {
            event.getChannel().sendMessage("To receive course recommendations:\n" +
                    "!studyCS - to find a Computer Programming course\n" +
                    "!studyMath - to find mathematics courses\n" +
                    "!studyHistory - to find US history or world history courses\n" +
                    "!studyScience - to find science courses\n" +
                    "!studyELA - to find English Language Arts courses\n" +
                    "!studyGrammar - to find a grammar course\n" +
                    "!easteregg - to try a random, interesting course\n" +
                    "To get a tutor: !tutor(subjectname)");
        }
    }
    /*public String nestedResponse(MessageCreateEvent response){
        if(response.getMessageContent().equalsIgnoreCase("US")){

        }else if (response.getMessageContent().equalsIgnoreCase("World")){
            event.getChannel().sendMessage("https://www.khanacademy.org/humanities/world-history");
        }else if (response.getMessageContent().contains("ye")){
            event.getChannel().sendMessage("https://www.khanacademy.org/science");
        }else if (response.getMessageContent().contains("no")){
            event.getChannel().sendMessage("https://www.youtube.com/user/crashcoursekids/playlists");
        }
        */
}

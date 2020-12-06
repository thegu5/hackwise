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
            int n = r.nextInt(10);
            switch (n) {
                case 0:
                    event.getChannel().sendMessage("https://www.khanacademy.org/college-careers-more/personal-finance");
                    break;
                case 1:
                    event.getChannel().sendMessage("https://www.khanacademy.org/college-careers-more/learnstorm-growth-mindset-activities-us");
                    break;
                case 2:
                    event.getChannel().sendMessage("https://www.youtube.com/watch?v=H6u0VBqNBQ8");
                    break;
                case 3:
                    event.getChannel().sendMessage("https://www.khanacademy.org/humanities/high-school-civics");
                    break;
                case 4:
                    event.getChannel().sendMessage("https://www.youtube.com/watch?v=BNYJQaZUDrI&list=PL8dPuuaLjXtNgK6MZucdYldNkMybYIHKR");
                    break;
                case 5:
                    event.getChannel().sendMessage("https://www.youtube.com/watch?v=ZQUxL4Jm1Lo");
                    break;
                case 6:
                    event.getChannel().sendMessage("https://www.youtube.com/watch?v=pOLmD_WVY-E");
                    break;
                case 7:
                    event.getChannel().sendMessage("https://www.youtube.com/watch?v=dItUGF8GdTw");
                    break;
                case 8:
                    event.getChannel().sendMessage("https://www.youtube.com/watch?v=deScHJGoVc8");
                    break;
                case 9:
                    event.getChannel().sendMessage("https://hubblesite.org/science/universe");
                    break;
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
        //to generate random math problems
        if(event.getMessageContent().equalsIgnoreCase("!randomProblem")){
            Random rand = new Random();
            int firstterm = rand.nextInt(36)+15;
            int secondterm = rand.nextInt(36) + 15;
            int thirdterm = rand.nextInt(51);
            int s = rand.nextInt(5);
            String op = "";
            if(firstterm%2 ==0){
                op = "-";
            }
            switch(s){
                case 0:
                    event.getChannel().sendMessage("Solve for x: 0= "+ firstterm+"x^2 + "+secondterm+"x + "+ thirdterm);
                    break;
                case 1:
                    event.getChannel().sendMessage("Draw a graph of the equation: " +op+ firstterm+" + " +thirdterm);
                    break;
                case 2:
                    event.getChannel().sendMessage("solve: " + secondterm/thirdterm);
                    break;
                case 3:
                    event.getChannel().sendMessage("Solve for y: " + firstterm + "y + " +thirdterm + " = "+secondterm + "x + "+s);
                    break;
                case 4:
                    event.getChannel().sendMessage("solve or simplify, if possible: " + firstterm/secondterm);
                    break;
            }
        }
        //to find parenting resources
        if(event.getMessageContent().equalsIgnoreCase("!socio-emo")){
            event.getChannel().sendMessage(" https://bealearninghero.org/parentstrong-2/resources/?tax_language=english&tax_subject=social&search_query&wpas_id=resources-search-parents&wpas_submit=1#results");
        }else if (event.getMessageContent().equalsIgnoreCase("!childEducation")){
            event.getChannel().sendMessage("https://www.pbs.org/parents");
        }
        //command dictionary
        if (event.getMessageContent().equalsIgnoreCase("!help")) {
            event.getChannel().sendMessage("To receive course recommendations:\n" +
                    "!studyCS - to find a Computer Programming course\n" +
                    "!studyMath - to find mathematics courses\n" +
                    "!studyHistory - to find US history or world history courses\n" +
                    "!studyScience - to find science courses\n" +
                    "!studyELA - to find English Language Arts courses\n" +
                    "!studyGrammar - to find a grammar course\n" +
                    "!easteregg - to try a random, interesting course\n" +
                    "To practice math or challenge yourself with a random problem:\n"+
                    "!randomProblem - generates a random quadratic equation, graphing, long division, or fraction problem\n"+
                    "For parenting resources:\n"+
                    "!social-emo - links you to a page of resources providing tips on how to support children's socio-emotional development\n"+
                    "!childEducation - links to resources for supplementing the learning of young children at home");

        }
    }
}

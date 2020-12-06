package com.ada;

import org.javacord.api.entity.channel.*;
import org.javacord.api.entity.permission.Permissions;
import org.javacord.api.entity.server.*;
import org.javacord.core.entity.user.Member;

import java.security.Permission;
import java.util.EnumSet;

/**
 * Created by nhe on 12/5/20.
 */
public class TutorPair{


    public static void createTutorRoom(String subject, Member member){
        Server server = member.getServer();
        ServerTextChannel tutorRoom = new ServerTextChannelBuilder(server)
                .setName(subject+" tutoring")
                .setTopic("Academic Support")
                .addPermissionOverwrite(member, EnumSet.of(Permission.VIEW_CHANNEL), null);
    }
}

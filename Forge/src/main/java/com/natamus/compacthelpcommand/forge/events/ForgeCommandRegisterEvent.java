package com.natamus.compacthelpcommand.forge.events;

import com.natamus.compacthelpcommand.cmds.CommandHelp;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class ForgeCommandRegisterEvent {
    @SubscribeEvent
    public static void registerCommands(RegisterCommandsEvent e) {
    	CommandHelp.register(e.getDispatcher());
    }
}

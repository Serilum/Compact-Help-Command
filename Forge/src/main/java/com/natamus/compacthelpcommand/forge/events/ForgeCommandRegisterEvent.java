package com.natamus.compacthelpcommand.forge.events;

import com.natamus.compacthelpcommand.cmds.CommandHelp;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber
public class ForgeCommandRegisterEvent {
    @SubscribeEvent
    public void registerCommands(RegisterCommandsEvent e) {
    	CommandHelp.register(e.getDispatcher());
    }
}

package com.serilum.compacthelpcommand.neoforge.events;

import com.serilum.compacthelpcommand.cmds.CommandHelp;
import net.neoforged.neoforge.event.RegisterCommandsEvent;
import net.neoforged.bus.api.SubscribeEvent;

public class NeoForgeCommandRegisterEvent {
	@SubscribeEvent
	public static void registerCommands(RegisterCommandsEvent e) {
		CommandHelp.register(e.getDispatcher());
	}
}

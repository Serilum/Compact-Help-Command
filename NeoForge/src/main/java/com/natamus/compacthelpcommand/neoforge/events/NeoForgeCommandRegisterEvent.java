package com.natamus.compacthelpcommand.neoforge.events;

import com.natamus.compacthelpcommand.cmds.CommandHelp;
import net.neoforged.neoforge.event.RegisterCommandsEvent;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber
public class NeoForgeCommandRegisterEvent {
	@SubscribeEvent
	public static void registerCommands(RegisterCommandsEvent e) {
		CommandHelp.register(e.getDispatcher());
	}
}

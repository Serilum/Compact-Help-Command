package com.natamus.compacthelpcommand;

import com.natamus.collective.check.RegisterMod;
import com.natamus.compacthelpcommand.cmds.CommandHelp;
import com.natamus.compacthelpcommand.util.Reference;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.command.v1.CommandRegistrationCallback;

public class ModFabric implements ModInitializer {
	
	@Override
	public void onInitialize() {
		setGlobalConstants();
		ModCommon.init();

		loadEvents();

		RegisterMod.register(Reference.NAME, Reference.MOD_ID, Reference.VERSION, Reference.ACCEPTED_VERSIONS);
	}

	private void loadEvents() {
		CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess) -> {
			CommandHelp.register(dispatcher);
		});
	}

	private static void setGlobalConstants() {

	}
}

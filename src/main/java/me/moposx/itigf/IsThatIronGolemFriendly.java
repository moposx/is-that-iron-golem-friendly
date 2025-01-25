package me.moposx.itigf;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IsThatIronGolemFriendly implements ModInitializer {
	public static final String MOD_ID = "itigf";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("[{}] Find some friendly iron golems.", MOD_ID);
	}
}
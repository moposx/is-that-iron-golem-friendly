package me.moposx.itigf;

import net.minecraft.world.entity.animal.IronGolem;

import snownee.jade.api.IWailaClientRegistration;
import snownee.jade.api.IWailaPlugin;

import me.moposx.itigf.provider.IronGolemComponentProvider;

public class IsThatIronGolemFriendlyPlugin implements IWailaPlugin {
    @Override
    public void registerClient(IWailaClientRegistration registration) {
        // register component providers
        registration.registerEntityComponent(IronGolemComponentProvider.INSTANCE, IronGolem.class);
    }
}

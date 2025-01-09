package me.moposx.itigf.provider;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.animal.IronGolem;

import snownee.jade.api.EntityAccessor;
import snownee.jade.api.IEntityComponentProvider;
import snownee.jade.api.ITooltip;
import snownee.jade.api.config.IPluginConfig;

import me.moposx.itigf.IsThatIronGolemFriendly;

public enum IronGolemComponentProvider implements IEntityComponentProvider {
    INSTANCE;

    @Override
    public void appendTooltip(ITooltip tooltip, EntityAccessor accessor, IPluginConfig config) {
        IronGolem golem = (IronGolem) accessor.getEntity();

        if (golem.isPlayerCreated()) {
            String key = String.format("entity.%s.iron_golem.friendly", IsThatIronGolemFriendly.MOD_ID);
            MutableComponent text = Component.translatable(key).withStyle(ChatFormatting.DARK_GREEN);
            tooltip.add(text);
        }
    }

    @Override
    public ResourceLocation getUid() {
        return ResourceLocation.fromNamespaceAndPath(IsThatIronGolemFriendly.MOD_ID,
                "show_iron_golem_friendliness");
    }
}

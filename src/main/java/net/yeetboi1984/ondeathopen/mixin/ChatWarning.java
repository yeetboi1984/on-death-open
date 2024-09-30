package net.yeetboi1984.ondeathopen.mixin;

import net.minecraft.client.MinecraftClient;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;


@Mixin(ServerPlayerEntity.class)
public class ChatWarning {
    @Inject(at = @At("TAIL"), method = "onWorldload")
	private void init(CallbackInfo info) {
        MinecraftClient mc = MinecraftClient.getInstance();
        mc.player.sendMessage(Text.literal("WARNING! YOU ARE USING ON DEATH OPEN! DOUBLE CHECK YOUR CONFIG!"));
    }
}

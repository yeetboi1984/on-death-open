package net.yeetboi1984.ondeathopen.mixin;

import net.minecraft.server.network.ServerPlayerEntity;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import net.yeetboi1984.ondeathopen.OnDeathOpenClient;

@Mixin(ServerPlayerEntity.class)
public class OnDeath {
	private static String OS = System.getProperty("os.name").toLowerCase();
	@Inject(at = @At("TAIL"), method = "onDeath")
	private void init(CallbackInfo info) {
		OnDeathOpenClient.UpdateConfig();

		String prefix = "";

		if(OS.indexOf("win") >= 0) {
			prefix = "cmd.exe /C ";
		}
		else if(OS.indexOf("nix") >= 0 || OS.indexOf("nux") >= 0 || OS.indexOf("aix") > 0 ) {
			prefix = "/bin/sh ";
		}
		try {
			Runtime.getRuntime().exec(prefix + OnDeathOpenClient.command);
		} catch (Exception e) {
			e.printStackTrace();
		}
		}
	}
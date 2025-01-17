package qouteall.imm_ptl.core.mixin.client;

import net.minecraft.client.network.PlayerListEntry;
import net.minecraft.world.GameMode;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import qouteall.imm_ptl.core.ducks.IEPlayerListEntry;

@Mixin(PlayerListEntry.class)
public class MixinPlayerListEntry implements IEPlayerListEntry {
    @Shadow
    private GameMode gameMode;
    
    @Override
    public void setGameMode(GameMode mode) {
        gameMode = mode;
    }
}

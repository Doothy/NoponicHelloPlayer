package gg.oddysian.death.helloplayer.helloplayer.listeners;

import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;

public class LoginListener {
    // On every player login
    @SubscribeEvent
    public static void onLogin(PlayerEvent.PlayerLoggedInEvent event){
        event.player.sendMessage(new TextComponentString("Hello " + event.player.getName()));
    }
}

package gg.oddysian.death.helloplayer.helloplayer.listeners;

import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;
import gg.oddysian.death.helloplayer.helloplayer.util.Scheduler;

public class LoginListener {
    // On every player login
    @SubscribeEvent
    public static void onLogin(PlayerEvent.PlayerLoggedInEvent event){

            Scheduler.runAsyncTimer(event.player.getServer(), 100,1);
            System.out.println("Login Event triggered!");
            event.player.sendMessage(new TextComponentString("Hello " + event.player.getName()));
    }
}

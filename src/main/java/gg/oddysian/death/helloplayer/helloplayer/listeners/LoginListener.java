package gg.oddysian.death.helloplayer.helloplayer.listeners;

import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;

public class LoginListener {
    public LoginListener(){
        MinecraftForge.EVENT_BUS.register(this);
    }

    // On every player login
    @SubscribeEvent
    public void onLogin(PlayerEvent.PlayerLoggedInEvent event){
        //Scheduler.runAsyncTimer(event.player.getServer(), 100,1); causes crashes
        System.out.println("Login Event triggered!");
        event.player.sendMessage(new TextComponentString("Hello " + event.player.getName()));
    }
}

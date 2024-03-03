package dev.potato.nmsexample.listeners;

import org.bukkit.craftbukkit.v1_20_R3.entity.CraftPlayer;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class PlayerMovementListener implements Listener {
    @EventHandler
    public void onPlayerMove(PlayerMoveEvent e) {
        // SPIGOT/BUKKIT:
        // Player interface object, that provides an implementation of the CraftBukkit CraftPlayer class, which uses NMS
        Player p = e.getPlayer(); // INTERFACE

        // CRAFTBUKKIT:
        // Now we have access to the raw CraftPlayer object
        CraftPlayer craftPlayer = (CraftPlayer) p; // CLASS


        /*
        -----------------------
        -                     -
        -         NMS         -
        -                     -
        -----------------------
        */


        // SPIGOT MAPPINGS:
        /*
        // We can now access NMS specific objects, such as an EntityPlayer
        EntityPlayer entityPlayer = craftPlayer.getHandle(); // CLASS

        // Sending packets using NMS
        PlayerConnection playerConnection = entityPlayer.c;
        PacketPlayOutGameStateChange packet = new PacketPlayOutGameStateChange(PacketPlayOutGameStateChange.c, 0f);
        playerConnection.b(packet);
        craftPlayer.sendMessage();

        // Sending player messages using NMS
        entityPlayer.a(IChatBaseComponent.a("Sending weather packet!"));
        */


        // MOJANG MAPPINGS:
        /*
        // We can now access NMS specific objects, such as a ServerPlayer
        ServerPlayer serverPlayer = craftPlayer.getHandle();

        // Sending packets using NMS
        ServerGamePacketListenerImpl connection = serverPlayer.connection;
        ClientboundGameEventPacket packet = new ClientboundGameEventPacket(ClientboundGameEventPacket.STOP_RAINING, 0f);
        connection.send(packet);

        // Sending player messages using NMS
        connection.sendPlayerChatMessage(PlayerChatMessage.system("Sending weather change"), ChatType.bind(ChatType.CHAT, serverPlayer));
        */


        /*
        UNDERSTANDING NMS:
        1) Look at the CraftBukkit source code
        2) Tutorials (that probably don't exist)
        3) NMS source code
        4) Debugging statements
        */
    }
}
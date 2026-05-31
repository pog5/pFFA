package me.pafias.pffa.events;

import lombok.Getter;
import me.pafias.pffa.objects.Spawn;
import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;
import org.jetbrains.annotations.NotNull;

/**
 * Fired after a player is teleported into an FFA spawn, with their kit already applied.
 */
public class FFASpawnEvent extends PlayerEvent {

    private static final HandlerList HANDLERS = new HandlerList();

    @Getter
    private final Spawn spawn;

    public FFASpawnEvent(@NotNull Player player, @NotNull Spawn spawn) {
        super(player);
        this.spawn = spawn;
    }

    @NotNull
    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

}

package listeners

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent
import java.util.logging.Logger

class Connect(private val logger: Logger) : Listener {
  @EventHandler
  fun onPlayerJoin(e: PlayerJoinEvent) {
    logger.info(e.player.name + " joined кароче")
  }
}
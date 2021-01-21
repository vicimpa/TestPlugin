import listeners.Connect
import org.bukkit.plugin.java.JavaPlugin

class Plugin : JavaPlugin() {
  private val connect = Connect(logger)

  override fun onEnable() {
    logger.info("Join")
    server.pluginManager.registerEvents(connect, this)
  }

  override fun onDisable() {
    logger.info("Disconnect")
  }
}
package io.github.andjsrk.iscareexplosions

import org.bukkit.entity.Creeper
import org.bukkit.entity.Fireball
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.entity.EntityExplodeEvent
import org.bukkit.plugin.java.JavaPlugin

class IScareExplosions: JavaPlugin(), Listener {
    override fun onEnable() {
        server.pluginManager.registerEvents(this, this)
    }
    @EventHandler
    fun onExplode(event: EntityExplodeEvent) {
        when (event.entity) {
            is Creeper, is Fireball -> { // ghast's fireball; also there is SmallFireball which indicates blaze's fireball
                event.blockList().clear()
            }
        }
    }
}

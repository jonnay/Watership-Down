(ns net.jonnay.watershipdown.WatershipDown
  (:import org.bukkit.Bukkit
           org.bukkit.plugin.java.JavaPlugin)
  (:gen-class
   :name net.jonnay.watershipdown.WatershipDown
   :extends org.bukkit.plugin.java.JavaPlugin
   )
)

;//#^{Stateless {}} is a @Stateless annotation

(set! *warn-on-reflection* true)
(set! *use-context-classloader* false)

(defn debug-to-mc-log [^String msg]
  (let [logger (Bukkit/getLogger)]
    (. logger info (str "(DEBUG) " msg))))

(defn -onEnable []
  (debug-to-mc-log "Enabled Watership down.  Super Clojure Powers!"))

(defn -onDisable []
  (debug-to-mc-log "Disabled Watership down."))

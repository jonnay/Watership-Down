(defproject net.jonnay/watershipdown  "0.1"
  :description "An example clojure bukkit plugin"
  :dependencies [[org.bukkit/bukkit "1.1-R3"]]
  :repositories {"org.bukkit" "Bukkit" "bukkit" {:url "http://repo.bukkit.org/content/groups/public/"}}
  :warn-on-reflection true
  :aot [net.jonnay.watershipdown.WatershipDown]
  :manifest {"Class-Path" "../lib/clojure-1.3.0.jar"}
)
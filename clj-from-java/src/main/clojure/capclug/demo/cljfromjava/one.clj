(ns capclug.demo.cljfromjava.one
  (:gen-class 
    :name capclug.demo.HelloOne
    :methods [[hiya [String] String]]))

(defn heya [#^String name]
  (do
    (println "heya " name)
    name))

(defn -main [& args] 
  (println args))

(defn -hiya [this #^String name]
  (heya name))

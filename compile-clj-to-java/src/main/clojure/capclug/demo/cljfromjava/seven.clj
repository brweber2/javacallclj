(ns capclug.demo.cljfromjava.seven
  (:gen-class
    :methods [[foo ["[Ljava.lang.String;" ] String]]))

(defn -foo [^"[Ljava.lang.String;" args]
  (println "at least I got here! " args)
  "return me")

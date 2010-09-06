(ns capclug.demo.cljfromjava.four-4
  (:gen-class))


; this doesn't compile!!!! (without four_4.clj on the classpath!)
(defn -main [& args]
  (println "in main four-4"))

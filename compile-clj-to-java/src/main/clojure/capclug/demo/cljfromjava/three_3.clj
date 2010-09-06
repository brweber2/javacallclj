(ns capclug.demo.cljfromjava.three-3
  (:gen-class))

(defn wow []
  (println "this is not visible i java"))

; if you take me out and call main in java, kaboom! main can be called, it just has nothing to call....
(defn -main [& args]
  (println "calling main, are we?"))



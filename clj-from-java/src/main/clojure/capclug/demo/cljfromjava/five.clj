(ns capclug.demo.cljfromjava.five
  (:gen-class
    :methods [[five-5 [] String]]))


(defn -five-5 []
  (println "high five")
  "done")

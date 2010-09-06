(ns capclug.demo.cljfromjava.five
  (:gen-class
    :methods [[five-5 [] String]]))

; generates public java.lang.String five-5(); which is not callable from Java!
(defn -five-5 []
  (println "high five")
  "done")

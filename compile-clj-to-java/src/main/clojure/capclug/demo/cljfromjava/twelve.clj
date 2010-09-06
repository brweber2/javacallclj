(ns capclug.demo.cljfromjava.twelve
  (:gen-class))

; not smart enought to compile & args to an array... it is just java.lang.Object
(defn -foo [str & args]
  "had enough?")

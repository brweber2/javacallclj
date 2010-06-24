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


; files with - in the name
; defrecord
; deftype
; defprotocol
; another project with dependency on this that calls this code from java
; using primitives
; using arrays
; type hints
; IDE java refactoring (does it detect clojure usages?)
; what else?
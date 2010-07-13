(ns capclug.demo.cljfromjava.seven
  (:gen-class
    :methods [[foo ["[Ljava.lang.String;" ] String]]))
; tried #^(into-array String nil)
; tried #^"[Ljava.lang.String;"
; tried Array
; tried (meta #^#=(array-of String) [])
; tried #^#=(array-of String)
; tried #^String[]

(defn -foo [$^"[Ljava.lang.String;" args]
  (println "at least I got here! " args)
  "return me")

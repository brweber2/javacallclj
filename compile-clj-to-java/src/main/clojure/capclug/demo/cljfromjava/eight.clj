(ns capclug.demo.cljfromjava.eight
  (:gen-class
    :methods [[foo [Object] void]
              [bar [Object] void]
              [baz [Object] void]]))

(defn -foo [this #^String baz]
  (println "will I work? " baz))

; tries to cast Double to String
(defn -bar [this #^String baz]
  (println "will I work? " (.toUpperCase baz)))

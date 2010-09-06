(ns capclug.demo.cljfromjava.nine
  (:gen-class
    :methods [[foo [String] void]
              [bar [String] void]]))

(defn -foo [this #^Object baz]
  (println "will I work? " baz))

(defn -bar [this #^Object baz]
  (println "will I work? " (.toUpperCase baz)))

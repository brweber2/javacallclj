(ns capclug.demo.cljfromjava.ten
  (:gen-class
    :methods [[foo [String] void]
              [bar [String] void]
              [baz [String] void]]))

(defn -foo [this #^Integer baz]
  (println "will I work? " baz))

(defn -bar [this #^Integer baz]
  (println "will I work? " (.toUpperCase baz)))

(defn -baz [this #^Integer baz]
  (println "will I work? " (.doubleValue baz)))
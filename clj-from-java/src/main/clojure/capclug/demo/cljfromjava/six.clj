(ns capclug.demo.cljfromjava.six
  (:gen-class
    :methods [[latida [Object Object] void]
              [datila [String int] void]]
              [foo [int String] void]))  ; this doesn't match the type hints!!???

(defn -latida [this #^String msg, #^Integer/TYPE n]
  (println (repeat n msg)))

(defn -datila [this msg n]
  (println (repeat n msg)))

(defn -foo [this #^String msg #^Integer/TYPE n]
  (println (repeat n msg)))

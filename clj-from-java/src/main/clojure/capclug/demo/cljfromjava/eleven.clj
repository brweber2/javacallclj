(ns capclug.demo.cljfromjava.eleven
  (:gen-class
    :methods [[foo [String "[Ljava.lang.String;"] String]]))

; compiles to String[] b/c we explicitly said to do so above
(defn -foo [str & args]
  "confused?")

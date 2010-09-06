(ns capclug.demo.cljfromjava.two)

(defrecord Foo [bar baz])

(deftype Bing [ham ton])

(defprotocol Blah "doc string"
  (add [a b] (+ a b))
  (sub [a b] (- a b)))

(deftype Bleh [#^int c]
  Blah
  (add [a b] (+ a b c))
  (sub [a b] (- a b c)))

; there is a lot more that you could do here... 

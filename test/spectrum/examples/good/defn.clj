(ns spectrum.examples.good.defn
  (:require [clojure.spec :as s]))

(s/fdef foo :args (s/cat :x string?) :ret string?)
(defn foo [x]
  x)

(ns fartgate.core-test
  (:require [clojure.test :as t]
            [fartgate.core :as f]
            [cheshire.core :as json]))

(t/deftest default (t/is (= (f/-handleRequest nil (clojure.java.io/reader "dev-resources/test.json") nil nil) {:container 137})))


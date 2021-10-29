(ns foo.a-test
  (:require [cljs.test :refer [deftest is]]))

(deftest basic-test
  (is (= 4 (+ 2 2))))

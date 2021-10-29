(ns foo.main
  (:require [huon.log :as log]))

(defn ^:export init []
  (log/configure! {:root-level :debug, :format identity})
  (log/info "Hello, world!"))

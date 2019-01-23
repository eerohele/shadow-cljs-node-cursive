(ns my.app
  (:require [cljs.nodejs :as node]))

(def fs (node/require "fs"))

(defn -main
  [& args]
  (println "Hello, world!"))

(defn read-file
  [path]
  (.readFileSync fs path #js {:encoding "utf-8"}))

(comment
  (read-file "/etc/passwd"))

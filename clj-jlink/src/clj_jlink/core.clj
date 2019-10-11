(ns clj-jlink.core
  (:gen-class)
  (:require [ring.adapter.jetty :refer [run-jetty]]))

(defn handler [req]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body "Hello World"})

(defn -main []
  (run-jetty handler {:port 3000}))

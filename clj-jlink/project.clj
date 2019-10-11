(defproject clj-jlink "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [ring/ring-core "1.7.1"]
                 [ring/ring-jetty-adapter "1.7.1"]]
  :main ^:skip-aot clj-jlink.core
  :plugins [[lein-jlink "0.2.1"]]
  :profiles {:uberjar {:aot :all}})

(defproject fartgate "0.1.0-SNAPSHOT"
  :description "Figure out when your AWS Fargate tasks are smelling up the room"
  :url "https://github.com/latacora/fartgate"
  :license {:name "EPL-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [cheshire "5.8.1"]
                 [com.amazonaws/aws-lambda-java-core "1.2.0"]
                 [com.taoensso/timbre "4.10.0"]]
  :main ^:skip-aot fartgate.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})

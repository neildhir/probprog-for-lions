(defproject lion "0.1.0-SNAPSHOT"
  :description "Demo of nonparametric probabilistic programs"
  :dependencies [[org.clojure/clojure "1.8.0"]
		 [nstools "0.2.4"]
		 [anglican "1.0.0"]
		 [org.clojure/data.csv "0.1.3"]
		 [org.clojure/math.combinatorics "0.1.3"]]
  :plugins [[dtolpin/lein-gorilla "0.3.7-SNAPSHOT"]]
  :resource-paths ["demo/"]
  :main ^:skip-aot anglican.core)

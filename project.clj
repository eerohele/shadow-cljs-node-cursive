(defproject app "0.1.0-SNAPSHOT"
  :aliases {"shadow-cljs" ["with-profile" "+cljs" "run" "-m" "shadow.cljs.devtools.cli" "watch" "app"]}

  :dependencies [[org.clojure/clojure "1.10.0"]
                 [org.clojure/clojurescript "1.10.439"]
                 [com.google.javascript/closure-compiler-unshaded "v20181210"]]

  :profiles {:cljs {:dependencies [[thheller/shadow-cljs "2.7.13"]
                                   [cider/piggieback "0.3.10"]]}})

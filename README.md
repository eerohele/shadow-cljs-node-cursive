1. Run `npm install shadow-cljs source-map-support --save-dev`.
1. Run `lein shadow-cljs`.
1. Once the shadow-cljs server has started, in another terminal window, run `node target/main.js`.
1. In Cursive, connect to the nREPL server running at port 50000.
1. In the REPL in Cursive, to switch to a ClojureScript REPL, run:

    ```clojure
    (shadow.cljs.devtools.api/nrepl-select :app)
    ```

1. In Cursive, run the "Load file in REPL" command.
1. Evaluate all the things!

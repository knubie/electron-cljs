(ns demo.renderer
  (:require
    [shadow.esm :as esm]
    [shadow.cljs.modern :refer (js-await)]))

(defn init []
  (js-await [x (esm/load-by-name "x")]
    ((x) "Module loaded")))

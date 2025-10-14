(ns demo.renderer
  (:require
    [shadow.lazy :as lazy]
    [shadow.cljs.modern :refer (js-await)]))

(def x-lazy (lazy/loadable demo.loadable/x))

(defn init []

  (lazy/load x-lazy)
  (js-await [x (lazy/load x-lazy)]
    (x "Module loaded")))

(ns demo.loadable)

(defn x {:lazy-loadable "x"} [msg]
  (js/alert msg))

(ns books.core)

(defn handler [request]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body "Hello, my books!"})

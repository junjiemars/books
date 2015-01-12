(ns owl.books.core
  (:require [ring.util.response :as rur])
  (:require [ring.middleware
             [file :as rmf]
             [resource :as rmr]
             [not-modified :as rmn]
             [content-type :as rmc]
             [session :as rms]]))

(defn handler [request]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body (list request)})

(defn init []
  (println "#init lein ring..."))

(defn destroy []
  (println "#destroy lein ring..."))

(def app
  (-> (fn [{session :session}]
        (rur/response (str "abc " (:username session))))
      (rms/wrap-session)))

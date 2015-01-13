(ns owl.books.core
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]))

(defn handler [request]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body (list request)})

(defn init []
  (println "#init lein ring..."))

(defn destroy []
  (println "#destroy lein ring..."))

(defroutes app-routes
  (GET "/" [] "Welcome Owl's Books")
  (route/not-found "not found"))

(def app
  (wrap-defaults app-routes site-defaults))

(ns owl.books.core
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]
            [owl.books.views :as v])
  (:gen-class))

(defn handler [request]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body (list request)})

(defn init []
  (println "#init lein ring..."))

(defn destroy []
  (println "#destroy lein ring..."))

(defn user-routes [user-id]
  (routes
   (GET "/profile" [] "u'r in profile")
   (GET "/posts" [] (v/user-posts))))

(defroutes app-routes
  (GET "/" [] (v/home-page))
  (context "/user/:user-id" [user-id]
           (user-routes user-id))
  (route/not-found "Page not found"))

(def app
  (wrap-defaults app-routes site-defaults))

(defn -main [& args]
  (app args))

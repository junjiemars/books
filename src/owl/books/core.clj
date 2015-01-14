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

(defn notes-route [note-id]
  (routes
   (GET "/" [] (str "default notes:" note-id))
   (GET "/profile" [] (v/notes-page))))

(defroutes app-routes
  (GET "/" [] (v/home-page))
  (context "/notes/:note-id" [note-id]
           (notes-route note-id))
  (route/not-found "Page not found"))

(def app
  (wrap-defaults app-routes site-defaults))

(defn -main [& args]
  (app args))

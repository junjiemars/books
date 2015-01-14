(ns owl.books.views
  (:use [hiccup.core])
  (:gen-class))

(defn user-posts []
  (html [:span {:class "foo"} "bar"]))

(ns owl.books.views
  (:use [hiccup.core])
  (:use [hiccup.page])
  (:gen-class))

(defn gen-page-head [title]
  [:head
   [:title (str "Locations: " title)]
   (include-css "css/styles.css")])

(def header-links
  [:div#header-links
   "[ "
   [:a {:href "/"} "Home"]
   " | "
   [:a {:href "/notes"} "Notes"]
   " ]"])

(defn home-page []
  (html5
   (gen-page-head "Home")
   [:h1 "Home"]
   header-links
   [:p "Welcome to Owl's Books"]))

(defn notes-page [& args]
  (html5
   (gen-page-head "Notes")
   [:h1 "Notes"]
   header-links
   [:p "Oh, u got in Notes"]))


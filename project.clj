(defproject books "0.1.0"
  :description "owl's books"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [compojure "1.3.1"]
                 [ring/ring-defaults "0.1.3"]
                 [hiccup "1.0.5"]
                 [korma "0.4.0"]
                 ]
  :plugins [[lein-ring "0.8.13" :exclusions [org.clojure/clojure]]]
  :main owl.books.core
  :ring {:handler owl.books.core/app
         :init owl.books.core/init
         :destroy owl.books.core/destroy
         #_ (:nrepl {:start? true
                     :port 2999})})

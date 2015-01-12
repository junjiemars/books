(defproject books "0.1.0"
  :description "my books"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [ring/ring-core "1.3.1"]
                 [ring/ring-jetty-adapter "1.3.1"]
                 ]
  :plugins [[lein-ring "0.8.13"]]
  :ring {:handler owl.books.core/handler
         :init owl.books.core/init
         :destroy owl.books.core/destroy
         #_ (:nrepl {:start? true
                     :port 2999})})

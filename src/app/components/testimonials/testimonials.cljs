(ns app.components.testimonials.testimonials
  (:require [reagent.core :as r]
            ["react-responsive-carousel" :refer [Carousel]]))


(def carousel (r/adapt-react-class Carousel))

(defn testimonials []
  [:div.testimonials {:id "testmonials"}
   [:img.testimonials-image {:src "resources/pictures/clients/map.png" :alt "all clients"}]
   [:div.testimonials-content
    [:h2.testimonials-title.text-header "Meet client satisfaction by using product"]
    [:p.testimonials-description "The rise of mobile devices transforms the way we consume information entirely and the world's most elevant channels such as Facebook"]
    
    [carousel

     [:div [:img {:src "resources/pictures/clients/client-1.png" :alt "stars"}]
      [:img {:src "resources/pictures/clients/client-2.png" :alt "stars"}]
      [:img {:src "resources/pictures/clients/client-3.png" :alt "stars"}]]]]])


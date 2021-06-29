(ns app.components.features.features
  (:require [app.components.features-item.features-item :refer [features-item]]))

(defn features []
  [:<> 
   [:div {:class "features" :id "features"}]
   [:div.features-content
    [:img.features-phone {:src "resources/pictures/main/features-phone.png" :alt "nothing"}]
    [:div.features-text
     [:p.text-header "Awesome apps features"]
     [:p.text-sub "Increase productivity with a simple to-do app, app for managing your personal budgets."]
     [:br]
     (features-item "inline-left" "resources/pictures/icons/icon-1.png" "Fast Performance" "#f55767" "Get your blood test delivered at home collect a sample from the news your blood tests")
     (features-item "inline-left" "resources/pictures/icons/icon-2.png" "Prototyping" "#2563ff" "Get your blood test delivered at home collect a sample from the news your blood tests")
     (features-item "inline-left" "resources/pictures/icons/icon-3.png" "Vector Editing" "#40975f" "Get your blood test delivered at home collect a sample from the news your blood tests")]]])

(def features-list [{:position "inline-left"
              :image "resources/pictures/icons/icon-1.png"
              :title "Fast Performance"
              :color "#f55767" 
              :description "Get your blood test delivered at home collect a sample from the news your blood tests"}
             {:position "inline-left"
              :image "resources/pictures/icons/icon-2.png"
              :title "Prototyping"
              :color "#2563ff"
              :description "Get your blood test delivered at home collect a sample from the news your blood tests"}
             {:position "inline-left"
              :image "resources/pictures/icons/icon-3.png"
              :title "Vector Editing"
              :color "#40975f"
              :description "Get your blood test delivered at home collect a sample from the news your blood tests"}])

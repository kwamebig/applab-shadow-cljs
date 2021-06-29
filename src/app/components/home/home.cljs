(ns app.components.home.home
  (:require [app.components.button.button :refer [button]]))


(defn home []
  [:header.home
   [:div.home-content
    [:div.home-main
     [:div.home-text
      [:p.home-trophy
       [:i.choice {:class "far fa-check-circle"}] "#1 Editors Choice App of 2020"]
      [:p.home-title "Best app for your modern lifestyle"]
      [:p.text-sub "Increase productivity with a simple to-do app, app for managing your personal budgets."]
      [:div
       [button "Try for free"]
       [:a {:href "#"} "Watch demo video"]]]
     [:img.home-image {:src "resources/pictures/main/phone-1.png" 
                                   :alt "main phone"}]]]])
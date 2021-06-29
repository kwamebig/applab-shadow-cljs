(ns app.components.header.header
  (:require [reagent.core :as r]
            [app.components.button.button :refer [button]]))

(def dashboard [{:title "Home"
            :route ::home}
           {:title "Key Features"
            :route ::key-features}
           {:title "Pricing"
            :route ::pricing}
           {:title "Testimonials"
            :route ::testimonials}
           {:title "FAQ"
            :route ::faq}])

(defn menu []
  [:<>
   [:div 
   [:div {:class (str "nav-items ")}
    [:a {:href "#header-main"} "Home"]
    [:a {:href "#feature"} "Key Features"]
    [:a {:href "#pricing"} "Pricing"]
    [:a {:href "#testimonials"} "Testimonials"]
    [:a {:href "#faq"} "FAQ"]
    [button "Try for free"]]]])

(defn logo []
  [:a.logo {:href "#"} "Lab"])

(defn navbar []
  [:nav.navbar
   [logo]
   [menu]])

(defn header []
  [:header.header
   [:div
    [navbar]]])

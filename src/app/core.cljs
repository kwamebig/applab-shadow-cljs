(ns app.core
  (:require [reagent.dom :as rdom]
            [reagent.core :as r]
            [reitit.frontend.easy :as rfe]
            [reitit.frontend :as rf]
            [reitit.coercion.spec :as rss]
            [app.components.home.home :refer [home]]
            [app.components.partners.partners :refer [partners]]
            [app.components.features.features :refer [features]]
            [app.components.pricing.pricing :refer [pricing]]
            [app.components.testimonials.testimonials :refer [testimonials]]
            [app.components.faq.faq :refer [faq]]
            [app.components.clock.clock :refer [clock]]
            [app.components.button.button :refer [button]]))


(defn menu []
  [:<>
   [:div {:class (str "nav-items")}
    [:a {:href (rfe/href ::home)} "Home"]
    [:a {:href (rfe/href ::features {:id 1})} "Key Features"]
    [:a {:href (rfe/href ::pricing {:id 1})} "Pricing"]
    [:a {:href (rfe/href ::testimonials {:id 1})} "Testimonials"]
    [:a {:href (rfe/href ::faq {:id 1})} "FAQ"]
    [:a {:href (rfe/href ::clock {:id 1})} "Clock"]
    [button "Try for free"]]]) 

(defn logo []
  [:a.logo {:href (rfe/href ::home)} "Lab"])

(defn header-navbar []
  [:nav.navbar
   (logo)
   (menu)])

(defn footer-navbar []
  [:footer.footer
  [:div {:class "row"}
   [:div {:class "col-md-6 mx-auto d-flex flex-column align-items-center"}
    [:div {:class "footer-logo logo", :href "#"} "Lab"]
    [:div {:class (str "footer-items ")}
     [:a {:href (rfe/href ::home)} "Home"]
     [:a {:href (rfe/href ::features {:id 1})} "Key Features"]
     [:a {:href (rfe/href ::pricing {:id 1})} "Pricing"]
     [:a {:href (rfe/href ::testimonials {:id 1})} "Testimonials"]
     [:a {:href (rfe/href ::faq {:id 1})} "FAQ"]
     [:a {:href (rfe/href ::clock {:id 1})} "Clock"]]
    [:div {:class "social-icon"}
     [:i {:class "fab fa-facebook-f"}]
     [:i {:class "fab fa-twitter"}]
     [:i {:class "fab fa-slack-hash"}]
     [:i {:class "fab fa-github-square"}]]
    [:div {:class "copyright"} "Copyright© Arifur Rahman Tushar 2019. All rights reserved"]]]])


(defn home-page [match]
  [:div
   [home]])

(defn partners-page [match]
  [:div
   [partners]])

(defn features-page [match]
  [:div
   [features]])

(defn pricing-page [match]
  [:div
   [pricing]])

(defn testimonials-page [match]
  [:div
   [testimonials]])

(defn faq-page [match]
  [:div
   [pricing]])

(defn clock-page [match]
  [:div
   [clock]])

(defonce match (r/atom nil))

(defn current-page []
  [:div
   [header-navbar]
   (if @match
     (let [view (:view (:data @match))]
       [view @match]))
   [footer-navbar]])

(def routes
  [["/"
    {:name ::home
     :view home-page}]
   
   ["/partners"
    {:name ::partners
     :view partners-page}]

   ["/features"
    {:name ::features
     :view features-page}]
   
   ["/pricing"
    {:name ::pricing
     :view pricing-page}]
   
   ["/testimonials"
    {:name ::testimonials
     :view testimonials-page}]
   
   ["/faq"
    {:name ::faq
     :view faq-page}]
   
   ["/clock"
    {:name ::clock
     :view clock-page}]
   ])

(defn ^:dev/after-load render
  "Render the toplevel component for this app."
  []
  (rfe/start!
   (rf/router routes {:data {:coercion rss/coercion}})
   (fn [m] (reset! match m))
   {:use-fragment true})
  (rdom/render [current-page] (.getElementById js/document "app")))

(defn main []
  (js/console.log "Page MZ Reload")
  (render))

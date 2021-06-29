(ns app.core
  (:require [reagent.dom :as rdom]
            [app.components.header.header :refer [header]]
            [app.components.home.home :refer [home]]
            [app.components.partners.partners :refer [partners]]
            [app.components.features.features :refer [features]]
            [app.components.pricing.pricing :refer [pricing]]
            [app.components.testimonials.testimonials :refer [testimonials]]
            [app.components.faq.faq :refer [faq]]
            [app.components.footer.footer :refer [footer]]))
          
(defn app-container []
  [:<>
   [header]
   [home]
   [partners]
   [features]
   [pricing]
   [testimonials]
   [faq]
   [footer]])


(defn ^:dev/after-load render
  "Render the toplevel component for this app."
  []
  (rdom/render [app-container] (.getElementById js/document "app")))

(defn main []
  (js/console.log "Page MZ Reload")
  (render))


;; (ns app.core
;;   (:require [reagent.dom :as rdom]
;;             [reagent.core :as r]
;;             [reitit.frontend.easy :as rfe]
;;             [reitit.frontend :as rf]
;;             [reitit.coercion.spec :as rss]
;;             [spec-tools.data-spec :as ds]
;;             [fipp.edn :as fedn]
;;             [app.components.header.header :refer [header]]
;;             [app.components.home.home :refer [home]]
;;             [app.components.partners.partners :refer [partners]]
;;             [app.components.features.features :refer [features]]
;;             [app.components.pricing.pricing :refer [pricing]]
;;             [app.components.testimonials.testimonials :refer [testimonials]]
;;             [app.components.faq.faq :refer [faq]]
;;             [app.components.footer.footer :refer [footer]]
;;             [app.components.clock.clock :refer [clock]]))

;; (defn home-page [match]
;;   [:div
;;    [home]])

;; (defn partners-page [match]
;;   [:div
;;    [partners]])

;; (defn features-page [match]
;;   [:div
;;    [features]])

;; (defn pricing-page [match]
;;   [:div
;;    [pricing]])

;; (defn testimonials-page [match]
;;   [:div
;;    [testimonials]])

;; (defn faq-page [match]
;;   [:div
;;    [pricing]])

;; (defn clock-page [match]
;;   [:div
;;    [clock]])

;; (defonce match (r/atom nil))

;; (defn current-page []
;;   [:div
;;    [header]
;;    (if @match
;;      (let [view (:view (:data @match))]
;;        [view @match]))
;;    [footer]])


;; (def routes
;;   [["/"
;;     {:name ::home
;;      :view home-page}]
   
;;    ["/partners"
;;     {:name ::partners
;;      :view partners-page}]

;;    ["/features"
;;     {:name ::features
;;      :view features-page}]
   
;;    ["/pricing"
;;     {:name ::pricing
;;      :view pricing-page}]
   
;;    ["/testimonials"
;;     {:name ::testimonials
;;      :view testimonials-page}]
   
;;    ["/faq"
;;     {:name ::faq
;;      :view faq-page}]
   
;;    ["/clock"
;;     {:name ::clock
;;      :view clock-page}]
;;    ])


;; (defn ^:dev/after-load render
;;   "Render the toplevel component for this app."
;;   []
;;   (rfe/start!
;;    (rf/router routes {:data {:coercion rss/coercion}})
;;    (fn [m] (reset! match m))
;;    {:use-fragment true})
;;   (rdom/render [current-page] (.getElementById js/document "app")))

;; (defn main []
;;   (js/console.log "Page MZ Reload")
;;   (render))

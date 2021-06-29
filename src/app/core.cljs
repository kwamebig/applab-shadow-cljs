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
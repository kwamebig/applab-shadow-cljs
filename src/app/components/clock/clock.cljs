(ns app.components.clock.clock
  (:require
   [reagent.core :as r]
   ["analog-clock-react" :default AnalogClock]))


(def clock-components (r/atom {:width "450px"
                               :border true
                               :border-color "black"
                               :base-color "white"
                               :center-color "black"
                               :center-corder-color "black"
                               :hand-colors {:second "black"
                                             :minute "black"
                                             :hour "black"}}
                               {:seconds (.getSeconds (new js/Date))
                                :minutes (.getMinutes (new js/Date)
                                :hours (.getHours (new js/Date)))}))

(defn get-current-time []
  (js/setInterval
   #(((let [date (new js/Date)]
         (swap! clock-components assoc :seconds (.getSeconds date))
         (swap! clock-components assoc :hours (.getHours date))
         (swap! clock-components assoc :minutes (.getMinutes date)))))
   1000))

(defn clock []
  [get-current-time]
  [:div.an-clock [:> AnalogClock @clock-components]]) 

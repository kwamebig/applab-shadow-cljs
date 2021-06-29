(ns app.components.features-item.features-item)

(defn features-item [position image header header-color description]
  [:div {:class position :style {:color header-color}}
   [:img {:class (str position "-img") :src image :alt ""}]
   [:div {:class (str position "-text")}
    [:h5.header-sub header]
    [:p.text-sub description]]])
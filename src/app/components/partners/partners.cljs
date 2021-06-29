(ns app.components.partners.partners)

(def partners-list [{:image "../../resources/pictures/companies/company-1.png"
                     :title "SouthWest"}
                    {:image "../../resources/pictures/companies/company-2.png"
                     :title "Anubis Entertainment"}
                    {:image "../../resources/pictures/companies/company-3.png"
                     :title "Alonzo Casseta"}
                    {:image "../../resources/pictures/companies/company-4.png"
                     :title "Premium Express"}
                    {:image "../../resources/pictures/companies/company-5.png"
                     :title "Maniac"}])

(defn partners []
   [:div {:class "container"}
  [:p {:class "top-header"} "Trusted by companies like"] 
  [:div {:class "row justify-content-center align-items-center trust"}
   (for [item partners-list]
     ^{:key (:title item)}
     [:img {:src (:image item)
            :title (:title item)}])]])
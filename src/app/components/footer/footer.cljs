(ns app.components.footer.footer)

(defn footer []
  [:footer {:class "footer section section-space-sm"}
 [:div {:class "container"}
  [:div {:class "row"}
   [:div {:class "col-md-6 mx-auto d-flex flex-column align-items-center"}
    [:div {:class "footer-logo logo", :href "#"} "Lab"]
    [:div {:class (str "footer-items ")}
      [:a {:href "#home"} "Home"]
      [:a {:href "#features"} "Key Features"]
      [:a {:href "#pricing"} "Pricing"]
      [:a {:href "#testimonials"} "Testimonial"]
      [:a {:href "#faq"} "FAQ"]]
    [:div {:class "social-icon"}
     [:i {:class "fab fa-facebook-f"}]
     [:i {:class "fab fa-twitter"}]
     [:i {:class "fab fa-slack-hash"}]
     [:i {:class "fab fa-github-square"}]]
    [:div {:class "copyright"} "Copyright© Arifur Rahman Tushar 2019. All rights reserved"]]]]])
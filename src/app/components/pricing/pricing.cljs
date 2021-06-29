(ns app.components.pricing.pricing
  [:require [app.components.button.button :refer [button]]])

(defn pricing []
  [:section {:id "pricing", :class "section-space"}
 [:div {:class "container"}
  [:div {:class "section-heading text-center"}
   [:h2.text-header " Get awesome features, without " 
    [:br]"extra charges"]]
  [:p {:class "intro text-center"} "The rise of mobile devices transforms the\n                way we consume information entirely" 
   [:br]"and the world's most elevant channels such as Facebook."]
  [:div {:class "pricing-container justify-content-center"}
   [:div {:class "pricing-switcher"}
    [:p {:class "fieldset"}
     [:input {:type "radio", :name "duration-1", :value "monthly", :id "monthly-1" }]
     [:label {:for "monthly-1"} "Monthly"]
     [:input {:type "radio", :name "duration-1", :value "annually", :id "annually-1"}]
     [:label {:for "annually-1"} "Annually"]
     [:span {:class "switch"}]]]
   [:div {:class "table row justify-content-center"}
    [:div {:class "col-lg-4 col-md-6"}
     [:div {:class "table-item is-visible", :data-type "monthly"}
      [:div {:class "table-head"}
       [:h2 {:class "price-1"} "$0" 
        [:span {:class "per"} "/month"]]
       [:h4 " Business Class "]
       [:p {:class "intro"} "For Small teams or office"]]
      [:ul {:class "table-content"}
       [:li "Drag and Drop Builder"]
       [:li "1,000's of Templates"]
       [:li "Blog Support Tools "]
       [:li "eCommerce Store "]]
      [button "Start free trial"]]]
    [:div {:class "col-lg-4 col-md-6"}
     [:div {:class "table-item is-hidden", :data-type "annually"}
      [:div {:class "table-head"}
       [:h2 {:class "price-2"} "$99" 
        [:span {:class "per"} "/month"]]
       [:h4 " Pro Master "]
       [:p {:class "intro"} "For Best Oportunities "]]
      [:ul {:class "table-content"}
       [:li "Drag and Drop Builder"]
       [:li " 1,000's of Templates "]
       [:li "Blog Support Tools "]
       [:li "eCommerce Store "]]
      [:ul {:class "table-content"}
       [button "Subscribe Now!"]
       [:br][:a {:href "#"} "Or start 14 Free Trial"]]]]]]]])
(ns app.components.faq.faq)

(defn faq []
  [:div#FAQ.FAQ
   [:div.questions-header 
    [:h2.questions-header-title.text-header
     "Frequently asked questions"]
    [:p.questions-header-description
     "The rise of mobile devices transforms the way we consume information entirely and the world's most elevant channels such as Facebook"]
    [:div.accordion-container 
     [:div {:class "accordion", :id "faqAccordion"}
 [:div {:class "accordion-item"}
  [:div {:class "accordion-header collapsed", :data-toggle "collapse", :data-target "#collapse1", :aria-expanded "false", :aria-controls "#collapse1"}
   [:div {:class "accordion-title"} "How to contact with riders emergency?"]]
  [:div {:class "accordion-body collapse:not", :id "collapse1", :data-parent "#faqAccordion"}
   [:div {:class "accordion-inner"} "Leverage agile frameworks to provide a robust synopsis for high level overviews. Iterative approaches to corporate strategy foster collaborative thinking to further the overall value proposition. Organically grow the holistic world view of disruptive innovation via workplace diversity and empowerment."]]]
 [:div {:class "accordion-item"}
  [:div {:class "accordion-header collapsed", :data-toggle "collapse", :data-target "#collapse2", :aria-expanded "false", :aria-controls "#collapse2"}
   [:div {:class "accordion-title"} "App installation failed, how to update system info?"]
   [:div {:class "accordion-icon"}]]
  [:div {:class "accordion-body collapse", :id "collapse2", :data-parent "#faqAccordion"}
   [:div {:class "accordion-inner"} "2222222222222222222 2222222222222222222 2 22222222222222\n                        22222222 222222222 2222222 22 22222222 22222 222222222"]]]
 [:div {:class "accordion-item"}
  [:div {:class "accordion-header collapsed", :data-toggle "collapse", :data-target "#collapse3", :aria-expanded "false", :aria-controls "#collapse3"}
   [:div {:class "accordion-title"} "Website response taking time, how to improve?"]
   [:div {:class "accordion-icon"}]]
  [:div {:class "accordion-body collapse", :id "collapse3", :data-parent "#faqAccordion"}
   [:div {:class "accordion-inner"} "333333333333333 333333333333333 3333333 3333 3333333 33333333 33333333 333333 33333 333 33333333333333333333333"]]]
 [:div {:class "accordion-item"}
  [:div {:class "accordion-header collapsed", :data-toggle "collapse", :data-target "#collapse4", :aria-expanded "false", :aria-controls "#collapse4"}
   [:div {:class "accordion-title"} "New update fixed all bug and issues"]
   [:div {:class "accordion-icon"}]]
  [:div {:class "accordion-body collapse", :id "collapse4", :data-parent "#faqAccordion"}
   [:div {:class "accordion-inner"} "44444 444444444 4444444 4 44444 444444444444444 444444444 4444444444444444444444444444444444444444444444"]]]
 [:div {:class "accordion-item"}
  [:div {:class "accordion-header collapsed", :data-toggle "collapse", :data-target "#collapse5", :aria-expanded "false", :aria-controls "#collapse5"}
   [:div {:class "accordion-title"} "How to contact with riders emergency?"]
   [:div {:class "accordion-icon"}]]
  [:div {:class "accordion-body collapse", :id "collapse5", :data-parent "#faqAccordion"}
   [:div {:class "accordion-inner"} "55555555555555 5555555555555 55 5555555555 5555555555 555 5 5555555555555 55555555555555555555555555555555"]]]]]]])



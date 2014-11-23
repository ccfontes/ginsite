(ns gin.site
  (:require [hiccup.def :refer [defelem]]
            [hiccup.element :refer [javascript-tag]]))

(defelem sentinel [control-id & [user-id]]
  (javascript-tag
    (str
      "(function(i,s,o,g,r,a,m){"
        "i['GoogleAnalyticsObject']=r;"
        "i[r]=i[r]||"
        "function(){(i[r].q=i[r].q||[]).push(arguments)},"
        "i[r].l=1*new Date();"
        "a=s.createElement(o),m=s.getElementsByTagName(o)[0];a.async=1;"
        "a.src=g;"
        "m.parentNode.insertBefore(a,m)})"
        "(window,document,'script','//www.google-analytics.com/analytics.js','ga');"
        "ga('create', '" control-id "', 'auto');"
        (if user-id ; Set the user ID using signed-in user_id.
          (str "ga('set', '&uid', {{" user-id "}})"))
        "ga('send', 'pageview');")))
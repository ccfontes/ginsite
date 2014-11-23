ginsite
=======
Google Analytics Insights for your Site in Clojure Hiccup.

### Getting InSite
----------
Add the following to the `:dependencies` vector of your `project.clj` file:
[![clojars version](https://clojars.org/ginsite/latest-version.svg?raw=true)]
(https://clojars.org/ginsite)

### Using it In z Site
----------
Insert the `sentinel` anywhere between the `head` or `body` tags.
```clojure
(require 'gin.site)

(gin.site/sentinel "UA-25491248-5")
;=> [:script {:type "text/javascript"} "//<![CDATA[\n(function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){(i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)})(window,document,'script','//www.google-analytics.com/analytics.js','ga');ga('create', UA-57014374-1, 'auto');ga('send', 'pageview');\n//]]>"]
```

### Helpless?
----------
<img src="http://i.imgur.com/1PQfh98.jpg"></img>

### This list of Sites using ginSite needs more love. Help me increase it now!
----------
[kanasubs.com](http://www.kanasubs.com) — Convert raw subtitles in Kanji to
Kana or Romaji online.

### Random license
----------
Copyright (C) 2014 Carlos C. Fontes.

Licensed under the [Apache License, Version 2.0](https://www.apache.org/licenses/LICENSE-2.0).

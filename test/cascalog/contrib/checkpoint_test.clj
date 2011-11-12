(ns cascalog.contrib.checkpoint-test
  (:use cascalog.contrib.checkpoint))

(defn run-test! []
    (workflow
     ["/tmp/lalala"]
     aaa ([]
            (sprint "aaa")
            (sprint "aaa")
            (sprint "aaa")
            (sprint "aaa"))
     bbb ([:deps nil]
            (sprint "bbb"))
     ccc ([:tmp-dirs "/tmp/ccc"]
            (sprint "ccc"))
     ddd ([:deps :all]
            (sprint "ddd"))))

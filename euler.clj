; Problem 1
(defn multiple-of [x] (fn [y] (= 0 (rem y x))))
(def multiple-of3 (multiple-of 3))
(def multiple-of5 (multiple-of 5))
(apply + (filter (fn [x] (and (multiple-of3 x) (multiple-of5 x))) (range 1 1001)))

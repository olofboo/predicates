(ns predicates)

(defn sum-f [f g x]
(+ (f x) (g x))
)

(defn less-than [n]
(fn [k] (< k n))
)

(defn equal-to [n]
(fn [k] (== k n))
)

(defn set->predicate [a-set]
(fn [x] (contains? a-set x))
)

(defn pred-and [pred1 pred2] (fn [k] (and (pred1 k) (pred2 k))))

(defn pred-or [pred1 pred2] (fn [k] (or (pred1 k) (pred2 k))))

(defn whitespace? [character]
  (Character/isWhitespace character))

(defn blank? [string] (every? whitespace? string))

(defn has-award? [book award]
(contains? (get book :awards) award)
)

(defn HAS-ALL-THE-AWARDS? [book awards]
(every? (get book :awards) awards)
)

(defn my-some [pred a-seq]
  :-)

(defn my-every? [pred a-seq]
  :-)

(defn prime? [n]
  :-)
;^^

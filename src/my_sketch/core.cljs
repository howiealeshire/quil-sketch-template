(ns ^:figwheel-always  my-sketch.core
  (:require [quil.core :as q :include-macros true]
            [quil.middleware :as m]))

(defn setup []
  ; Set frame rate to 30 frames per second.
  ; Set color mode to HSB (HSV) instead of default RGB.
  (q/color-mode :hsb))


(defn draw []
  ; Clear the sketch by filling it with light-grey color.
  (q/background 2)
  ; Set circle color.
  (q/fill 255 255)
  ; Calculate x and y coordinates of the circle.
  (q/ellipse 100 100 100 100))

; this function is called in index.html
(defn ^:export run-sketch []
  (q/defsketch my-sketch
    :host "my-sketch"
    :size [500 500]
    :setup setup
    :draw draw))

; uncomment this line to reset the sketch:
; (run-sketch)

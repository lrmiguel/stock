(ns estoque.core)

(defn aplica-desconto?
  "Decides on whether giving a discount or not based upon the brute value"
  [valor-bruto]
  (> valor-bruto 100))

(defn valor-descontado
  "Retorna o valor descontado que é 90% do valor bruto"
  [valor-bruto]
  (if (aplica-desconto? valor-bruto)
    (let [taxa-de-desconto (/ 10 100)
          desconto (* valor-bruto taxa-de-desconto)]
      (println "Calculando valor descontado para taxa de" taxa-de-desconto)
      (- valor-bruto desconto)
      )
      valor-bruto))

(valor-descontado 1000)

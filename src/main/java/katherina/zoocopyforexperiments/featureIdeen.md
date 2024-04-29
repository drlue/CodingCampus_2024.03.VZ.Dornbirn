25.04.2024

### **Geplante Features**

- MOOC-Feature: Von Tag zu Tag soll eine zufällige Anzahl an Besuchenden generiert werden. Diese sollen folgende Eigenschaften aufweisen: Vorname, Nachname, Alter, Kaufkraft, Liebling.
- Die Besuchenden sollen folgende Dinge tun: Sie sollen die Gehege durchlaufen und Tiere anschauen. Ist das zufällig angeschaute Lieblingstier und haben sie genug Kaufkraft, so sollen sie Tierfutter für 1€ kaufen.


#### Spätere Bonusfeatures für Besuchende:

- Softeisautomat - falls nach dem Durchlaufen aller Gehege noch Geld vorhanden ist, soll ein Softeis für 2€ aus dem Automaten gezogen werden.
- Zoo-Giftshop - falls nach dem Kauf eines Softeises noch Geld vorhanden ist, kann eine Postkarte (1 €) oder ein Plüschtier, klein (5 €) oder ein Plüschtier, groß (25€) gekauft werden.
- Statt eines Giftshops (oder davor, danach, ich muss das noch überlegen) können die Leute auch einkehren und Pommes (2€) und einen Softdrink (1€) kaufen.

Am Ende soll ausgegeben werden, ob der Zoo rote oder schwarze Zahlen geschrieben hat.

#### **Weitere Möglichkeiten, die Komplexität des Zoos zu erhöhen:**

- Events (beispielsweise: Eine Schulklasse besucht den Zoo und gibt 300€ aus! oder "Aufgrund einer Unwetterwarnung muss der Zoo heute geschlossen bleiben. Es gibt an diesem Tag keine Besuchenden").
- Automatisierter Anbau von Gehegen (beispielsweise "Sobald der Zoo 10.000 Euro Gewinn gemacht hat, wird ein Affenhaus gebaut und automatisch mit so und so vielen Affen gefüllt, die wiederum bestimmte Bedürfnisse haben. Leute, deren Lieblingstier ein Affe ist, geben nun mehr Geld aus.)
- Gehalt für die Pflegenden und Honorar für den Tierarzt, sofern der Tierarzt ein Tier heilen musste. (also fast jeden Tag)

#### **Komfort-Features und Usability**

- Es ist geplant, auf lange Sicht die Möglichkeit eines Safe-Files zu implementieren. Nach jeder Simulation (Anzahl der festgelegten Schleifen in "day") wird in eine Datei gespeichert und anschließend aus dieser Datei gelesen, um anschließend erneut die gleiche Anzahl an Tagen zu simulieren. Die neue Ausgabe wird ebenfalls im Safe-File hinterlegt.
- Damit einhergehend ist geplant, eine Abfrage einzubauen, ob "from scratch" simuliert werden soll oder ein Savefile geladen werden soll.
- Accessibility: Auf lange Sicht möchte ich die Möglichkeit einbauen, eine Ausgabe mit Markdown, eine als .txt und eine gefärbte in der Konsole zu realisieren.

#### **Verbesserungen**

- "Die Tiere in diesem Gehege sind brav." soll nur noch einmal ausgegeben werden, nämlich für den Fall, dass kein einziger Biss im Gehege ausgelöst wird.
- die Ausgabe bei leeren Gehegen fehlt.
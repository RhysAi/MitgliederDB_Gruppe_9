#Abgabe Projekt Aufgabe 1 Gruppe 9

Die unsortierte Datenbank lässt sich über die Klasse StartMitgliederDB  ausführen und die sortierte Datenbank über StartMitgliederDBOrdered.

Beim ersten Ausführen des Programmcodes kann es eventuell vorkommen, dass zuvor noch lokal die JUnit im Classpath importiert werden muss. 

Unser Ziel war es das Programm schlank zu halten und dennoch möglichst alle Sonderfälle abzugreifen und zu behandeln. Um dies zu erreichen haben wir unter anderem eine zentrale Methode dbOperations erstellt. 
Diese handelt die Methoden delete(), modify() und insert() ab. Bei dem Begriff modify haben wir es so implementiert, dass wenn der Datensatz nicht vorhanden ist wird stattdessen ein insert() ausgeführt. 

Außerdem haben wir durch die rekursiven Methoden moveLeft() und moveRight() eine Möglichkeit geschaffen, dass beim insert() oder delete() die Blöcke formatiert werden, 
damit keine leeren Plätze bestehen bzw. auch die richtige Sortierung gewährleistet ist, selbst wenn ein Datensatz besonders groß ist und nicht mehr in den Block passt.
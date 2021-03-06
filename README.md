ogrzewanie_elektryczne
======================

Sterowanie ogrzewaniem elektrycznych mat grzewczych
Realizowane poprzez sterowaniem obwodu zasilającego na zasadzie "włącz- wyłącz".
Pozostała regulacja pzostaje bez zmian. Tzn. oryginalny sterownik w dalszym ciągu reguluje poziomem przepływu prądu przez grzałki, a co za tym idzie, ilością ciepła oddawanego przez maty grzewcze.
Załączanie i wyłączanie odbywać się będzie z użyciem komunikacji GSM.
Interfejsem służącym powyższemu będzie program na Android lub WindowsPhone.
Sterownikiem odbierającym sygnały będzie mikrokontroler oparty na układzie Atmega i zawartym na płycie Arduino Uno z modułem GSM. Elementem wykonawczym będzie zestaw przekaźników, sterujących obwody zasilające maty grzewcze w rozdzielni budynku.

By uniknąć niebezpieczeństwa porażenia prądem w momencie przerwania obwodu (na przewodzie neutralnym pojawi się napięcie 230V pomniejszone o rezystancję cewki przekaźnika) planuję zastosować dodatkowe odcięcie przewodu fazowego.

Wymagania sprzętowe powyższej konfiguracji:
* Płyta Arduino;
* Moduł GSM;
* Zestaw przekaźników

Wymagania systemowe:
* Oprogramowanie mikrokontrolera (C, C++);
* Oprogramowanie na telefon (Java, C#);

Schemat blokowy: RYS.: <a href=https://github.com/elmort/ogrzewanie_elektryczne/blob/master/Mat_grzewcze_podstawowy.jpeg>Mat_grzewcze_podstawowy.jpeg</a>



###########Dodatkowy moduł - Obwód antysabotażowy################

Przerwanie obwodu zasilającego odbiornik w stanie beznapięciowym.
Monitorowanie potencjału (0V) przewodu neutralnego w obwodzie napięcia 230V. Wystąpienie zjawiska braku ciągłości obwodu (przerwanie, przecięcie, itp.) spowoduje wysłanie sygnału do kontrolera. Efektem tego będzie powiadomienie odpowiednim komunikatem, wysłanym za pomocą GSM, odbiorcę.

Schemat blokowy: RYS.: Mat_grzewcze_sabotaz.jpeg</br>

Schemat ideowy: RYS.: Schemat_ideowy.jpeg


##########Moduły rozwojowe########################################

* Moduł sieciowy- możliwość sterowania z dowolnej przeglądarki internetowej. Wymagany stały dostęp do internetu;
* Akumulator- stały monitoring systemu + informacja o zaniku zasilania z sieci energetycznej. Wymagany akumulator, przekaźnik, moduł kontroli akumulatora, układ opóźniający;
* Czujniki temperatury: zewnętrzny + wewntrzne- automatyczne sterowanie ogrzewaniem. Wymagane czujniki + okablowanie;
* Bezpośrednie podłączenie do regulatorów mat grzewczych- zdalna możliwość płynnej regulacji ogrzewania. Wymagania: okablowanie;
* Oświetlenie, nawadnianie, kontrola zużycia prądu, itp...

Schemat blokowy: RYS.: Mat_grzewcze_sabotaz_dodatkowe.jpeg

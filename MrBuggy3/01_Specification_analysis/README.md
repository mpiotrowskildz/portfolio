## Specification analysis  
Before anything else, I have analysed the requirements provided in the [official pdf file](http://mrbuggy.pl/mrbuggy3/dfiles/Specyfikacja_Mr_Buggy_3.pdf).  
The following are the problems, inaccuracies or errors that I have found.

Id| Page no | The mistake/uncertainty | My comment
--|--|--|--
1|6|Wymagane są **cztery** wersje aplikacji klienckiej|There are only three listed and three are mentioned before in the text
2|7|Wersja demonstracyjna, końcowa oraz publiczna różnią się jedynie ilością zadań. Pozostałe cechy aplikacji są takie same.|Not specific enough. Does that mean that the public version has to include a choice between team mode and single mode? Does the different number of tasks refer to the demo app vs the other two, or does the public version also have a different number of tasks from the final version?
3|7|Wśród zamieszczonych zadań nie może się znaleźć zadanie z wersji demonstracyjnej (**opisane poniżej**).|The task is not described immediately below. It can be found on p. 13-14.
4| 7, 8, 10|Wersja demonstracyjna, końcowa oraz publiczna różnią się jedynie ilością zadań.|This is inconsistent with later information on p. 8 which says that a team member CANNOT report defects; then on p. 10 it is said that the function is available in all modes.
5|7|Język programowania oraz baza danych **urzyta** podczas tworzenia aplikacji nie są zdefiniowane.| a typo
6|7|Aplikacja MrBuggy 3 składa się z dwóch części: część kliencka, część serwerowa|Before that, in the definitions, these are not called "parts", but "applications."
7|8|W każdym zdaniu ma być dokładnie jeden defekt. Defekty te mogą należeć do grup: defektów funkcjonalnych, bezpieczeństwa, użyteczności|The usability defects are a subgroup of functional defects.
8|8|W każdym **zdaniu** ma być dokładnie jeden defekt. Defekty te mogą należeć do grup: defektów funkcjonalnych, bezpieczeństwa, użyteczności|a typo
9|8/9|Kopia zapasowa ma być tworzona po każdorazowym kliknięciu w przycisk “Znalazłem defekt”.|Elsewhere in the document, the button is called "Report a bug" in a gender-neutral way in Polish while here it shows masculine gender.
10|10|Pole “Czas” - wyświetla czas do zakończenia rundy|Does this apply to the public version of the app as well, or only to the final tournament version?
11|10|Pole “Czas” - wyświetla czas do zakończenia rundy (format: gg:mm:ss; godzina, minuta, sekunda, **milisekunda**)| Miliseconds are not included in the format.
12|10|Pole “Nr zadania” - podaje numer zadania wyświetlonego w oknie “Zadania”. Zasady numeracji zadań są opisane poniżej.|They are not described below.
13|10|Przyciski nawigacyjne - “Następne” i “Poprzednie” umożliwiają przeniesienie się do odpowiednio **bieżącego**, następnego i poprzedniego zadania.|It is impossible to navigate to the current task, this should be dropped.
14|10|Przycisk “Zakończ” - zakończenie pracy nad wszystkimi zadaniami i wysłanie odpowiedzi do oceny. Nie da się cofnąć tej czynności. można ją wykonać tylko raz. Aby uniknąć pomyłek użytkownik musi potwierdzić chęć wykonania tej czynności. Po wciśnięciu przycisku “Zakończ” wszystkie dane dotyczące użytkownika oraz rozwiązanych przez niego zadań testowych eksportowane są do pliku binarnego.|It is unclear whether the confirmation of finishing the task includes yet another instance of the word "Finish". It should be defined what the confirmation window should look like.
15|10|Nie da się cofnąć tej czynności **. m**ożna ją wykonać|Punctauation mistake.
16|10/11|Po wciśnięciu przycisku “Zakończ” wszystkie dane dotyczące użytkownika oraz rozwiązanych przez niego zadań testowych eksportowane są do pliku **binarnego**.|Chapter 5 states that the exported file should be a text file, not binary.
17|11|Okno aplikacji powinno mieścić się w całości na ekranie monitora o rozdzielczości 1024x768 i być **estetyczne**.|"Tasteful" is not a factual description and should be further defined.
18|11|W oknie aplikacji musi się znaleźć ikona MrBuggy 3.|It needs further specification what is meant by "icon".
19|11|Picture 1|The description before does not include the status of the connection.
20|11|Picture 1|The design includes 12 visible tasks while Chapter 5.1 states that there should be 15.
21|11|Aplikacja serwerowa ma zostać stworzona przy wykorzystaniu języka Java7.| On p. 7 it was stated that the programming language should not be defined.
22|12|czas odpowiedzi interfejsu musi być krótszy od 1 sekundy|possible problem: the waiting time might be too long for users
23|12|wielkość pliku z kopią zapasową aplikacji klienckiej nie może przekraczać **2MB1**|What is the final size of the app?
24|12|wydajność aplikacji liczona ze wzoru:|the formula does not calculate the app's efficacy.
25|12|dostęp do części serwerowej aplikacji musi być zabezpieczony loginem i hasłem (and the following points)|What about the client app? Does it apply to it as well?
26|12|login musi składać się z 2 do 8 znaków i zawierać przynajmniej jedną małą literę, jedną wielką literę, jedną cyfrę i jeden znak specjalny|The login requirements are contradictory - the minimum character length should be 4.
27|12|login nie może zawierać białych znaków ani polskich znaków **dialektycznych**|wrong word: diacritics (znaki diakrytyczne).
28|12|hasło musi składać się z co najmniej 20 znaków|the length of the password seems unnecessarily long.
29|13|hasło nie może zawierać białych znaków ani polskich znaków **dialektycznych**|wrong word: diacritics (znaki diakrytyczne).
30|13|hasła muszą być przechowywane w formacie zaszyfrowanym|the encryption method is not mentioned.
31|13|konto musi zostać zablokowane po 3 krotnym wpisaniu **błędnego hasła lub jego części**|unnecessary "of its part"
32|13|tokeny do konta mają być generowane losowo|The type of the tokens is not defined.
33|13|w ciągu roku średnia ilość awarii (rozumianych jako ilość niespodziewanych wyłączeń aplikacji wymagających skorzystania z kopii zapasowej) w jednym dniu nie może być większa niż 1|Seems superflous when considering that the app will work only during the Testing Cup - needs revision.
34|13|przełączanie pomiędzy zadaniami nie może być dłuższe niż 1 sekunda|The time of transition seems to be too long.
35|13|Nie jest wymagany instalator aplikacji.|The list of definitions on p. 5 includes the term "installer" and the fact that it will install the app. 
36|14|Opis **zadań** zamieszczonych w tej wersji|The description includes two tasks whereas Chapter 3 stated one task.
37|14|defekty normalne (od 3 do **4** pkt), defekty krytyczne (od **4** do 6 pkt)|Do the scoring criteria intentionally overlap?
all pages|there are often punctuation marks missing from lists|The style should be consistent and created according to generally accepted rules.

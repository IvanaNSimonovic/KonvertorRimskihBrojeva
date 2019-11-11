# KonvertorRimskihBrojeva
Konvertor rimskih brojeva
Rimski brojevi su predstavljeni kao simboli redom: I, V, X, L, C, D i M. Njihove vrednosti date su u tabeli.

Na primer, 2 se piše kao II u rimskoj notaciji, samo dva I spojena. 12 se piše kao XII, što je prosto X + II. Broj
27 je XXVII, što je XX + V + II.
Rimski brojevi se obično pišu od najvećeg do najmanjeg s leva na desno. Međutim, simbol koji odgovara broju
4 nije IIII, već IV. Zato što je 1 pre 5, tada oduzimamo i dobijamo 4. Sličan princip se primenjuje za broj 9 koji
se piše kao IX. U sledećim slučajevima se oduzimanje dešava:
1. I se nalazi preV(5) i X(10) pa se dobija 4 i 9
2. X se nalazi preL(50) i C(100) pa se dobija 40 i 90
3. C se nalazi pre D(500) i M(1000) pa se dobija 400 i 900

Ako se prosledi rimski broj u obliku stringa napisati metodu koja vraća integer vrednost tog broja. Smatrati da će finalni broj biti manji od
4000.
Primer 1:
Ulaz: "III"
Izlaz: 3

Primer 2:

Ulaz: "IV"
Izlaz: 4

Primer 3:
Ulaz: "IX"
Izlaz: 9

Primer 4:
Ulaz: "LVIII"
Izlaz: 58
Objasnjenje: L = 50, V= 5, III = 3.

Primer 5:

Input: "MCMXCIV"
Output: 1994
Objasnjenje: M = 1000, CM = 900, XC = 90, IV = 4.

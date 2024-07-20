# Processo Logico

- Per la classe eventi si pone un problema con la gestione delle date che espongo di seguito :

Il costruttore della classe Evento fa si che l'utente inserisca la data dell'evento. Di seguito dobbiamo preoccuparci di verificare che :

- La data sia valida in termini di formato (quindi dd-mm-yyyy)
- La data non sia passata

Per soddisfare entrambe le condizioni, abbiamo bisogno di utilizzare le seguenti classi :

## Formato della data
Occupiamoci prima di recuperare la data attuale e in seguito di formattarla come ci aspettiamo.

### Classe LocalDate con metodo now()
Questa classe con l'ausilio del metodo now() restituisce la data attuale in formato yyyy-mm-dd

### Classe DateTimeFormatter con metodo ofPattern()
Il metodo ofPattern della classe DateTimeFormatter ci permette di formattare la data restituita da LocalDate.now() nel formato che ci aspettiamo noi ovvero dd-mm-yyyy.


## Controllo se la data non è passata
Qui la situazione si complica leggermente. Per controllare




##Produzione Borse - Fiorucci Maria Vittoria
Simulatore di processo per la produzione di borse in Java, che utilizza thread paralleli per rappresentare le diverse fasi della produzione.

Descrizione
Questo progetto implementa una simulazione realistica del processo di produzione di borse utilizzando i thread Java. 
Ogni fase della produzione viene eseguita da un thread separato, con sincronizzazione tra le fasi per garantire il corretto flusso del processo di produzione.

Fasi di Produzione
Il processo è suddiviso in 2 fasi principali:

Taglio del Tessuto - Preparazione e taglio del tessuto
Cucitura - Assemblaggio di tutti i componenti

Ogni fase attende il completamento della fase precedente (tramite join()) prima di iniziare.

Struttura del Progetto
src/
├── Processo.java       # Classe principale
├── Taglio.java         # Thread fase 1: taglio tessuto
├── Cucitura.java       # Thread fase 2: cucitura


Dettagli Tecnici
Threading e Sincronizzazione
Ogni borsa passa attraverso tutte le fasi in sequenza. La sincronizzazione è gestita tramite:

Thread.start() per avviare ogni fase
Thread.join() per attendere il completamento della fase precedente
Thread.sleep() per simulare i tempi di lavorazione

Flusso di Esecuzione
Taglio → join() → Cucitura → join() → Fine
Ogni thread padre attende il completamento del thread figlio prima di procedere, garantendo che le fasi vengano eseguite nell'ordine corretto.

Licenza
Progetto a scopo didattico

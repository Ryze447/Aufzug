
/**
 * Beschreiben Sie hier die Klasse Aufzug.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Aufzug
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int aktuellesStockwerk;
    private int maximalesStockwerk; 
    private int minimalesStockwerk; 
    private int maximalePersonenanzahl; 
    private int aktuellePersonenanzahl; 
    private boolean tuerZustand; 

    /**
     * Konstruktor für Objekte der Klasse Aufzug
     * @param pMaximalesStockwerk Die maximale Anzahl der Stockwerke
     * @param pMinimalesStockwerk Die minimale Anzahl der Stockwerke
     * @param pMaximalePersonenzahl Die maximale Anzahl der Personen im Aufzug
     */
    public Aufzug(int pMaximalesStockwerk, int pMinimalesStockwerk, int pMaximalePersonenanzahl)
    {
        maximalesStockwerk = pMaximalesStockwerk;
        minimalesStockwerk = pMinimalesStockwerk;
        maximalePersonenanzahl = pMaximalePersonenanzahl;
        aktuellesStockwerk = minimalesStockwerk;
        aktuellePersonenanzahl = 0;
        //Auf ist true zu ist false
        tuerZustand = false;
    
    }

    /**
     * Überprüft, ob die angegebene Personen ein- bzw. aussteigen dürfen
     * @param anzahl Anzahl der potenziellen Personen, die ein- oder aussteigen wollen
     * @return Gibt true zurück, wenn die Anzahl der zu- oder aussteigenden Personen die maximale Anzahl an Personen nicht 
     * übersteigt, bzw. nicht unter 0 fällt
     */
    private boolean personenZahlLegitim(int anzahl) {
        if((aktuellePersonenanzahl + anzahl) <= maximalePersonenanzahl && 
        (aktuellePersonenanzahl + anzahl) >= 0) {
            return true;
        }
        return false;
    }
    
    /**
     * Überprüft, ob das gewählte Stockwerk exisitert
     * @param stockwerk Das Zielstockwerk, das überprüft wird.
     * @return Gibt true zurück, wenn das angegebene Stockwerk existiert, ansonsten false.
     */
    private boolean stockwerkVorhanden(int stockwerk) {
        if (stockwerk >= minimalesStockwerk && stockwerk <= maximalesStockwerk) {
            return true;
        } else{
            return false;
        }
    }
    
    /** 
     * Gib zurück, ob die Tür auf ist
     * @return true, wenn die Tür geöffnet ist, false, wenn die Tür geschlossen ist
     */
    private boolean istTuerOffen() {
        return tuerZustand;
    }
    
    /**
     * Gibt das aktuelle Stockwerk zurück
     * @return Gibt das aktuelle Stockwerk zurück
     */
    public int gibAktuellesStockwerk() {
        return aktuellesStockwerk;
    }
    
    /** 
     * Gibt die aktuelle Anzahl an Personen im Aufzug zurück
     * @return Gibt die aktuelle Anzahl an Personen im Aufzug zurück
     */
    public int gibAktuellePersonenzahl() {
        return aktuellePersonenanzahl;
    }
    
    /**
     * Schließt die Tür, wenn sie geschlossen war und schließt die Tür, wenn sie geöffnet war. 
     */
    public void tuerZustandAendern() {
        
    }
    
    /** 
     * Lässt Fahrgäste einsteigen. Gibt eine Fehlermeldung zurück, wenn die Anazhl der Gäste die maximale Personen
     */
    public void einsteigen(int anzahl) {
        // 1. Schritt, ob anzahl zusteigen darf
        // 2. Schritt, Tür öffnen
        // 3. Schritt, anzahl zu aktuellerPersonenzahl addieren 
        // 4. Schritt, Tür schließen
    }
    
    /**
     * Lässt Fahrgäste aussteigen. Gibt eine Fehlermeldung zurück, wenn die Anazhl der Gäste im Aufzug unter 0 fällt
     */
    public void aussteigen(int anzahl) {
        // 1. Schritt, ob anzahl zusteigen darf
        // 2. Schritt, Tür öffnen
        // 3. Schritt, anzahl zu aktuellerPersonenzahl subtrahieren 
        // 4. Schritt, Tür schließen
    }
    
    /** 
     * Der Aufzug fährt in das angegebene Stockwerk. DAbei wird zuerst überprüft, ob das Stockwerk vorhanden ist. 
     * @return Ist das Stockwerk vorhanden, wird der Prozess des Aufzugfahrens als String ausgegeben.
     * Ist das Stockwerk nicht vorhanden, wird eine Fehlermeldung ausgegeben.
     */
    public void fahreZuStockwerk(int zielEtage) {
        
    }
}

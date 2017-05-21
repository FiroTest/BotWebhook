package it.upo.reti2s;

/**
 * Describe a Task with its properties.
 *
 * @author <a href="mailto:luigi.derussis@uniupo.it">Luigi De Russis</a>
 * @version 1.0 (28/04/2017)
 */
public class Task {

    private int id;
    private String description;
    private int urgent;

    public Task(int id, String description, int urgent) {
        this.id = id;
        this.description = description;
        this.urgent = urgent;
    }

    public Task(int id, String description) {
        this.id = id;
        this.description = description;
        this.urgent = 0;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public int getUrgent() {
        return urgent;
    }

}

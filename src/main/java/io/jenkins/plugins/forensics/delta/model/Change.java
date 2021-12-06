package io.jenkins.plugins.forensics.delta.model;

import java.io.Serializable;

/**
 * A change made on specific lines within a specific file.
 * <p>
 * The lines are defined by a starting and an ending point (1-based line counter), describing the made changes
 * within the new version of the file. In case of a deleted file, the line range describes the deleted lines within the
 * old version of the file, since only then it is possible to determine what has been deleted.
 *
 * @author Florian Orendi
 */
public class Change implements Serializable {

    private static final long serialVersionUID = 1543635877389921937L;

    /**
     * The {@link ChangeEditType} of the change.
     */
    private final ChangeEditType changeEditType;

    /**
     * The starting point of the change (1-based).
     */
    private final int fromLine;
    /**
     * The ending point of the change (1-based).
     */
    private final int toLine;

    public Change(final ChangeEditType changeEditType, final int fromLine, final int toLine) {
        this.changeEditType = changeEditType;
        this.fromLine = fromLine;
        this.toLine = toLine;
    }

    public ChangeEditType getEditType() {
        return changeEditType;
    }

    public int getFromLine() {
        return fromLine;
    }

    public int getToLine() {
        return toLine;
    }
}

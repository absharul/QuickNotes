package com.github.android.lvrn.lvrnproject.view.activity.noteeditor;

import android.view.MenuItem;
import android.widget.EditText;

import com.github.valhallalabs.laverna.persistent.entity.Notebook;

/**
 * @author Vadim Boitsov <vadimboitsov1@gmail.com>
 */

public interface NoteEditorPresenter {

    /**
     * A method which subscribes an edit text to webview for showing previews of a markdown editor.
     * @param editText an edit text to subscribe.
     */
    void subscribeEditorForPreview(EditText editText);

    /**
     * A method which unsubscribes and edit text to webiew for showing previews of a markdown editor.
     */
    void unsubscribeEditorForPreview();

    /**
     * A method which binds a view to a presenter.
     */
    void bindView(NoteEditorActivity noteEditorActivity);

    /**
     * A method which unbinds a view to a presenter.
     */
    void unbindView();

    /**
     * A method which saves new note.
     */
    void saveNewNote(/*String notebookId, */String title, String content, String htmlContent);

    void setNotebook(Notebook notebook);

    Notebook getNotebook();

    void subscribeMenuForNotebook(MenuItem menuItem);
}

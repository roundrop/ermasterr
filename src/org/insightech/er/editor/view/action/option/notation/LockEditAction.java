package org.insightech.er.editor.view.action.option.notation;

import org.eclipse.jface.action.IAction;
import org.eclipse.swt.widgets.Event;
import org.insightech.er.ResourceString;
import org.insightech.er.editor.ERDiagramEditor;
import org.insightech.er.editor.model.ERDiagram;
import org.insightech.er.editor.view.action.AbstractBaseAction;

public class LockEditAction extends AbstractBaseAction {

    public static final String ID = LockEditAction.class.getName();

    public LockEditAction(final ERDiagramEditor editor) {
        super(ID, null, IAction.AS_CHECK_BOX, editor);
        setText(ResourceString.getResourceString("action.title.lock.edit"));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void execute(final Event event) {
        final ERDiagram diagram = getDiagram();

        diagram.setDisableSelectColumn(isChecked());
    }
}

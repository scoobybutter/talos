package behavioural.command.commands

import behavioural.command.editor.Editor

class PasteCommand(editor: Editor): Command(editor) {
    override fun execute() {
        if (editor.clipboard == null || editor.clipboard?.isEmpty() == true) return
        backup()
        editor.textField.insert(editor.clipboard, editor.textField.caretPosition)
    }

    override fun unexecute() {
        editor.textField.text = this.backupStr
    }
}
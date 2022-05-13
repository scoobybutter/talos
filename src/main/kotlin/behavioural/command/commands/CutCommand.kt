package behavioural.command.commands

import behavioural.command.editor.Editor

class CutCommand(editor: Editor) : Command(editor) {
    override fun execute() {
        if (editor.textField.selectedText.isEmpty()) return
        backup()
        editor.clipboard = editor.textField.selectedText
        editor.textField.text = editor.textField.text.substring(
            0,
            editor.textField.selectionStart
        ) + editor.textField.text.substring(
            editor.textField.selectionEnd
        )
    }

    override fun unexecute() {
        editor.textField.text = this.backupStr
    }
}
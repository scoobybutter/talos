package behavioural.command.commands

import behavioural.command.editor.Editor

class CopyCommand(editor: Editor): Command(editor) {
    override fun execute() {
        editor.clipboard = editor.textField.selectedText
    }

    override fun unexecute() {
        return
    }
}
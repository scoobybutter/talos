package behavioural.command.commands

import behavioural.command.editor.Editor

abstract class Command(editor: Editor) {
    val editor: Editor
    lateinit var backupStr: String

    init {
        this.editor = editor
    }

    fun backup() {
        this.backupStr = editor.textField.text
    }

    abstract fun execute()
    abstract fun unexecute()
}
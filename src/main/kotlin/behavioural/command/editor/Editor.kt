package behavioural.command.editor

import behavioural.command.commands.*
import java.awt.FlowLayout
import javax.swing.*

class Editor {
    var clipboard: String? = null
    val textField: JTextArea
    private val commandHistory = CommandHistory()

    init {
        val frame = JFrame("Command Pattern Tester")
        val content = JPanel()
        frame.contentPane = content
        frame.defaultCloseOperation = WindowConstants.EXIT_ON_CLOSE
        content.layout = BoxLayout(content, BoxLayout.Y_AXIS)
        textField = JTextArea()
        textField.lineWrap = true
        content.add(textField)
        val buttons = JPanel(FlowLayout(FlowLayout.CENTER))
        val cmdC = JButton("Cmd+C")
        val cmdX = JButton("Cmd+X")
        val cmdV = JButton("Cmd+V")
        val cmdZ = JButton("Cmd+Z")
        val editor = this
        cmdC.addActionListener { executeCommand(CopyCommand(editor)) }
        cmdX.addActionListener { executeCommand(CutCommand(editor)) }
        cmdV.addActionListener { executeCommand(PasteCommand(editor)) }
        cmdZ.addActionListener { undo() }
        buttons.add(cmdC)
        buttons.add(cmdX)
        buttons.add(cmdV)
        buttons.add(cmdZ)
        content.add(buttons)
        frame.setSize(450, 200)
        frame.setLocationRelativeTo(null)
        frame.isVisible = true
    }

    private fun executeCommand(command: Command) {
        command.execute()
        commandHistory.push(command)
    }

    private fun undo() {
        if (commandHistory.isEmpty()) return
        commandHistory.pop().unexecute()
    }
}
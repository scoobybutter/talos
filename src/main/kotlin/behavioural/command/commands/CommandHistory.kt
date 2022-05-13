package behavioural.command.commands

import java.util.*

class CommandHistory {
    private val history = Stack<Command>()

    fun push(command: Command): Command = history.push(command)

    fun pop(): Command = history.pop()

    fun isEmpty(): Boolean = history.isEmpty()
}
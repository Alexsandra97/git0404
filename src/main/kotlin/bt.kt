import com.github.kotlintelegrambot.bot
import com.github.kotlintelegrambot.dispatch
import com.github.kotlintelegrambot.dispatcher.command
import com.github.kotlintelegrambot.dispatcher.text
import com.github.kotlintelegrambot.entities.ChatId
import com.github.kotlintelegrambot.entities.ParseMode.MARKDOWN

fun main() {
    val bot = bot {
        token = "7674778480:AAGs3VAMpMTb4A82IDXgYPwPu4uiI1s8DLw"  // ← Замените на свой!
        dispatch {
            command("start") {
                bot.sendMessage(
                    chatId = ChatId.fromId(message.chat.id),
                    text = "Привет! Я бот на Kotlin 🤖"
                )
            }
        }
    }
    bot.startPolling()
    println("Бот запущен! Остановить: Ctrl+C")
}
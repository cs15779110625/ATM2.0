import java.util.*

fun main(){
    var money_cs = 10000
    var money_jack = 1000
    while(true) {
        println("hello，欢迎使用ATM!")
        println("请登录!")
        println("账号：")
        val scanner = Scanner(System.`in`)
        val name = scanner.nextLine()
        println("密码：")
        val password = scanner.nextLine()
        var result: String = "null"
        when (name) {
            "cs" -> when (password) {
                "123" -> result = "登陆成功，欢迎用户：" + name
            }
            "jack" -> when (password) {
                "456" -> result = "登陆成功，欢迎用户：" + name
            }
        }
        if (result == "null") {
            println("登陆失败，账号或密码错误！")
            continue
        }
        println(result)
        label@
        while(true){
            println("请选择您需要的服务：")
            println("1.取钱 2.存钱 3.查询余额 4.注销")
            val movement = scanner.nextInt()
            while (movement == 1) {
                println("请输入数额：")
                val number = scanner.nextInt();
                val counter = "money_" + name
                when (counter) {
                    "money_cs" -> money_cs -= number
                    "money_jack" -> money_jack -= number
                }
                println("操作成功！")
                break
            }
            while (movement == 2) {
                println("请输入数额：")
                val number = scanner.nextInt();
                val counter = "money_" + name
                when (counter) {
                    "money_cs" -> money_cs += number
                    "money_jack" -> money_jack += number
                }
                println("操作成功！")
                break
            }
            while (movement == 3) {
                val counter = "money_" + name
                when (counter) {
                    "money_cs" -> println(money_cs)
                    "money_jack" -> println(money_jack)
                }
                break
            }
            while (movement == 4) {
                println("注销成功")
                break@label
            }
            while(movement !in 1..4) {
                println("无效操作")
                break
            }
        }

    }
}

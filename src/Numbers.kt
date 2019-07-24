fun main() {
    var x = 0
    var y = 0
    while (x < 5) {
        y = x - y
        print("$x$y")
        x = x + 1
    }
}
package org.example.lesson22

data class MainScreenState(
    val data: String,
    val isLoading: Boolean = false,
)

class MainScreenViewModel(var mainScreenState: MainScreenState) {

    fun loadData() {
        if (this.mainScreenState.isLoading) {
            println("- загрузка данных;")
            Thread.sleep(1000)
            println("- наличие загруженных данных.")
        } else println("- отсутствие данных;")
    }
}

fun main() {

    val screenState = MainScreenState("any data")
    val screen1 = MainScreenViewModel(screenState)
    screen1.loadData()
    screen1.mainScreenState = screenState.copy(isLoading = true)
    screen1.loadData()

}

package function

fun reformat(
    str: String,
    normalizeCase: Boolean = true,
    upperCaseFirstLetter: Boolean = true,
    divideByCamelHumps: Boolean = false,
    wordSeparator: Char = ' ',
) {
}

fun main(){
    reformat("This is a short String!", upperCaseFirstLetter = false, wordSeparator = '_')
}
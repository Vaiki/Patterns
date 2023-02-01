package builder

class Developer private constructor(
    private val resource: String?,
    private val course: String?,
    private val mentor: String?,
    private val book: String?
) {
    data class Builder(
        var resource: String? = "didn't use",
        var course: String? = "didn't use",
        var mentor: String? = "didn't use",
        var book: String = "didn't use"
    ) {
        fun resource(resource: String) = apply { this.resource = resource }
        fun course(course: String) = apply { this.course = course }
        fun mentor(mentor: String) = apply { this.mentor = mentor }
        fun book(book: String) = apply { this.book = book }
        fun build() = Developer(resource, course, mentor, book)
    }

    override fun toString(): String {
        return " mentor - $mentor;\n course - $course;\n resource - $resource;\n book - $book."
    }

}

fun main() {
    val juniorAndroidDeveloper = Developer.Builder()
        .mentor("Sergei Ermolaev")
        .course("Android Academy")
        .resource("Start Android")
        .book("Clean Arch")
        .build()
    println("Helped me to become a developer:\n$juniorAndroidDeveloper")
}
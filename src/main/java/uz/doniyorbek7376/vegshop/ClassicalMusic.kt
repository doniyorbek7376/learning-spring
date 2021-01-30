package uz.doniyorbek7376.vegshop

class ClassicalMusic private constructor():Music {
    fun doMyInit() {
        println("Initialization of CM")
    }
    override fun getSong(): String {
        return "Classical music"
    }
    fun doMyDestroy() {
        println("Destroying....")
    }

    companion object {
        @JvmStatic
        fun getClassicalMusic(): ClassicalMusic {
            return ClassicalMusic()
        }
    }
}
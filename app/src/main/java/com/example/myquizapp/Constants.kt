package com.example.myquizapp

object Constants {
    const val USER_NAME:String ="user_name"
    const val TOTAL_QUESTIONS:String="total_questions"
    const val CORRECT_ANSWER:String="correct_answers"
    fun getQuestions():ArrayList<Question>{
        val questionList= ArrayList<Question>()
        val que1=Question(
           1,"What country does this flag belong to?",R.drawable.ic_flag_of_argentina,"Argentina","Australia",
        "Armenia","Austria",1
        )
        questionList.add(que1)
        val que2=Question(
            2,"What country does this flag belong to?",R.drawable.ic_flag_of_australia,"Argentina","Australia",
            "Armenia","Austria",2
        )
        questionList.add(que2)
        val que3=Question(
            3,"What country does this flag belong to?",R.drawable.ic_flag_of_belgium,"Argentina","Australia",
            "Belgium","Austria",3
        )
        questionList.add(que3)
        val que4=Question(
            4,"What country does this flag belong to?",R.drawable.ic_flag_of_brazil,"Argentina","Australia",
            "Armenia","Brazil",4
        )
        questionList.add(que4)
        val que5=Question(
            5,"What country does this flag belong to?",R.drawable.ic_flag_of_denmark,"Denmark","Australia",
            "Armenia","Austria",1
        )
        questionList.add(que5)
        val que6=Question(
            6,"What country does this flag belong to?",R.drawable.ic_flag_of_fiji,"Argentina","Fiji",
            "Armenia","Austria",2
        )
        questionList.add(que6)
        return questionList
    }
}